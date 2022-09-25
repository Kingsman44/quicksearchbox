package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.c.d */
/* compiled from: PG */
public final class C128586d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C128586d f353551d;

    /* renamed from: e */
    private static volatile C63010eb f353552e;

    /* renamed from: a */
    public int f353553a;

    /* renamed from: b */
    public boolean f353554b;

    /* renamed from: c */
    public int f353555c;

    static {
        C128586d dVar = new C128586d();
        f353551d = dVar;
        C62942bv.registerDefaultInstance(C128586d.class, dVar);
    }

    private C128586d() {
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
                return newMessageInfo(f353551d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C128586d();
            case 4:
                return new C128585c();
            case 5:
                return f353551d;
            case 6:
                C63010eb ebVar = f353552e;
                if (ebVar == null) {
                    synchronized (C128586d.class) {
                        ebVar = f353552e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f353551d);
                            f353552e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
