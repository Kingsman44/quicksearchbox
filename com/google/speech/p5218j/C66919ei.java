package com.google.speech.p5218j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.speech.j.ei */
/* compiled from: PG */
public final class C66919ei extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66919ei f181909c;

    /* renamed from: e */
    private static volatile C63010eb f181910e;

    /* renamed from: a */
    public String f181911a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C63088z f181912b = C63088z.f170246b;

    /* renamed from: d */
    private int f181913d;

    static {
        C66919ei eiVar = new C66919ei();
        f181909c = eiVar;
        C62942bv.registerDefaultInstance(C66919ei.class, eiVar);
    }

    private C66919ei() {
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
                return newMessageInfo(f181909c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C66919ei();
            case 4:
                return new C66918eh();
            case 5:
                return f181909c;
            case 6:
                C63010eb ebVar = f181910e;
                if (ebVar == null) {
                    synchronized (C66919ei.class) {
                        ebVar = f181910e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181909c);
                            f181910e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
