package com.google.p4184bj.p4189b.p4190a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4479cg.C58079k;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.b.a.l */
/* compiled from: PG */
public final class C55880l extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C55880l f148692f;

    /* renamed from: h */
    private static volatile C63010eb f148693h;

    /* renamed from: a */
    public String f148694a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f148695b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C58079k f148696c;

    /* renamed from: d */
    public String f148697d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f148698e;

    /* renamed from: g */
    private int f148699g;

    static {
        C55880l lVar = new C55880l();
        f148692f = lVar;
        C62942bv.registerDefaultInstance(C55880l.class, lVar);
    }

    private C55880l() {
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
                return newMessageInfo(f148692f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဌ\u0004", new Object[]{C30325g.f82003a, "a", "b", C45240c.f118157a, "d", "e", C55878j.f148691a});
            case 3:
                return new C55880l();
            case 4:
                return new C55877i();
            case 5:
                return f148692f;
            case 6:
                C63010eb ebVar = f148693h;
                if (ebVar == null) {
                    synchronized (C55880l.class) {
                        ebVar = f148693h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f148692f);
                            f148693h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
