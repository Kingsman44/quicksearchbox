package com.google.p4653i.p4654a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p381aj.p382a.p383a.p384a.C8242v;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.i.a.x */
/* compiled from: PG */
public final class C61714x extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C61714x f166722k;

    /* renamed from: m */
    private static volatile C63010eb f166723m;

    /* renamed from: a */
    public int f166724a;

    /* renamed from: b */
    public double f166725b;

    /* renamed from: c */
    public double f166726c;

    /* renamed from: d */
    public String f166727d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f166728e;

    /* renamed from: f */
    public int f166729f = 1;

    /* renamed from: g */
    public C8242v f166730g;

    /* renamed from: h */
    public String f166731h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public C61686b f166732i;

    /* renamed from: j */
    public C61716z f166733j;

    /* renamed from: l */
    private byte f166734l = 2;

    static {
        C61714x xVar = new C61714x();
        f166722k = xVar;
        C62942bv.registerDefaultInstance(C61714x.class, xVar);
    }

    private C61714x() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f166734l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f166734l = b;
                return null;
            case 2:
                return newMessageInfo(f166722k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0001\u0001က\u0000\u0002က\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဌ\u0004\u0006ᐉ\u0005\u0007ဈ\u0006\bဉ\b\tဉ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C61712v.f166721a, C30325g.f82003a, C19618h.f54585a, "j", "i"});
            case 3:
                return new C61714x();
            case 4:
                return new C61711u();
            case 5:
                return f166722k;
            case 6:
                C63010eb ebVar = f166723m;
                if (ebVar == null) {
                    synchronized (C61714x.class) {
                        ebVar = f166723m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166722k);
                            f166723m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
