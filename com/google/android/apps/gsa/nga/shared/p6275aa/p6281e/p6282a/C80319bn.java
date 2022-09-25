package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.bn */
/* compiled from: PG */
public final class C80319bn extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C80319bn f220407d;

    /* renamed from: e */
    private static volatile C63010eb f220408e;

    /* renamed from: a */
    public String f220409a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C80317bl f220410b;

    /* renamed from: c */
    public C80317bl f220411c;

    static {
        C80319bn bnVar = new C80319bn();
        f220407d = bnVar;
        C62942bv.registerDefaultInstance(C80319bn.class, bnVar);
    }

    private C80319bn() {
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
                return newMessageInfo(f220407d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\t", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C80319bn();
            case 4:
                return new C80318bm();
            case 5:
                return f220407d;
            case 6:
                C63010eb ebVar = f220408e;
                if (ebVar == null) {
                    synchronized (C80319bn.class) {
                        ebVar = f220408e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220407d);
                            f220408e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
