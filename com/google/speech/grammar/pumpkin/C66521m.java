package com.google.speech.grammar.pumpkin;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.grammar.pumpkin.m */
/* compiled from: PG */
public final class C66521m extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C66521m f180919g;

    /* renamed from: i */
    private static volatile C63010eb f180920i;

    /* renamed from: a */
    public int f180921a;

    /* renamed from: b */
    public String f180922b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f180923c = -1;

    /* renamed from: d */
    public float f180924d;

    /* renamed from: e */
    public String f180925e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f180926f = BuildConfig.FLAVOR;

    /* renamed from: h */
    private byte f180927h = 2;

    static {
        C66521m mVar = new C66521m();
        f180919g = mVar;
        C62942bv.registerDefaultInstance(C66521m.class, mVar);
    }

    private C66521m() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f180927h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f180927h = b;
                return null;
            case 2:
                return newMessageInfo(f180919g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဌ\u0001\u0004ခ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"a", "b", C45240c.f118157a, C66522n.f180928a, "d", "e", C10662f.f35572a});
            case 3:
                return new C66521m();
            case 4:
                return new C66520l();
            case 5:
                return f180919g;
            case 6:
                C63010eb ebVar = f180920i;
                if (ebVar == null) {
                    synchronized (C66521m.class) {
                        ebVar = f180920i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180919g);
                            f180920i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
