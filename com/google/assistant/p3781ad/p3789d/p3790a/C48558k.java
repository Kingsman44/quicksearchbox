package com.google.assistant.p3781ad.p3789d.p3790a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.a.k */
/* compiled from: PG */
public final class C48558k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48558k f125445c;

    /* renamed from: d */
    private static volatile C63010eb f125446d;

    /* renamed from: a */
    public int f125447a = 0;

    /* renamed from: b */
    public Object f125448b;

    static {
        C48558k kVar = new C48558k();
        f125445c = kVar;
        C62942bv.registerDefaultInstance(C48558k.class, kVar);
    }

    private C48558k() {
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
                return newMessageInfo(f125445c, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"b", "a", C48560m.class, C48556i.class, C48551d.class, C48549b.class});
            case 3:
                return new C48558k();
            case 4:
                return new C48557j();
            case 5:
                return f125445c;
            case 6:
                C63010eb ebVar = f125446d;
                if (ebVar == null) {
                    synchronized (C48558k.class) {
                        ebVar = f125446d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125445c);
                            f125446d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
