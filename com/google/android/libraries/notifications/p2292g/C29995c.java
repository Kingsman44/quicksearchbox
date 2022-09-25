package com.google.android.libraries.notifications.p2292g;

import com.google.p4160bf.p4164b.p4165a.p4166a.C55522ab;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.notifications.g.c */
/* compiled from: PG */
public final class C29995c extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62962ci f81203b = new C29993a();

    /* renamed from: c */
    public static final C29995c f81204c;

    /* renamed from: d */
    private static volatile C63010eb f81205d;

    /* renamed from: a */
    public C62961ch f81206a = emptyIntList();

    static {
        C29995c cVar = new C29995c();
        f81204c = cVar;
        C62942bv.registerDefaultInstance(C29995c.class, cVar);
    }

    private C29995c() {
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
                return newMessageInfo(f81204c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", C55522ab.m87702b()});
            case 3:
                return new C29995c();
            case 4:
                return new C29994b();
            case 5:
                return f81204c;
            case 6:
                C63010eb ebVar = f81205d;
                if (ebVar == null) {
                    synchronized (C29995c.class) {
                        ebVar = f81205d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f81204c);
                            f81205d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
