package com.google.android.apps.search.soundsearch.p10664h;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.audio.p4107b.p4108a.C54591n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.soundsearch.h.d */
/* compiled from: PG */
public final class C141708d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C141708d f384603d;

    /* renamed from: f */
    private static volatile C63010eb f384604f;

    /* renamed from: a */
    public int f384605a;

    /* renamed from: b */
    public C54591n f384606b;

    /* renamed from: c */
    public String f384607c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private byte f384608e = 2;

    static {
        C141708d dVar = new C141708d();
        f384603d = dVar;
        C62942bv.registerDefaultInstance(C141708d.class, dVar);
    }

    private C141708d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f384608e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f384608e = b;
                return null;
            case 2:
                return newMessageInfo(f384603d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C141708d();
            case 4:
                return new C141707c();
            case 5:
                return f384603d;
            case 6:
                C63010eb ebVar = f384604f;
                if (ebVar == null) {
                    synchronized (C141708d.class) {
                        ebVar = f384604f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f384603d);
                            f384604f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
