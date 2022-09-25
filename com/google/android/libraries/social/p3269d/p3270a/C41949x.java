package com.google.android.libraries.social.p3269d.p3270a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.social.d.a.x */
/* compiled from: PG */
public final class C41949x extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C41949x f109493g;

    /* renamed from: i */
    private static volatile C63010eb f109494i;

    /* renamed from: a */
    public int f109495a;

    /* renamed from: b */
    public int f109496b;

    /* renamed from: c */
    public String f109497c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C41943r f109498d;

    /* renamed from: e */
    public C41939n f109499e;

    /* renamed from: f */
    public C41932g f109500f;

    /* renamed from: h */
    private byte f109501h = 2;

    static {
        C41949x xVar = new C41949x();
        f109493g = xVar;
        C62942bv.registerDefaultInstance(C41949x.class, xVar);
    }

    private C41949x() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f109501h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f109501h = b;
                return null;
            case 2:
                return newMessageInfo(f109493g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ᐉ\u0004", new Object[]{"a", "b", C41947v.f109492a, C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C41949x();
            case 4:
                return new C41946u();
            case 5:
                return f109493g;
            case 6:
                C63010eb ebVar = f109494i;
                if (ebVar == null) {
                    synchronized (C41949x.class) {
                        ebVar = f109494i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f109493g);
                            f109494i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
