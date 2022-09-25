package com.google.lens.p4698d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4488cj.p4489a.p4490a.p4491a.C58124d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.d.u */
/* compiled from: PG */
public final class C62182u extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62182u f167894e;

    /* renamed from: h */
    private static volatile C63010eb f167895h;

    /* renamed from: a */
    public String f167896a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C58124d f167897b;

    /* renamed from: c */
    public C62961ch f167898c = emptyIntList();

    /* renamed from: d */
    public C62186y f167899d;

    /* renamed from: f */
    private int f167900f;

    /* renamed from: g */
    private byte f167901g = 2;

    static {
        C62182u uVar = new C62182u();
        f167894e = uVar;
        C62942bv.registerDefaultInstance(C62182u.class, uVar);
    }

    private C62182u() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167901g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f167901g = b;
                return null;
            case 2:
                return newMessageInfo(f167894e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C62182u();
            case 4:
                return new C62181t();
            case 5:
                return f167894e;
            case 6:
                C63010eb ebVar = f167895h;
                if (ebVar == null) {
                    synchronized (C62182u.class) {
                        ebVar = f167895h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167894e);
                            f167895h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
