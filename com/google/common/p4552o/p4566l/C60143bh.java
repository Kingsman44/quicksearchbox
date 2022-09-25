package com.google.common.p4552o.p4566l;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.bh */
/* compiled from: PG */
public final class C60143bh extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C60143bh f162691f;

    /* renamed from: g */
    private static volatile C63010eb f162692g;

    /* renamed from: a */
    public int f162693a;

    /* renamed from: b */
    public int f162694b;

    /* renamed from: c */
    public String f162695c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f162696d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f162697e = BuildConfig.FLAVOR;

    static {
        C60143bh bhVar = new C60143bh();
        f162691f = bhVar;
        C62942bv.registerDefaultInstance(C60143bh.class, bhVar);
    }

    private C60143bh() {
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
                return newMessageInfo(f162691f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C60183cu.f162811a, C45240c.f118157a, "d", "e"});
            case 3:
                return new C60143bh();
            case 4:
                return new C60142bg();
            case 5:
                return f162691f;
            case 6:
                C63010eb ebVar = f162692g;
                if (ebVar == null) {
                    synchronized (C60143bh.class) {
                        ebVar = f162692g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162691f);
                            f162692g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
