package com.google.p4172bg;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bg.ap */
/* compiled from: PG */
public final class C55708ap extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55708ap f146960d;

    /* renamed from: e */
    private static volatile C63010eb f146961e;

    /* renamed from: a */
    public C62971cq f146962a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public boolean f146963b;

    /* renamed from: c */
    public String f146964c = BuildConfig.FLAVOR;

    static {
        C55708ap apVar = new C55708ap();
        f146960d = apVar;
        C62942bv.registerDefaultInstance(C55708ap.class, apVar);
    }

    private C55708ap() {
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
                return newMessageInfo(f146960d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ț\u0002\u0007\u0003Ȉ", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C55708ap();
            case 4:
                return new C55707ao();
            case 5:
                return f146960d;
            case 6:
                C63010eb ebVar = f146961e;
                if (ebVar == null) {
                    synchronized (C55708ap.class) {
                        ebVar = f146961e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146960d);
                            f146961e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
