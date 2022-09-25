package com.google.speech.p5208h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.h.ag */
/* compiled from: PG */
public final class C66550ag extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66550ag f180992c;

    /* renamed from: d */
    public static final C62940bt f180993d;

    /* renamed from: e */
    private static volatile C63010eb f180994e;

    /* renamed from: a */
    public int f180995a;

    /* renamed from: b */
    public boolean f180996b;

    static {
        C66550ag agVar = new C66550ag();
        f180992c = agVar;
        C62942bv.registerDefaultInstance(C66550ag.class, agVar);
        f180993d = C62942bv.newSingularGeneratedExtension(C66607ce.f181191f, agVar, agVar, (C62958ce) null, 77499489, C63066gd.MESSAGE, C66550ag.class);
    }

    private C66550ag() {
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
                return newMessageInfo(f180992c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66550ag();
            case 4:
                return new C66549af();
            case 5:
                return f180992c;
            case 6:
                C63010eb ebVar = f180994e;
                if (ebVar == null) {
                    synchronized (C66550ag.class) {
                        ebVar = f180994e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180992c);
                            f180994e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
