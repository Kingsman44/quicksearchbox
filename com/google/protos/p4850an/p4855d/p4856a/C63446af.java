package com.google.protos.p4850an.p4855d.p4856a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4850an.p4855d.p4862g.C63565b;

/* renamed from: com.google.protos.an.d.a.af */
/* compiled from: PG */
public final class C63446af extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C63446af f171461f;

    /* renamed from: h */
    private static volatile C63010eb f171462h;

    /* renamed from: a */
    public int f171463a;

    /* renamed from: b */
    public C63565b f171464b;

    /* renamed from: c */
    public int f171465c;

    /* renamed from: d */
    public String f171466d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C63448ah f171467e;

    /* renamed from: g */
    private byte f171468g = 2;

    static {
        C63446af afVar = new C63446af();
        f171461f = afVar;
        C62942bv.registerDefaultInstance(C63446af.class, afVar);
    }

    private C63446af() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171468g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171468g = b;
                return null;
            case 2:
                return newMessageInfo(f171461f, "\u0001\u0004\u0000\u0001\u0003\t\u0004\u0000\u0000\u0001\u0003ဌ\u0002\u0004ဈ\u0003\u0006ဉ\u0004\tᐉ\u0000", new Object[]{"a", C45240c.f118157a, C63444ad.f171460a, "d", "e", "b"});
            case 3:
                return new C63446af();
            case 4:
                return new C63443ac();
            case 5:
                return f171461f;
            case 6:
                C63010eb ebVar = f171462h;
                if (ebVar == null) {
                    synchronized (C63446af.class) {
                        ebVar = f171462h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171461f);
                            f171462h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
