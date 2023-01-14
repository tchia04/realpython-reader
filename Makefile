setup:
	pip install -r requirements.txt

build:
	python3 -m build

check:
	twine check dist/*

upload_test_pypi:
	twine upload -r testpypi dist/*

upload_pypi:
	twine upload -r pypi dist/*
