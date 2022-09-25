package com.google.assistant.p3944g.p3948b.p3949a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.g.b.a.v */
/* compiled from: PG */
public final class C52957v extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C52957v f138849e;

    /* renamed from: f */
    private static volatile C63010eb f138850f;

    /* renamed from: a */
    public int f138851a;

    /* renamed from: b */
    public C52960y f138852b;

    /* renamed from: c */
    public C52946k f138853c;

    /* renamed from: d */
    public C52951p f138854d;

    static {
        C52957v vVar = new C52957v();
        f138849e = vVar;
        C62942bv.registerDefaultInstance(C52957v.class, vVar);
    }

    private C52957v() {
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
                return newMessageInfo(f138849e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C52957v();
            case 4:
                return new C52956u();
            case 5:
                return f138849e;
            case 6:
                C63010eb ebVar = f138850f;
                if (ebVar == null) {
                    synchronized (C52957v.class) {
                        ebVar = f138850f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138849e);
                            f138850f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
