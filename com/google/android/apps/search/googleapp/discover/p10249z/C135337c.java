package com.google.android.apps.search.googleapp.discover.p10249z;

import com.google.p4283bv.p4354e.C57528m;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.z.c */
/* compiled from: PG */
public final class C135337c extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62962ci f368733b = new C135276a();

    /* renamed from: c */
    public static final C135337c f368734c;

    /* renamed from: d */
    private static volatile C63010eb f368735d;

    /* renamed from: a */
    public C62961ch f368736a = emptyIntList();

    static {
        C135337c cVar = new C135337c();
        f368734c = cVar;
        C62942bv.registerDefaultInstance(C135337c.class, cVar);
    }

    private C135337c() {
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
                return newMessageInfo(f368734c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", C57528m.m88370b()});
            case 3:
                return new C135337c();
            case 4:
                return new C135320b();
            case 5:
                return f368734c;
            case 6:
                C63010eb ebVar = f368735d;
                if (ebVar == null) {
                    synchronized (C135337c.class) {
                        ebVar = f368735d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f368734c);
                            f368735d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
