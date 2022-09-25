package com.google.p4017at.p4049f.p4050a.p4053b.p4054a.p4055a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.f.a.b.a.a.h */
/* compiled from: PG */
public final class C53943h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53943h f141535c;

    /* renamed from: e */
    private static volatile C63010eb f141536e;

    /* renamed from: a */
    public C53947l f141537a;

    /* renamed from: b */
    public C53941f f141538b;

    /* renamed from: d */
    private int f141539d;

    static {
        C53943h hVar = new C53943h();
        f141535c = hVar;
        C62942bv.registerDefaultInstance(C53943h.class, hVar);
    }

    private C53943h() {
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
                return newMessageInfo(f141535c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C53943h();
            case 4:
                return new C53942g();
            case 5:
                return f141535c;
            case 6:
                C63010eb ebVar = f141536e;
                if (ebVar == null) {
                    synchronized (C53943h.class) {
                        ebVar = f141536e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141535c);
                            f141536e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
