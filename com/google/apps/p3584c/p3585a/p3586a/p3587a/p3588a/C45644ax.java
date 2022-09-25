package com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p381aj.p382a.p383a.p384a.C8213ab;
import com.google.p381aj.p382a.p383a.p384a.C8219ah;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.c.a.a.a.a.ax */
/* compiled from: PG */
public final class C45644ax extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C45644ax f120079a;

    /* renamed from: f */
    private static volatile C63010eb f120080f;

    /* renamed from: b */
    private int f120081b;

    /* renamed from: c */
    private C8213ab f120082c;

    /* renamed from: d */
    private C8219ah f120083d;

    /* renamed from: e */
    private byte f120084e = 2;

    static {
        C45644ax axVar = new C45644ax();
        f120079a = axVar;
        C62942bv.registerDefaultInstance(C45644ax.class, axVar);
    }

    private C45644ax() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f120084e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f120084e = b;
                return null;
            case 2:
                return newMessageInfo(f120079a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0003ᐉ\u0002", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C45644ax();
            case 4:
                return new C45643aw();
            case 5:
                return f120079a;
            case 6:
                C63010eb ebVar = f120080f;
                if (ebVar == null) {
                    synchronized (C45644ax.class) {
                        ebVar = f120080f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f120079a);
                            f120080f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
