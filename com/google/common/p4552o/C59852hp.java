package com.google.common.p4552o;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.hp */
/* compiled from: PG */
public final class C59852hp extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C59852hp f161741h;

    /* renamed from: i */
    private static volatile C63010eb f161742i;

    /* renamed from: a */
    public int f161743a;

    /* renamed from: b */
    public int f161744b;

    /* renamed from: c */
    public long f161745c;

    /* renamed from: d */
    public long f161746d;

    /* renamed from: e */
    public long f161747e;

    /* renamed from: f */
    public C59854hr f161748f;

    /* renamed from: g */
    public C62971cq f161749g = emptyProtobufList();

    static {
        C59852hp hpVar = new C59852hp();
        f161741h = hpVar;
        C62942bv.registerDefaultInstance(C59852hp.class, hpVar);
    }

    private C59852hp() {
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
                return newMessageInfo(f161741h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဉ\u0004\u0006\u001b", new Object[]{"a", "b", C59850hn.f161740a, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C59854hr.class});
            case 3:
                return new C59852hp();
            case 4:
                return new C59849hm();
            case 5:
                return f161741h;
            case 6:
                C63010eb ebVar = f161742i;
                if (ebVar == null) {
                    synchronized (C59852hp.class) {
                        ebVar = f161742i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161741h);
                            f161742i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
