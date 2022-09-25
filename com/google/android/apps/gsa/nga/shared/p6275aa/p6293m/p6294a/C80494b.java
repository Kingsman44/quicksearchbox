package com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.p6294a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.m.a.b */
/* compiled from: PG */
public final class C80494b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80494b f220964c;

    /* renamed from: d */
    private static volatile C63010eb f220965d;

    /* renamed from: a */
    public float f220966a;

    /* renamed from: b */
    public float f220967b;

    static {
        C80494b bVar = new C80494b();
        f220964c = bVar;
        C62942bv.registerDefaultInstance(C80494b.class, bVar);
    }

    private C80494b() {
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
                return newMessageInfo(f220964c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0002\u0001", new Object[]{"a", "b"});
            case 3:
                return new C80494b();
            case 4:
                return new C80493a();
            case 5:
                return f220964c;
            case 6:
                C63010eb ebVar = f220965d;
                if (ebVar == null) {
                    synchronized (C80494b.class) {
                        ebVar = f220965d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220964c);
                            f220965d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
