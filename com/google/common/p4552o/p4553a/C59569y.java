package com.google.common.p4552o.p4553a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.y */
/* compiled from: PG */
public final class C59569y extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C59569y f158066g;

    /* renamed from: h */
    private static volatile C63010eb f158067h;

    /* renamed from: a */
    public int f158068a;

    /* renamed from: b */
    public int f158069b;

    /* renamed from: c */
    public String f158070c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f158071d;

    /* renamed from: e */
    public C59450aa f158072e;

    /* renamed from: f */
    public boolean f158073f;

    static {
        C59569y yVar = new C59569y();
        f158066g = yVar;
        C62942bv.registerDefaultInstance(C59569y.class, yVar);
    }

    private C59569y() {
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
                return newMessageInfo(f158066g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0005ဌ\u0004\u0006ဉ\u0005\u0007ဇ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", C59451ab.f157710a, "e", C10662f.f35572a});
            case 3:
                return new C59569y();
            case 4:
                return new C59568x();
            case 5:
                return f158066g;
            case 6:
                C63010eb ebVar = f158067h;
                if (ebVar == null) {
                    synchronized (C59569y.class) {
                        ebVar = f158067h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158066g);
                            f158067h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
