package com.google.android.apps.search.googleapp.discover.p10214s;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.googleapp.discover.s.bo */
/* compiled from: PG */
public final class C134577bo extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C134577bo f366511f;

    /* renamed from: g */
    private static volatile C63010eb f366512g;

    /* renamed from: a */
    public int f366513a;

    /* renamed from: b */
    public long f366514b;

    /* renamed from: c */
    public long f366515c;

    /* renamed from: d */
    public long f366516d;

    /* renamed from: e */
    public C63042fg f366517e;

    static {
        C134577bo boVar = new C134577bo();
        f366511f = boVar;
        C62942bv.registerDefaultInstance(C134577bo.class, boVar);
    }

    private C134577bo() {
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
                return newMessageInfo(f366511f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C134577bo();
            case 4:
                return new C134576bn();
            case 5:
                return f366511f;
            case 6:
                C63010eb ebVar = f366512g;
                if (ebVar == null) {
                    synchronized (C134577bo.class) {
                        ebVar = f366512g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366511f);
                            f366512g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
