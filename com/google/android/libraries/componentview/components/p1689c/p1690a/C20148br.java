package com.google.android.libraries.componentview.components.p1689c.p1690a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.componentview.components.base.p1687a.C19983f;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.libraries.componentview.components.c.a.br */
/* compiled from: PG */
public final class C20148br extends C62942bv implements C63001dt {

    /* renamed from: r */
    public static final C20148br f56496r;

    /* renamed from: s */
    public static final C62940bt f56497s;

    /* renamed from: t */
    private static volatile C63010eb f56498t;

    /* renamed from: a */
    public int f56499a;

    /* renamed from: b */
    public int f56500b = 0;

    /* renamed from: c */
    public Object f56501c;

    /* renamed from: d */
    public int f56502d = 0;

    /* renamed from: e */
    public Object f56503e;

    /* renamed from: f */
    public C20145bo f56504f;

    /* renamed from: g */
    public String f56505g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f56506h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f56507i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public C19983f f56508j;

    /* renamed from: k */
    public String f56509k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public String f56510l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public String f56511m = BuildConfig.FLAVOR;

    /* renamed from: n */
    public String f56512n = BuildConfig.FLAVOR;

    /* renamed from: o */
    public String f56513o = BuildConfig.FLAVOR;

    /* renamed from: p */
    public String f56514p = BuildConfig.FLAVOR;

    /* renamed from: q */
    public String f56515q = BuildConfig.FLAVOR;

    static {
        C20148br brVar = new C20148br();
        f56496r = brVar;
        C62942bv.registerDefaultInstance(C20148br.class, brVar);
        f56497s = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, brVar, brVar, (C62958ce) null, 122073380, C63066gd.MESSAGE, C20148br.class);
    }

    private C20148br() {
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
                return newMessageInfo(f56496r, "\u0001\u0010\u0002\u0001\u0002\u0011\u0010\u0000\u0000\u0000\u0002ြ\u0001\u0003ြ\u0001\u0004ဉ\u0004\u0005ဈ\u0005\u0006ဈ\u0006\u0007ဈ\u0007\bြ\u0000\tြ\u0000\nဉ\b\u000bဈ\t\fဈ\n\rဈ\u000b\u000eဈ\f\u000fဈ\r\u0010ဈ\u000e\u0011ဈ\u000f", new Object[]{C45240c.f118157a, "b", "e", "d", "a", C20145bo.class, C20145bo.class, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", C20143bm.class, C20147bq.class, "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, "p", "q"});
            case 3:
                return new C20148br();
            case 4:
                return new C20141bk();
            case 5:
                return f56496r;
            case 6:
                C63010eb ebVar = f56498t;
                if (ebVar == null) {
                    synchronized (C20148br.class) {
                        ebVar = f56498t;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56496r);
                            f56498t = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
