package com.google.assistant.p3897e.p3921j;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;

/* renamed from: com.google.assistant.e.j.adm */
/* compiled from: PG */
public final class adm extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final adm f134889h;

    /* renamed from: i */
    private static volatile C63010eb f134890i;

    /* renamed from: a */
    public int f134891a;

    /* renamed from: b */
    public C52623yp f134892b;

    /* renamed from: c */
    public int f134893c = 1;

    /* renamed from: d */
    public int f134894d;

    /* renamed from: e */
    public int f134895e;

    /* renamed from: f */
    public C52121g f134896f;

    /* renamed from: g */
    public C62971cq f134897g = emptyProtobufList();

    static {
        adm adm = new adm();
        f134889h = adm;
        C62942bv.registerDefaultInstance(adm.class, adm);
    }

    private adm() {
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
                return newMessageInfo(f134889h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0006ဉ\u0005\u0007\u001b", new Object[]{"a", "b", C45240c.f118157a, adk.f134888a, "d", adg.f134886a, "e", adi.f134887a, C10662f.f35572a, C30325g.f82003a, C63070h.class});
            case 3:
                return new adm();
            case 4:
                return new adf();
            case 5:
                return f134889h;
            case 6:
                C63010eb ebVar = f134890i;
                if (ebVar == null) {
                    synchronized (adm.class) {
                        ebVar = f134890i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134889h);
                            f134890i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
