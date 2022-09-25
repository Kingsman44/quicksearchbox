package com.google.speech.p5208h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.h.dw */
/* compiled from: PG */
public final class C66656dw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66656dw f181331c;

    /* renamed from: d */
    public static final C62940bt f181332d;

    /* renamed from: e */
    private static volatile C63010eb f181333e;

    /* renamed from: a */
    public int f181334a;

    /* renamed from: b */
    public int f181335b;

    static {
        C66656dw dwVar = new C66656dw();
        f181331c = dwVar;
        C62942bv.registerDefaultInstance(C66656dw.class, dwVar);
        f181332d = C62942bv.newSingularGeneratedExtension(C66603ca.f181183a, dwVar, dwVar, (C62958ce) null, 112997213, C63066gd.MESSAGE, C66656dw.class);
    }

    private C66656dw() {
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
                return newMessageInfo(f181331c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C66655dv.f181330a});
            case 3:
                return new C66656dw();
            case 4:
                return new C66654du();
            case 5:
                return f181331c;
            case 6:
                C63010eb ebVar = f181333e;
                if (ebVar == null) {
                    synchronized (C66656dw.class) {
                        ebVar = f181333e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181331c);
                            f181333e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
