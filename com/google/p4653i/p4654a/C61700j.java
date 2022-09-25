package com.google.p4653i.p4654a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.i.a.j */
/* compiled from: PG */
public final class C61700j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C61700j f166688d;

    /* renamed from: f */
    private static volatile C63010eb f166689f;

    /* renamed from: a */
    public int f166690a;

    /* renamed from: b */
    public String f166691b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C61698h f166692c;

    /* renamed from: e */
    private byte f166693e = 2;

    static {
        C61700j jVar = new C61700j();
        f166688d = jVar;
        C62942bv.registerDefaultInstance(C61700j.class, jVar);
    }

    private C61700j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f166693e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f166693e = b;
                return null;
            case 2:
                return newMessageInfo(f166688d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0001\u0002ဈ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C61700j();
            case 4:
                return new C61699i();
            case 5:
                return f166688d;
            case 6:
                C63010eb ebVar = f166689f;
                if (ebVar == null) {
                    synchronized (C61700j.class) {
                        ebVar = f166689f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166688d);
                            f166689f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
