package com.google.android.libraries.componentview.components.base.p1687a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p10983ae.p10984a.C147476u;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.libraries.componentview.components.base.a.da */
/* compiled from: PG */
public final class C19981da extends C62942bv implements C63001dt {

    /* renamed from: v */
    public static final C19981da f55977v;

    /* renamed from: w */
    public static final C62940bt f55978w;

    /* renamed from: y */
    private static volatile C63010eb f55979y;

    /* renamed from: a */
    public int f55980a;

    /* renamed from: b */
    public String f55981b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C19995r f55982c;

    /* renamed from: d */
    public String f55983d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public float f55984e;

    /* renamed from: f */
    public int f55985f;

    /* renamed from: g */
    public int f55986g;

    /* renamed from: h */
    public C19916aq f55987h;

    /* renamed from: i */
    public C62971cq f55988i = emptyProtobufList();

    /* renamed from: j */
    public float f55989j;

    /* renamed from: k */
    public float f55990k = 1.0f;

    /* renamed from: l */
    public boolean f55991l;

    /* renamed from: m */
    public boolean f55992m;

    /* renamed from: n */
    public boolean f55993n;

    /* renamed from: o */
    public boolean f55994o = true;

    /* renamed from: p */
    public boolean f55995p;

    /* renamed from: q */
    public C19920au f55996q;

    /* renamed from: r */
    public boolean f55997r;

    /* renamed from: s */
    public boolean f55998s;

    /* renamed from: t */
    public boolean f55999t;

    /* renamed from: u */
    public String f56000u = BuildConfig.FLAVOR;

    /* renamed from: x */
    private byte f56001x = 2;

    static {
        C19981da daVar = new C19981da();
        f55977v = daVar;
        C62942bv.registerDefaultInstance(C19981da.class, daVar);
        f55978w = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, daVar, daVar, (C62958ce) null, 108390328, C63066gd.MESSAGE, C19981da.class);
    }

    private C19981da() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f56001x);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f56001x = b;
                return null;
            case 2:
                return newMessageInfo(f55977v, "\u0001\u0014\u0000\u0001\u0001\u0014\u0014\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ခ\u0003\u0005ဋ\u0004\u0006ဌ\u0005\u0007ဉ\u0006\bЛ\tခ\u0007\nခ\b\u000bဇ\t\fဇ\n\rဇ\u000b\u000eဇ\f\u000fဇ\r\u0010ဉ\u000e\u0011ဇ\u000f\u0012ဇ\u0010\u0013ဇ\u0011\u0014ဈ\u0012", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19978cy.f55975a, C19618h.f54585a, "i", C56425d.class, "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, "p", "q", C33259r.f88929b, C59002s.f156871a, C42181t.f110467a, C147476u.f398081a});
            case 3:
                return new C19981da();
            case 4:
                return new C19977cx();
            case 5:
                return f55977v;
            case 6:
                C63010eb ebVar = f55979y;
                if (ebVar == null) {
                    synchronized (C19981da.class) {
                        ebVar = f55979y;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55977v);
                            f55979y = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
