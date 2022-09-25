package com.google.android.apps.search.fedora.p10110k.p10112b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.fedora.k.b.g */
/* compiled from: PG */
public final class C133017g extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C133017g f362733b;

    /* renamed from: d */
    private static volatile C63010eb f362734d;

    /* renamed from: a */
    public boolean f362735a;

    /* renamed from: c */
    private int f362736c;

    static {
        C133017g gVar = new C133017g();
        f362733b = gVar;
        C62942bv.registerDefaultInstance(C133017g.class, gVar);
    }

    private C133017g() {
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
                return newMessageInfo(f362733b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C133017g();
            case 4:
                return new C133016f();
            case 5:
                return f362733b;
            case 6:
                C63010eb ebVar = f362734d;
                if (ebVar == null) {
                    synchronized (C133017g.class) {
                        ebVar = f362734d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362733b);
                            f362734d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
