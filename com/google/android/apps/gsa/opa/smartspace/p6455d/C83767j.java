package com.google.android.apps.gsa.opa.smartspace.p6455d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.d.j */
/* compiled from: PG */
public final class C83767j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C83767j f228313c;

    /* renamed from: d */
    private static volatile C63010eb f228314d;

    /* renamed from: a */
    public int f228315a;

    /* renamed from: b */
    public long f228316b;

    static {
        C83767j jVar = new C83767j();
        f228313c = jVar;
        C62942bv.registerDefaultInstance(C83767j.class, jVar);
    }

    private C83767j() {
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
                return newMessageInfo(f228313c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C83767j();
            case 4:
                return new C83766i();
            case 5:
                return f228313c;
            case 6:
                C63010eb ebVar = f228314d;
                if (ebVar == null) {
                    synchronized (C83767j.class) {
                        ebVar = f228314d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228313c);
                            f228314d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
