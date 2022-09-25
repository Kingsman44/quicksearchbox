package com.google.assistant.p3897e.p3902c.p3907c;

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

/* renamed from: com.google.assistant.e.c.c.ev */
/* compiled from: PG */
public final class C51058ev extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C51058ev f132941o;

    /* renamed from: p */
    private static volatile C63010eb f132942p;

    /* renamed from: a */
    public int f132943a;

    /* renamed from: b */
    public String f132944b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f132945c;

    /* renamed from: d */
    public long f132946d;

    /* renamed from: e */
    public String f132947e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f132948f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f132949g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public int f132950h;

    /* renamed from: i */
    public String f132951i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f132952j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public String f132953k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public boolean f132954l;

    /* renamed from: m */
    public boolean f132955m;

    /* renamed from: n */
    public String f132956n = BuildConfig.FLAVOR;

    static {
        C51058ev evVar = new C51058ev();
        f132941o = evVar;
        C62942bv.registerDefaultInstance(C51058ev.class, evVar);
    }

    private C51058ev() {
    }

    /* renamed from: a */
    public final boolean mo53513a() {
        return (this.f132943a & 1) != 0;
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
                return newMessageInfo(f132941o, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0004\u0004ဈ\u0005\u0005ဌ\u0006\u0007ဈ\b\bဈ\t\tဈ\n\nဇ\u000b\u000bဂ\u0002\fဇ\f\rဈ\r\u000eဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C51056et.f132940a, "i", "j", C19621k.f54601a, "l", "d", "m", C48004n.f124238a, "e"});
            case 3:
                return new C51058ev();
            case 4:
                return new C51055es();
            case 5:
                return f132941o;
            case 6:
                C63010eb ebVar = f132942p;
                if (ebVar == null) {
                    synchronized (C51058ev.class) {
                        ebVar = f132942p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132941o);
                            f132942p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
