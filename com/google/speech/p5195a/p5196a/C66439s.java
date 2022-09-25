package com.google.speech.p5195a.p5196a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.a.a.s */
/* compiled from: PG */
public final class C66439s extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66439s f180648c;

    /* renamed from: d */
    private static volatile C63010eb f180649d;

    /* renamed from: a */
    public int f180650a;

    /* renamed from: b */
    public String f180651b = BuildConfig.FLAVOR;

    static {
        C66439s sVar = new C66439s();
        f180648c = sVar;
        C62942bv.registerDefaultInstance(C66439s.class, sVar);
    }

    private C66439s() {
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
                return newMessageInfo(f180648c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66439s();
            case 4:
                return new C66438r();
            case 5:
                return f180648c;
            case 6:
                C63010eb ebVar = f180649d;
                if (ebVar == null) {
                    synchronized (C66439s.class) {
                        ebVar = f180649d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180648c);
                            f180649d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
