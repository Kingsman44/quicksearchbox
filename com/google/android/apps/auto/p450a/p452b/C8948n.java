package com.google.android.apps.auto.p450a.p452b;

import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.auto.a.b.n */
/* compiled from: PG */
public final class C8948n extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C8948n f31011g;

    /* renamed from: i */
    private static volatile C63010eb f31012i;

    /* renamed from: a */
    public int f31013a;

    /* renamed from: b */
    public long f31014b;

    /* renamed from: c */
    public long f31015c;

    /* renamed from: d */
    public long f31016d;

    /* renamed from: e */
    public double f31017e;

    /* renamed from: f */
    public double f31018f;

    /* renamed from: h */
    private int f31019h;

    static {
        C8948n nVar = new C8948n();
        f31011g = nVar;
        C62942bv.registerDefaultInstance(C8948n.class, nVar);
    }

    private C8948n() {
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
                return newMessageInfo(f31011g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005က\u0004\u0006က\u0005", new Object[]{C19618h.f54585a, "a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C8948n();
            case 4:
                return new C8947m();
            case 5:
                return f31011g;
            case 6:
                C63010eb ebVar = f31012i;
                if (ebVar == null) {
                    synchronized (C8948n.class) {
                        ebVar = f31012i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31011g);
                            f31012i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
