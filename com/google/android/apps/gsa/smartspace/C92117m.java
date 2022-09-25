package com.google.android.apps.gsa.smartspace;

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

/* renamed from: com.google.android.apps.gsa.smartspace.m */
/* compiled from: PG */
public final class C92117m extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C92117m f256824i;

    /* renamed from: j */
    private static volatile C63010eb f256825j;

    /* renamed from: a */
    public int f256826a;

    /* renamed from: b */
    public String f256827b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f256828c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f256829d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public long f256830e;

    /* renamed from: f */
    public long f256831f;

    /* renamed from: g */
    public int f256832g;

    /* renamed from: h */
    public String f256833h = BuildConfig.FLAVOR;

    static {
        C92117m mVar = new C92117m();
        f256824i = mVar;
        C62942bv.registerDefaultInstance(C92117m.class, mVar);
    }

    private C92117m() {
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
                return newMessageInfo(f256824i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဈ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C92115k.f256823a, C19618h.f54585a});
            case 3:
                return new C92117m();
            case 4:
                return new C92114j();
            case 5:
                return f256824i;
            case 6:
                C63010eb ebVar = f256825j;
                if (ebVar == null) {
                    synchronized (C92117m.class) {
                        ebVar = f256825j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f256824i);
                            f256825j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
