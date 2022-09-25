package com.google.nlp.p4735b.p4736a.p4737a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.b.a.a.d */
/* compiled from: PG */
public final class C62811d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62811d f169616d;

    /* renamed from: f */
    private static volatile C63010eb f169617f;

    /* renamed from: a */
    public int f169618a;

    /* renamed from: b */
    public boolean f169619b;

    /* renamed from: c */
    public String f169620c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private byte f169621e = 2;

    static {
        C62811d dVar = new C62811d();
        f169616d = dVar;
        C62942bv.registerDefaultInstance(C62811d.class, dVar);
    }

    private C62811d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169621e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f169621e = b;
                return null;
            case 2:
                return newMessageInfo(f169616d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C62811d();
            case 4:
                return new C62810c();
            case 5:
                return f169616d;
            case 6:
                C63010eb ebVar = f169617f;
                if (ebVar == null) {
                    synchronized (C62811d.class) {
                        ebVar = f169617f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169616d);
                            f169617f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
