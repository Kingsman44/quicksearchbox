package com.google.android.apps.gsa.staticplugins.opa.promo;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.promo.ap */
/* compiled from: PG */
public final class C109920ap extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C109920ap f306268h;

    /* renamed from: i */
    private static volatile C63010eb f306269i;

    /* renamed from: a */
    public int f306270a;

    /* renamed from: b */
    public String f306271b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f306272c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f306273d;

    /* renamed from: e */
    public long f306274e;

    /* renamed from: f */
    public C109927d f306275f;

    /* renamed from: g */
    public C62971cq f306276g = emptyProtobufList();

    static {
        C109920ap apVar = new C109920ap();
        f306268h = apVar;
        C62942bv.registerDefaultInstance(C109920ap.class, apVar);
    }

    private C109920ap() {
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
                return newMessageInfo(f306268h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဂ\u0003\u0005ဉ\u0004\u0006\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C109929f.class});
            case 3:
                return new C109920ap();
            case 4:
                return new C109919ao();
            case 5:
                return f306268h;
            case 6:
                C63010eb ebVar = f306269i;
                if (ebVar == null) {
                    synchronized (C109920ap.class) {
                        ebVar = f306269i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f306268h);
                            f306269i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
