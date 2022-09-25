package com.google.android.libraries.lens.view.p2069am;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p10983ae.p10984a.C147476u;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4699e.C62191ad;
import com.google.lens.p4699e.C62195ah;
import com.google.lens.p4699e.C62227h;
import com.google.lens.p4699e.C62231l;
import com.google.lens.p4700f.C62249d;
import com.google.lens.p4707j.C62445bv;
import com.google.lens.p4707j.C62447bx;
import com.google.lens.p4707j.C62488dk;
import com.google.lens.p4707j.C62493dp;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.libraries.lens.view.am.ap */
/* compiled from: PG */
public final class C25308ap extends C62942bv implements C63001dt {

    /* renamed from: A */
    private static volatile C63010eb f68838A;

    /* renamed from: y */
    public static final C25308ap f68839y;

    /* renamed from: a */
    public int f68840a;

    /* renamed from: b */
    public int f68841b = 0;

    /* renamed from: c */
    public Object f68842c;

    /* renamed from: d */
    public int f68843d = 0;

    /* renamed from: e */
    public Object f68844e;

    /* renamed from: f */
    public int f68845f;

    /* renamed from: g */
    public C62488dk f68846g;

    /* renamed from: h */
    public C62445bv f68847h;

    /* renamed from: i */
    public int f68848i;

    /* renamed from: j */
    public String f68849j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public float f68850k;

    /* renamed from: l */
    public boolean f68851l;

    /* renamed from: m */
    public boolean f68852m;

    /* renamed from: n */
    public boolean f68853n;

    /* renamed from: o */
    public C25305am f68854o;

    /* renamed from: p */
    public C25293aa f68855p;

    /* renamed from: q */
    public C62249d f68856q;

    /* renamed from: r */
    public float f68857r;

    /* renamed from: s */
    public float f68858s;

    /* renamed from: t */
    public C62493dp f68859t;

    /* renamed from: u */
    public C62447bx f68860u;

    /* renamed from: v */
    public C62447bx f68861v;

    /* renamed from: w */
    public C62971cq f68862w = emptyProtobufList();

    /* renamed from: x */
    public boolean f68863x;

    /* renamed from: z */
    private byte f68864z = 2;

    static {
        C25308ap apVar = new C25308ap();
        f68839y = apVar;
        C62942bv.registerDefaultInstance(C25308ap.class, apVar);
    }

    private C25308ap() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f68864z);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f68864z = b;
                return null;
            case 2:
                return newMessageInfo(f68839y, "\u0000\u0018\u0002\u0001\u0001'\u0018\u0000\u0001\u0002\u0001\u0004\u0004\f\u0005Ȉ\n\u0001\f<\u0001\r<\u0001\u000f\t\u0010м\u0000\u0013<\u0001\u0014\t\u0015<\u0001\u0016\t\u0018\u0007\u001c\t\u001d\t\u001fဉ\u0000 ဉ\u0001!ဉ\u0002\"Л#\u0001$\u0001%\u0007&\u0007'ဇ\u0003", new Object[]{C45240c.f118157a, "b", "e", "d", "a", C10662f.f35572a, "i", "j", C19621k.f54601a, C25303ak.class, C62231l.class, C66412o.f180592a, C25307ao.class, C62227h.class, C19618h.f54585a, C62191ad.class, C30325g.f82003a, C48004n.f124238a, "p", "q", C42181t.f110467a, C147476u.f398081a, "v", "w", C62195ah.class, C33259r.f88929b, C59002s.f156871a, "l", "m", "x"});
            case 3:
                return new C25308ap();
            case 4:
                return new C25348x();
            case 5:
                return f68839y;
            case 6:
                C63010eb ebVar = f68838A;
                if (ebVar == null) {
                    synchronized (C25308ap.class) {
                        ebVar = f68838A;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68839y);
                            f68838A = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
