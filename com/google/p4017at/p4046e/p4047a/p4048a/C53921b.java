package com.google.p4017at.p4046e.p4047a.p4048a;

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

/* renamed from: com.google.at.e.a.a.b */
/* compiled from: PG */
public final class C53921b extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C53921b f141481i;

    /* renamed from: k */
    private static volatile C63010eb f141482k;

    /* renamed from: a */
    public String f141483a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f141484b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f141485c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f141486d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f141487e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f141488f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f141489g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public int f141490h;

    /* renamed from: j */
    private int f141491j;

    static {
        C53921b bVar = new C53921b();
        f141481i = bVar;
        C62942bv.registerDefaultInstance(C53921b.class, bVar);
    }

    private C53921b() {
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
                return newMessageInfo(f141481i, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bင\u0007", new Object[]{"j", "a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C53921b();
            case 4:
                return new C53920a();
            case 5:
                return f141481i;
            case 6:
                C63010eb ebVar = f141482k;
                if (ebVar == null) {
                    synchronized (C53921b.class) {
                        ebVar = f141482k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141481i);
                            f141482k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
