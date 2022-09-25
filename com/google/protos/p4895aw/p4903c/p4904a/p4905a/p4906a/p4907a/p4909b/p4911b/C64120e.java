package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4909b.p4911b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.c.a.a.a.a.b.b.e */
/* compiled from: PG */
public final class C64120e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64120e f173349c;

    /* renamed from: e */
    private static volatile C63010eb f173350e;

    /* renamed from: a */
    public int f173351a;

    /* renamed from: b */
    public int f173352b;

    /* renamed from: d */
    private int f173353d;

    static {
        C64120e eVar = new C64120e();
        f173349c = eVar;
        C62942bv.registerDefaultInstance(C64120e.class, eVar);
    }

    private C64120e() {
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
                return newMessageInfo(f173349c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", C64118c.m96357b()});
            case 3:
                return new C64120e();
            case 4:
                return new C64119d();
            case 5:
                return f173349c;
            case 6:
                C63010eb ebVar = f173350e;
                if (ebVar == null) {
                    synchronized (C64120e.class) {
                        ebVar = f173350e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173349c);
                            f173350e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
