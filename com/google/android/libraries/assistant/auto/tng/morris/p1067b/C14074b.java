package com.google.android.libraries.assistant.auto.tng.morris.p1067b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.b.b */
/* compiled from: PG */
public final class C14074b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C14074b f42725e;

    /* renamed from: f */
    private static volatile C63010eb f42726f;

    /* renamed from: a */
    public int f42727a;

    /* renamed from: b */
    public int f42728b;

    /* renamed from: c */
    public C63042fg f42729c;

    /* renamed from: d */
    public int f42730d;

    static {
        C14074b bVar = new C14074b();
        f42725e = bVar;
        C62942bv.registerDefaultInstance(C14074b.class, bVar);
    }

    private C14074b() {
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
                return newMessageInfo(f42725e, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C14074b();
            case 4:
                return new C14065a();
            case 5:
                return f42725e;
            case 6:
                C63010eb ebVar = f42726f;
                if (ebVar == null) {
                    synchronized (C14074b.class) {
                        ebVar = f42726f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f42725e);
                            f42726f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
