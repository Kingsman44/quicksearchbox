package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106531e;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8222i.C106566d;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p4016z.C53708bf;
import com.google.p4479cg.C58079k;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.h */
/* compiled from: PG */
public final class C106596h extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C106596h f297204n;

    /* renamed from: q */
    private static volatile C63010eb f297205q;

    /* renamed from: a */
    public int f297206a;

    /* renamed from: b */
    public int f297207b;

    /* renamed from: c */
    public boolean f297208c;

    /* renamed from: d */
    public long f297209d;

    /* renamed from: e */
    public long f297210e;

    /* renamed from: f */
    public long f297211f;

    /* renamed from: g */
    public String f297212g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f297213h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public C62971cq f297214i = emptyProtobufList();

    /* renamed from: j */
    public long f297215j;

    /* renamed from: k */
    public C58079k f297216k;

    /* renamed from: l */
    public C63042fg f297217l;

    /* renamed from: m */
    public int f297218m;

    /* renamed from: o */
    private C106566d f297219o;

    /* renamed from: p */
    private byte f297220p = 2;

    static {
        C106596h hVar = new C106596h();
        f297204n = hVar;
        C62942bv.registerDefaultInstance(C106596h.class, hVar);
    }

    private C106596h() {
    }

    /* renamed from: a */
    public final void mo95586a() {
        C62971cq cqVar = this.f297214i;
        if (!cqVar.mo58948c()) {
            this.f297214i = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f297220p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f297220p = b;
                return null;
            case 2:
                return newMessageInfo(f297204n, "\u0001\r\u0000\u0001\u0004\u0014\r\u0000\u0001\u0002\u0004ဇ\u0002\u0007ဂ\t\bဉ\n\tЛ\nဌ\u0000\fᐉ\f\u000eဉ\u000e\u000fဌ\u000f\u0010ဂ\u0003\u0011ဂ\u0004\u0012ဈ\u0006\u0013ဂ\u0005\u0014ဈ\u0007", new Object[]{"a", C45240c.f118157a, "j", C19621k.f54601a, "i", C53708bf.class, "b", C106531e.m177307b(), C66412o.f180592a, "l", "m", C106595g.m177370b(), "d", "e", C30325g.f82003a, C10662f.f35572a, C19618h.f54585a});
            case 3:
                return new C106596h();
            case 4:
                return new C106593e();
            case 5:
                return f297204n;
            case 6:
                C63010eb ebVar = f297205q;
                if (ebVar == null) {
                    synchronized (C106596h.class) {
                        ebVar = f297205q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f297204n);
                            f297205q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
