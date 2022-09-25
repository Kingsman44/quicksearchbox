package com.google.p4140ba.p4141a.p4142a.p4144b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.a.b.z */
/* compiled from: PG */
public final class C54806z extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C54806z f143773n;

    /* renamed from: o */
    private static volatile C63010eb f143774o;

    /* renamed from: a */
    public int f143775a;

    /* renamed from: b */
    public C54796p f143776b;

    /* renamed from: c */
    public C54803w f143777c;

    /* renamed from: d */
    public C54794n f143778d;

    /* renamed from: e */
    public C54790j f143779e;

    /* renamed from: f */
    public long f143780f;

    /* renamed from: g */
    public boolean f143781g;

    /* renamed from: h */
    public int f143782h;

    /* renamed from: i */
    public String f143783i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f143784j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public int f143785k;

    /* renamed from: l */
    public C54785e f143786l;

    /* renamed from: m */
    public boolean f143787m;

    static {
        C54806z zVar = new C54806z();
        f143773n = zVar;
        C62942bv.registerDefaultInstance(C54806z.class, zVar);
    }

    private C54806z() {
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
                return newMessageInfo(f143773n, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဂ\u0004\u0005ဌ\u0006\u0006ဈ\u0007\u0007ဈ\b\tဉ\u0003\nဉ\n\u000bဌ\t\fဇ\u000b\u000eဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", C10662f.f35572a, C19618h.f54585a, C54805y.f143772a, "i", "j", "e", "l", C19621k.f54601a, C54781a.f143722a, "m", C30325g.f82003a});
            case 3:
                return new C54806z();
            case 4:
                return new C54804x();
            case 5:
                return f143773n;
            case 6:
                C63010eb ebVar = f143774o;
                if (ebVar == null) {
                    synchronized (C54806z.class) {
                        ebVar = f143774o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143773n);
                            f143774o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
