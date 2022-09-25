package com.google.protos.p4985f.p5023n.p5024a.p5025a.p5026a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.n.a.a.a.i */
/* compiled from: PG */
public final class C64964i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64964i f175937d;

    /* renamed from: e */
    private static volatile C63010eb f175938e;

    /* renamed from: a */
    public int f175939a;

    /* renamed from: b */
    public int f175940b;

    /* renamed from: c */
    public C64960e f175941c;

    static {
        C64964i iVar = new C64964i();
        f175937d = iVar;
        C62942bv.registerDefaultInstance(C64964i.class, iVar);
    }

    private C64964i() {
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
                return newMessageInfo(f175937d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C64963h.m96487b(), C45240c.f118157a});
            case 3:
                return new C64964i();
            case 4:
                return new C64961f();
            case 5:
                return f175937d;
            case 6:
                C63010eb ebVar = f175938e;
                if (ebVar == null) {
                    synchronized (C64964i.class) {
                        ebVar = f175938e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175937d);
                            f175938e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
