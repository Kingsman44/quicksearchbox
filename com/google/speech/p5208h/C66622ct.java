package com.google.speech.p5208h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.h.ct */
/* compiled from: PG */
public final class C66622ct extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66622ct f181244a;

    /* renamed from: b */
    public static final C62940bt f181245b;

    /* renamed from: c */
    private static volatile C63010eb f181246c;

    static {
        C66622ct ctVar = new C66622ct();
        f181244a = ctVar;
        C62942bv.registerDefaultInstance(C66622ct.class, ctVar);
        f181245b = C62942bv.newSingularGeneratedExtension(C66611ci.f181206g, ctVar, ctVar, (C62958ce) null, 29737259, C63066gd.MESSAGE, C66622ct.class);
    }

    private C66622ct() {
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
                return newMessageInfo(f181244a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66622ct();
            case 4:
                return new C66621cs();
            case 5:
                return f181244a;
            case 6:
                C63010eb ebVar = f181246c;
                if (ebVar == null) {
                    synchronized (C66622ct.class) {
                        ebVar = f181246c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181244a);
                            f181246c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
