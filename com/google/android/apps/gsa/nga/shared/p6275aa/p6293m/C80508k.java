package com.google.android.apps.gsa.nga.shared.p6275aa.p6293m;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.m.k */
/* compiled from: PG */
public final class C80508k extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C80508k f221004e;

    /* renamed from: f */
    private static volatile C63010eb f221005f;

    /* renamed from: a */
    public int f221006a;

    /* renamed from: b */
    public int f221007b;

    /* renamed from: c */
    public int f221008c;

    /* renamed from: d */
    public C52070ec f221009d;

    static {
        C80508k kVar = new C80508k();
        f221004e = kVar;
        C62942bv.registerDefaultInstance(C80508k.class, kVar);
    }

    private C80508k() {
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
                return newMessageInfo(f221004e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C80508k();
            case 4:
                return new C80507j();
            case 5:
                return f221004e;
            case 6:
                C63010eb ebVar = f221005f;
                if (ebVar == null) {
                    synchronized (C80508k.class) {
                        ebVar = f221005f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221004e);
                            f221005f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
