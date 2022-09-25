package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.a.h */
/* compiled from: PG */
public final class C112141h extends C62934bn implements C63001dt {
    public C112141h() {
        super(C112144k.f311414b);
    }

    /* renamed from: a */
    public final float mo99419a(String str) {
        str.getClass();
        Map unmodifiableMap = Collections.unmodifiableMap(((C112144k) this.instance).f311416a);
        if (unmodifiableMap.containsKey(str)) {
            return ((Float) unmodifiableMap.get(str)).floatValue();
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final void mo99420b(String str, float f) {
        str.getClass();
        copyOnWrite();
        C112144k kVar = (C112144k) this.instance;
        C112144k kVar2 = C112144k.f311414b;
        C62995dn dnVar = kVar.f311416a;
        if (!dnVar.f170058b) {
            kVar.f311416a = dnVar.mo58980a();
        }
        kVar.f311416a.put(str, Float.valueOf(f));
    }
}
