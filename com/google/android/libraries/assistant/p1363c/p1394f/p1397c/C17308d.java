package com.google.android.libraries.assistant.p1363c.p1394f.p1397c;

import com.google.assistant.p3897e.p3921j.C51785da;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.f.c.d */
/* compiled from: PG */
public final class C17308d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C17308d f50130c;

    /* renamed from: d */
    private static volatile C63010eb f50131d;

    /* renamed from: a */
    public C62971cq f50132a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f50133b = C62942bv.emptyProtobufList();

    static {
        C17308d dVar = new C17308d();
        f50130c = dVar;
        C62942bv.registerDefaultInstance(C17308d.class, dVar);
    }

    private C17308d() {
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
                return newMessageInfo(f50130c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u001b\u0003Ț", new Object[]{"a", C51785da.class, "b"});
            case 3:
                return new C17308d();
            case 4:
                return new C17307c();
            case 5:
                return f50130c;
            case 6:
                C63010eb ebVar = f50131d;
                if (ebVar == null) {
                    synchronized (C17308d.class) {
                        ebVar = f50131d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f50130c);
                            f50131d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
