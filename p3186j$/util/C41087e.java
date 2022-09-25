package p3186j$.util;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Map;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: j$.util.e */
final class C41087e implements Map, Serializable, Map {

    /* renamed from: a */
    private final Map f107635a;

    /* renamed from: b */
    final Object f107636b = this;

    /* renamed from: c */
    private transient Set f107637c;

    /* renamed from: d */
    private transient Set f107638d;

    /* renamed from: e */
    private transient Collection f107639e;

    C41087e(Map map) {
        this.f107635a = (Map) Objects.requireNonNull(map);
    }

    /* renamed from: a */
    private static Set m71714a(Set set, Object obj) {
        if (DesugarCollections.f107496e == null) {
            return Collections.synchronizedSet(set);
        }
        try {
            return (Set) DesugarCollections.f107496e.newInstance(new Object[]{set, obj});
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new Error("Unable to instantiate a synchronized list.", e);
        }
    }

    public final void clear() {
        synchronized (this.f107636b) {
            this.f107635a.clear();
        }
    }

    public final Object compute(Object obj, BiFunction biFunction) {
        Object compute;
        synchronized (this.f107636b) {
            compute = Map.EL.compute(this.f107635a, obj, biFunction);
        }
        return compute;
    }

    public final Object computeIfAbsent(Object obj, Function function) {
        Object computeIfAbsent;
        synchronized (this.f107636b) {
            computeIfAbsent = Map.EL.computeIfAbsent(this.f107635a, obj, function);
        }
        return computeIfAbsent;
    }

    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object computeIfPresent;
        synchronized (this.f107636b) {
            computeIfPresent = Map.EL.computeIfPresent(this.f107635a, obj, biFunction);
        }
        return computeIfPresent;
    }

    public final boolean containsKey(Object obj) {
        boolean containsKey;
        synchronized (this.f107636b) {
            containsKey = this.f107635a.containsKey(obj);
        }
        return containsKey;
    }

    public final boolean containsValue(Object obj) {
        boolean containsValue;
        synchronized (this.f107636b) {
            containsValue = this.f107635a.containsValue(obj);
        }
        return containsValue;
    }

    public final Set entrySet() {
        Set set;
        synchronized (this.f107636b) {
            if (this.f107638d == null) {
                this.f107638d = m71714a(this.f107635a.entrySet(), this.f107636b);
            }
            set = this.f107638d;
        }
        return set;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f107636b) {
            equals = this.f107635a.equals(obj);
        }
        return equals;
    }

    public final void forEach(BiConsumer biConsumer) {
        synchronized (this.f107636b) {
            Map.EL.forEach(this.f107635a, biConsumer);
        }
    }

    public final Object get(Object obj) {
        Object obj2;
        synchronized (this.f107636b) {
            obj2 = this.f107635a.get(obj);
        }
        return obj2;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        Object orDefault;
        synchronized (this.f107636b) {
            orDefault = Map.EL.getOrDefault(this.f107635a, obj, obj2);
        }
        return orDefault;
    }

    public final int hashCode() {
        int hashCode;
        synchronized (this.f107636b) {
            hashCode = this.f107635a.hashCode();
        }
        return hashCode;
    }

    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f107636b) {
            isEmpty = this.f107635a.isEmpty();
        }
        return isEmpty;
    }

    public final Set keySet() {
        Set set;
        synchronized (this.f107636b) {
            if (this.f107637c == null) {
                this.f107637c = m71714a(this.f107635a.keySet(), this.f107636b);
            }
            set = this.f107637c;
        }
        return set;
    }

    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Object merge;
        synchronized (this.f107636b) {
            merge = Map.EL.merge(this.f107635a, obj, obj2, biFunction);
        }
        return merge;
    }

    public final Object put(Object obj, Object obj2) {
        Object put;
        synchronized (this.f107636b) {
            put = this.f107635a.put(obj, obj2);
        }
        return put;
    }

    public final void putAll(java.util.Map map) {
        synchronized (this.f107636b) {
            this.f107635a.putAll(map);
        }
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object putIfAbsent;
        synchronized (this.f107636b) {
            putIfAbsent = Map.EL.putIfAbsent(this.f107635a, obj, obj2);
        }
        return putIfAbsent;
    }

    public final Object remove(Object obj) {
        Object remove;
        synchronized (this.f107636b) {
            remove = this.f107635a.remove(obj);
        }
        return remove;
    }

    public final boolean remove(Object obj, Object obj2) {
        boolean z;
        synchronized (this.f107636b) {
            java.util.Map map = this.f107635a;
            if (map instanceof Map) {
                z = ((Map) map).remove(obj, obj2);
            } else {
                z = Map.CC.$default$remove(map, obj, obj2);
            }
        }
        return z;
    }

    public final Object replace(Object obj, Object obj2) {
        Object replace;
        synchronized (this.f107636b) {
            replace = Map.EL.replace(this.f107635a, obj, obj2);
        }
        return replace;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean z;
        synchronized (this.f107636b) {
            java.util.Map map = this.f107635a;
            if (map instanceof Map) {
                z = ((Map) map).replace(obj, obj2, obj3);
            } else {
                z = Map.CC.$default$replace(map, obj, obj2, obj3);
            }
        }
        return z;
    }

    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.f107636b) {
            Map.EL.m71635a(this.f107635a, biFunction);
        }
    }

    public final int size() {
        int size;
        synchronized (this.f107636b) {
            size = this.f107635a.size();
        }
        return size;
    }

    public final String toString() {
        String obj;
        synchronized (this.f107636b) {
            obj = this.f107635a.toString();
        }
        return obj;
    }

    public final Collection values() {
        Collection collection;
        Collection collection2;
        synchronized (this.f107636b) {
            if (this.f107639e == null) {
                Collection values = this.f107635a.values();
                Object obj = this.f107636b;
                if (DesugarCollections.f107495d == null) {
                    collection2 = Collections.synchronizedCollection(values);
                } else {
                    try {
                        collection2 = (Collection) DesugarCollections.f107495d.newInstance(new Object[]{values, obj});
                    } catch (InstantiationException e) {
                        e = e;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    } catch (IllegalAccessException e2) {
                        e = e2;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    } catch (InvocationTargetException e3) {
                        e = e3;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    }
                }
                this.f107639e = collection2;
            }
            collection = this.f107639e;
        }
        return collection;
    }
}
