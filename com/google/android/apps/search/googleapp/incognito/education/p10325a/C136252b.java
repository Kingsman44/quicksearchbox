package com.google.android.apps.search.googleapp.incognito.education.p10325a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.incognito.education.a.b */
/* compiled from: PG */
public final class C136252b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C136252b f371056c;

    /* renamed from: d */
    private static volatile C63010eb f371057d;

    /* renamed from: a */
    public int f371058a;

    /* renamed from: b */
    public boolean f371059b;

    static {
        C136252b bVar = new C136252b();
        f371056c = bVar;
        C62942bv.registerDefaultInstance(C136252b.class, bVar);
    }

    private C136252b() {
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
                return newMessageInfo(f371056c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C136252b();
            case 4:
                return new C136251a();
            case 5:
                return f371056c;
            case 6:
                C63010eb ebVar = f371057d;
                if (ebVar == null) {
                    synchronized (C136252b.class) {
                        ebVar = f371057d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f371056c);
                            f371057d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
