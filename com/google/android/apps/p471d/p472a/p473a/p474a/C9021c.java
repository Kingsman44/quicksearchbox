package com.google.android.apps.p471d.p472a.p473a.p474a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.d.a.a.a.c */
/* compiled from: PG */
public final class C9021c extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C9021c f31152b;

    /* renamed from: c */
    private static volatile C63010eb f31153c;

    /* renamed from: a */
    public String f31154a = BuildConfig.FLAVOR;

    static {
        C9021c cVar = new C9021c();
        f31152b = cVar;
        C62942bv.registerDefaultInstance(C9021c.class, cVar);
    }

    private C9021c() {
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
                return newMessageInfo(f31152b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C9021c();
            case 4:
                return new C9020b();
            case 5:
                return f31152b;
            case 6:
                C63010eb ebVar = f31153c;
                if (ebVar == null) {
                    synchronized (C9021c.class) {
                        ebVar = f31153c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31152b);
                            f31153c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
