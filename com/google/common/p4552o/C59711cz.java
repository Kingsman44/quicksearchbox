package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3745ab.C48260bq;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p4438c.p4439a.C57915d;
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

/* renamed from: com.google.common.o.cz */
/* compiled from: PG */
public final class C59711cz extends C62942bv implements C63001dt {

    /* renamed from: r */
    public static final C59711cz f160207r;

    /* renamed from: s */
    public static final C62940bt f160208s;

    /* renamed from: t */
    private static volatile C63010eb f160209t;

    /* renamed from: a */
    public int f160210a;

    /* renamed from: b */
    public C59708cw f160211b;

    /* renamed from: c */
    public C59725dj f160212c;

    /* renamed from: d */
    public C59722dg f160213d;

    /* renamed from: e */
    public C48260bq f160214e;

    /* renamed from: f */
    public C59731dp f160215f;

    /* renamed from: g */
    public C59733dr f160216g;

    /* renamed from: h */
    public C59735dt f160217h;

    /* renamed from: i */
    public C59737dv f160218i;

    /* renamed from: j */
    public C62971cq f160219j = emptyProtobufList();

    /* renamed from: k */
    public C59739dx f160220k;

    /* renamed from: l */
    public String f160221l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public C59729dn f160222m;

    /* renamed from: n */
    public C59720de f160223n;

    /* renamed from: o */
    public C59717db f160224o;

    /* renamed from: p */
    public C59741dz f160225p;

    /* renamed from: q */
    public int f160226q;

    static {
        C59711cz czVar = new C59711cz();
        f160207r = czVar;
        C62942bv.registerDefaultInstance(C59711cz.class, czVar);
        f160208s = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, czVar, czVar, (C62958ce) null, 278593377, C63066gd.MESSAGE, C59711cz.class);
    }

    private C59711cz() {
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
                return newMessageInfo(f160207r, "\u0001\u0010\u0000\u0001\u0003\u0012\u0010\u0000\u0001\u0000\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\n\u001b\u000bဉ\n\fဈ\u000b\rဉ\f\u000eဉ\r\u000fဉ\u000e\u0010ဉ\u000f\u0011ဌ\u0010\u0012ဉ\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "j", C60003j.class, C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, "p", "q", C59709cx.f160206a, "i"});
            case 3:
                return new C59711cz();
            case 4:
                return new C59710cy();
            case 5:
                return f160207r;
            case 6:
                C63010eb ebVar = f160209t;
                if (ebVar == null) {
                    synchronized (C59711cz.class) {
                        ebVar = f160209t;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f160207r);
                            f160209t = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
