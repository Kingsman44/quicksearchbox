package com.google.p4160bf.p4164b.p4165a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.cq */
/* compiled from: PG */
public final class C55661cq extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C55661cq f146868e;

    /* renamed from: f */
    private static volatile C63010eb f146869f;

    /* renamed from: a */
    public int f146870a;

    /* renamed from: b */
    public String f146871b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f146872c;

    /* renamed from: d */
    public long f146873d;

    static {
        C55661cq cqVar = new C55661cq();
        f146868e = cqVar;
        C62942bv.registerDefaultInstance(C55661cq.class, cqVar);
    }

    private C55661cq() {
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
                return newMessageInfo(f146868e, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0000\u0003ဂ\u0001\u0004ဈ\u0000\u0005ဂ\u0002", new Object[]{"a", C45240c.f118157a, "b", "d"});
            case 3:
                return new C55661cq();
            case 4:
                return new C55660cp();
            case 5:
                return f146868e;
            case 6:
                C63010eb ebVar = f146869f;
                if (ebVar == null) {
                    synchronized (C55661cq.class) {
                        ebVar = f146869f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146868e);
                            f146869f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
