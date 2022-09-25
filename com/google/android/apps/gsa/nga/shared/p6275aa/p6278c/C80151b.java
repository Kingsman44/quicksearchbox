package com.google.android.apps.gsa.nga.shared.p6275aa.p6278c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.c.b */
/* compiled from: PG */
public final class C80151b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80151b f219941c;

    /* renamed from: d */
    private static volatile C63010eb f219942d;

    /* renamed from: a */
    public int f219943a;

    /* renamed from: b */
    public boolean f219944b;

    static {
        C80151b bVar = new C80151b();
        f219941c = bVar;
        C62942bv.registerDefaultInstance(C80151b.class, bVar);
    }

    private C80151b() {
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
                return newMessageInfo(f219941c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C80151b();
            case 4:
                return new C80150a();
            case 5:
                return f219941c;
            case 6:
                C63010eb ebVar = f219942d;
                if (ebVar == null) {
                    synchronized (C80151b.class) {
                        ebVar = f219942d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219941c);
                            f219942d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
