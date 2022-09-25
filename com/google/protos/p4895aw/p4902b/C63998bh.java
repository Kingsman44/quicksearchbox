package com.google.protos.p4895aw.p4902b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.protos.aw.b.bh */
/* compiled from: PG */
public final class C63998bh extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C63998bh f173067f;

    /* renamed from: g */
    private static volatile C63010eb f173068g;

    /* renamed from: a */
    public int f173069a;

    /* renamed from: b */
    public int f173070b;

    /* renamed from: c */
    public C63088z f173071c = C63088z.f170246b;

    /* renamed from: d */
    public long f173072d;

    /* renamed from: e */
    public String f173073e = BuildConfig.FLAVOR;

    static {
        C63998bh bhVar = new C63998bh();
        f173067f = bhVar;
        C62942bv.registerDefaultInstance(C63998bh.class, bhVar);
    }

    private C63998bh() {
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
                return newMessageInfo(f173067f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C63996bf.f173066a, C45240c.f118157a, "d", "e"});
            case 3:
                return new C63998bh();
            case 4:
                return new C63995be();
            case 5:
                return f173067f;
            case 6:
                C63010eb ebVar = f173068g;
                if (ebVar == null) {
                    synchronized (C63998bh.class) {
                        ebVar = f173068g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173067f);
                            f173068g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
