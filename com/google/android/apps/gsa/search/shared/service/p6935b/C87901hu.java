package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.hu */
/* compiled from: PG */
public final class C87901hu extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87901hu f237784c;

    /* renamed from: d */
    private static volatile C63010eb f237785d;

    /* renamed from: a */
    public int f237786a;

    /* renamed from: b */
    public int f237787b;

    static {
        C87901hu huVar = new C87901hu();
        f237784c = huVar;
        C62942bv.registerDefaultInstance(C87901hu.class, huVar);
    }

    private C87901hu() {
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
                return newMessageInfo(f237784c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C87901hu();
            case 4:
                return new C87900ht();
            case 5:
                return f237784c;
            case 6:
                C63010eb ebVar = f237785d;
                if (ebVar == null) {
                    synchronized (C87901hu.class) {
                        ebVar = f237785d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237784c);
                            f237785d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
