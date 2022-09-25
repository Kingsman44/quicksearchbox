package com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.ondevice.f.a.a.n */
/* compiled from: PG */
public final class C24459n extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C24459n f66948g;

    /* renamed from: h */
    private static volatile C63010eb f66949h;

    /* renamed from: a */
    public int f66950a;

    /* renamed from: b */
    public boolean f66951b;

    /* renamed from: c */
    public int f66952c;

    /* renamed from: d */
    public int f66953d;

    /* renamed from: e */
    public String f66954e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f66955f = BuildConfig.FLAVOR;

    static {
        C24459n nVar = new C24459n();
        f66948g = nVar;
        C62942bv.registerDefaultInstance(C24459n.class, nVar);
    }

    private C24459n() {
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
                return newMessageInfo(f66948g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, C24455j.f66946a, "d", C24457l.f66947a, "e", C10662f.f35572a});
            case 3:
                return new C24459n();
            case 4:
                return new C24454i();
            case 5:
                return f66948g;
            case 6:
                C63010eb ebVar = f66949h;
                if (ebVar == null) {
                    synchronized (C24459n.class) {
                        ebVar = f66949h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f66948g);
                            f66949h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
