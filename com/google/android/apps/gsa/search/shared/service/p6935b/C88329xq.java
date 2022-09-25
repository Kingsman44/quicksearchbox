package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60456qs;
import com.google.p4184bj.C56036l;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.xq */
/* compiled from: PG */
public final class C88329xq extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C88329xq f238867j;

    /* renamed from: m */
    private static volatile C63010eb f238868m;

    /* renamed from: a */
    public int f238869a;

    /* renamed from: b */
    public long f238870b;

    /* renamed from: c */
    public C60456qs f238871c;

    /* renamed from: d */
    public boolean f238872d;

    /* renamed from: e */
    public boolean f238873e;

    /* renamed from: f */
    public int f238874f;

    /* renamed from: g */
    public boolean f238875g;

    /* renamed from: h */
    public boolean f238876h;

    /* renamed from: i */
    public C56036l f238877i;

    /* renamed from: k */
    private C60321oe f238878k;

    /* renamed from: l */
    private byte f238879l = 2;

    static {
        C88329xq xqVar = new C88329xq();
        f238867j = xqVar;
        C62942bv.registerDefaultInstance(C88329xq.class, xqVar);
    }

    private C88329xq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f238879l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f238879l = b;
                return null;
            case 2:
                return newMessageInfo(f238867j, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0003\u0001ဂ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bᐉ\u0007\tᐉ\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C19621k.f54601a, "i"});
            case 3:
                return new C88329xq();
            case 4:
                return new C88328xp();
            case 5:
                return f238867j;
            case 6:
                C63010eb ebVar = f238868m;
                if (ebVar == null) {
                    synchronized (C88329xq.class) {
                        ebVar = f238868m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238867j);
                            f238868m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
