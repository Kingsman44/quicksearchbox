package com.google.speech.p5208h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protobuf.C63088z;

/* renamed from: com.google.speech.h.j */
/* compiled from: PG */
public final class C66676j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66676j f181378c;

    /* renamed from: d */
    public static final C62940bt f181379d;

    /* renamed from: e */
    public static final C62940bt f181380e;

    /* renamed from: f */
    private static volatile C63010eb f181381f;

    /* renamed from: a */
    public int f181382a;

    /* renamed from: b */
    public C63088z f181383b = C63088z.f170246b;

    static {
        C66676j jVar = new C66676j();
        f181378c = jVar;
        C62942bv.registerDefaultInstance(C66676j.class, jVar);
        C66676j jVar2 = jVar;
        C66676j jVar3 = jVar;
        f181379d = C62942bv.newSingularGeneratedExtension(C66607ce.f181191f, jVar2, jVar3, (C62958ce) null, 293101, C63066gd.MESSAGE, C66676j.class);
        f181380e = C62942bv.newSingularGeneratedExtension(C66607ce.f181191f, jVar2, jVar3, (C62958ce) null, 62724734, C63066gd.MESSAGE, C66676j.class);
    }

    private C66676j() {
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
                return newMessageInfo(f181378c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66676j();
            case 4:
                return new C66675i();
            case 5:
                return f181378c;
            case 6:
                C63010eb ebVar = f181381f;
                if (ebVar == null) {
                    synchronized (C66676j.class) {
                        ebVar = f181381f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181378c);
                            f181381f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
