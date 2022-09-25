package com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.c.a.a.a.a.v */
/* compiled from: PG */
public final class C45676v extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C45676v f120151c;

    /* renamed from: d */
    private static volatile C63010eb f120152d;

    /* renamed from: a */
    public int f120153a;

    /* renamed from: b */
    public long f120154b;

    static {
        C45676v vVar = new C45676v();
        f120151c = vVar;
        C62942bv.registerDefaultInstance(C45676v.class, vVar);
    }

    private C45676v() {
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
                return newMessageInfo(f120151c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဂ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C45676v();
            case 4:
                return new C45675u();
            case 5:
                return f120151c;
            case 6:
                C63010eb ebVar = f120152d;
                if (ebVar == null) {
                    synchronized (C45676v.class) {
                        ebVar = f120152d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f120151c);
                            f120152d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
