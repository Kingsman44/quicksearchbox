package com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a;

import com.google.android.apps.gsa.opaonboarding.p6462d.C83930q;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3861at.C50347ts;
import com.google.p4017at.p4018a.p4019a.p4020a.C53750ah;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.a.h */
/* compiled from: PG */
public final class C109776h extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C109776h f305880h;

    /* renamed from: i */
    private static volatile C63010eb f305881i;

    /* renamed from: a */
    public int f305882a;

    /* renamed from: b */
    public C109778j f305883b;

    /* renamed from: c */
    public C63088z f305884c = C63088z.f170246b;

    /* renamed from: d */
    public int f305885d;

    /* renamed from: e */
    public int f305886e;

    /* renamed from: f */
    public C50347ts f305887f;

    /* renamed from: g */
    public C63088z f305888g = C63088z.f170246b;

    static {
        C109776h hVar = new C109776h();
        f305880h = hVar;
        C62942bv.registerDefaultInstance(C109776h.class, hVar);
    }

    private C109776h() {
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
                return newMessageInfo(f305880h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဉ\u0004\u0006ည\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", C53750ah.f141112a, "e", C83930q.f228588a, C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C109776h();
            case 4:
                return new C109775g();
            case 5:
                return f305880h;
            case 6:
                C63010eb ebVar = f305881i;
                if (ebVar == null) {
                    synchronized (C109776h.class) {
                        ebVar = f305881i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f305880h);
                            f305881i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
