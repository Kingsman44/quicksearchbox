package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63037fb;

/* renamed from: com.google.assistant.e.i.a.oo */
/* compiled from: PG */
public final class C51623oo extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51623oo f134536c;

    /* renamed from: d */
    private static volatile C63010eb f134537d;

    /* renamed from: a */
    public int f134538a;

    /* renamed from: b */
    public C63037fb f134539b;

    static {
        C51623oo ooVar = new C51623oo();
        f134536c = ooVar;
        C62942bv.registerDefaultInstance(C51623oo.class, ooVar);
    }

    private C51623oo() {
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
                return newMessageInfo(f134536c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C51623oo();
            case 4:
                return new C51622on();
            case 5:
                return f134536c;
            case 6:
                C63010eb ebVar = f134537d;
                if (ebVar == null) {
                    synchronized (C51623oo.class) {
                        ebVar = f134537d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134536c);
                            f134537d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
