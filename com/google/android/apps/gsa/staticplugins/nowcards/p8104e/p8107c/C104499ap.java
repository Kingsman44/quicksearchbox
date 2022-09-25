package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c;

import com.google.p375ai.p378b.C7593ct;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.c.ap */
/* compiled from: PG */
public final class C104499ap extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C104499ap f290645b;

    /* renamed from: d */
    private static volatile C63010eb f290646d;

    /* renamed from: a */
    public C7593ct f290647a;

    /* renamed from: c */
    private byte f290648c = 2;

    static {
        C104499ap apVar = new C104499ap();
        f290645b = apVar;
        C62942bv.registerDefaultInstance(C104499ap.class, apVar);
    }

    private C104499ap() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f290648c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f290648c = b;
                return null;
            case 2:
                return newMessageInfo(f290645b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C104499ap();
            case 4:
                return new C104498ao();
            case 5:
                return f290645b;
            case 6:
                C63010eb ebVar = f290646d;
                if (ebVar == null) {
                    synchronized (C104499ap.class) {
                        ebVar = f290646d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f290645b);
                            f290646d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
