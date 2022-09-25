package com.google.speech.p5228m;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4934ay.p4945e.C64351a;

/* renamed from: com.google.speech.m.bb */
/* compiled from: PG */
public final class C67298bb extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C67298bb f182924f;

    /* renamed from: g */
    private static volatile C63010eb f182925g;

    /* renamed from: a */
    public int f182926a;

    /* renamed from: b */
    public int f182927b;

    /* renamed from: c */
    public int f182928c;

    /* renamed from: d */
    public boolean f182929d;

    /* renamed from: e */
    public long f182930e;

    static {
        C67298bb bbVar = new C67298bb();
        f182924f = bbVar;
        C62942bv.registerDefaultInstance(C67298bb.class, bbVar);
    }

    private C67298bb() {
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
                return newMessageInfo(f182924f, "\u0001\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0000\u0000\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဌ\u0000\u0006ဌ\u0001", new Object[]{"a", "d", "e", "b", C64351a.f173953a, C45240c.f118157a, C62722b.m94932b()});
            case 3:
                return new C67298bb();
            case 4:
                return new C67297ba();
            case 5:
                return f182924f;
            case 6:
                C63010eb ebVar = f182925g;
                if (ebVar == null) {
                    synchronized (C67298bb.class) {
                        ebVar = f182925g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182924f);
                            f182925g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
