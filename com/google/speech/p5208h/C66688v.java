package com.google.speech.p5208h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.p5224k.p5225a.C67238p;

/* renamed from: com.google.speech.h.v */
/* compiled from: PG */
public final class C66688v extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66688v f181417a;

    /* renamed from: b */
    public static final C62940bt f181418b;

    /* renamed from: c */
    private static volatile C63010eb f181419c;

    static {
        C66688v vVar = new C66688v();
        f181417a = vVar;
        C62942bv.registerDefaultInstance(C66688v.class, vVar);
        f181418b = C62942bv.newSingularGeneratedExtension(C67238p.f182736e, vVar, vVar, (C62958ce) null, 304390461, C63066gd.MESSAGE, C66688v.class);
    }

    private C66688v() {
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
                return newMessageInfo(f181417a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66688v();
            case 4:
                return new C66687u();
            case 5:
                return f181417a;
            case 6:
                C63010eb ebVar = f181419c;
                if (ebVar == null) {
                    synchronized (C66688v.class) {
                        ebVar = f181419c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181417a);
                            f181419c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
