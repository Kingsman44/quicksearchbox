package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5230n.p5232b.C67402ar;

/* renamed from: com.google.bb.a.rb */
/* compiled from: PG */
public final class C55403rb extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C55403rb f145982e;

    /* renamed from: h */
    private static volatile C63010eb f145983h;

    /* renamed from: a */
    public int f145984a;

    /* renamed from: b */
    public C55365pr f145985b;

    /* renamed from: c */
    public String f145986c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C67402ar f145987d;

    /* renamed from: f */
    private C55395qu f145988f;

    /* renamed from: g */
    private byte f145989g = 2;

    static {
        C55403rb rbVar = new C55403rb();
        f145982e = rbVar;
        C62942bv.registerDefaultInstance(C55403rb.class, rbVar);
    }

    private C55403rb() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145989g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145989g = b;
                return null;
            case 2:
                return newMessageInfo(f145982e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0003\u0003ᐉ\u0002\u0004ဈ\u0001", new Object[]{"a", "b", C10662f.f35572a, "d", C45240c.f118157a});
            case 3:
                return new C55403rb();
            case 4:
                return new C55402ra();
            case 5:
                return f145982e;
            case 6:
                C63010eb ebVar = f145983h;
                if (ebVar == null) {
                    synchronized (C55403rb.class) {
                        ebVar = f145983h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145982e);
                            f145983h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
