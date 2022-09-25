package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4563i.C59920cb;
import com.google.common.p4552o.p4563i.C59952dg;
import com.google.common.p4552o.p4563i.C59954di;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.common.o.acb */
/* compiled from: PG */
public final class acb extends C62942bv implements C63001dt {

    /* renamed from: r */
    public static final acb f158263r;

    /* renamed from: s */
    private static volatile C63010eb f158264s;

    /* renamed from: a */
    public int f158265a;

    /* renamed from: b */
    public abh f158266b;

    /* renamed from: c */
    public abu f158267c;

    /* renamed from: d */
    public long f158268d;

    /* renamed from: e */
    public abf f158269e;

    /* renamed from: f */
    public abm f158270f;

    /* renamed from: g */
    public aae f158271g;

    /* renamed from: h */
    public abz f158272h;

    /* renamed from: i */
    public abx f158273i;

    /* renamed from: j */
    public C59952dg f158274j;

    /* renamed from: k */
    public abq f158275k;

    /* renamed from: l */
    public String f158276l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public int f158277m;

    /* renamed from: n */
    public C59920cb f158278n;

    /* renamed from: o */
    public int f158279o;

    /* renamed from: p */
    public int f158280p;

    /* renamed from: q */
    public boolean f158281q;

    static {
        acb acb = new acb();
        f158263r = acb;
        C62942bv.registerDefaultInstance(acb.class, acb);
    }

    private acb() {
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
                return newMessageInfo(f158263r, "\u0001\u0010\u0000\u0001\u0001\u0012\u0010\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\bဉ\u0007\tဉ\b\nဉ\t\fဉ\n\rဈ\u000b\u000eဌ\f\u000fဉ\r\u0010ဌ\u000e\u0011င\u000f\u0012ဇ\u0010", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", aca.f158262a, C48004n.f124238a, C66412o.f180592a, C59954di.f162039a, "p", "q"});
            case 3:
                return new acb();
            case 4:
                return new abd();
            case 5:
                return f158263r;
            case 6:
                C63010eb ebVar = f158264s;
                if (ebVar == null) {
                    synchronized (acb.class) {
                        ebVar = f158264s;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158263r);
                            f158264s = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
