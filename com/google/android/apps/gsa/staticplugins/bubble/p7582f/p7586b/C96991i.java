package com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7586b;

import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7587c.C97015t;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.f.b.i */
/* compiled from: PG */
public final class C96991i extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C96991i f271051b;

    /* renamed from: e */
    private static volatile C63010eb f271052e;

    /* renamed from: a */
    public C97015t f271053a;

    /* renamed from: c */
    private int f271054c;

    /* renamed from: d */
    private byte f271055d = 2;

    static {
        C96991i iVar = new C96991i();
        f271051b = iVar;
        C62942bv.registerDefaultInstance(C96991i.class, iVar);
    }

    private C96991i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f271055d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f271055d = b;
                return null;
            case 2:
                return newMessageInfo(f271051b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C96991i();
            case 4:
                return new C96990h();
            case 5:
                return f271051b;
            case 6:
                C63010eb ebVar = f271052e;
                if (ebVar == null) {
                    synchronized (C96991i.class) {
                        ebVar = f271052e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f271051b);
                            f271052e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
