package com.google.android.gms.measurement.p10848a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.measurement.a.at */
/* compiled from: PG */
public final class C145142at extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C145142at f392296g;

    /* renamed from: h */
    private static volatile C63010eb f392297h;

    /* renamed from: a */
    public int f392298a;

    /* renamed from: b */
    public long f392299b;

    /* renamed from: c */
    public String f392300c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f392301d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public long f392302e;

    /* renamed from: f */
    public double f392303f;

    static {
        C145142at atVar = new C145142at();
        f392296g = atVar;
        C62942bv.registerDefaultInstance(C145142at.class, atVar);
    }

    private C145142at() {
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
                return newMessageInfo(f392296g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0006က\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C145142at();
            case 4:
                return new C145141as();
            case 5:
                return f392296g;
            case 6:
                C63010eb ebVar = f392297h;
                if (ebVar == null) {
                    synchronized (C145142at.class) {
                        ebVar = f392297h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f392296g);
                            f392297h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
