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

/* renamed from: com.google.android.libraries.componentview.components.base.a.co */
/* compiled from: PG */
public final class C19968co extends C62942bv implements C63001dt {

    /* renamed from: B */
    public static final C19968co f55915B;

    /* renamed from: C */
    public static final C62940bt f55916C;

    /* renamed from: E */
    private static volatile C63010eb f55917E;

    /* renamed from: A */
    public boolean f55918A;

    /* renamed from: D */
    private byte f55919D = 2;

    /* renamed from: a */
    public int f55920a;

    /* renamed from: b */
    public String f55921b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f55922c;

    /* renamed from: d */
    public boolean f55923d;

    /* renamed from: e */
    public boolean f55924e;

    /* renamed from: f */
    public boolean f55925f;

    /* renamed from: g */
    public float f55926g = 0.6f;

    /* renamed from: h */
    public C19995r f55927h;

    /* renamed from: i */
    public boolean f55928i;

    /* renamed from: j */
    public String f55929j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public float f55930k;

    /* renamed from: l */
    public float f55931l;

    /* renamed from: m */
    public boolean f55932m;

    /* renamed from: n */
    public boolean f55933n;

    /* renamed from: o */
    public C62971cq f55934o = emptyProtobufList();

    /* renamed from: p */
    public String f55935p = BuildConfig.FLAVOR;

    /* renamed from: q */
    public float f55936q;

    /* renamed from: r */
    public C19983f f55937r;

    /* renamed from: s */
    public boolean f55938s;

    /* renamed from: t */
    public int f55939t;

    /* renamed from: u */
    public boolean f55940u;

    /* renamed from: v */
    public float f55941v;

    /* renamed from: w */
    public String f55942w = BuildConfig.FLAVOR;

    /* renamed from: x */
    public C19966cm f55943x;

    /* renamed from: y */
    public boolean f55944y;

    /* renamed from: z */
    public boolean f55945z;

    static {
        C19968co coVar = new C19968co();
        f55915B = coVar;
        C62942bv.registerDefaultInstance(C19968co.class, coVar);
        f55916C = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, coVar, coVar, (C62958ce) null, 108390331, C63066gd.MESSAGE, C19968co.class);
    }

    private C19968co() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f55919D);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f55919D = b;
                return null;
            case 2:
                return newMessageInfo(f55915B, "\u0001\u001a\u0000\u0001\u0001\u001b\u001a\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ခ\u0005\u0007ဉ\u0006\bဇ\u0007\tဈ\b\nခ\t\u000bခ\n\rဇ\u000b\u000eဇ\f\u000fЛ\u0010ဈ\r\u0011ခ\u000e\u0012ဉ\u000f\u0013ဇ\u0010\u0014ဇ\u0012\u0015ခ\u0013\u0016ဈ\u0014\u0017ဉ\u0015\u0018ဇ\u0016\u0019ဇ\u0017\u001aဇ\u0018\u001bင\u0011", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, C56425d.class, "p", "q", C33259r.f88929b, C59002s.f156871a, C147476u.f398081a, "v", "w", "x", "y", "z", "A", C42181t.f110467a});
            case 3:
                return new C19968co();
            case 4:
                return new C19967cn();
            case 5:
                return f55915B;
            case 6:
                C63010eb ebVar = f55917E;
                if (ebVar == null) {
                    synchronized (C19968co.class) {
                        ebVar = f55917E;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55915B);
                            f55917E = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
