package com.google.android.libraries.mdi.download;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.download.bj */
/* compiled from: PG */
public final class C28732bj extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C28732bj f78053b;

    /* renamed from: d */
    private static volatile C63010eb f78054d;

    /* renamed from: a */
    public String f78055a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f78056c;

    static {
        C28732bj bjVar = new C28732bj();
        f78053b = bjVar;
        C62942bv.registerDefaultInstance(C28732bj.class, bjVar);
    }

    private C28732bj() {
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
                return newMessageInfo(f78053b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C28732bj();
            case 4:
                return new C28731bi();
            case 5:
                return f78053b;
            case 6:
                C63010eb ebVar = f78054d;
                if (ebVar == null) {
                    synchronized (C28732bj.class) {
                        ebVar = f78054d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f78053b);
                            f78054d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
