package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9022c.p9025c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5208h.C66611ci;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.b.c.c.d */
/* compiled from: PG */
public final class C119711d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C119711d f333527b;

    /* renamed from: d */
    private static volatile C63010eb f333528d;

    /* renamed from: a */
    public C66611ci f333529a;

    /* renamed from: c */
    private byte f333530c = 2;

    static {
        C119711d dVar = new C119711d();
        f333527b = dVar;
        C62942bv.registerDefaultInstance(C119711d.class, dVar);
    }

    private C119711d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f333530c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f333530c = b;
                return null;
            case 2:
                return newMessageInfo(f333527b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C119711d();
            case 4:
                return new C119710c();
            case 5:
                return f333527b;
            case 6:
                C63010eb ebVar = f333528d;
                if (ebVar == null) {
                    synchronized (C119711d.class) {
                        ebVar = f333528d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333527b);
                            f333528d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
