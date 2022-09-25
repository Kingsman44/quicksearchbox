package com.google.protos.p4985f.p4986a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52431rm;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.a.l */
/* compiled from: PG */
public final class C64702l extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64702l f175387d;

    /* renamed from: e */
    private static volatile C63010eb f175388e;

    /* renamed from: a */
    public int f175389a;

    /* renamed from: b */
    public String f175390b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f175391c;

    static {
        C64702l lVar = new C64702l();
        f175387d = lVar;
        C62942bv.registerDefaultInstance(C64702l.class, lVar);
    }

    private C64702l() {
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
                return newMessageInfo(f175387d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C52431rm.m86629c()});
            case 3:
                return new C64702l();
            case 4:
                return new C64701k();
            case 5:
                return f175387d;
            case 6:
                C63010eb ebVar = f175388e;
                if (ebVar == null) {
                    synchronized (C64702l.class) {
                        ebVar = f175388e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175387d);
                            f175388e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
