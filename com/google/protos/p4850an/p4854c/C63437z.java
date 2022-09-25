package com.google.protos.p4850an.p4854c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p381aj.p382a.p383a.p384a.C8213ab;
import com.google.p381aj.p382a.p383a.p384a.C8219ah;
import com.google.p381aj.p382a.p383a.p384a.C8242v;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.c.z */
/* compiled from: PG */
public final class C63437z extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63437z f171447a;

    /* renamed from: g */
    private static volatile C63010eb f171448g;

    /* renamed from: b */
    private int f171449b;

    /* renamed from: c */
    private C8242v f171450c;

    /* renamed from: d */
    private C8213ab f171451d;

    /* renamed from: e */
    private C8219ah f171452e;

    /* renamed from: f */
    private byte f171453f = 2;

    static {
        C63437z zVar = new C63437z();
        f171447a = zVar;
        C62942bv.registerDefaultInstance(C63437z.class, zVar);
    }

    private C63437z() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171453f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171453f = b;
                return null;
            case 2:
                return newMessageInfo(f171447a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0003ᐉ\u0002\u0005ᐉ\u0004", new Object[]{"b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C63437z();
            case 4:
                return new C63436y();
            case 5:
                return f171447a;
            case 6:
                C63010eb ebVar = f171448g;
                if (ebVar == null) {
                    synchronized (C63437z.class) {
                        ebVar = f171448g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171447a);
                            f171448g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
