package com.google.speech.p5228m;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.k */
/* compiled from: PG */
public final class C67347k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67347k f183055c;

    /* renamed from: e */
    private static volatile C63010eb f183056e;

    /* renamed from: a */
    public C67361y f183057a;

    /* renamed from: b */
    public int f183058b;

    /* renamed from: d */
    private int f183059d;

    static {
        C67347k kVar = new C67347k();
        f183055c = kVar;
        C62942bv.registerDefaultInstance(C67347k.class, kVar);
    }

    private C67347k() {
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
                return newMessageInfo(f183055c, "\u0001\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0006ဌ\u0005", new Object[]{"d", "a", "b", C67277ah.f182881a});
            case 3:
                return new C67347k();
            case 4:
                return new C67346j();
            case 5:
                return f183055c;
            case 6:
                C63010eb ebVar = f183056e;
                if (ebVar == null) {
                    synchronized (C67347k.class) {
                        ebVar = f183056e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183055c);
                            f183056e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
