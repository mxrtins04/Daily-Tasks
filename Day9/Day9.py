names = ["Sina", "Katherine", "dan", "Seyi"]

def remove_enemies(names):
	return len(names) == 4
print(list(filter(remove_enemies,names)))