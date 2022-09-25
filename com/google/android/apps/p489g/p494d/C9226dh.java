package com.google.android.apps.p489g.p494d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.dh */
/* compiled from: PG */
public final class C9226dh extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C9226dh f31894d;

    /* renamed from: e */
    private static volatile C63010eb f31895e;

    /* renamed from: a */
    public int f31896a;

    /* renamed from: b */
    public String f31897b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f31898c = BuildConfig.FLAVOR;

    static {
        C9226dh dhVar = new C9226dh();
        f31894d = dhVar;
        C62942bv.registerDefaultInstance(C9226dh.class, dhVar);
    }

    private C9226dh() {
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
                return newMessageInfo(f31894d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C9226dh();
            case 4:
                return new C9225dg();
            case 5:
                return f31894d;
            case 6:
                C63010eb ebVar = f31895e;
                if (ebVar == null) {
                    synchronized (C9226dh.class) {
                        ebVar = f31895e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31894d);
                            f31895e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
