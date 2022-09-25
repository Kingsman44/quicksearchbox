package com.google.p4283bv.p4287b.p4288a.p4289a.p4294ad;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.ad.k */
/* compiled from: PG */
public final class C56641k extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56641k f151212d;

    /* renamed from: e */
    private static volatile C63010eb f151213e;

    /* renamed from: a */
    public int f151214a;

    /* renamed from: b */
    public String f151215b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f151216c = BuildConfig.FLAVOR;

    static {
        C56641k kVar = new C56641k();
        f151212d = kVar;
        C62942bv.registerDefaultInstance(C56641k.class, kVar);
    }

    private C56641k() {
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
                return newMessageInfo(f151212d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C56641k();
            case 4:
                return new C56640j();
            case 5:
                return f151212d;
            case 6:
                C63010eb ebVar = f151213e;
                if (ebVar == null) {
                    synchronized (C56641k.class) {
                        ebVar = f151213e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151212d);
                            f151213e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
