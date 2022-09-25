package com.google.assistant.p3820ak;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4479cg.C58070b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ak.h */
/* compiled from: PG */
public final class C49209h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49209h f127229b;

    /* renamed from: d */
    private static volatile C63010eb f127230d;

    /* renamed from: a */
    public C58070b f127231a;

    /* renamed from: c */
    private int f127232c;

    static {
        C49209h hVar = new C49209h();
        f127229b = hVar;
        C62942bv.registerDefaultInstance(C49209h.class, hVar);
    }

    private C49209h() {
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
                return newMessageInfo(f127229b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C49209h();
            case 4:
                return new C49208g();
            case 5:
                return f127229b;
            case 6:
                C63010eb ebVar = f127230d;
                if (ebVar == null) {
                    synchronized (C49209h.class) {
                        ebVar = f127230d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127229b);
                            f127230d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
