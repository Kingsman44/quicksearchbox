package com.google.android.apps.auto.p450a.p452b;

import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.auto.a.b.l */
/* compiled from: PG */
public final class C8946l extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C8946l f31002g;

    /* renamed from: i */
    private static volatile C63010eb f31003i;

    /* renamed from: a */
    public int f31004a;

    /* renamed from: b */
    public C62910ar f31005b;

    /* renamed from: c */
    public C62910ar f31006c;

    /* renamed from: d */
    public C62910ar f31007d;

    /* renamed from: e */
    public C62910ar f31008e;

    /* renamed from: f */
    public C62910ar f31009f;

    /* renamed from: h */
    private int f31010h;

    static {
        C8946l lVar = new C8946l();
        f31002g = lVar;
        C62942bv.registerDefaultInstance(C8946l.class, lVar);
    }

    private C8946l() {
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
                return newMessageInfo(f31002g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{C19618h.f54585a, "a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C8946l();
            case 4:
                return new C8945k();
            case 5:
                return f31002g;
            case 6:
                C63010eb ebVar = f31003i;
                if (ebVar == null) {
                    synchronized (C8946l.class) {
                        ebVar = f31003i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31002g);
                            f31003i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
