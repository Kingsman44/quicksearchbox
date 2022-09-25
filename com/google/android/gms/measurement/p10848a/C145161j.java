package com.google.android.gms.measurement.p10848a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.measurement.a.j */
/* compiled from: PG */
public final class C145161j extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C145161j f392351g;

    /* renamed from: h */
    private static volatile C63010eb f392352h;

    /* renamed from: a */
    public int f392353a;

    /* renamed from: b */
    public int f392354b;

    /* renamed from: c */
    public boolean f392355c;

    /* renamed from: d */
    public String f392356d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f392357e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f392358f = BuildConfig.FLAVOR;

    static {
        C145161j jVar = new C145161j();
        f392351g = jVar;
        C62942bv.registerDefaultInstance(C145161j.class, jVar);
    }

    private C145161j() {
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
                return newMessageInfo(f392351g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", C145159h.f392350a, C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C145161j();
            case 4:
                return new C145158g();
            case 5:
                return f392351g;
            case 6:
                C63010eb ebVar = f392352h;
                if (ebVar == null) {
                    synchronized (C145161j.class) {
                        ebVar = f392352h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f392351g);
                            f392352h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
