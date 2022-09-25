package com.google.assistant.p3890d.p3891a.p3892a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.d.a.a.b */
/* compiled from: PG */
public final class C50857b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50857b f132425c;

    /* renamed from: d */
    private static volatile C63010eb f132426d;

    /* renamed from: a */
    public boolean f132427a;

    /* renamed from: b */
    public int f132428b;

    static {
        C50857b bVar = new C50857b();
        f132425c = bVar;
        C62942bv.registerDefaultInstance(C50857b.class, bVar);
    }

    private C50857b() {
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
                return newMessageInfo(f132425c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\f", new Object[]{"a", "b"});
            case 3:
                return new C50857b();
            case 4:
                return new C50856a();
            case 5:
                return f132425c;
            case 6:
                C63010eb ebVar = f132426d;
                if (ebVar == null) {
                    synchronized (C50857b.class) {
                        ebVar = f132426d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132425c);
                            f132426d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
