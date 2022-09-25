package com.google.protos.youtube.elements.p5166b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.youtube.elements.C66063ay;
import com.google.protos.youtube.elements.C66128bg;
import com.google.protos.youtube.elements.C66166ck;

/* renamed from: com.google.protos.youtube.elements.b.j */
/* compiled from: PG */
public final class C66105j extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C66105j f179759f;

    /* renamed from: h */
    private static volatile C63010eb f179760h;

    /* renamed from: a */
    public int f179761a;

    /* renamed from: b */
    public String f179762b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C66128bg f179763c;

    /* renamed from: d */
    public C66166ck f179764d;

    /* renamed from: e */
    public C66063ay f179765e;

    /* renamed from: g */
    private byte f179766g = 2;

    static {
        C66105j jVar = new C66105j();
        f179759f = jVar;
        C62942bv.registerDefaultInstance(C66105j.class, jVar);
    }

    private C66105j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179766g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179766g = b;
                return null;
            case 2:
                return newMessageInfo(f179759f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C66105j();
            case 4:
                return new C66104i();
            case 5:
                return f179759f;
            case 6:
                C63010eb ebVar = f179760h;
                if (ebVar == null) {
                    synchronized (C66105j.class) {
                        ebVar = f179760h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179759f);
                            f179760h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
