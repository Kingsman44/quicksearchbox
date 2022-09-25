package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.c.b.j */
/* compiled from: PG */
public final class C13048j extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C13048j f40502e;

    /* renamed from: g */
    private static volatile C63010eb f40503g;

    /* renamed from: a */
    public int f40504a;

    /* renamed from: b */
    public C62971cq f40505b = emptyProtobufList();

    /* renamed from: c */
    public int f40506c;

    /* renamed from: d */
    public int f40507d;

    /* renamed from: f */
    private byte f40508f = 2;

    static {
        C13048j jVar = new C13048j();
        f40502e = jVar;
        C62942bv.registerDefaultInstance(C13048j.class, jVar);
    }

    private C13048j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f40508f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f40508f = b;
                return null;
            case 2:
                return newMessageInfo(f40502e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဌ\u0000\u0003င\u0001", new Object[]{"a", "b", C52560wg.class, C45240c.f118157a, C13046h.f40501a, "d"});
            case 3:
                return new C13048j();
            case 4:
                return new C13045g();
            case 5:
                return f40502e;
            case 6:
                C63010eb ebVar = f40503g;
                if (ebVar == null) {
                    synchronized (C13048j.class) {
                        ebVar = f40503g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40502e);
                            f40503g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
