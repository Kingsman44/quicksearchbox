package com.google.android.libraries.search.p3055n;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5218j.C66948fk;

/* renamed from: com.google.android.libraries.search.n.bu */
/* compiled from: PG */
public final class C39372bu extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62962ci f103682b = new C39370bs();

    /* renamed from: c */
    public static final C39372bu f103683c;

    /* renamed from: d */
    private static volatile C63010eb f103684d;

    /* renamed from: a */
    public C62961ch f103685a = emptyIntList();

    static {
        C39372bu buVar = new C39372bu();
        f103683c = buVar;
        C62942bv.registerDefaultInstance(C39372bu.class, buVar);
    }

    private C39372bu() {
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
                return newMessageInfo(f103683c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"a", C66948fk.m97390b()});
            case 3:
                return new C39372bu();
            case 4:
                return new C39371bt();
            case 5:
                return f103683c;
            case 6:
                C63010eb ebVar = f103684d;
                if (ebVar == null) {
                    synchronized (C39372bu.class) {
                        ebVar = f103684d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f103683c);
                            f103684d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
