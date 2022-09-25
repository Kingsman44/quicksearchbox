package com.google.android.apps.gsa.staticplugins.opa.p8173aa;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.g.f;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.aa.ak */
/* compiled from: PG */
public final class C105930ak extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C105930ak f295754i;

    /* renamed from: k */
    private static volatile C63010eb f295755k;

    /* renamed from: a */
    public int f295756a;

    /* renamed from: b */
    public int f295757b = 0;

    /* renamed from: c */
    public Object f295758c;

    /* renamed from: d */
    public long f295759d;

    /* renamed from: e */
    public String f295760e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public long f295761f;

    /* renamed from: g */
    public String f295762g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public boolean f295763h;

    /* renamed from: j */
    private byte f295764j = 2;

    static {
        C105930ak akVar = new C105930ak();
        f295754i = akVar;
        C62942bv.registerDefaultInstance(C105930ak.class, akVar);
    }

    private C105930ak() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f295764j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f295764j = b;
                return null;
            case 2:
                return newMessageInfo(f295754i, "\u0001\u0015\u0001\u0001\u0001\u0015\u0015\u0000\u0000\u0005\u0001ြ\u0000\u0002ြ\u0000\u0003ᐼ\u0000\u0004ᐼ\u0000\u0005ြ\u0000\u0006ဂ\u0010\u0007ြ\u0000\bြ\u0000\tဈ\u0011\nဂ\u0012\u000bဈ\u0013\fဇ\u0014\rြ\u0000\u000eᐼ\u0000\u000fြ\u0000\u0010ြ\u0000\u0011ြ\u0000\u0012ြ\u0000\u0013ᐼ\u0000\u0014ᐼ\u0000\u0015ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", C105921ab.class, C105960j.class, C105955e.class, f.class, C105972v.class, "d", C105976z.class, C105957g.class, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C105964n.class, C105923ad.class, C105962l.class, C105966p.class, C105968r.class, C105925af.class, C105927ah.class, C105970t.class, C105929aj.class});
            case 3:
                return new C105930ak();
            case 4:
                return new C105958h();
            case 5:
                return f295754i;
            case 6:
                C63010eb ebVar = f295755k;
                if (ebVar == null) {
                    synchronized (C105930ak.class) {
                        ebVar = f295755k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f295754i);
                            f295755k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
