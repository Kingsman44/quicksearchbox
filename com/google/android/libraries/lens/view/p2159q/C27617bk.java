package com.google.android.libraries.lens.view.p2159q;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.libraries.lens.view.q.bk */
/* compiled from: PG */
public final class C27617bk extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C27617bk f75453e;

    /* renamed from: f */
    private static volatile C63010eb f75454f;

    /* renamed from: a */
    public int f75455a;

    /* renamed from: b */
    public C63042fg f75456b;

    /* renamed from: c */
    public String f75457c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f75458d = BuildConfig.FLAVOR;

    static {
        C27617bk bkVar = new C27617bk();
        f75453e = bkVar;
        C62942bv.registerDefaultInstance(C27617bk.class, bkVar);
    }

    private C27617bk() {
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
                return newMessageInfo(f75453e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C27617bk();
            case 4:
                return new C27616bj();
            case 5:
                return f75453e;
            case 6:
                C63010eb ebVar = f75454f;
                if (ebVar == null) {
                    synchronized (C27617bk.class) {
                        ebVar = f75454f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f75453e);
                            f75454f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
