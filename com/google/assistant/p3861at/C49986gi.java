package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.gi */
/* compiled from: PG */
public final class C49986gi extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49986gi f129937b;

    /* renamed from: d */
    private static volatile C63010eb f129938d;

    /* renamed from: a */
    public C49982ge f129939a;

    /* renamed from: c */
    private int f129940c;

    static {
        C49986gi giVar = new C49986gi();
        f129937b = giVar;
        C62942bv.registerDefaultInstance(C49986gi.class, giVar);
    }

    private C49986gi() {
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
                return newMessageInfo(f129937b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C49986gi();
            case 4:
                return new C49985gh();
            case 5:
                return f129937b;
            case 6:
                C63010eb ebVar = f129938d;
                if (ebVar == null) {
                    synchronized (C49986gi.class) {
                        ebVar = f129938d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129937b);
                            f129938d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
