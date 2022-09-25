package com.google.assistant.p3781ad.p3789d.p3791b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.ak */
/* compiled from: PG */
public final class C48676ak extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C48676ak f125924l;

    /* renamed from: m */
    private static volatile C63010eb f125925m;

    /* renamed from: a */
    public int f125926a;

    /* renamed from: b */
    public int f125927b;

    /* renamed from: c */
    public int f125928c;

    /* renamed from: d */
    public String f125929d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f125930e;

    /* renamed from: f */
    public int f125931f;

    /* renamed from: g */
    public int f125932g;

    /* renamed from: h */
    public int f125933h;

    /* renamed from: i */
    public int f125934i;

    /* renamed from: j */
    public double f125935j;

    /* renamed from: k */
    public C48722d f125936k;

    static {
        C48676ak akVar = new C48676ak();
        f125924l = akVar;
        C62942bv.registerDefaultInstance(C48676ak.class, akVar);
    }

    private C48676ak() {
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
                return newMessageInfo(f125924l, "\u0001\n\u0000\u0001\u0001\u0014\n\u0000\u0000\u0000\u0001င\u0003\u0002ဌ\u0007\u0003က\b\fဈ\u0002\rင\u0004\u0010င\u0000\u0011ဌ\u0001\u0012ဉ\t\u0013င\u0005\u0014ဌ\u0006", new Object[]{"a", "e", "i", C48580an.m85242c(), "j", "d", C10662f.f35572a, "b", C45240c.f118157a, C48741w.f126123a, C19621k.f54601a, C30325g.f82003a, C19618h.f54585a, C48672ag.m85260c()});
            case 3:
                return new C48676ak();
            case 4:
                return new C48675aj();
            case 5:
                return f125924l;
            case 6:
                C63010eb ebVar = f125925m;
                if (ebVar == null) {
                    synchronized (C48676ak.class) {
                        ebVar = f125925m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125924l);
                            f125925m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
