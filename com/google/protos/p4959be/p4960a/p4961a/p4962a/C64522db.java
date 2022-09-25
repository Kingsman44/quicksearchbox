package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.db */
/* compiled from: PG */
public final class C64522db extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64522db f174986d;

    /* renamed from: e */
    private static volatile C63010eb f174987e;

    /* renamed from: a */
    public String f174988a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f174989b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public boolean f174990c;

    static {
        C64522db dbVar = new C64522db();
        f174986d = dbVar;
        C62942bv.registerDefaultInstance(C64522db.class, dbVar);
    }

    private C64522db() {
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
                return newMessageInfo(f174986d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003\u0007", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C64522db();
            case 4:
                return new C64521da();
            case 5:
                return f174986d;
            case 6:
                C63010eb ebVar = f174987e;
                if (ebVar == null) {
                    synchronized (C64522db.class) {
                        ebVar = f174987e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174986d);
                            f174987e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
