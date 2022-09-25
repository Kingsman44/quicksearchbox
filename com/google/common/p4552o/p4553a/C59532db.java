package com.google.common.p4552o.p4553a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.db */
/* compiled from: PG */
public final class C59532db extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59532db f157973d;

    /* renamed from: e */
    private static volatile C63010eb f157974e;

    /* renamed from: a */
    public int f157975a;

    /* renamed from: b */
    public String f157976b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f157977c;

    static {
        C59532db dbVar = new C59532db();
        f157973d = dbVar;
        C62942bv.registerDefaultInstance(C59532db.class, dbVar);
    }

    private C59532db() {
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
                return newMessageInfo(f157973d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C59532db();
            case 4:
                return new C59531da();
            case 5:
                return f157973d;
            case 6:
                C63010eb ebVar = f157974e;
                if (ebVar == null) {
                    synchronized (C59532db.class) {
                        ebVar = f157974e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157973d);
                            f157974e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
