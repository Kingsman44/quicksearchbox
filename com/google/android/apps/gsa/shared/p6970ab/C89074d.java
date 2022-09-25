package com.google.android.apps.gsa.shared.p6970ab;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.ab.d */
/* compiled from: PG */
public final class C89074d extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C89074d f241391g;

    /* renamed from: h */
    private static volatile C63010eb f241392h;

    /* renamed from: a */
    public int f241393a;

    /* renamed from: b */
    public double f241394b;

    /* renamed from: c */
    public int f241395c;

    /* renamed from: d */
    public int f241396d;

    /* renamed from: e */
    public int f241397e;

    /* renamed from: f */
    public int f241398f;

    static {
        C89074d dVar = new C89074d();
        f241391g = dVar;
        C62942bv.registerDefaultInstance(C89074d.class, dVar);
    }

    private C89074d() {
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
                return newMessageInfo(f241391g, "\u0001\u0005\u0000\u0001\u0003\r\u0005\u0000\u0000\u0000\u0003က\u0002\nဋ\t\u000bဋ\n\fဋ\u000b\rဋ\f", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C89074d();
            case 4:
                return new C89073c();
            case 5:
                return f241391g;
            case 6:
                C63010eb ebVar = f241392h;
                if (ebVar == null) {
                    synchronized (C89074d.class) {
                        ebVar = f241392h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f241391g);
                            f241392h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
