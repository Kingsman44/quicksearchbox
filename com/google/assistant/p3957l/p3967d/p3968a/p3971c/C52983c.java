package com.google.assistant.p3957l.p3967d.p3968a.p3971c;

import com.google.android.apps.gsa.assistant.settings.shared.a.a.e;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.l.d.a.c.c */
/* compiled from: PG */
public final class C52983c extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52983c f138890b;

    /* renamed from: c */
    private static volatile C63010eb f138891c;

    /* renamed from: a */
    public C62971cq f138892a = emptyProtobufList();

    static {
        C52983c cVar = new C52983c();
        f138890b = cVar;
        C62942bv.registerDefaultInstance(C52983c.class, cVar);
    }

    private C52983c() {
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
                return newMessageInfo(f138890b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", e.class});
            case 3:
                return new C52983c();
            case 4:
                return new C52982b();
            case 5:
                return f138890b;
            case 6:
                C63010eb ebVar = f138891c;
                if (ebVar == null) {
                    synchronized (C52983c.class) {
                        ebVar = f138891c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138890b);
                            f138891c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
