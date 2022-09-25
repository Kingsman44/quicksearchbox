package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.g.a.u */
/* compiled from: PG */
public final class C127634u extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C127634u f351359b;

    /* renamed from: c */
    private static volatile C63010eb f351360c;

    /* renamed from: a */
    public int f351361a;

    static {
        C127634u uVar = new C127634u();
        f351359b = uVar;
        C62942bv.registerDefaultInstance(C127634u.class, uVar);
    }

    private C127634u() {
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
                return newMessageInfo(f351359b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C127634u();
            case 4:
                return new C127633t();
            case 5:
                return f351359b;
            case 6:
                C63010eb ebVar = f351360c;
                if (ebVar == null) {
                    synchronized (C127634u.class) {
                        ebVar = f351360c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f351359b);
                            f351360c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
