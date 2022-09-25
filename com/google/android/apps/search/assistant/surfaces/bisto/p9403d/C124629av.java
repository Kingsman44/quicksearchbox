package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.av */
/* compiled from: PG */
public final class C124629av extends C62942bv implements C63001dt {

    /* renamed from: r */
    public static final C124629av f343812r;

    /* renamed from: s */
    private static volatile C63010eb f343813s;

    /* renamed from: a */
    public int f343814a;

    /* renamed from: b */
    public String f343815b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f343816c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f343817d;

    /* renamed from: e */
    public int f343818e;

    /* renamed from: f */
    public int f343819f;

    /* renamed from: g */
    public long f343820g;

    /* renamed from: h */
    public int f343821h;

    /* renamed from: i */
    public String f343822i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f343823j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public int f343824k;

    /* renamed from: l */
    public long f343825l;

    /* renamed from: m */
    public long f343826m;

    /* renamed from: n */
    public boolean f343827n;

    /* renamed from: o */
    public C62971cq f343828o = emptyProtobufList();

    /* renamed from: p */
    public int f343829p;

    /* renamed from: q */
    public String f343830q = BuildConfig.FLAVOR;

    static {
        C124629av avVar = new C124629av();
        f343812r = avVar;
        C62942bv.registerDefaultInstance(C124629av.class, avVar);
    }

    private C124629av() {
    }

    /* renamed from: a */
    public final void mo106569a() {
        C62971cq cqVar = this.f343828o;
        if (!cqVar.mo58948c()) {
            this.f343828o = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f343812r, "\u0001\u0010\u0000\u0001\u0001\u0013\u0010\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0006င\u0004\tဂ\u0007\nဌ\b\u000bဈ\t\fဈ\n\rဌ\u000b\u000eဂ\f\u000fဂ\r\u0010ဇ\u000e\u0011\u001b\u0012င\u000f\u0013ဈ\u0010", new Object[]{"a", "b", C45240c.f118157a, "d", C124637bc.f343850a, "e", C124639be.f343851a, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C124625ar.m204291b(), "i", "j", C19621k.f54601a, C124651bq.f343907a, "l", "m", C48004n.f124238a, C66412o.f180592a, C124650bp.class, "p", "q"});
            case 3:
                return new C124629av();
            case 4:
                return new C124628au();
            case 5:
                return f343812r;
            case 6:
                C63010eb ebVar = f343813s;
                if (ebVar == null) {
                    synchronized (C124629av.class) {
                        ebVar = f343813s;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f343812r);
                            f343813s = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
