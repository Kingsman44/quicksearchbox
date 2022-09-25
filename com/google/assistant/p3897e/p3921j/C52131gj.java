package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.gj */
/* compiled from: PG */
public final class C52131gj extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C52131gj f136789h;

    /* renamed from: i */
    private static volatile C63010eb f136790i;

    /* renamed from: a */
    public int f136791a;

    /* renamed from: b */
    public String f136792b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f136793c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f136794d = true;

    /* renamed from: e */
    public int f136795e;

    /* renamed from: f */
    public String f136796f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f136797g = BuildConfig.FLAVOR;

    static {
        C52131gj gjVar = new C52131gj();
        f136789h = gjVar;
        C62942bv.registerDefaultInstance(C52131gj.class, gjVar);
    }

    private C52131gj() {
    }

    /* renamed from: b */
    public static C63010eb m86514b() {
        return f136789h.getParserForType();
    }

    /* renamed from: a */
    public final boolean mo53800a() {
        return (this.f136791a & 16) != 0;
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
                return newMessageInfo(f136789h, "\u0001\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဇ\u0002\u0005ဌ\u0003\u0006ဈ\u0004\u0007ဈ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C52129gh.f136788a, C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C52131gj();
            case 4:
                return new C52128gg();
            case 5:
                return f136789h;
            case 6:
                C63010eb ebVar = f136790i;
                if (ebVar == null) {
                    synchronized (C52131gj.class) {
                        ebVar = f136790i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136789h);
                            f136790i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
