package com.google.speech.p5218j.p5220b.p5221a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.b.a.ad */
/* compiled from: PG */
public final class C66791ad extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66791ad f181636c;

    /* renamed from: d */
    private static volatile C63010eb f181637d;

    /* renamed from: a */
    public int f181638a;

    /* renamed from: b */
    public int f181639b;

    static {
        C66791ad adVar = new C66791ad();
        f181636c = adVar;
        C62942bv.registerDefaultInstance(C66791ad.class, adVar);
    }

    private C66791ad() {
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
                return newMessageInfo(f181636c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C66790ac.f181635a});
            case 3:
                return new C66791ad();
            case 4:
                return new C66789ab();
            case 5:
                return f181636c;
            case 6:
                C63010eb ebVar = f181637d;
                if (ebVar == null) {
                    synchronized (C66791ad.class) {
                        ebVar = f181637d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181636c);
                            f181637d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
