package com.google.android.libraries.assistant.contexttrigger.p1457c;

import com.google.android.libraries.assistant.contexttrigger.p1461e.C17692f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.c.q */
/* compiled from: PG */
public final class C17653q extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C17653q f50778c;

    /* renamed from: d */
    private static volatile C63010eb f50779d;

    /* renamed from: a */
    public int f50780a = 0;

    /* renamed from: b */
    public Object f50781b;

    static {
        C17653q qVar = new C17653q();
        f50778c = qVar;
        C62942bv.registerDefaultInstance(C17653q.class, qVar);
    }

    private C17653q() {
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
                return newMessageInfo(f50778c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"b", "a", C17692f.class});
            case 3:
                return new C17653q();
            case 4:
                return new C17649m();
            case 5:
                return f50778c;
            case 6:
                C63010eb ebVar = f50779d;
                if (ebVar == null) {
                    synchronized (C17653q.class) {
                        ebVar = f50779d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f50778c);
                            f50779d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
