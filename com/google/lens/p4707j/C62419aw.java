package com.google.lens.p4707j;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.aw */
/* compiled from: PG */
public final class C62419aw extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62419aw f168491e;

    /* renamed from: h */
    private static volatile C63010eb f168492h;

    /* renamed from: a */
    public int f168493a = 0;

    /* renamed from: b */
    public Object f168494b;

    /* renamed from: c */
    public C62431bh f168495c;

    /* renamed from: d */
    public int f168496d;

    /* renamed from: f */
    private int f168497f;

    /* renamed from: g */
    private byte f168498g = 2;

    static {
        C62419aw awVar = new C62419aw();
        f168491e = awVar;
        C62942bv.registerDefaultInstance(C62419aw.class, awVar);
    }

    private C62419aw() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168498g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168498g = b;
                return null;
            case 2:
                return newMessageInfo(f168491e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဌ\u0001\u0003ᐼ\u0000", new Object[]{"b", "a", C10662f.f35572a, C45240c.f118157a, "d", C62428be.f168520a, C62563ge.class});
            case 3:
                return new C62419aw();
            case 4:
                return new C62418av();
            case 5:
                return f168491e;
            case 6:
                C63010eb ebVar = f168492h;
                if (ebVar == null) {
                    synchronized (C62419aw.class) {
                        ebVar = f168492h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168491e);
                            f168492h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
