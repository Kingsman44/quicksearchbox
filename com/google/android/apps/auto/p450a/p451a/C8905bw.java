package com.google.android.apps.auto.p450a.p451a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.auto.a.a.bw */
/* compiled from: PG */
public final class C8905bw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8905bw f30911c;

    /* renamed from: d */
    private static volatile C63010eb f30912d;

    /* renamed from: a */
    public int f30913a;

    /* renamed from: b */
    public String f30914b = BuildConfig.FLAVOR;

    static {
        C8905bw bwVar = new C8905bw();
        f30911c = bwVar;
        C62942bv.registerDefaultInstance(C8905bw.class, bwVar);
    }

    private C8905bw() {
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
                return newMessageInfo(f30911c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C8905bw();
            case 4:
                return new C8904bv();
            case 5:
                return f30911c;
            case 6:
                C63010eb ebVar = f30912d;
                if (ebVar == null) {
                    synchronized (C8905bw.class) {
                        ebVar = f30912d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30911c);
                            f30912d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
