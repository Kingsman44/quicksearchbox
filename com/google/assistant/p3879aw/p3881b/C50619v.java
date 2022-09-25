package com.google.assistant.p3879aw.p3881b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.aw.b.v */
/* compiled from: PG */
public final class C50619v extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50619v f131692c;

    /* renamed from: d */
    private static volatile C63010eb f131693d;

    /* renamed from: a */
    public int f131694a;

    /* renamed from: b */
    public C50611n f131695b;

    static {
        C50619v vVar = new C50619v();
        f131692c = vVar;
        C62942bv.registerDefaultInstance(C50619v.class, vVar);
    }

    private C50619v() {
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
                return newMessageInfo(f131692c, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဉ\u0005", new Object[]{"a", "b"});
            case 3:
                return new C50619v();
            case 4:
                return new C50618u();
            case 5:
                return f131692c;
            case 6:
                C63010eb ebVar = f131693d;
                if (ebVar == null) {
                    synchronized (C50619v.class) {
                        ebVar = f131693d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131692c);
                            f131693d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
