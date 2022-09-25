package com.google.assistant.p3957l.p3967d.p3968a.p3969a;

import com.google.android.apps.gsa.assistant.settings.shared.a.a.e;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.l.d.a.a.c */
/* compiled from: PG */
public final class C52977c extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52977c f138881b;

    /* renamed from: c */
    private static volatile C63010eb f138882c;

    /* renamed from: a */
    public C62971cq f138883a = emptyProtobufList();

    static {
        C52977c cVar = new C52977c();
        f138881b = cVar;
        C62942bv.registerDefaultInstance(C52977c.class, cVar);
    }

    private C52977c() {
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
                return newMessageInfo(f138881b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", e.class});
            case 3:
                return new C52977c();
            case 4:
                return new C52976b();
            case 5:
                return f138881b;
            case 6:
                C63010eb ebVar = f138882c;
                if (ebVar == null) {
                    synchronized (C52977c.class) {
                        ebVar = f138882c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138881b);
                            f138882c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
