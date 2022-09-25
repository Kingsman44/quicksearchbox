package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.p10712d.C142388dm;
import com.google.android.p10712d.C142390do;
import com.google.android.p10712d.C142407ee;
import com.google.android.p10712d.C142413ek;
import com.google.android.p10712d.C142531w;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.bh */
/* compiled from: PG */
public final class C124642bh extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C124642bh f343852o;

    /* renamed from: p */
    private static volatile C63010eb f343853p;

    /* renamed from: a */
    public int f343854a;

    /* renamed from: b */
    public int f343855b = -1;

    /* renamed from: c */
    public int f343856c;

    /* renamed from: d */
    public long f343857d;

    /* renamed from: e */
    public long f343858e;

    /* renamed from: f */
    public int f343859f;

    /* renamed from: g */
    public int f343860g;

    /* renamed from: h */
    public int f343861h;

    /* renamed from: i */
    public int f343862i;

    /* renamed from: j */
    public String f343863j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public C62971cq f343864k = emptyProtobufList();

    /* renamed from: l */
    public int f343865l;

    /* renamed from: m */
    public int f343866m;

    /* renamed from: n */
    public int f343867n;

    static {
        C124642bh bhVar = new C124642bh();
        f343852o = bhVar;
        C62942bv.registerDefaultInstance(C124642bh.class, bhVar);
    }

    private C124642bh() {
    }

    /* renamed from: a */
    public final void mo106572a() {
        C62971cq cqVar = this.f343864k;
        if (!cqVar.mo58948c()) {
            this.f343864k = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f343852o, "\u0001\r\u0000\u0001\u0001\u0013\r\u0000\u0001\u0000\u0001င\u0000\u0002ဌ\u0001\u0007ဂ\u0002\bဂ\u0003\u000bဌ\u0004\fဌ\u0005\rဌ\u0006\u000eဌ\u0007\u000fဈ\b\u0010\u001b\u0011ဌ\t\u0012ဌ\n\u0013ဌ\u000b", new Object[]{"a", "b", C45240c.f118157a, C124715m.m204379b(), "d", "e", C10662f.f35572a, C124647bm.f343889a, C30325g.f82003a, C124630aw.f343831a, C19618h.f54585a, C124613af.m204284b(), "i", C142413ek.m231080b(), "j", C19621k.f54601a, C142531w.class, "l", C142388dm.m231073b(), "m", C142407ee.m231078b(), C48004n.f124238a, C142390do.m231075b()});
            case 3:
                return new C124642bh();
            case 4:
                return new C124641bg();
            case 5:
                return f343852o;
            case 6:
                C63010eb ebVar = f343853p;
                if (ebVar == null) {
                    synchronized (C124642bh.class) {
                        ebVar = f343853p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f343852o);
                            f343853p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
