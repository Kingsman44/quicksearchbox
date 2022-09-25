package com.google.android.apps.gsa.p496a.p497a.p498a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.a.a.a.c */
/* compiled from: PG */
public final class C9303c extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C9303c f32288b;

    /* renamed from: d */
    private static volatile C63010eb f32289d;

    /* renamed from: a */
    public boolean f32290a;

    /* renamed from: c */
    private int f32291c;

    static {
        C9303c cVar = new C9303c();
        f32288b = cVar;
        C62942bv.registerDefaultInstance(C9303c.class, cVar);
    }

    private C9303c() {
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
                return newMessageInfo(f32288b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဇ\u0002", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C9303c();
            case 4:
                return new C9302b();
            case 5:
                return f32288b;
            case 6:
                C63010eb ebVar = f32289d;
                if (ebVar == null) {
                    synchronized (C9303c.class) {
                        ebVar = f32289d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32288b);
                            f32289d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
