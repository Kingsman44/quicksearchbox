package com.google.assistant.p3886c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.b */
/* compiled from: PG */
public final class C50715b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50715b f131973d;

    /* renamed from: e */
    private static volatile C63010eb f131974e;

    /* renamed from: a */
    public int f131975a;

    /* renamed from: b */
    public int f131976b;

    /* renamed from: c */
    public C62971cq f131977c = emptyProtobufList();

    static {
        C50715b bVar = new C50715b();
        f131973d = bVar;
        C62942bv.registerDefaultInstance(C50715b.class, bVar);
    }

    private C50715b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f131973d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"a", "b", C50834f.f132362a, C45240c.f118157a, C50837i.class});
            case 3:
                return new C50715b();
            case 4:
                return new C50664a();
            case 5:
                return f131973d;
            case 6:
                C63010eb ebVar = f131974e;
                if (ebVar == null) {
                    synchronized (C50715b.class) {
                        ebVar = f131974e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131973d);
                            f131974e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
