package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.qb */
/* compiled from: PG */
public final class C60439qb extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60439qb f163564d;

    /* renamed from: e */
    private static volatile C63010eb f163565e;

    /* renamed from: a */
    public int f163566a;

    /* renamed from: b */
    public String f163567b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f163568c = BuildConfig.FLAVOR;

    static {
        C60439qb qbVar = new C60439qb();
        f163564d = qbVar;
        C62942bv.registerDefaultInstance(C60439qb.class, qbVar);
    }

    private C60439qb() {
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
                return newMessageInfo(f163564d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C60439qb();
            case 4:
                return new C60438qa();
            case 5:
                return f163564d;
            case 6:
                C63010eb ebVar = f163565e;
                if (ebVar == null) {
                    synchronized (C60439qb.class) {
                        ebVar = f163565e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163564d);
                            f163565e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
