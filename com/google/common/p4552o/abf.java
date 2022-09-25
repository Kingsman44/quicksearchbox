package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4563i.C59917bz;
import com.google.common.p4552o.p4563i.C59967q;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4963bf.p4964a.p4965a.C64576ay;
import com.google.protos.p4963bf.p4964a.p4965a.C64594bp;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.common.o.abf */
/* compiled from: PG */
public final class abf extends C62942bv implements C63001dt {

    /* renamed from: p */
    public static final abf f158184p;

    /* renamed from: q */
    private static volatile C63010eb f158185q;

    /* renamed from: a */
    public int f158186a;

    /* renamed from: b */
    public C62971cq f158187b = emptyProtobufList();

    /* renamed from: c */
    public int f158188c;

    /* renamed from: d */
    public int f158189d;

    /* renamed from: e */
    public int f158190e;

    /* renamed from: f */
    public int f158191f;

    /* renamed from: g */
    public int f158192g;

    /* renamed from: h */
    public int f158193h;

    /* renamed from: i */
    public int f158194i;

    /* renamed from: j */
    public int f158195j;

    /* renamed from: k */
    public String f158196k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public int f158197l;

    /* renamed from: m */
    public int f158198m;

    /* renamed from: n */
    public C62971cq f158199n = emptyProtobufList();

    /* renamed from: o */
    public C62971cq f158200o = emptyProtobufList();

    static {
        abf abf = new abf();
        f158184p = abf;
        C62942bv.registerDefaultInstance(abf.class, abf);
    }

    private abf() {
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
                return newMessageInfo(f158184p, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0003\u0000\u0001\u001b\u0002င\u0000\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tဈ\b\nင\u0001\u000b\u001b\rဌ\n\u000eဌ\u000b\u000f\u001b", new Object[]{"a", "b", C60695zk.class, C45240c.f118157a, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "d", C48004n.f124238a, C59967q.class, "l", C64594bp.f175134a, "m", C64576ay.f175085a, C66412o.f180592a, C59917bz.class});
            case 3:
                return new abf();
            case 4:
                return new abe();
            case 5:
                return f158184p;
            case 6:
                C63010eb ebVar = f158185q;
                if (ebVar == null) {
                    synchronized (abf.class) {
                        ebVar = f158185q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158184p);
                            f158185q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
