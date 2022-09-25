package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.common.p4552o.aoq;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58148f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.cf */
/* compiled from: PG */
public final class C87751cf extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87751cf f237501c;

    /* renamed from: e */
    private static volatile C63010eb f237502e;

    /* renamed from: a */
    public C58148f f237503a;

    /* renamed from: b */
    public int f237504b;

    /* renamed from: d */
    private int f237505d;

    static {
        C87751cf cfVar = new C87751cf();
        f237501c = cfVar;
        C62942bv.registerDefaultInstance(C87751cf.class, cfVar);
    }

    private C87751cf() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f237501c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", aoq.f159508a});
            case 3:
                return new C87751cf();
            case 4:
                return new C87750ce();
            case 5:
                return f237501c;
            case 6:
                C63010eb ebVar = f237502e;
                if (ebVar == null) {
                    synchronized (C87751cf.class) {
                        ebVar = f237502e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237501c);
                            f237502e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
