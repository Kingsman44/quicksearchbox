package com.google.android.apps.gsa.sidekick.shared.monet.p7247c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7799kj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.c.ad */
/* compiled from: PG */
public final class C91780ad extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C91780ad f255936d;

    /* renamed from: f */
    private static volatile C63010eb f255937f;

    /* renamed from: a */
    public int f255938a;

    /* renamed from: b */
    public C7799kj f255939b;

    /* renamed from: c */
    public boolean f255940c;

    /* renamed from: e */
    private byte f255941e = 2;

    static {
        C91780ad adVar = new C91780ad();
        f255936d = adVar;
        C62942bv.registerDefaultInstance(C91780ad.class, adVar);
    }

    private C91780ad() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f255941e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f255941e = b;
                return null;
            case 2:
                return newMessageInfo(f255936d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C91780ad();
            case 4:
                return new C91779ac();
            case 5:
                return f255936d;
            case 6:
                C63010eb ebVar = f255937f;
                if (ebVar == null) {
                    synchronized (C91780ad.class) {
                        ebVar = f255937f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f255936d);
                            f255937f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
