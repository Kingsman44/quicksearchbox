package androidx.work;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class ArrayCreatingInputMerger extends C4638s {
    /* renamed from: a */
    public final C4632m mo9295a(List list) {
        Class cls;
        Object newInstance;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map unmodifiableMap = Collections.unmodifiableMap(((C4632m) it.next()).f14551b);
            C69664n.m101060f(unmodifiableMap, "input.keyValueMap");
            Iterator it2 = unmodifiableMap.entrySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value == null || (cls = value.getClass()) == null) {
                        cls = String.class;
                    }
                    Object obj = hashMap2.get(str);
                    C69664n.m101060f(str, "key");
                    if (obj != null) {
                        Class<?> cls2 = obj.getClass();
                        if (C69664n.m101066l(cls2, cls)) {
                            C69664n.m101060f(value, "value");
                            int length = Array.getLength(obj);
                            int length2 = Array.getLength(value);
                            Class<?> componentType = obj.getClass().getComponentType();
                            C69664n.m101058d(componentType);
                            Object newInstance2 = Array.newInstance(componentType, length + length2);
                            System.arraycopy(obj, 0, newInstance2, 0, length);
                            System.arraycopy(value, 0, newInstance2, length, length2);
                            C69664n.m101060f(newInstance2, "newArray");
                            value = newInstance2;
                            C69664n.m101060f(value, "if (existingValue == nul…      }\n                }");
                            hashMap2.put(str, value);
                        } else if (C69664n.m101066l(cls2.getComponentType(), cls)) {
                            int length3 = Array.getLength(obj);
                            newInstance = Array.newInstance(cls, length3 + 1);
                            System.arraycopy(obj, 0, newInstance, 0, length3);
                            Array.set(newInstance, length3, value);
                            C69664n.m101060f(newInstance, "newArray");
                        } else {
                            throw new IllegalArgumentException();
                        }
                    } else if (cls.isArray()) {
                        C69664n.m101060f(value, "if (existingValue == nul…      }\n                }");
                        hashMap2.put(str, value);
                    } else {
                        newInstance = Array.newInstance(cls, 1);
                        Array.set(newInstance, 0, value);
                        C69664n.m101060f(newInstance, "newArray");
                    }
                    value = newInstance;
                    C69664n.m101060f(value, "if (existingValue == nul…      }\n                }");
                    hashMap2.put(str, value);
                }
            }
        }
        C4631l.m13031b(hashMap2, hashMap);
        return C4631l.m13030a(hashMap);
    }
}
