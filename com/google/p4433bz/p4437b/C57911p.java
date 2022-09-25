package com.google.p4433bz.p4437b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bz.b.p */
/* compiled from: PG */
public final class C57911p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57911p f154894c;

    /* renamed from: d */
    private static volatile C63010eb f154895d;

    /* renamed from: a */
    public int f154896a;

    /* renamed from: b */
    public String f154897b = BuildConfig.FLAVOR;

    static {
        C57911p pVar = new C57911p();
        f154894c = pVar;
        C62942bv.registerDefaultInstance(C57911p.class, pVar);
    }

    private C57911p() {
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
                return newMessageInfo(f154894c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C57911p();
            case 4:
                return new C57910o();
            case 5:
                return f154894c;
            case 6:
                C63010eb ebVar = f154895d;
                if (ebVar == null) {
                    synchronized (C57911p.class) {
                        ebVar = f154895d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154894c);
                            f154895d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
