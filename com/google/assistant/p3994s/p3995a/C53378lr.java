package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.lr */
/* compiled from: PG */
public final class C53378lr extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53378lr f140068c;

    /* renamed from: d */
    private static volatile C63010eb f140069d;

    /* renamed from: a */
    public int f140070a;

    /* renamed from: b */
    public C53368lh f140071b;

    static {
        C53378lr lrVar = new C53378lr();
        f140068c = lrVar;
        C62942bv.registerDefaultInstance(C53378lr.class, lrVar);
    }

    private C53378lr() {
        emptyProtobufList();
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
                return newMessageInfo(f140068c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C53378lr();
            case 4:
                return new C53377lq();
            case 5:
                return f140068c;
            case 6:
                C63010eb ebVar = f140069d;
                if (ebVar == null) {
                    synchronized (C53378lr.class) {
                        ebVar = f140069d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140068c);
                            f140069d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
