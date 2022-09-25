package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4909b.p4911b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.c.a.a.a.a.b.b.i */
/* compiled from: PG */
public final class C64124i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64124i f173360c;

    /* renamed from: e */
    private static volatile C63010eb f173361e;

    /* renamed from: a */
    public int f173362a;

    /* renamed from: b */
    public int f173363b;

    /* renamed from: d */
    private int f173364d;

    static {
        C64124i iVar = new C64124i();
        f173360c = iVar;
        C62942bv.registerDefaultInstance(C64124i.class, iVar);
    }

    private C64124i() {
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
                return newMessageInfo(f173360c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", C64123h.m96359b(), "b", C64118c.m96357b()});
            case 3:
                return new C64124i();
            case 4:
                return new C64121f();
            case 5:
                return f173360c;
            case 6:
                C63010eb ebVar = f173361e;
                if (ebVar == null) {
                    synchronized (C64124i.class) {
                        ebVar = f173361e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173360c);
                            f173361e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
