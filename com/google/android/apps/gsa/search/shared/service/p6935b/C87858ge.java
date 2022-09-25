package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ge */
/* compiled from: PG */
public final class C87858ge extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C87858ge f237699b;

    /* renamed from: d */
    private static volatile C63010eb f237700d;

    /* renamed from: a */
    public C63088z f237701a = C63088z.f170246b;

    /* renamed from: c */
    private int f237702c;

    static {
        C87858ge geVar = new C87858ge();
        f237699b = geVar;
        C62942bv.registerDefaultInstance(C87858ge.class, geVar);
    }

    private C87858ge() {
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
                return newMessageInfo(f237699b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C87858ge();
            case 4:
                return new C87857gd();
            case 5:
                return f237699b;
            case 6:
                C63010eb ebVar = f237700d;
                if (ebVar == null) {
                    synchronized (C87858ge.class) {
                        ebVar = f237700d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237699b);
                            f237700d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
