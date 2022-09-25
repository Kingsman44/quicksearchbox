package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.j.hd */
/* compiled from: PG */
public final class C52152hd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52152hd f136850c;

    /* renamed from: d */
    private static volatile C63010eb f136851d;

    /* renamed from: a */
    public int f136852a;

    /* renamed from: b */
    public C63088z f136853b = C63088z.f170246b;

    static {
        C52152hd hdVar = new C52152hd();
        f136850c = hdVar;
        C62942bv.registerDefaultInstance(C52152hd.class, hdVar);
    }

    private C52152hd() {
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
                return newMessageInfo(f136850c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52152hd();
            case 4:
                return new C52151hc();
            case 5:
                return f136850c;
            case 6:
                C63010eb ebVar = f136851d;
                if (ebVar == null) {
                    synchronized (C52152hd.class) {
                        ebVar = f136851d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136850c);
                            f136851d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
