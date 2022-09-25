package com.google.assistant.p3863av.p3876g.p3877a.p3878a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5127o.C65682h;

/* renamed from: com.google.assistant.av.g.a.a.j */
/* compiled from: PG */
public final class C50588j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50588j f131638c;

    /* renamed from: d */
    private static volatile C63010eb f131639d;

    /* renamed from: a */
    public int f131640a;

    /* renamed from: b */
    public C65682h f131641b;

    static {
        C50588j jVar = new C50588j();
        f131638c = jVar;
        C62942bv.registerDefaultInstance(C50588j.class, jVar);
    }

    private C50588j() {
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
                return newMessageInfo(f131638c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50588j();
            case 4:
                return new C50587i();
            case 5:
                return f131638c;
            case 6:
                C63010eb ebVar = f131639d;
                if (ebVar == null) {
                    synchronized (C50588j.class) {
                        ebVar = f131639d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131638c);
                            f131639d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
