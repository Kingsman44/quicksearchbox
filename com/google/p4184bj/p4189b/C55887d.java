package com.google.p4184bj.p4189b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.b.d */
/* compiled from: PG */
public final class C55887d extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C55887d f148716f;

    /* renamed from: h */
    private static volatile C63010eb f148717h;

    /* renamed from: a */
    public int f148718a;

    /* renamed from: b */
    public String f148719b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C55897n f148720c;

    /* renamed from: d */
    public int f148721d;

    /* renamed from: e */
    public C55889f f148722e;

    /* renamed from: g */
    private byte f148723g = 2;

    static {
        C55887d dVar = new C55887d();
        f148716f = dVar;
        C62942bv.registerDefaultInstance(C55887d.class, dVar);
    }

    private C55887d() {
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f148723g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f148723g = b;
                return null;
            case 2:
                return newMessageInfo(f148716f, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဉ\u0001\u0005ဌ\u0003\bᐉ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", C55894k.f148737a, "e"});
            case 3:
                return new C55887d();
            case 4:
                return new C55885c();
            case 5:
                return f148716f;
            case 6:
                C63010eb ebVar = f148717h;
                if (ebVar == null) {
                    synchronized (C55887d.class) {
                        ebVar = f148717h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f148716f);
                            f148717h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
