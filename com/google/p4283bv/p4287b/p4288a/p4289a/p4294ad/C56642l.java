package com.google.p4283bv.p4287b.p4288a.p4289a.p4294ad;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.ad.l */
/* compiled from: PG */
public final class C56642l extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C56642l f151217g;

    /* renamed from: h */
    private static volatile C63010eb f151218h;

    /* renamed from: a */
    public int f151219a;

    /* renamed from: b */
    public String f151220b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f151221c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f151222d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f151223e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C56641k f151224f;

    static {
        C56642l lVar = new C56642l();
        f151217g = lVar;
        C62942bv.registerDefaultInstance(C56642l.class, lVar);
    }

    private C56642l() {
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
                return newMessageInfo(f151217g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C56642l();
            case 4:
                return new C56639i();
            case 5:
                return f151217g;
            case 6:
                C63010eb ebVar = f151218h;
                if (ebVar == null) {
                    synchronized (C56642l.class) {
                        ebVar = f151218h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151217g);
                            f151218h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
