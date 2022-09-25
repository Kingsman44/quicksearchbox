package com.google.common.p4552o.p4570p;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.p.bj */
/* compiled from: PG */
public final class C60381bj extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60381bj f163402e;

    /* renamed from: g */
    private static volatile C63010eb f163403g;

    /* renamed from: a */
    public String f163404a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f163405b;

    /* renamed from: c */
    public int f163406c = 3;

    /* renamed from: d */
    public int f163407d;

    /* renamed from: f */
    private int f163408f;

    static {
        C60381bj bjVar = new C60381bj();
        f163402e = bjVar;
        C62942bv.registerDefaultInstance(C60381bj.class, bjVar);
    }

    private C60381bj() {
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
                return newMessageInfo(f163402e, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0004ဌ\u0003\bဌ\u0006", new Object[]{C10662f.f35572a, "a", "b", C60379bh.f163401a, C45240c.f118157a, C60375bd.f163399a, "d", C60377bf.f163400a});
            case 3:
                return new C60381bj();
            case 4:
                return new C60374bc();
            case 5:
                return f163402e;
            case 6:
                C63010eb ebVar = f163403g;
                if (ebVar == null) {
                    synchronized (C60381bj.class) {
                        ebVar = f163403g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163402e);
                            f163403g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
