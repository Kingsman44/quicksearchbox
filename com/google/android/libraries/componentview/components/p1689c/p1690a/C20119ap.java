package com.google.android.libraries.componentview.components.p1689c.p1690a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.componentview.components.base.p1687a.C19916aq;
import com.google.android.libraries.componentview.components.base.p1687a.C19984g;
import com.google.android.libraries.componentview.components.base.p1687a.C19986i;
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

/* renamed from: com.google.android.libraries.componentview.components.c.a.ap */
/* compiled from: PG */
public final class C20119ap extends C62942bv implements C63001dt {

    /* renamed from: r */
    public static final C20119ap f56375r;

    /* renamed from: s */
    public static final C62940bt f56376s;

    /* renamed from: t */
    private static volatile C63010eb f56377t;

    /* renamed from: a */
    public int f56378a;

    /* renamed from: b */
    public String f56379b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f56380c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f56381d;

    /* renamed from: e */
    public boolean f56382e;

    /* renamed from: f */
    public int f56383f;

    /* renamed from: g */
    public float f56384g;

    /* renamed from: h */
    public int f56385h;

    /* renamed from: i */
    public boolean f56386i;

    /* renamed from: j */
    public int f56387j;

    /* renamed from: k */
    public float f56388k;

    /* renamed from: l */
    public float f56389l = 1.0f;

    /* renamed from: m */
    public String f56390m = BuildConfig.FLAVOR;

    /* renamed from: n */
    public int f56391n;

    /* renamed from: o */
    public boolean f56392o;

    /* renamed from: p */
    public boolean f56393p;

    /* renamed from: q */
    public C19916aq f56394q;

    static {
        C20119ap apVar = new C20119ap();
        f56375r = apVar;
        C62942bv.registerDefaultInstance(C20119ap.class, apVar);
        f56376s = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, apVar, apVar, (C62958ce) null, 115382447, C63066gd.MESSAGE, C20119ap.class);
    }

    private C20119ap() {
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
                return newMessageInfo(f56375r, "\u0001\u0010\u0000\u0001\u0001\u0011\u0010\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0002\u0003ဇ\u0003\u0004ဌ\u0004\u0005ခ\u0005\u0006ဋ\u0006\u0007ဇ\u0007\bဌ\b\nခ\t\u000bခ\n\fဈ\u000b\rဌ\f\u000eဇ\r\u000fဉ\u000f\u0010ဇ\u000e\u0011ဈ\u0001", new Object[]{"a", "b", "d", C20115al.f56373a, "e", C10662f.f35572a, C19984g.f56010a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19986i.f56011a, C19621k.f54601a, "l", "m", C48004n.f124238a, C20117an.f56374a, C66412o.f180592a, "q", "p", C45240c.f118157a});
            case 3:
                return new C20119ap();
            case 4:
                return new C20114ak();
            case 5:
                return f56375r;
            case 6:
                C63010eb ebVar = f56377t;
                if (ebVar == null) {
                    synchronized (C20119ap.class) {
                        ebVar = f56377t;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56375r);
                            f56377t = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
