package com.google.android.libraries.mdi.download;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.download.be */
/* compiled from: PG */
public final class C28727be extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C28727be f78039b;

    /* renamed from: d */
    private static volatile C63010eb f78040d;

    /* renamed from: a */
    public String f78041a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f78042c;

    static {
        C28727be beVar = new C28727be();
        f78039b = beVar;
        C62942bv.registerDefaultInstance(C28727be.class, beVar);
    }

    private C28727be() {
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
                return newMessageInfo(f78039b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C28727be();
            case 4:
                return new C28726bd();
            case 5:
                return f78039b;
            case 6:
                C63010eb ebVar = f78040d;
                if (ebVar == null) {
                    synchronized (C28727be.class) {
                        ebVar = f78040d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f78039b);
                            f78040d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
