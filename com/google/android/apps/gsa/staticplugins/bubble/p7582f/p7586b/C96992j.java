package com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7586b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.f.b.j */
/* compiled from: PG */
public final class C96992j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C96992j f271056c;

    /* renamed from: e */
    private static volatile C63010eb f271057e;

    /* renamed from: a */
    public int f271058a = 0;

    /* renamed from: b */
    public Object f271059b;

    /* renamed from: d */
    private byte f271060d = 2;

    static {
        C96992j jVar = new C96992j();
        f271056c = jVar;
        C62942bv.registerDefaultInstance(C96992j.class, jVar);
    }

    private C96992j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f271060d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f271060d = b;
                return null;
            case 2:
                return newMessageInfo(f271056c, "\u0001\u0001\u0001\u0000\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐼ\u0000", new Object[]{"b", "a", C96991i.class});
            case 3:
                return new C96992j();
            case 4:
                return new C96989g();
            case 5:
                return f271056c;
            case 6:
                C63010eb ebVar = f271057e;
                if (ebVar == null) {
                    synchronized (C96992j.class) {
                        ebVar = f271057e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f271056c);
                            f271057e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
