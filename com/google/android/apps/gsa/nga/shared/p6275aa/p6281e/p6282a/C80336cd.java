package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.cd */
/* compiled from: PG */
public final class C80336cd extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C80336cd f220442f;

    /* renamed from: g */
    private static volatile C63010eb f220443g;

    /* renamed from: a */
    public int f220444a = 0;

    /* renamed from: b */
    public Object f220445b;

    /* renamed from: c */
    public String f220446c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f220447d;

    /* renamed from: e */
    public C80335cc f220448e;

    static {
        C80336cd cdVar = new C80336cd();
        f220442f = cdVar;
        C62942bv.registerDefaultInstance(C80336cd.class, cdVar);
    }

    private C80336cd() {
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
                return newMessageInfo(f220442f, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\t\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"b", "a", C45240c.f118157a, "d", "e", C80330by.class, C80328bw.class, C80333ca.class, C80324bs.class, C80326bu.class});
            case 3:
                return new C80336cd();
            case 4:
                return new C80322bq();
            case 5:
                return f220442f;
            case 6:
                C63010eb ebVar = f220443g;
                if (ebVar == null) {
                    synchronized (C80336cd.class) {
                        ebVar = f220443g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220442f);
                            f220443g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
