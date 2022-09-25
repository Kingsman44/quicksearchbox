package com.google.android.libraries.componentview.components.base.p1687a;

import com.evernote.android.state.BuildConfig;
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
import com.google.protobuf.C63088z;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.libraries.componentview.components.base.a.bo */
/* compiled from: PG */
public final class C19941bo extends C62942bv implements C63001dt {

    /* renamed from: q */
    public static final C19941bo f55793q;

    /* renamed from: r */
    public static final C62940bt f55794r;

    /* renamed from: s */
    private static volatile C63010eb f55795s;

    /* renamed from: a */
    public int f55796a;

    /* renamed from: b */
    public String f55797b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C63088z f55798c = C63088z.f170246b;

    /* renamed from: d */
    public String f55799d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f55800e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f55801f = true;

    /* renamed from: g */
    public int f55802g = 2;

    /* renamed from: h */
    public C19916aq f55803h;

    /* renamed from: i */
    public int f55804i = 4;

    /* renamed from: j */
    public float f55805j;

    /* renamed from: k */
    public boolean f55806k;

    /* renamed from: l */
    public C19995r f55807l;

    /* renamed from: m */
    public boolean f55808m;

    /* renamed from: n */
    public C19935bi f55809n;

    /* renamed from: o */
    public boolean f55810o;

    /* renamed from: p */
    public int f55811p;

    static {
        C19941bo boVar = new C19941bo();
        f55793q = boVar;
        C62942bv.registerDefaultInstance(C19941bo.class, boVar);
        f55794r = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, boVar, boVar, (C62958ce) null, 108390338, C63066gd.MESSAGE, C19941bo.class);
    }

    private C19941bo() {
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
                return newMessageInfo(f55793q, "\u0001\u000f\u0000\u0001\u0001\u0011\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0004ဌ\u0005\u0005ဉ\u0006\u0006ဌ\u0007\u0007ဇ\t\bည\u0001\tဈ\u0002\nဉ\n\u000bဇ\u0004\fဇ\u000b\rဉ\f\u000eဇ\r\u000fဈ\u0003\u0010ဌ\u000e\u0011ခ\b", new Object[]{"a", "b", C30325g.f82003a, C19937bk.f55791a, C19618h.f54585a, "i", C19939bm.f55792a, C19621k.f54601a, C45240c.f118157a, "d", "l", C10662f.f35572a, "m", C48004n.f124238a, C66412o.f180592a, "e", "p", C19907ah.f55699a, "j"});
            case 3:
                return new C19941bo();
            case 4:
                return new C19936bj();
            case 5:
                return f55793q;
            case 6:
                C63010eb ebVar = f55795s;
                if (ebVar == null) {
                    synchronized (C19941bo.class) {
                        ebVar = f55795s;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55793q);
                            f55795s = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
