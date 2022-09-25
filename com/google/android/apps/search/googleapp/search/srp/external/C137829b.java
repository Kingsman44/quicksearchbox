package com.google.android.apps.search.googleapp.search.srp.external;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.external.b */
/* compiled from: PG */
public final class C137829b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C137829b f374984d;

    /* renamed from: e */
    private static volatile C63010eb f374985e;

    /* renamed from: a */
    public int f374986a;

    /* renamed from: b */
    public boolean f374987b;

    /* renamed from: c */
    public C63042fg f374988c;

    static {
        C137829b bVar = new C137829b();
        f374984d = bVar;
        C62942bv.registerDefaultInstance(C137829b.class, bVar);
    }

    private C137829b() {
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
                return newMessageInfo(f374984d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C137829b();
            case 4:
                return new C137828a();
            case 5:
                return f374984d;
            case 6:
                C63010eb ebVar = f374985e;
                if (ebVar == null) {
                    synchronized (C137829b.class) {
                        ebVar = f374985e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f374984d);
                            f374985e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
