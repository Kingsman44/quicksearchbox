package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.am */
/* compiled from: PG */
public final class C53076am extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53076am f139090c;

    /* renamed from: d */
    private static volatile C63010eb f139091d;

    /* renamed from: a */
    public int f139092a;

    /* renamed from: b */
    public String f139093b = BuildConfig.FLAVOR;

    static {
        C53076am amVar = new C53076am();
        f139090c = amVar;
        C62942bv.registerDefaultInstance(C53076am.class, amVar);
    }

    private C53076am() {
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
                return newMessageInfo(f139090c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C53076am();
            case 4:
                return new C53075al();
            case 5:
                return f139090c;
            case 6:
                C63010eb ebVar = f139091d;
                if (ebVar == null) {
                    synchronized (C53076am.class) {
                        ebVar = f139091d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139090c);
                            f139091d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
