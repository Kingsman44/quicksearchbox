package com.google.p4215bk.p4220c.p4221a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bk.c.a.d */
/* compiled from: PG */
public final class C56054d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56054d f149359d;

    /* renamed from: g */
    private static volatile C63010eb f149360g;

    /* renamed from: a */
    public String f149361a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f149362b;

    /* renamed from: c */
    public String f149363c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f149364e;

    /* renamed from: f */
    private byte f149365f = 2;

    static {
        C56054d dVar = new C56054d();
        f149359d = dVar;
        C62942bv.registerDefaultInstance(C56054d.class, dVar);
    }

    private C56054d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f149365f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f149365f = b;
                return null;
            case 2:
                return newMessageInfo(f149359d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", C56052b.f149358a, C45240c.f118157a});
            case 3:
                return new C56054d();
            case 4:
                return new C56051a();
            case 5:
                return f149359d;
            case 6:
                C63010eb ebVar = f149360g;
                if (ebVar == null) {
                    synchronized (C56054d.class) {
                        ebVar = f149360g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149359d);
                            f149360g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
