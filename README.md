(env) PS D:\PFA_Trading\reinforcement_trading_mt5-20250728T133705Z-1-001\reinforcement_trading_mt5> & D:/PFA_Trading/reinforcement_trading_mt5-20250728T133705Z-1-001/reinforcement_trading_mt5/env/Scripts/python.exe d:/PFA_Trading/reinforcement_trading_mt5-20250728T133705Z-1-001/reinforcement_trading_mt5/train_rl_model.py
🚀 Entraînement PPO avec device cuda...
Using cuda device
🚀 Entraînement SAC avec device cuda...
Using cuda device
🚀 Entraînement A2C avec device cuda...
Using cuda device
🚀 Entraînement TD3 avec device cuda...
Using cuda device
concurrent.futures.process._RemoteTraceback:
"""
Traceback (most recent call last):
  File "C:\Users\bajil\AppData\Local\Programs\Python\Python310\lib\concurrent\futures\process.py", line 243, in _process_worker
    r = call_item.fn(*call_item.args, **call_item.kwargs)
  File "d:\PFA_Trading\reinforcement_trading_mt5-20250728T133705Z-1-001\reinforcement_trading_mt5\train_rl_model.py", line 62, in train_model
    model = model_class("MlpPolicy", env, verbose=1, device=device)
  File "D:\PFA_Trading\reinforcement_trading_mt5-20250728T133705Z-1-001\reinforcement_trading_mt5\env\lib\site-packages\stable_baselines3\ppo\ppo.py", line 107, in __init__
    super().__init__(
  File "D:\PFA_Trading\reinforcement_trading_mt5-20250728T133705Z-1-001\reinforcement_trading_mt5\env\lib\site-packages\stable_baselines3\common\on_policy_algorithm.py", line 81, in __init__
    super().__init__(
  File "D:\PFA_Trading\reinforcement_trading_mt5-20250728T133705Z-1-001\reinforcement_trading_mt5\env\lib\site-packages\stable_baselines3\common\base_class.py", line 187, in __init__
    assert isinstance(self.action_space, supported_action_spaces), (
AssertionError: The algorithm only supports (<class 'gym.spaces.box.Box'>, <class 'gym.spaces.discrete.Discrete'>, <class 'gym.spaces.multi_discrete.MultiDiscrete'>, <class 'gym.spaces.multi_binary.MultiBinary'>) as action spaces but Discrete(3) was provided
"""

The above exception was the direct cause of the following exception:

Traceback (most recent call last):
  File "d:\PFA_Trading\reinforcement_trading_mt5-20250728T133705Z-1-001\reinforcement_trading_mt5\train_rl_model.py", line 75, in <module>
    future.result()
  File "C:\Users\bajil\AppData\Local\Programs\Python\Python310\lib\concurrent\futures\_base.py", line 445, in result
    return self.__get_result()
  File "C:\Users\bajil\AppData\Local\Programs\Python\Python310\lib\concurrent\futures\_base.py", line 390, in __get_result
    raise self._exception
AssertionError: The algorithm only supports (<class 'gym.spaces.box.Box'>, <class 'gym.spaces.discrete.Discrete'>, <class 'gym.spaces.multi_discrete.MultiDiscrete'>, <class 'gym.spaces.multi_binary.MultiBinary'>) as action spaces but Discrete(3) was provided
(env) PS D:\PFA_Trading\reinforcement_trading_mt5-20250728T133705Z-1-001\reinforcement_trading_mt5>
