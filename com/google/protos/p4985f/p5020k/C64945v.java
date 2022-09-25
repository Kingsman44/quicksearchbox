package com.google.protos.p4985f.p5020k;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.k.v */
/* compiled from: PG */
public final class C64945v extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64945v f175887a;

    /* renamed from: e */
    private static volatile C63010eb f175888e;

    /* renamed from: b */
    private C62995dn f175889b = C62995dn.f170057a;

    /* renamed from: c */
    private C62995dn f175890c = C62995dn.f170057a;

    /* renamed from: d */
    private byte f175891d = 2;

    static {
        C64945v vVar = new C64945v();
        f175887a = vVar;
        C62942bv.registerDefaultInstance(C64945v.class, vVar);
    }

    private C64945v() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f175891d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f175891d = b;
                return null;
            case 2:
                return newMessageInfo(f175887a, "\u0001\u0002\u0000\u0000\u0002\u0003\u0002\u0002\u0000\u0001\u00022\u0003в", new Object[]{"b", C64944u.f175886a, C45240c.f118157a, C64943t.f175885a});
            case 3:
                return new C64945v();
            case 4:
                return new C64942s();
            case 5:
                return f175887a;
            case 6:
                C63010eb ebVar = f175888e;
                if (ebVar == null) {
                    synchronized (C64945v.class) {
                        ebVar = f175888e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175887a);
                            f175888e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
