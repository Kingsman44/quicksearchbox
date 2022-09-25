package com.google.p4283bv.p4345d.p4350b.p4353c;

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

/* renamed from: com.google.bv.d.b.c.k */
/* compiled from: PG */
public final class C57019k extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C57019k f152221j;

    /* renamed from: k */
    private static volatile C63010eb f152222k;

    /* renamed from: a */
    public int f152223a;

    /* renamed from: b */
    public String f152224b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f152225c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f152226d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f152227e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f152228f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f152229g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f152230h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f152231i = BuildConfig.FLAVOR;

    static {
        C57019k kVar = new C57019k();
        f152221j = kVar;
        C62942bv.registerDefaultInstance(C57019k.class, kVar);
    }

    private C57019k() {
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
                return newMessageInfo(f152221j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\nဈ\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C57019k();
            case 4:
                return new C57018j();
            case 5:
                return f152221j;
            case 6:
                C63010eb ebVar = f152222k;
                if (ebVar == null) {
                    synchronized (C57019k.class) {
                        ebVar = f152222k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152221j);
                            f152222k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
