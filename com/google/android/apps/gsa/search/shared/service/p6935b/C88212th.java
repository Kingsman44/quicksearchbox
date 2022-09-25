package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.th */
/* compiled from: PG */
public final class C88212th extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88212th f238439c;

    /* renamed from: d */
    private static volatile C63010eb f238440d;

    /* renamed from: a */
    public int f238441a;

    /* renamed from: b */
    public String f238442b = BuildConfig.FLAVOR;

    static {
        C88212th thVar = new C88212th();
        f238439c = thVar;
        C62942bv.registerDefaultInstance(C88212th.class, thVar);
    }

    private C88212th() {
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
                return newMessageInfo(f238439c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C88212th();
            case 4:
                return new C88211tg();
            case 5:
                return f238439c;
            case 6:
                C63010eb ebVar = f238440d;
                if (ebVar == null) {
                    synchronized (C88212th.class) {
                        ebVar = f238440d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238439c);
                            f238440d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
