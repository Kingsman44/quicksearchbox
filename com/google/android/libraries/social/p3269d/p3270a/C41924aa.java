package com.google.android.libraries.social.p3269d.p3270a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import p5602o.p5607c.C71924aa;

/* renamed from: com.google.android.libraries.social.d.a.aa */
/* compiled from: PG */
public final class C41924aa extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62962ci f109369e = new C41950y();

    /* renamed from: g */
    public static final C41924aa f109370g;

    /* renamed from: h */
    private static volatile C63010eb f109371h;

    /* renamed from: a */
    public int f109372a;

    /* renamed from: b */
    public String f109373b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f109374c;

    /* renamed from: d */
    public C62961ch f109375d = emptyIntList();

    /* renamed from: f */
    public int f109376f;

    static {
        C41924aa aaVar = new C41924aa();
        f109370g = aaVar;
        C62942bv.registerDefaultInstance(C41924aa.class, aaVar);
    }

    private C41924aa() {
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
                return newMessageInfo(f109370g, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003\u001e\u0004င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C71924aa.m105228b(), C10662f.f35572a});
            case 3:
                return new C41924aa();
            case 4:
                return new C41951z();
            case 5:
                return f109370g;
            case 6:
                C63010eb ebVar = f109371h;
                if (ebVar == null) {
                    synchronized (C41924aa.class) {
                        ebVar = f109371h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f109370g);
                            f109371h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
