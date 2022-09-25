package com.google.p4280bt;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;

/* renamed from: com.google.bt.d */
/* compiled from: PG */
public final class C56488d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56488d f150876d;

    /* renamed from: e */
    private static volatile C63010eb f150877e;

    /* renamed from: a */
    public int f150878a;

    /* renamed from: b */
    public String f150879b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f150880c = emptyProtobufList();

    static {
        C56488d dVar = new C56488d();
        f150876d = dVar;
        C62942bv.registerDefaultInstance(C56488d.class, dVar);
    }

    private C56488d() {
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
                return newMessageInfo(f150876d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, C63070h.class});
            case 3:
                return new C56488d();
            case 4:
                return new C56487c();
            case 5:
                return f150876d;
            case 6:
                C63010eb ebVar = f150877e;
                if (ebVar == null) {
                    synchronized (C56488d.class) {
                        ebVar = f150877e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150876d);
                            f150877e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
