package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.p */
/* compiled from: PG */
public final class C80519p extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62962ci f221048b = new C80485l();

    /* renamed from: c */
    public static final C80519p f221049c;

    /* renamed from: d */
    private static volatile C63010eb f221050d;

    /* renamed from: a */
    public C62961ch f221051a = emptyIntList();

    static {
        C80519p pVar = new C80519p();
        f221049c = pVar;
        C62942bv.registerDefaultInstance(C80519p.class, pVar);
    }

    private C80519p() {
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
                return newMessageInfo(f221049c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", C80518o.m128190b()});
            case 3:
                return new C80519p();
            case 4:
                return new C80491m();
            case 5:
                return f221049c;
            case 6:
                C63010eb ebVar = f221050d;
                if (ebVar == null) {
                    synchronized (C80519p.class) {
                        ebVar = f221050d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221049c);
                            f221050d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
