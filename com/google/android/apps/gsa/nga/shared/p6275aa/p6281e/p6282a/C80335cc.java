package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.cc */
/* compiled from: PG */
public final class C80335cc extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C80335cc f220436e;

    /* renamed from: f */
    private static volatile C63010eb f220437f;

    /* renamed from: a */
    public String f220438a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f220439b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f220440c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f220441d = BuildConfig.FLAVOR;

    static {
        C80335cc ccVar = new C80335cc();
        f220436e = ccVar;
        C62942bv.registerDefaultInstance(C80335cc.class, ccVar);
    }

    private C80335cc() {
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
                return newMessageInfo(f220436e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C80335cc();
            case 4:
                return new C80334cb();
            case 5:
                return f220436e;
            case 6:
                C63010eb ebVar = f220437f;
                if (ebVar == null) {
                    synchronized (C80335cc.class) {
                        ebVar = f220437f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220436e);
                            f220437f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
