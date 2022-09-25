package com.google.p395al.p398b.p399a.p400a;

import com.google.p375ai.p376a.p377a.C7509b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.b.a.a.e */
/* compiled from: PG */
public final class C8421e extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C8421e f29289c;

    /* renamed from: e */
    private static volatile C63010eb f29290e;

    /* renamed from: a */
    public int f29291a = 0;

    /* renamed from: b */
    public Object f29292b;

    /* renamed from: d */
    private byte f29293d = 2;

    static {
        C8421e eVar = new C8421e();
        f29289c = eVar;
        C62942bv.registerDefaultInstance(C8421e.class, eVar);
    }

    private C8421e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f29293d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f29293d = b;
                return null;
            case 2:
                return newMessageInfo(f29289c, "\u0001\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0003ြ\u0000", new Object[]{"b", "a", C7509b.class});
            case 3:
                return new C8421e();
            case 4:
                return new C8420d();
            case 5:
                return f29289c;
            case 6:
                C63010eb ebVar = f29290e;
                if (ebVar == null) {
                    synchronized (C8421e.class) {
                        ebVar = f29290e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29289c);
                            f29290e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
