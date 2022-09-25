package com.google.android.apps.search.googleapp.discover.p10166a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.a.g */
/* compiled from: PG */
public final class C133993g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C133993g f364982c;

    /* renamed from: d */
    private static volatile C63010eb f364983d;

    /* renamed from: a */
    public int f364984a;

    /* renamed from: b */
    public long f364985b;

    static {
        C133993g gVar = new C133993g();
        f364982c = gVar;
        C62942bv.registerDefaultInstance(C133993g.class, gVar);
    }

    private C133993g() {
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
                return newMessageInfo(f364982c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C133993g();
            case 4:
                return new C133992f();
            case 5:
                return f364982c;
            case 6:
                C63010eb ebVar = f364983d;
                if (ebVar == null) {
                    synchronized (C133993g.class) {
                        ebVar = f364983d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f364982c);
                            f364983d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
