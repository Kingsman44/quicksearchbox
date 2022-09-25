package com.google.android.libraries.search.assistant.fluidactions.p2538b.p2539a;

import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.b.a.b */
/* compiled from: PG */
public final class C32948b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C32948b f88272b;

    /* renamed from: c */
    private static volatile C63010eb f88273c;

    /* renamed from: a */
    public C62971cq f88274a = emptyProtobufList();

    static {
        C32948b bVar = new C32948b();
        f88272b = bVar;
        C62942bv.registerDefaultInstance(C32948b.class, bVar);
    }

    private C32948b() {
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
                return newMessageInfo(f88272b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C51058ev.class});
            case 3:
                return new C32948b();
            case 4:
                return new C32947a();
            case 5:
                return f88272b;
            case 6:
                C63010eb ebVar = f88273c;
                if (ebVar == null) {
                    synchronized (C32948b.class) {
                        ebVar = f88273c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f88272b);
                            f88273c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
