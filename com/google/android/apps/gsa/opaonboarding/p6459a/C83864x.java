package com.google.android.apps.gsa.opaonboarding.p6459a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4017at.p4018a.p4019a.p4020a.C53750ah;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.opaonboarding.a.x */
/* compiled from: PG */
public final class C83864x extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C83864x f228509f;

    /* renamed from: g */
    private static volatile C63010eb f228510g;

    /* renamed from: a */
    public int f228511a;

    /* renamed from: b */
    public int f228512b;

    /* renamed from: c */
    public int f228513c;

    /* renamed from: d */
    public C63088z f228514d = C63088z.f170246b;

    /* renamed from: e */
    public C63088z f228515e = C63088z.f170246b;

    static {
        C83864x xVar = new C83864x();
        f228509f = xVar;
        C62942bv.registerDefaultInstance(C83864x.class, xVar);
    }

    private C83864x() {
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
                return newMessageInfo(f228509f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"a", "b", C83862v.f228508a, C45240c.f118157a, C53750ah.f141112a, "d", "e"});
            case 3:
                return new C83864x();
            case 4:
                return new C83861u();
            case 5:
                return f228509f;
            case 6:
                C63010eb ebVar = f228510g;
                if (ebVar == null) {
                    synchronized (C83864x.class) {
                        ebVar = f228510g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228509f);
                            f228510g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
