package com.google.android.apps.search.assistant.verticals.automation.routines.p10028d;

import com.google.assistant.p3861at.afy;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.d.q */
/* compiled from: PG */
public final class C131874q extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C131874q f360119c;

    /* renamed from: d */
    private static volatile C63010eb f360120d;

    /* renamed from: a */
    public int f360121a;

    /* renamed from: b */
    public afy f360122b;

    static {
        C131874q qVar = new C131874q();
        f360119c = qVar;
        C62942bv.registerDefaultInstance(C131874q.class, qVar);
    }

    private C131874q() {
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
                return newMessageInfo(f360119c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C131874q();
            case 4:
                return new C131873p();
            case 5:
                return f360119c;
            case 6:
                C63010eb ebVar = f360120d;
                if (ebVar == null) {
                    synchronized (C131874q.class) {
                        ebVar = f360120d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f360119c);
                            f360120d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
