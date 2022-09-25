package com.google.android.p10712d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.ey */
/* compiled from: PG */
public final class C142427ey extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C142427ey f386482g;

    /* renamed from: h */
    private static volatile C63010eb f386483h;

    /* renamed from: a */
    public int f386484a;

    /* renamed from: b */
    public String f386485b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f386486c;

    /* renamed from: d */
    public int f386487d;

    /* renamed from: e */
    public int f386488e;

    /* renamed from: f */
    public int f386489f;

    static {
        C142427ey eyVar = new C142427ey();
        f386482g = eyVar;
        C62942bv.registerDefaultInstance(C142427ey.class, eyVar);
    }

    private C142427ey() {
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
                return newMessageInfo(f386482g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C142427ey();
            case 4:
                return new C142426ex();
            case 5:
                return f386482g;
            case 6:
                C63010eb ebVar = f386483h;
                if (ebVar == null) {
                    synchronized (C142427ey.class) {
                        ebVar = f386483h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386482g);
                            f386483h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
