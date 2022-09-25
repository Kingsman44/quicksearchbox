package com.google.android.libraries.assistant.auto.tng.suggestions.p1263k;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.k.aw */
/* compiled from: PG */
public final class C16349aw extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C16349aw f48126d;

    /* renamed from: f */
    private static volatile C63010eb f48127f;

    /* renamed from: a */
    public int f48128a;

    /* renamed from: b */
    public C62971cq f48129b = emptyProtobufList();

    /* renamed from: c */
    public boolean f48130c;

    /* renamed from: e */
    private byte f48131e = 2;

    static {
        C16349aw awVar = new C16349aw();
        f48126d = awVar;
        C62942bv.registerDefaultInstance(C16349aw.class, awVar);
    }

    private C16349aw() {
    }

    /* renamed from: a */
    public final void mo22892a() {
        C62971cq cqVar = this.f48129b;
        if (!cqVar.mo58948c()) {
            this.f48129b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f48131e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f48131e = b;
                return null;
            case 2:
                return newMessageInfo(f48126d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဇ\u0000", new Object[]{"a", "b", C16344ar.class, C45240c.f118157a});
            case 3:
                return new C16349aw();
            case 4:
                return new C16348av();
            case 5:
                return f48126d;
            case 6:
                C63010eb ebVar = f48127f;
                if (ebVar == null) {
                    synchronized (C16349aw.class) {
                        ebVar = f48127f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48126d);
                            f48127f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
