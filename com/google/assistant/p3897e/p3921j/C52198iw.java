package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.iw */
/* compiled from: PG */
public final class C52198iw extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52198iw f136995d;

    /* renamed from: g */
    private static volatile C63010eb f136996g;

    /* renamed from: a */
    public int f136997a;

    /* renamed from: b */
    public C52159hk f136998b;

    /* renamed from: c */
    public int f136999c = 1;

    /* renamed from: e */
    private C52568wo f137000e;

    /* renamed from: f */
    private byte f137001f = 2;

    static {
        C52198iw iwVar = new C52198iw();
        f136995d = iwVar;
        C62942bv.registerDefaultInstance(C52198iw.class, iwVar);
    }

    private C52198iw() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f137001f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f137001f = b;
                return null;
            case 2:
                return newMessageInfo(f136995d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "e", C45240c.f118157a, C52196iu.f136994a});
            case 3:
                return new C52198iw();
            case 4:
                return new C52195it();
            case 5:
                return f136995d;
            case 6:
                C63010eb ebVar = f136996g;
                if (ebVar == null) {
                    synchronized (C52198iw.class) {
                        ebVar = f136996g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136995d);
                            f136996g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
