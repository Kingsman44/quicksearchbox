package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ug */
/* compiled from: PG */
public final class C88238ug extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C88238ug f238487f;

    /* renamed from: g */
    private static volatile C63010eb f238488g;

    /* renamed from: a */
    public int f238489a;

    /* renamed from: b */
    public boolean f238490b;

    /* renamed from: c */
    public boolean f238491c;

    /* renamed from: d */
    public boolean f238492d;

    /* renamed from: e */
    public boolean f238493e;

    static {
        C88238ug ugVar = new C88238ug();
        f238487f = ugVar;
        C62942bv.registerDefaultInstance(C88238ug.class, ugVar);
    }

    private C88238ug() {
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
                return newMessageInfo(f238487f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C88238ug();
            case 4:
                return new C88237uf();
            case 5:
                return f238487f;
            case 6:
                C63010eb ebVar = f238488g;
                if (ebVar == null) {
                    synchronized (C88238ug.class) {
                        ebVar = f238488g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238487f);
                            f238488g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
