package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.qf */
/* compiled from: PG */
public final class C60443qf extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60443qf f163571d;

    /* renamed from: e */
    private static volatile C63010eb f163572e;

    /* renamed from: a */
    public int f163573a;

    /* renamed from: b */
    public String f163574b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f163575c;

    static {
        C60443qf qfVar = new C60443qf();
        f163571d = qfVar;
        C62942bv.registerDefaultInstance(C60443qf.class, qfVar);
    }

    private C60443qf() {
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
                return newMessageInfo(f163571d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C60443qf();
            case 4:
                return new C60442qe();
            case 5:
                return f163571d;
            case 6:
                C63010eb ebVar = f163572e;
                if (ebVar == null) {
                    synchronized (C60443qf.class) {
                        ebVar = f163572e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163571d);
                            f163572e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
