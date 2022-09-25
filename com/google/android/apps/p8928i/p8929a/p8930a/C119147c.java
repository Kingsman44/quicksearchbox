package com.google.android.apps.p8928i.p8929a.p8930a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.i.a.a.c */
/* compiled from: PG */
public final class C119147c extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C119147c f332310b;

    /* renamed from: c */
    private static volatile C63010eb f332311c;

    /* renamed from: a */
    public String f332312a = BuildConfig.FLAVOR;

    static {
        C119147c cVar = new C119147c();
        f332310b = cVar;
        C62942bv.registerDefaultInstance(C119147c.class, cVar);
    }

    private C119147c() {
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
                return newMessageInfo(f332310b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C119147c();
            case 4:
                return new C119146b();
            case 5:
                return f332310b;
            case 6:
                C63010eb ebVar = f332311c;
                if (ebVar == null) {
                    synchronized (C119147c.class) {
                        ebVar = f332311c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f332310b);
                            f332311c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
