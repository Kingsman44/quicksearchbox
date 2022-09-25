package com.google.assistant.p3957l.p3961b.p3962a.p3963a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.l.b.a.a.b */
/* compiled from: PG */
public final class C52972b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52972b f138876c;

    /* renamed from: d */
    private static volatile C63010eb f138877d;

    /* renamed from: a */
    public int f138878a;

    /* renamed from: b */
    public boolean f138879b;

    static {
        C52972b bVar = new C52972b();
        f138876c = bVar;
        C62942bv.registerDefaultInstance(C52972b.class, bVar);
    }

    private C52972b() {
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
                return newMessageInfo(f138876c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52972b();
            case 4:
                return new C52971a();
            case 5:
                return f138876c;
            case 6:
                C63010eb ebVar = f138877d;
                if (ebVar == null) {
                    synchronized (C52972b.class) {
                        ebVar = f138877d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138876c);
                            f138877d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
