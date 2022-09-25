package com.google.p4017at.p4060h.p4073d.p4074a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.d.a.ax */
/* compiled from: PG */
public final class C54235ax extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54235ax f142386a;

    /* renamed from: f */
    private static volatile C63010eb f142387f;

    /* renamed from: b */
    private int f142388b;

    /* renamed from: c */
    private String f142389c = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f142390d;

    /* renamed from: e */
    private byte f142391e = 2;

    static {
        C54235ax axVar = new C54235ax();
        f142386a = axVar;
        C62942bv.registerDefaultInstance(C54235ax.class, axVar);
    }

    private C54235ax() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142391e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f142391e = b;
                return null;
            case 2:
                return newMessageInfo(f142386a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔄ\u0001", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C54235ax();
            case 4:
                return new C54234aw();
            case 5:
                return f142386a;
            case 6:
                C63010eb ebVar = f142387f;
                if (ebVar == null) {
                    synchronized (C54235ax.class) {
                        ebVar = f142387f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142386a);
                            f142387f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
