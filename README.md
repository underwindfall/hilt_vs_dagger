# Introduction
This repo is try to find the different usage injection dependency between `dagger` and `hilt`.  The been spilited by serveral test cases to let us know better about the detail of DI. Each `Test case` have a specific branch. All screenshots is from this [slide](https://github.com/underwindfall/hilt_vs_dagger/blob/main/dagger%20vs%20hilt.key)

## Test cases
### Case 1 Use ActivityComponent to inject two activity(no scope)
- branch  [case 1](https://github.com/underwindfall/hilt_vs_dagger/tree/case1/activity_compoenent_no_scope)
- ![image](https://user-images.githubusercontent.com/14819756/111628432-7f258c00-87f0-11eb-9e68-0be3b4490b49.png)


### Case 2 Test case 2. Use ActivityComponent to inject two activity (scope @PerActivity)
- branch [case 2](https://github.com/underwindfall/hilt_vs_dagger/tree/case2/activity_compoenent_scope_peractvity)
- ![image](https://user-images.githubusercontent.com/14819756/111628622-b5fba200-87f0-11eb-9f15-7e154a96534b.png)

### Case 3 Test case 3. Use AppComponent to inject two activity (no scope)
- branch [case 3](https://github.com/underwindfall/hilt_vs_dagger/tree/case3/application_component_no_scope)
- ![image](https://user-images.githubusercontent.com/14819756/111628827-ecd1b800-87f0-11eb-8841-aaabb610a89b.png)


### Case 4 Test case 4. Use AppComponent to inject two activity (scope @Singleton)
- branch [case 4](https://github.com/underwindfall/hilt_vs_dagger/tree/case4/application_component_scope_singleton)
- ![image](https://user-images.githubusercontent.com/14819756/111629085-33271700-87f1-11eb-8fc4-b1e828e7700c.png)

### Case 4.1 Test case 4.1. Use AppComponent to inject two activity (scope @Singleton)
- branch [case 4.1](https://github.com/underwindfall/hilt_vs_dagger/tree/case4.1/application_component_create_singleton)
- ![image](https://user-images.githubusercontent.com/14819756/111629160-4803aa80-87f1-11eb-8902-5190a89bff3e.png)

### Case 5 (compare hilt usage Test case 5. Use @InstallIn(ActivityComponent::class) to inject two activity(no scope))
- branch [case 5](https://github.com/underwindfall/hilt_vs_dagger/tree/case5/hilt_no_scope_activity_componenet)
- ![image](https://user-images.githubusercontent.com/14819756/111629253-636eb580-87f1-11eb-99e2-53fddbe770a6.png)

### Case 5.1 Test case 5.1. Use @InstallIn(ActivityComponent::class) to inject two activity(@ActivityScope)
- branch [case 5.1](https://github.com/underwindfall/hilt_vs_dagger/tree/case5.1/hilt_activityscoped_activity_compoenent)
- ![image](https://user-images.githubusercontent.com/14819756/111629253-636eb580-87f1-11eb-99e2-53fddbe770a6.png)
