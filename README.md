# lib

Step 1. Add the JitPack repository to your build file
------gradle----
  
dependencyResolutionManagement
{
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}

 Step 2. Add the dependency
------gradle----

	dependencies {
	        implementation 'com.github.cvivek503:lib:Tag'
	}

