package com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.a.c.j */
/* compiled from: PG */
public final class C137252j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C137252j f373402c;

    /* renamed from: e */
    private static volatile C63010eb f373403e;

    /* renamed from: a */
    public long f373404a;

    /* renamed from: b */
    public C137250h f373405b;

    /* renamed from: d */
    private byte f373406d = 2;

    static {
        C137252j jVar = new C137252j();
        f373402c = jVar;
        C62942bv.registerDefaultInstance(C137252j.class, jVar);
    }

    private C137252j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f373406d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f373406d = b;
                return null;
            case 2:
                return newMessageInfo(f373402c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u0003\u0002Љ", new Object[]{"a", "b"});
            case 3:
                return new C137252j();
            case 4:
                return new C137251i();
            case 5:
                return f373402c;
            case 6:
                C63010eb ebVar = f373403e;
                if (ebVar == null) {
                    synchronized (C137252j.class) {
                        ebVar = f373403e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f373402c);
                            f373403e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
