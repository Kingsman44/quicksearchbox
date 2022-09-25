package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.as */
/* compiled from: PG */
public final class C51691as extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51691as f135610d;

    /* renamed from: e */
    private static volatile C63010eb f135611e;

    /* renamed from: a */
    public int f135612a;

    /* renamed from: b */
    public C51098gh f135613b;

    /* renamed from: c */
    public boolean f135614c = true;

    static {
        C51691as asVar = new C51691as();
        f135610d = asVar;
        C62942bv.registerDefaultInstance(C51691as.class, asVar);
    }

    private C51691as() {
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
                return newMessageInfo(f135610d, "\u0001\u0002\u0000\u0001\u0001\t\u0002\u0000\u0000\u0000\u0001ဉ\u0000\tဇ\u0007", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C51691as();
            case 4:
                return new C51690ar();
            case 5:
                return f135610d;
            case 6:
                C63010eb ebVar = f135611e;
                if (ebVar == null) {
                    synchronized (C51691as.class) {
                        ebVar = f135611e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135610d);
                            f135611e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
