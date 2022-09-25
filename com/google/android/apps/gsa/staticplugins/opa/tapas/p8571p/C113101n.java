package com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.p.n */
/* compiled from: PG */
public final class C113101n extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C113101n f313365l;

    /* renamed from: m */
    private static volatile C63010eb f313366m;

    /* renamed from: a */
    public int f313367a;

    /* renamed from: b */
    public C62971cq f313368b;

    /* renamed from: c */
    public C113103p f313369c;

    /* renamed from: d */
    public C62995dn f313370d = C62995dn.f170057a;

    /* renamed from: e */
    public C62995dn f313371e;

    /* renamed from: f */
    public C62995dn f313372f;

    /* renamed from: g */
    public C62995dn f313373g;

    /* renamed from: h */
    public C62995dn f313374h;

    /* renamed from: i */
    public C62995dn f313375i;

    /* renamed from: j */
    public C62995dn f313376j;

    /* renamed from: k */
    public C62995dn f313377k;

    static {
        C113101n nVar = new C113101n();
        f313365l = nVar;
        C62942bv.registerDefaultInstance(C113101n.class, nVar);
    }

    private C113101n() {
        C62995dn dnVar = C62995dn.f170057a;
        this.f313371e = dnVar;
        this.f313372f = dnVar;
        this.f313373g = dnVar;
        this.f313374h = dnVar;
        this.f313375i = dnVar;
        this.f313376j = dnVar;
        this.f313377k = dnVar;
        this.f313368b = C62942bv.emptyProtobufList();
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
                return newMessageInfo(f313365l, "\u0001\n\u0000\u0001\u0001\n\n\b\u0001\u0000\u0001\u001a\u0002ဉ\u0000\u00032\u00042\u00052\u00062\u00072\b2\t2\n2", new Object[]{"a", "b", C45240c.f118157a, "d", C113099l.f313363a, "e", C113094g.f313358a, C10662f.f35572a, C113096i.f313360a, C30325g.f82003a, C113098k.f313362a, C19618h.f54585a, C113097j.f313361a, "i", C113100m.f313364a, "j", C113095h.f313359a, C19621k.f54601a, C113092e.f313357a});
            case 3:
                return new C113101n();
            case 4:
                return new C113093f();
            case 5:
                return f313365l;
            case 6:
                C63010eb ebVar = f313366m;
                if (ebVar == null) {
                    synchronized (C113101n.class) {
                        ebVar = f313366m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f313365l);
                            f313366m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
