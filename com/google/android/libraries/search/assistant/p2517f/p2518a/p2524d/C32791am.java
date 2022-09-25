package com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.f.a.d.am */
/* compiled from: PG */
public final class C32791am extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C32791am f87965c;

    /* renamed from: d */
    private static volatile C63010eb f87966d;

    /* renamed from: a */
    public int f87967a;

    /* renamed from: b */
    public String f87968b = BuildConfig.FLAVOR;

    static {
        C32791am amVar = new C32791am();
        f87965c = amVar;
        C62942bv.registerDefaultInstance(C32791am.class, amVar);
    }

    private C32791am() {
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
                return newMessageInfo(f87965c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C32791am();
            case 4:
                return new C32790al();
            case 5:
                return f87965c;
            case 6:
                C63010eb ebVar = f87966d;
                if (ebVar == null) {
                    synchronized (C32791am.class) {
                        ebVar = f87966d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f87965c);
                            f87966d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
