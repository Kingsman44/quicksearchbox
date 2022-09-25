package androidx.p060c;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Map;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: androidx.c.g */
/* compiled from: PG */
public class C0977g extends C0984n implements Map, p3186j$.util.Map {

    /* renamed from: a */
    C0968a f3096a;

    /* renamed from: b */
    C0973c f3097b;

    /* renamed from: c */
    C0975e f3098c;

    public C0977g() {
        super(0);
    }

    /* renamed from: a */
    public final boolean mo3642a(Collection collection) {
        for (Object containsKey : collection) {
            if (!containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo3643b(Collection collection) {
        int i = this.f3122d;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(mo3702e(i2))) {
                mo3704f(i2);
            }
        }
        return i != this.f3122d;
    }

    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    public final Set entrySet() {
        C0968a aVar = this.f3096a;
        if (aVar != null) {
            return aVar;
        }
        C0968a aVar2 = new C0968a(this);
        this.f3096a = aVar2;
        return aVar2;
    }

    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public final Set keySet() {
        C0973c cVar = this.f3097b;
        if (cVar != null) {
            return cVar;
        }
        C0973c cVar2 = new C0973c(this);
        this.f3097b = cVar2;
        return cVar2;
    }

    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    public final void putAll(java.util.Map map) {
        mo3710i(this.f3122d + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final Collection values() {
        C0975e eVar = this.f3098c;
        if (eVar != null) {
            return eVar;
        }
        C0975e eVar2 = new C0975e(this);
        this.f3098c = eVar2;
        return eVar2;
    }

    public C0977g(int i) {
        super(i);
    }

    public C0977g(C0984n nVar) {
        super(0);
        if (nVar != null) {
            mo3712j(nVar);
        }
    }
}
