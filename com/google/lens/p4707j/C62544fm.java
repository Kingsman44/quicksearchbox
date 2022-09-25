package com.google.lens.p4707j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4698d.C62167f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.fm */
/* compiled from: PG */
public final class C62544fm extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62544fm f168854b;

    /* renamed from: e */
    private static volatile C63010eb f168855e;

    /* renamed from: a */
    public C62167f f168856a;

    /* renamed from: c */
    private int f168857c;

    /* renamed from: d */
    private byte f168858d = 2;

    static {
        C62544fm fmVar = new C62544fm();
        f168854b = fmVar;
        C62942bv.registerDefaultInstance(C62544fm.class, fmVar);
    }

    private C62544fm() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168858d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168858d = b;
                return null;
            case 2:
                return newMessageInfo(f168854b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C62544fm();
            case 4:
                return new C62543fl();
            case 5:
                return f168854b;
            case 6:
                C63010eb ebVar = f168855e;
                if (ebVar == null) {
                    synchronized (C62544fm.class) {
                        ebVar = f168855e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168854b);
                            f168855e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
