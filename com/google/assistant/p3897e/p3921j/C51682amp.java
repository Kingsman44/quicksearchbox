package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.amp */
/* compiled from: PG */
public final class C51682amp extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51682amp f135384d;

    /* renamed from: e */
    private static volatile C63010eb f135385e;

    /* renamed from: a */
    public int f135386a;

    /* renamed from: b */
    public String f135387b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f135388c;

    static {
        C51682amp amp = new C51682amp();
        f135384d = amp;
        C62942bv.registerDefaultInstance(C51682amp.class, amp);
    }

    private C51682amp() {
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
                return newMessageInfo(f135384d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, amo.m86344b()});
            case 3:
                return new C51682amp();
            case 4:
                return new amm();
            case 5:
                return f135384d;
            case 6:
                C63010eb ebVar = f135385e;
                if (ebVar == null) {
                    synchronized (C51682amp.class) {
                        ebVar = f135385e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135384d);
                            f135385e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
