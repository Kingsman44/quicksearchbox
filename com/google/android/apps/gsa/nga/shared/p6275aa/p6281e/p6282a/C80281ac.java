package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.ac */
/* compiled from: PG */
public final class C80281ac extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80281ac f220298c;

    /* renamed from: d */
    private static volatile C63010eb f220299d;

    /* renamed from: a */
    public String f220300a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public long f220301b;

    static {
        C80281ac acVar = new C80281ac();
        f220298c = acVar;
        C62942bv.registerDefaultInstance(C80281ac.class, acVar);
    }

    private C80281ac() {
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
                return newMessageInfo(f220298c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0002", new Object[]{"a", "b"});
            case 3:
                return new C80281ac();
            case 4:
                return new C80280ab();
            case 5:
                return f220298c;
            case 6:
                C63010eb ebVar = f220299d;
                if (ebVar == null) {
                    synchronized (C80281ac.class) {
                        ebVar = f220299d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220298c);
                            f220299d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
