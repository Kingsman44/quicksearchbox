package com.google.android.libraries.assistant.auto.tng.p1163s.p1164a.p1167b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.s.a.b.b */
/* compiled from: PG */
public final class C15762b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C15762b f46964d;

    /* renamed from: e */
    private static volatile C63010eb f46965e;

    /* renamed from: a */
    public int f46966a;

    /* renamed from: b */
    public boolean f46967b;

    /* renamed from: c */
    public boolean f46968c = true;

    static {
        C15762b bVar = new C15762b();
        f46964d = bVar;
        C62942bv.registerDefaultInstance(C15762b.class, bVar);
    }

    private C15762b() {
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
                return newMessageInfo(f46964d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C15762b();
            case 4:
                return new C15761a();
            case 5:
                return f46964d;
            case 6:
                C63010eb ebVar = f46965e;
                if (ebVar == null) {
                    synchronized (C15762b.class) {
                        ebVar = f46965e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f46964d);
                            f46965e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
