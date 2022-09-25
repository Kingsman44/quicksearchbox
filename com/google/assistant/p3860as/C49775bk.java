package com.google.assistant.p3860as;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.as.bk */
/* compiled from: PG */
public final class C49775bk extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49775bk f128529c;

    /* renamed from: e */
    private static volatile C63010eb f128530e;

    /* renamed from: a */
    public String f128531a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f128532b;

    /* renamed from: d */
    private int f128533d;

    static {
        C49775bk bkVar = new C49775bk();
        f128529c = bkVar;
        C62942bv.registerDefaultInstance(C49775bk.class, bkVar);
    }

    private C49775bk() {
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
                return newMessageInfo(f128529c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C49775bk();
            case 4:
                return new C49774bj();
            case 5:
                return f128529c;
            case 6:
                C63010eb ebVar = f128530e;
                if (ebVar == null) {
                    synchronized (C49775bk.class) {
                        ebVar = f128530e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128529c);
                            f128530e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
