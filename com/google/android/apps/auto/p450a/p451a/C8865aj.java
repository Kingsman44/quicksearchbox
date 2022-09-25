package com.google.android.apps.auto.p450a.p451a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.auto.a.a.aj */
/* compiled from: PG */
public final class C8865aj extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C8865aj f30788h;

    /* renamed from: i */
    private static volatile C63010eb f30789i;

    /* renamed from: a */
    public int f30790a;

    /* renamed from: b */
    public String f30791b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C63088z f30792c = C63088z.f170246b;

    /* renamed from: d */
    public String f30793d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f30794e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f30795f;

    /* renamed from: g */
    public String f30796g = BuildConfig.FLAVOR;

    static {
        C8865aj ajVar = new C8865aj();
        f30788h = ajVar;
        C62942bv.registerDefaultInstance(C8865aj.class, ajVar);
    }

    private C8865aj() {
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
                return newMessageInfo(f30788h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003ဈ\u0003\u0004ည\u0001\u0005ဇ\u0004\u0006ဈ\u0005", new Object[]{"a", "b", "d", "e", C45240c.f118157a, C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C8865aj();
            case 4:
                return new C8864ai();
            case 5:
                return f30788h;
            case 6:
                C63010eb ebVar = f30789i;
                if (ebVar == null) {
                    synchronized (C8865aj.class) {
                        ebVar = f30789i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30788h);
                            f30789i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
