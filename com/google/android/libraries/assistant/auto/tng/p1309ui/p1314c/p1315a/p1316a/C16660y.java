package com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.c.a.a.y */
/* compiled from: PG */
public final class C16660y extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C16660y f48794d;

    /* renamed from: f */
    private static volatile C63010eb f48795f;

    /* renamed from: a */
    public int f48796a;

    /* renamed from: b */
    public C62971cq f48797b = emptyProtobufList();

    /* renamed from: c */
    public boolean f48798c;

    /* renamed from: e */
    private byte f48799e = 2;

    static {
        C16660y yVar = new C16660y();
        f48794d = yVar;
        C62942bv.registerDefaultInstance(C16660y.class, yVar);
    }

    private C16660y() {
    }

    /* renamed from: a */
    public final void mo22948a() {
        C62971cq cqVar = this.f48797b;
        if (!cqVar.mo58948c()) {
            this.f48797b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f48799e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f48799e = b;
                return null;
            case 2:
                return newMessageInfo(f48794d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဇ\u0000", new Object[]{"a", "b", C16644i.class, C45240c.f118157a});
            case 3:
                return new C16660y();
            case 4:
                return new C16659x();
            case 5:
                return f48794d;
            case 6:
                C63010eb ebVar = f48795f;
                if (ebVar == null) {
                    synchronized (C16660y.class) {
                        ebVar = f48795f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48794d);
                            f48795f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
