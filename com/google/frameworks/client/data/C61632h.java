package com.google.frameworks.client.data;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protobuf.C63088z;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.frameworks.client.data.h */
/* compiled from: PG */
public final class C61632h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C61632h f166517c;

    /* renamed from: d */
    public static final C62940bt f166518d;

    /* renamed from: e */
    private static volatile C63010eb f166519e;

    /* renamed from: a */
    public int f166520a;

    /* renamed from: b */
    public C63088z f166521b = C63088z.f170246b;

    static {
        C61632h hVar = new C61632h();
        f166517c = hVar;
        C62942bv.registerDefaultInstance(C61632h.class, hVar);
        f166518d = C62942bv.newSingularGeneratedExtension(C63771b.f172510a, hVar, hVar, (C62958ce) null, 202735639, C63066gd.MESSAGE, C61632h.class);
    }

    private C61632h() {
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
                return newMessageInfo(f166517c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new C61632h();
            case 4:
                return new C61631g();
            case 5:
                return f166517c;
            case 6:
                C63010eb ebVar = f166519e;
                if (ebVar == null) {
                    synchronized (C61632h.class) {
                        ebVar = f166519e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166517c);
                            f166519e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
