package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.j */
/* compiled from: PG */
public final class C80469j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80469j f220856b;

    /* renamed from: d */
    private static volatile C63010eb f220857d;

    /* renamed from: a */
    public String f220858a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f220859c;

    static {
        C80469j jVar = new C80469j();
        f220856b = jVar;
        C62942bv.registerDefaultInstance(C80469j.class, jVar);
    }

    private C80469j() {
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
                return newMessageInfo(f220856b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C80469j();
            case 4:
                return new C80452i();
            case 5:
                return f220856b;
            case 6:
                C63010eb ebVar = f220857d;
                if (ebVar == null) {
                    synchronized (C80469j.class) {
                        ebVar = f220857d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220856b);
                            f220857d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
