package com.google.assistant.p3781ad.p3782a.p3783a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p4016z.C53691ap;
import com.google.assistant.p4016z.C53692aq;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.a.a.c */
/* compiled from: PG */
public final class C48477c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48477c f125220d;

    /* renamed from: f */
    private static volatile C63010eb f125221f;

    /* renamed from: a */
    public int f125222a;

    /* renamed from: b */
    public int f125223b;

    /* renamed from: c */
    public C62971cq f125224c = emptyProtobufList();

    /* renamed from: e */
    private byte f125225e = 2;

    static {
        C48477c cVar = new C48477c();
        f125220d = cVar;
        C62942bv.registerDefaultInstance(C48477c.class, cVar);
    }

    private C48477c() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f125225e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f125225e = b;
                return null;
            case 2:
                return newMessageInfo(f125220d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0001\u0001ဌ\u0000\u0003Л", new Object[]{"a", "b", C53691ap.m86885b(), C45240c.f118157a, C53692aq.class});
            case 3:
                return new C48477c();
            case 4:
                return new C48476b();
            case 5:
                return f125220d;
            case 6:
                C63010eb ebVar = f125221f;
                if (ebVar == null) {
                    synchronized (C48477c.class) {
                        ebVar = f125221f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125220d);
                            f125221f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
