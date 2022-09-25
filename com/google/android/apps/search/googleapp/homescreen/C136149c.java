package com.google.android.apps.search.googleapp.homescreen;

import com.google.android.apps.search.googleapp.p10310h.C136123d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.c */
/* compiled from: PG */
public final class C136149c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C136149c f370793c;

    /* renamed from: e */
    private static volatile C63010eb f370794e;

    /* renamed from: a */
    public int f370795a;

    /* renamed from: b */
    public C136123d f370796b;

    /* renamed from: d */
    private byte f370797d = 2;

    static {
        C136149c cVar = new C136149c();
        f370793c = cVar;
        C62942bv.registerDefaultInstance(C136149c.class, cVar);
    }

    private C136149c() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f370797d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f370797d = b;
                return null;
            case 2:
                return newMessageInfo(f370793c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C136149c();
            case 4:
                return new C136147b();
            case 5:
                return f370793c;
            case 6:
                C63010eb ebVar = f370794e;
                if (ebVar == null) {
                    synchronized (C136149c.class) {
                        ebVar = f370794e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f370793c);
                            f370794e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
