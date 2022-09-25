package com.google.android.gms.wearable.p10888a.p10889a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.wearable.a.a.h */
/* compiled from: PG */
public final class C146403h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C146403h f395502d;

    /* renamed from: f */
    private static volatile C63010eb f395503f;

    /* renamed from: a */
    public int f395504a;

    /* renamed from: b */
    public int f395505b = 1;

    /* renamed from: c */
    public C146402g f395506c;

    /* renamed from: e */
    private byte f395507e = 2;

    static {
        C146403h hVar = new C146403h();
        f395502d = hVar;
        C62942bv.registerDefaultInstance(C146403h.class, hVar);
    }

    private C146403h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f395507e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f395507e = b;
                return null;
            case 2:
                return newMessageInfo(f395502d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔌ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C146399d.f395483a, C45240c.f118157a});
            case 3:
                return new C146403h();
            case 4:
                return new C146398c();
            case 5:
                return f395502d;
            case 6:
                C63010eb ebVar = f395503f;
                if (ebVar == null) {
                    synchronized (C146403h.class) {
                        ebVar = f395503f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f395502d);
                            f395503f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
