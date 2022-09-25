package com.google.assistant.p3860as;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.as.as */
/* compiled from: PG */
public final class C49756as extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49756as f128486c;

    /* renamed from: d */
    private static volatile C63010eb f128487d;

    /* renamed from: a */
    public int f128488a;

    /* renamed from: b */
    public String f128489b = BuildConfig.FLAVOR;

    static {
        C49756as asVar = new C49756as();
        f128486c = asVar;
        C62942bv.registerDefaultInstance(C49756as.class, asVar);
    }

    private C49756as() {
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
                return newMessageInfo(f128486c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C49756as();
            case 4:
                return new C49755ar();
            case 5:
                return f128486c;
            case 6:
                C63010eb ebVar = f128487d;
                if (ebVar == null) {
                    synchronized (C49756as.class) {
                        ebVar = f128487d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128486c);
                            f128487d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
