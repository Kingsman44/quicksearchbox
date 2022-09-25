package com.google.speech.p5228m;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.cf */
/* compiled from: PG */
public final class C67329cf extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67329cf f183007c;

    /* renamed from: d */
    private static volatile C63010eb f183008d;

    /* renamed from: a */
    public int f183009a;

    /* renamed from: b */
    public String f183010b = BuildConfig.FLAVOR;

    static {
        C67329cf cfVar = new C67329cf();
        f183007c = cfVar;
        C62942bv.registerDefaultInstance(C67329cf.class, cfVar);
    }

    private C67329cf() {
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
                return newMessageInfo(f183007c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C67329cf();
            case 4:
                return new C67328ce();
            case 5:
                return f183007c;
            case 6:
                C63010eb ebVar = f183008d;
                if (ebVar == null) {
                    synchronized (C67329cf.class) {
                        ebVar = f183008d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183007c);
                            f183008d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
