package com.google.android.libraries.assistant.p1467d.p1472c.p1476c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.d.c.c.k */
/* compiled from: PG */
public final class C17909k extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C17909k f51314c;

    /* renamed from: e */
    private static volatile C63010eb f51315e;

    /* renamed from: a */
    public int f51316a;

    /* renamed from: b */
    public int f51317b;

    /* renamed from: d */
    private byte f51318d = 2;

    static {
        C17909k kVar = new C17909k();
        f51314c = kVar;
        C62942bv.registerDefaultInstance(C17909k.class, kVar);
    }

    private C17909k() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f51318d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f51318d = b;
                return null;
            case 2:
                return newMessageInfo(f51314c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C17908j.m35108b()});
            case 3:
                return new C17909k();
            case 4:
                return new C17906h();
            case 5:
                return f51314c;
            case 6:
                C63010eb ebVar = f51315e;
                if (ebVar == null) {
                    synchronized (C17909k.class) {
                        ebVar = f51315e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f51314c);
                            f51315e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
