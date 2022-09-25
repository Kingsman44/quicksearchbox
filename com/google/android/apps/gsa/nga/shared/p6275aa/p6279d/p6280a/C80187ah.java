package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.ah */
/* compiled from: PG */
public final class C80187ah extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C80187ah f220007e;

    /* renamed from: f */
    private static volatile C63010eb f220008f;

    /* renamed from: a */
    public int f220009a;

    /* renamed from: b */
    public int f220010b;

    /* renamed from: c */
    public String f220011c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f220012d = BuildConfig.FLAVOR;

    static {
        C80187ah ahVar = new C80187ah();
        f220007e = ahVar;
        C62942bv.registerDefaultInstance(C80187ah.class, ahVar);
    }

    private C80187ah() {
        emptyProtobufList();
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
                return newMessageInfo(f220007e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002င\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C80187ah();
            case 4:
                return new C80186ag();
            case 5:
                return f220007e;
            case 6:
                C63010eb ebVar = f220008f;
                if (ebVar == null) {
                    synchronized (C80187ah.class) {
                        ebVar = f220008f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220007e);
                            f220008f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
