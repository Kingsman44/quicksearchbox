package com.google.p4283bv.p4287b.p4288a.p4289a.p4308m;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.m.b */
/* compiled from: PG */
public final class C56741b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C56741b f151431f;

    /* renamed from: h */
    private static volatile C63010eb f151432h;

    /* renamed from: a */
    public int f151433a;

    /* renamed from: b */
    public String f151434b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f151435c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f151436d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f151437e = BuildConfig.FLAVOR;

    /* renamed from: g */
    private byte f151438g = 2;

    static {
        C56741b bVar = new C56741b();
        f151431f = bVar;
        C62942bv.registerDefaultInstance(C56741b.class, bVar);
    }

    private C56741b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f151438g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f151438g = b;
                return null;
            case 2:
                return newMessageInfo(f151431f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C56741b();
            case 4:
                return new C56740a();
            case 5:
                return f151431f;
            case 6:
                C63010eb ebVar = f151432h;
                if (ebVar == null) {
                    synchronized (C56741b.class) {
                        ebVar = f151432h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151431f);
                            f151432h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
