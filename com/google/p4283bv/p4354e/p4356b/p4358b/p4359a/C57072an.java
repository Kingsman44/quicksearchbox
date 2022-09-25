package com.google.p4283bv.p4354e.p4356b.p4358b.p4359a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.a.an */
/* compiled from: PG */
public final class C57072an extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C57072an f152355i;

    /* renamed from: k */
    private static volatile C63010eb f152356k;

    /* renamed from: a */
    public String f152357a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f152358b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f152359c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f152360d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f152361e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f152362f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f152363g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public int f152364h = 1;

    /* renamed from: j */
    private int f152365j;

    static {
        C57072an anVar = new C57072an();
        f152355i = anVar;
        C62942bv.registerDefaultInstance(C57072an.class, anVar);
    }

    private C57072an() {
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
                return newMessageInfo(f152355i, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003ဈ\u0003\u0004ဈ\u0004\u0005ဈ\u0005\u0006ဈ\u0006\u0007ဈ\u0001\bဌ\u0007", new Object[]{"j", "a", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, "b", C19618h.f54585a, C57070al.f152354a});
            case 3:
                return new C57072an();
            case 4:
                return new C57069ak();
            case 5:
                return f152355i;
            case 6:
                C63010eb ebVar = f152356k;
                if (ebVar == null) {
                    synchronized (C57072an.class) {
                        ebVar = f152356k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152355i);
                            f152356k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
