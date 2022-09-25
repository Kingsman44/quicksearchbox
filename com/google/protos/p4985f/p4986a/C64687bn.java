package com.google.protos.p4985f.p4986a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.a.bn */
/* compiled from: PG */
public final class C64687bn extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64687bn f175340d;

    /* renamed from: e */
    private static volatile C63010eb f175341e;

    /* renamed from: a */
    public int f175342a;

    /* renamed from: b */
    public String f175343b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f175344c = BuildConfig.FLAVOR;

    static {
        C64687bn bnVar = new C64687bn();
        f175340d = bnVar;
        C62942bv.registerDefaultInstance(C64687bn.class, bnVar);
    }

    private C64687bn() {
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
                return newMessageInfo(f175340d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C64687bn();
            case 4:
                return new C64686bm();
            case 5:
                return f175340d;
            case 6:
                C63010eb ebVar = f175341e;
                if (ebVar == null) {
                    synchronized (C64687bn.class) {
                        ebVar = f175341e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175340d);
                            f175341e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
