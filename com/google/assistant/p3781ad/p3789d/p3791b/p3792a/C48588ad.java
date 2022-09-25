package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80007da;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p.C113101n;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3860as.C49740ac;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.a.ad */
/* compiled from: PG */
public final class C48588ad extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C48588ad f125578i;

    /* renamed from: k */
    private static volatile C63010eb f125579k;

    /* renamed from: a */
    public int f125580a;

    /* renamed from: b */
    public C48661v f125581b;

    /* renamed from: c */
    public C62995dn f125582c = C62995dn.f170057a;

    /* renamed from: d */
    public C62995dn f125583d = C62995dn.f170057a;

    /* renamed from: e */
    public C62971cq f125584e = C62942bv.emptyProtobufList();

    /* renamed from: f */
    public C49740ac f125585f;

    /* renamed from: g */
    public C113101n f125586g;

    /* renamed from: h */
    public C80007da f125587h;

    /* renamed from: j */
    private byte f125588j = 2;

    static {
        C48588ad adVar = new C48588ad();
        f125578i = adVar;
        C62942bv.registerDefaultInstance(C48588ad.class, adVar);
    }

    private C48588ad() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f125588j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f125588j = b;
                return null;
            case 2:
                return newMessageInfo(f125578i, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0002\u0001\u0001\u0001ဉ\u0000\u00022\u00032\u0004Ț\u0005ᐉ\u0001\u0006ဉ\u0002\u0007ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, C48587ac.f125577a, "d", C48586ab.f125576a, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C48588ad();
            case 4:
                return new C48585aa();
            case 5:
                return f125578i;
            case 6:
                C63010eb ebVar = f125579k;
                if (ebVar == null) {
                    synchronized (C48588ad.class) {
                        ebVar = f125579k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125578i);
                            f125579k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
