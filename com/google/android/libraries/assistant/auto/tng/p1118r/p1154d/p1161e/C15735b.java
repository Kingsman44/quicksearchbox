package com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1161e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.d.e.b */
/* compiled from: PG */
public final class C15735b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C15735b f46916b;

    /* renamed from: c */
    private static volatile C63010eb f46917c;

    /* renamed from: a */
    public C62971cq f46918a = emptyProtobufList();

    static {
        C15735b bVar = new C15735b();
        f46916b = bVar;
        C62942bv.registerDefaultInstance(C15735b.class, bVar);
    }

    private C15735b() {
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
                return newMessageInfo(f46916b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C15737d.class});
            case 3:
                return new C15735b();
            case 4:
                return new C15734a();
            case 5:
                return f46916b;
            case 6:
                C63010eb ebVar = f46917c;
                if (ebVar == null) {
                    synchronized (C15735b.class) {
                        ebVar = f46917c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f46916b);
                            f46917c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
