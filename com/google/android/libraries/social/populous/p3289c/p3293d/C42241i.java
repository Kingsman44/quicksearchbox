package com.google.android.libraries.social.populous.p3289c.p3293d;

import com.google.p4181bi.C55808ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.social.populous.c.d.i */
/* compiled from: PG */
public final class C42241i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C42241i f110587c;

    /* renamed from: e */
    private static volatile C63010eb f110588e;

    /* renamed from: a */
    public C55808ar f110589a;

    /* renamed from: b */
    public C42237e f110590b;

    /* renamed from: d */
    private byte f110591d = 2;

    static {
        C42241i iVar = new C42241i();
        f110587c = iVar;
        C62942bv.registerDefaultInstance(C42241i.class, iVar);
    }

    private C42241i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f110591d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f110591d = b;
                return null;
            case 2:
                return newMessageInfo(f110587c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001Љ\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C42241i();
            case 4:
                return new C42240h();
            case 5:
                return f110587c;
            case 6:
                C63010eb ebVar = f110588e;
                if (ebVar == null) {
                    synchronized (C42241i.class) {
                        ebVar = f110588e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f110587c);
                            f110588e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
