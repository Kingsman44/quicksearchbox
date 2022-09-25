package com.google.protos.p4874ap.p4877b.p4878a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.protos.ap.b.a.u */
/* compiled from: PG */
public final class C63710u extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63710u f172252d;

    /* renamed from: f */
    private static volatile C63010eb f172253f;

    /* renamed from: a */
    public C62971cq f172254a = emptyProtobufList();

    /* renamed from: b */
    public C63042fg f172255b;

    /* renamed from: c */
    public String f172256c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f172257e;

    static {
        C63710u uVar = new C63710u();
        f172252d = uVar;
        C62942bv.registerDefaultInstance(C63710u.class, uVar);
    }

    private C63710u() {
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
                return newMessageInfo(f172252d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဈ\u0001", new Object[]{"e", "a", C63709t.class, "b", C45240c.f118157a});
            case 3:
                return new C63710u();
            case 4:
                return new C63707r();
            case 5:
                return f172252d;
            case 6:
                C63010eb ebVar = f172253f;
                if (ebVar == null) {
                    synchronized (C63710u.class) {
                        ebVar = f172253f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172252d);
                            f172253f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
