package com.google.android.apps.p8919h.p8920a.p8921a.p8922a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.h.a.a.a.ak */
/* compiled from: PG */
public final class C119102ak extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C119102ak f332224b;

    /* renamed from: c */
    private static volatile C63010eb f332225c;

    /* renamed from: a */
    public String f332226a = BuildConfig.FLAVOR;

    static {
        C119102ak akVar = new C119102ak();
        f332224b = akVar;
        C62942bv.registerDefaultInstance(C119102ak.class, akVar);
    }

    private C119102ak() {
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
                return newMessageInfo(f332224b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C119102ak();
            case 4:
                return new C119101aj();
            case 5:
                return f332224b;
            case 6:
                C63010eb ebVar = f332225c;
                if (ebVar == null) {
                    synchronized (C119102ak.class) {
                        ebVar = f332225c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f332224b);
                            f332225c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
