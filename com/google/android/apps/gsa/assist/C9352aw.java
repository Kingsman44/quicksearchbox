package com.google.android.apps.gsa.assist;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assist.aw */
/* compiled from: PG */
public final class C9352aw extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C9352aw f32476g;

    /* renamed from: h */
    private static volatile C63010eb f32477h;

    /* renamed from: a */
    public int f32478a;

    /* renamed from: b */
    public C9360ba f32479b;

    /* renamed from: c */
    public C9364be f32480c;

    /* renamed from: d */
    public C9366bg f32481d;

    /* renamed from: e */
    public C9350au f32482e;

    /* renamed from: f */
    public C9354ay f32483f;

    static {
        C9352aw awVar = new C9352aw();
        f32476g = awVar;
        C62942bv.registerDefaultInstance(C9352aw.class, awVar);
    }

    private C9352aw() {
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
                return newMessageInfo(f32476g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C9352aw();
            case 4:
                return new C9351av();
            case 5:
                return f32476g;
            case 6:
                C63010eb ebVar = f32477h;
                if (ebVar == null) {
                    synchronized (C9352aw.class) {
                        ebVar = f32477h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32476g);
                            f32477h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
