package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.c */
/* compiled from: PG */
public final class C124661c extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C124661c f343917b;

    /* renamed from: c */
    private static volatile C63010eb f343918c;

    /* renamed from: a */
    public C62995dn f343919a = C62995dn.f170057a;

    static {
        C124661c cVar = new C124661c();
        f343917b = cVar;
        C62942bv.registerDefaultInstance(C124661c.class, cVar);
    }

    private C124661c() {
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
                return newMessageInfo(f343917b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C124634b.f343842a});
            case 3:
                return new C124661c();
            case 4:
                return new C124607a();
            case 5:
                return f343917b;
            case 6:
                C63010eb ebVar = f343918c;
                if (ebVar == null) {
                    synchronized (C124661c.class) {
                        ebVar = f343918c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f343917b);
                            f343918c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
