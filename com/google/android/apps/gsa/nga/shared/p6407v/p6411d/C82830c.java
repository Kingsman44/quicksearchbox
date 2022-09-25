package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.c */
/* compiled from: PG */
public final class C82830c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C82830c f225706c;

    /* renamed from: d */
    private static volatile C63010eb f225707d;

    /* renamed from: a */
    public int f225708a;

    /* renamed from: b */
    public int f225709b;

    static {
        C82830c cVar = new C82830c();
        f225706c = cVar;
        C62942bv.registerDefaultInstance(C82830c.class, cVar);
    }

    private C82830c() {
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
                return newMessageInfo(f225706c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C82776a.f225543a});
            case 3:
                return new C82830c();
            case 4:
                return new C82803b();
            case 5:
                return f225706c;
            case 6:
                C63010eb ebVar = f225707d;
                if (ebVar == null) {
                    synchronized (C82830c.class) {
                        ebVar = f225707d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225706c);
                            f225707d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
