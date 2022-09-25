package com.google.common.p4552o;

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

/* renamed from: com.google.common.o.afg */
/* compiled from: PG */
public final class afg extends C62942bv implements C63001dt {

    /* renamed from: q */
    public static final afg f158518q;

    /* renamed from: r */
    private static volatile C63010eb f158519r;

    /* renamed from: a */
    public int f158520a;

    /* renamed from: b */
    public boolean f158521b;

    /* renamed from: c */
    public double f158522c;

    /* renamed from: d */
    public double f158523d;

    /* renamed from: e */
    public String f158524e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public double f158525f;

    /* renamed from: g */
    public double f158526g;

    /* renamed from: h */
    public double f158527h;

    /* renamed from: i */
    public int f158528i;

    /* renamed from: j */
    public String f158529j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public C62971cq f158530k = emptyProtobufList();

    /* renamed from: l */
    public boolean f158531l;

    /* renamed from: m */
    public double f158532m;

    /* renamed from: n */
    public double f158533n;

    /* renamed from: o */
    public aff f158534o;

    /* renamed from: p */
    public afc f158535p;

    static {
        afg afg = new afg();
        f158518q = afg;
        C62942bv.registerDefaultInstance(afg.class, afg);
    }

    private afg() {
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
                return newMessageInfo(f158518q, "\u0001\u000f\u0000\u0001\u0001\u0014\u000f\u0000\u0001\u0000\u0001ဇ\u0000\u0002က\u0001\u0003က\u0002\u0007ဈ\u0005\bက\u0006\tက\u0007\fက\n\rင\u000b\u000eဈ\f\u000f\u001b\u0010ဇ\u000e\u0011က\u000f\u0012က\u0010\u0013ဉ\u0011\u0014ဉ\u0012", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, afa.class, "l", "m", C48004n.f124238a, C66412o.f180592a, "p"});
            case 3:
                return new afg();
            case 4:
                return new afd();
            case 5:
                return f158518q;
            case 6:
                C63010eb ebVar = f158519r;
                if (ebVar == null) {
                    synchronized (afg.class) {
                        ebVar = f158519r;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158518q);
                            f158519r = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
