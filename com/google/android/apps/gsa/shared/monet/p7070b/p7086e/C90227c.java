package com.google.android.apps.gsa.shared.monet.p7070b.p7086e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.monet.b.e.c */
/* compiled from: PG */
public final class C90227c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C90227c f252063c;

    /* renamed from: d */
    private static volatile C63010eb f252064d;

    /* renamed from: a */
    public int f252065a;

    /* renamed from: b */
    public int f252066b;

    static {
        C90227c cVar = new C90227c();
        f252063c = cVar;
        C62942bv.registerDefaultInstance(C90227c.class, cVar);
    }

    private C90227c() {
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
                return newMessageInfo(f252063c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C90229e.m146772b()});
            case 3:
                return new C90227c();
            case 4:
                return new C90226b();
            case 5:
                return f252063c;
            case 6:
                C63010eb ebVar = f252064d;
                if (ebVar == null) {
                    synchronized (C90227c.class) {
                        ebVar = f252064d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f252063c);
                            f252064d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
