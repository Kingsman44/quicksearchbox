package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.bm */
/* compiled from: PG */
public final class C79965bm extends C62942bv implements C63001dt {

    /* renamed from: r */
    public static final C79965bm f219309r;

    /* renamed from: s */
    private static volatile C63010eb f219310s;

    /* renamed from: a */
    public int f219311a;

    /* renamed from: b */
    public float f219312b;

    /* renamed from: c */
    public String f219313c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public float f219314d;

    /* renamed from: e */
    public float f219315e;

    /* renamed from: f */
    public C62971cq f219316f = emptyProtobufList();

    /* renamed from: g */
    public C79961bi f219317g;

    /* renamed from: h */
    public C79969bq f219318h;

    /* renamed from: i */
    public C79971bs f219319i;

    /* renamed from: j */
    public C79946au f219320j;

    /* renamed from: k */
    public C79953ba f219321k;

    /* renamed from: l */
    public C79953ba f219322l;

    /* renamed from: m */
    public C79967bo f219323m;

    /* renamed from: n */
    public C79963bk f219324n;

    /* renamed from: o */
    public C79963bk f219325o;

    /* renamed from: p */
    public C79963bk f219326p;

    /* renamed from: q */
    public C79963bk f219327q;

    static {
        C79965bm bmVar = new C79965bm();
        f219309r = bmVar;
        C62942bv.registerDefaultInstance(C79965bm.class, bmVar);
    }

    private C79965bm() {
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
                return newMessageInfo(f219309r, "\u0001\u0010\u0000\u0001\u0002\u0012\u0010\u0000\u0001\u0000\u0002ခ\u0001\u0004\u001b\u0005ဈ\u0002\u0006ခ\u0003\u0007ခ\u0004\bဉ\n\tဉ\u000b\nဉ\f\u000bဉ\r\fဉ\u000e\rဉ\u000f\u000eဉ\u0010\u000fဉ\u0006\u0010ဉ\u0007\u0011ဉ\t\u0012ဉ\b", new Object[]{"a", "b", C10662f.f35572a, C79944as.class, C45240c.f118157a, "d", "e", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, "p", "q", C30325g.f82003a, C19618h.f54585a, "j", "i"});
            case 3:
                return new C79965bm();
            case 4:
                return new C79964bl();
            case 5:
                return f219309r;
            case 6:
                C63010eb ebVar = f219310s;
                if (ebVar == null) {
                    synchronized (C79965bm.class) {
                        ebVar = f219310s;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219309r);
                            f219310s = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
