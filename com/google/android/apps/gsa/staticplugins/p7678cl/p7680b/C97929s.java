package com.google.android.apps.gsa.staticplugins.p7678cl.p7680b;

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
import com.google.protos.p4757ac.p4758a.C63102a;
import com.google.protos.p4757ac.p4758a.C63107f;
import com.google.protos.p4757ac.p4758a.C63111j;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.apps.gsa.staticplugins.cl.b.s */
/* compiled from: PG */
public final class C97929s extends C62942bv implements C63001dt {

    /* renamed from: r */
    public static final C97929s f273451r;

    /* renamed from: s */
    private static volatile C63010eb f273452s;

    /* renamed from: a */
    public int f273453a;

    /* renamed from: b */
    public String f273454b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f273455c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f273456d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f273457e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f273458f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f273459g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f273460h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public int f273461i;

    /* renamed from: j */
    public long f273462j;

    /* renamed from: k */
    public C63111j f273463k;

    /* renamed from: l */
    public C63107f f273464l;

    /* renamed from: m */
    public boolean f273465m;

    /* renamed from: n */
    public boolean f273466n;

    /* renamed from: o */
    public long f273467o;

    /* renamed from: p */
    public long f273468p;

    /* renamed from: q */
    public long f273469q;

    static {
        C97929s sVar = new C97929s();
        f273451r = sVar;
        C62942bv.registerDefaultInstance(C97929s.class, sVar);
    }

    private C97929s() {
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
                return newMessageInfo(f273451r, "\u0001\u0010\u0000\u0001\u0001\u0015\u0010\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\tဈ\u0004\nဈ\u0005\fဈ\u0007\rဌ\b\u000eဂ\t\u000fဉ\n\u0010ဇ\f\u0011ဇ\r\u0012ဉ\u000b\u0013ဂ\u000e\u0014ဂ\u000f\u0015ဂ\u0010", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", C63102a.f170332a, "j", C19621k.f54601a, "m", C48004n.f124238a, "l", C66412o.f180592a, "p", "q"});
            case 3:
                return new C97929s();
            case 4:
                return new C97928r();
            case 5:
                return f273451r;
            case 6:
                C63010eb ebVar = f273452s;
                if (ebVar == null) {
                    synchronized (C97929s.class) {
                        ebVar = f273452s;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f273451r);
                            f273452s = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
