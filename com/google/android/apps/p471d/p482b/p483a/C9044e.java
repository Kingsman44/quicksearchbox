package com.google.android.apps.p471d.p482b.p483a;

import com.google.assistant.p3931f.p3939c.C52846w;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.d.b.a.e */
/* compiled from: PG */
public final class C9044e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C9044e f31248c;

    /* renamed from: d */
    private static volatile C63010eb f31249d;

    /* renamed from: a */
    public int f31250a;

    /* renamed from: b */
    public C52846w f31251b;

    static {
        C9044e eVar = new C9044e();
        f31248c = eVar;
        C62942bv.registerDefaultInstance(C9044e.class, eVar);
    }

    private C9044e() {
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
                return newMessageInfo(f31248c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C9044e();
            case 4:
                return new C9043d();
            case 5:
                return f31248c;
            case 6:
                C63010eb ebVar = f31249d;
                if (ebVar == null) {
                    synchronized (C9044e.class) {
                        ebVar = f31249d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31248c);
                            f31249d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
