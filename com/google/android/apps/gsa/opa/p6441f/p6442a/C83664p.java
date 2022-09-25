package com.google.android.apps.gsa.opa.p6441f.p6442a;

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
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.f.a.p */
/* compiled from: PG */
public final class C83664p extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C83664p f228049o;

    /* renamed from: p */
    private static volatile C63010eb f228050p;

    /* renamed from: a */
    public int f228051a;

    /* renamed from: b */
    public int f228052b;

    /* renamed from: c */
    public long f228053c;

    /* renamed from: d */
    public long f228054d;

    /* renamed from: e */
    public String f228055e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f228056f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public boolean f228057g;

    /* renamed from: h */
    public boolean f228058h;

    /* renamed from: i */
    public boolean f228059i;

    /* renamed from: j */
    public boolean f228060j;

    /* renamed from: k */
    public boolean f228061k;

    /* renamed from: l */
    public boolean f228062l;

    /* renamed from: m */
    public boolean f228063m;

    /* renamed from: n */
    public boolean f228064n;

    static {
        C83664p pVar = new C83664p();
        f228049o = pVar;
        C62942bv.registerDefaultInstance(C83664p.class, pVar);
    }

    private C83664p() {
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
                return newMessageInfo(f228049o, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဂ\u0002\u0002ဈ\u0003\u0003ဇ\u0005\u0004ဇ\u0007\u0005ဇ\b\u0006ဇ\t\u0007ဇ\n\bဇ\u000b\tဇ\f\nဌ\u0000\u000bဂ\u0001\fဇ\u0006\rဈ\u0004", new Object[]{"a", "d", "e", C30325g.f82003a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a, "b", C83661m.f228048a, C45240c.f118157a, C19618h.f54585a, C10662f.f35572a});
            case 3:
                return new C83664p();
            case 4:
                return new C83663o();
            case 5:
                return f228049o;
            case 6:
                C63010eb ebVar = f228050p;
                if (ebVar == null) {
                    synchronized (C83664p.class) {
                        ebVar = f228050p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228049o);
                            f228050p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
