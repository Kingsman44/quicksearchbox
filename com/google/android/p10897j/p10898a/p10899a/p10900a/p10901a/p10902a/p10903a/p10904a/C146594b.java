package com.google.android.p10897j.p10898a.p10899a.p10900a.p10901a.p10902a.p10903a.p10904a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.j.a.a.a.a.a.a.a.b */
/* compiled from: PG */
public final class C146594b extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C146594b f395943g;

    /* renamed from: h */
    private static volatile C63010eb f395944h;

    /* renamed from: a */
    public int f395945a;

    /* renamed from: b */
    public String f395946b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f395947c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f395948d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f395949e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C63088z f395950f = C63088z.f170246b;

    static {
        C146594b bVar = new C146594b();
        f395943g = bVar;
        C62942bv.registerDefaultInstance(C146594b.class, bVar);
    }

    private C146594b() {
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
                return newMessageInfo(f395943g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ည\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C146594b();
            case 4:
                return new C146593a();
            case 5:
                return f395943g;
            case 6:
                C63010eb ebVar = f395944h;
                if (ebVar == null) {
                    synchronized (C146594b.class) {
                        ebVar = f395944h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f395943g);
                            f395944h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
