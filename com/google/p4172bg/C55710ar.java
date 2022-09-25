package com.google.p4172bg;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bg.ar */
/* compiled from: PG */
public final class C55710ar extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C55710ar f146965f;

    /* renamed from: g */
    private static volatile C63010eb f146966g;

    /* renamed from: a */
    public String f146967a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f146968b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f146969c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f146970d;

    /* renamed from: e */
    public boolean f146971e;

    static {
        C55710ar arVar = new C55710ar();
        f146965f = arVar;
        C62942bv.registerDefaultInstance(C55710ar.class, arVar);
    }

    private C55710ar() {
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
                return newMessageInfo(f146965f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0007\u0005\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C55710ar();
            case 4:
                return new C55709aq();
            case 5:
                return f146965f;
            case 6:
                C63010eb ebVar = f146966g;
                if (ebVar == null) {
                    synchronized (C55710ar.class) {
                        ebVar = f146966g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146965f);
                            f146966g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
