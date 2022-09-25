package com.google.common.p4552o.p4566l;

import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.aqu;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.n */
/* compiled from: PG */
public final class C60214n extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C60214n f162914g;

    /* renamed from: j */
    private static volatile C63010eb f162915j;

    /* renamed from: a */
    public int f162916a;

    /* renamed from: b */
    public int f162917b = -1;

    /* renamed from: c */
    public int f162918c;

    /* renamed from: d */
    public int f162919d = -1;

    /* renamed from: e */
    public int f162920e;

    /* renamed from: f */
    public C60218r f162921f;

    /* renamed from: h */
    private aqu f162922h;

    /* renamed from: i */
    private byte f162923i = 2;

    static {
        C60214n nVar = new C60214n();
        f162914g = nVar;
        C62942bv.registerDefaultInstance(C60214n.class, nVar);
    }

    private C60214n() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f162923i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f162923i = b;
                return null;
            case 2:
                return newMessageInfo(f162914g, "\u0001\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0000\u0001\u0001င\u0000\u0002င\u0003\u0005င\u0005\u0007င\u0007\rᐉ\u000b\u000fဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C19618h.f54585a});
            case 3:
                return new C60214n();
            case 4:
                return new C60213m();
            case 5:
                return f162914g;
            case 6:
                C63010eb ebVar = f162915j;
                if (ebVar == null) {
                    synchronized (C60214n.class) {
                        ebVar = f162915j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162914g);
                            f162915j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
