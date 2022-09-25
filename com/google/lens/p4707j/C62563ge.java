package com.google.lens.p4707j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.ge */
/* compiled from: PG */
public final class C62563ge extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62563ge f168910d;

    /* renamed from: g */
    private static volatile C63010eb f168911g;

    /* renamed from: a */
    public int f168912a = 0;

    /* renamed from: b */
    public Object f168913b;

    /* renamed from: c */
    public int f168914c;

    /* renamed from: e */
    private int f168915e;

    /* renamed from: f */
    private byte f168916f = 2;

    static {
        C62563ge geVar = new C62563ge();
        f168910d = geVar;
        C62942bv.registerDefaultInstance(C62563ge.class, geVar);
    }

    private C62563ge() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168916f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168916f = b;
                return null;
            case 2:
                return newMessageInfo(f168910d, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0003\u0001ဌ\u0000\u0002ᐼ\u0000\u0003ᐼ\u0000\u0004ြ\u0000\u0005ᐼ\u0000", new Object[]{"b", "a", "e", C45240c.f118157a, C62564gf.f168917a, C62550fs.class, C62552fu.class, C62540fi.class, C62544fm.class});
            case 3:
                return new C62563ge();
            case 4:
                return new C62562gd();
            case 5:
                return f168910d;
            case 6:
                C63010eb ebVar = f168911g;
                if (ebVar == null) {
                    synchronized (C62563ge.class) {
                        ebVar = f168911g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168910d);
                            f168911g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
