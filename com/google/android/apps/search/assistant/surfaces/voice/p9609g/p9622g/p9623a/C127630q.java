package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.g.a.q */
/* compiled from: PG */
public final class C127630q extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C127630q f351355b;

    /* renamed from: c */
    private static volatile C63010eb f351356c;

    /* renamed from: a */
    public int f351357a;

    static {
        C127630q qVar = new C127630q();
        f351355b = qVar;
        C62942bv.registerDefaultInstance(C127630q.class, qVar);
    }

    private C127630q() {
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
                return newMessageInfo(f351355b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C127630q();
            case 4:
                return new C127629p();
            case 5:
                return f351355b;
            case 6:
                C63010eb ebVar = f351356c;
                if (ebVar == null) {
                    synchronized (C127630q.class) {
                        ebVar = f351356c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f351355b);
                            f351356c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
