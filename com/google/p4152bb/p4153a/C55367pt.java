package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.pt */
/* compiled from: PG */
public final class C55367pt extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C55367pt f145890g;

    /* renamed from: i */
    private static volatile C63010eb f145891i;

    /* renamed from: a */
    public int f145892a;

    /* renamed from: b */
    public C55136he f145893b;

    /* renamed from: c */
    public String f145894c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f145895d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f145896e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f145897f;

    /* renamed from: h */
    private byte f145898h = 2;

    static {
        C55367pt ptVar = new C55367pt();
        f145890g = ptVar;
        C62942bv.registerDefaultInstance(C55367pt.class, ptVar);
    }

    private C55367pt() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145898h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145898h = b;
                return null;
            case 2:
                return newMessageInfo(f145890g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0006င\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C55367pt();
            case 4:
                return new C55366ps();
            case 5:
                return f145890g;
            case 6:
                C63010eb ebVar = f145891i;
                if (ebVar == null) {
                    synchronized (C55367pt.class) {
                        ebVar = f145891i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145890g);
                            f145891i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
