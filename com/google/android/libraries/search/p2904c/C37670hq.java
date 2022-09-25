package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.hq */
/* compiled from: PG */
public final class C37670hq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37670hq f100052c;

    /* renamed from: d */
    private static volatile C63010eb f100053d;

    /* renamed from: a */
    public int f100054a;

    /* renamed from: b */
    public int f100055b;

    static {
        C37670hq hqVar = new C37670hq();
        f100052c = hqVar;
        C62942bv.registerDefaultInstance(C37670hq.class, hqVar);
    }

    private C37670hq() {
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
                return newMessageInfo(f100052c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C37670hq();
            case 4:
                return new C37669hp();
            case 5:
                return f100052c;
            case 6:
                C63010eb ebVar = f100053d;
                if (ebVar == null) {
                    synchronized (C37670hq.class) {
                        ebVar = f100053d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100052c);
                            f100053d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
