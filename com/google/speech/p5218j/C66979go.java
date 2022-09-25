package com.google.speech.p5218j;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.go */
/* compiled from: PG */
public final class C66979go extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C66979go f182056g;

    /* renamed from: h */
    private static volatile C63010eb f182057h;

    /* renamed from: a */
    public int f182058a;

    /* renamed from: b */
    public int f182059b = 0;

    /* renamed from: c */
    public Object f182060c;

    /* renamed from: d */
    public boolean f182061d;

    /* renamed from: e */
    public boolean f182062e;

    /* renamed from: f */
    public int f182063f;

    static {
        C66979go goVar = new C66979go();
        f182056g = goVar;
        C62942bv.registerDefaultInstance(C66979go.class, goVar);
    }

    private C66979go() {
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
                return newMessageInfo(f182056g, "\u0001\u0005\u0001\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ွ\u0000\u0005ျ\u0000\u0006ဇ\u0005\u0007င\u0006", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C10662f.f35572a});
            case 3:
                return new C66979go();
            case 4:
                return new C66978gn();
            case 5:
                return f182056g;
            case 6:
                C63010eb ebVar = f182057h;
                if (ebVar == null) {
                    synchronized (C66979go.class) {
                        ebVar = f182057h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182056g);
                            f182057h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
