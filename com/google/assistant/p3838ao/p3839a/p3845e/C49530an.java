package com.google.assistant.p3838ao.p3839a.p3845e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ao.a.e.an */
/* compiled from: PG */
public final class C49530an extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C49530an f127800e;

    /* renamed from: g */
    private static volatile C63010eb f127801g;

    /* renamed from: a */
    public int f127802a;

    /* renamed from: b */
    public int f127803b;

    /* renamed from: c */
    public C62971cq f127804c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f127805d = emptyProtobufList();

    /* renamed from: f */
    private byte f127806f = 2;

    static {
        C49530an anVar = new C49530an();
        f127800e = anVar;
        C62942bv.registerDefaultInstance(C49530an.class, anVar);
    }

    private C49530an() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f127806f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f127806f = b;
                return null;
            case 2:
                return newMessageInfo(f127800e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဌ\u0000\u0002\u001b\u0003\u001b", new Object[]{"a", "b", C49617h.m85586b(), C45240c.f118157a, C49524ah.class, "d", C49526aj.class});
            case 3:
                return new C49530an();
            case 4:
                return new C49529am();
            case 5:
                return f127800e;
            case 6:
                C63010eb ebVar = f127801g;
                if (ebVar == null) {
                    synchronized (C49530an.class) {
                        ebVar = f127801g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127800e);
                            f127801g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
