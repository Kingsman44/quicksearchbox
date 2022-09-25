package com.google.p4495cl.p4497b.p4498a.p4499a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.cl.b.a.a.d */
/* compiled from: PG */
public final class C58133d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C58133d f155412d;

    /* renamed from: e */
    private static volatile C63010eb f155413e;

    /* renamed from: a */
    public int f155414a;

    /* renamed from: b */
    public String f155415b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f155416c;

    static {
        C58133d dVar = new C58133d();
        f155412d = dVar;
        C62942bv.registerDefaultInstance(C58133d.class, dVar);
    }

    private C58133d() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.f155416c = -1;
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
                return newMessageInfo(f155412d, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0000\u0004င\u0002\u0005ဈ\u0000", new Object[]{"a", C45240c.f118157a, "b"});
            case 3:
                return new C58133d();
            case 4:
                return new C58132c();
            case 5:
                return f155412d;
            case 6:
                C63010eb ebVar = f155413e;
                if (ebVar == null) {
                    synchronized (C58133d.class) {
                        ebVar = f155413e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155412d);
                            f155413e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
