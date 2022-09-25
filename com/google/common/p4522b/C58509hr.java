package com.google.common.p4522b;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.b.hr */
/* compiled from: PG */
final class C58509hr extends C58517hz {

    /* renamed from: a */
    final /* synthetic */ C58512hu f156151a;

    public C58509hr(C58512hu huVar) {
        this.f156151a = huVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use KeysSerializedForm");
    }

    /* renamed from: a */
    public final boolean mo55032a() {
        return true;
    }

    /* renamed from: c */
    public final C58528ij mo55460c() {
        return this.f156151a.map.keySet();
    }

    public final boolean contains(Object obj) {
        return this.f156151a.map.containsKey(obj);
    }

    /* renamed from: e */
    public final C58691ok mo55461e(int i) {
        Map.Entry entry = (Map.Entry) this.f156151a.map.entrySet().mo55229u().get(i);
        return new C58697oq(entry.getKey(), ((Collection) entry.getValue()).size());
    }

    /* renamed from: l */
    public final /* synthetic */ Set mo54974l() {
        return this.f156151a.map.keySet();
    }

    /* renamed from: lv */
    public final int mo54932lv(Object obj) {
        Collection collection = (Collection) this.f156151a.map.get(obj);
        if (collection == null) {
            return 0;
        }
        return collection.size();
    }

    public final int size() {
        return this.f156151a.size;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C58510hs(this.f156151a);
    }
}
