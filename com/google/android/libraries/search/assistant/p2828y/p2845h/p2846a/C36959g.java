package com.google.android.libraries.search.assistant.p2828y.p2845h.p2846a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.y.h.a.g */
/* compiled from: PG */
public final class C36959g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C36959g f96233c;

    /* renamed from: d */
    private static volatile C63010eb f96234d;

    /* renamed from: a */
    public int f96235a;

    /* renamed from: b */
    public String f96236b = BuildConfig.FLAVOR;

    static {
        C36959g gVar = new C36959g();
        f96233c = gVar;
        C62942bv.registerDefaultInstance(C36959g.class, gVar);
    }

    private C36959g() {
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
                return newMessageInfo(f96233c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C36959g();
            case 4:
                return new C36958f();
            case 5:
                return f96233c;
            case 6:
                C63010eb ebVar = f96234d;
                if (ebVar == null) {
                    synchronized (C36959g.class) {
                        ebVar = f96234d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f96233c);
                            f96234d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
