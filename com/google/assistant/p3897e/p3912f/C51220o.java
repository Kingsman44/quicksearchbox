package com.google.assistant.p3897e.p3912f;

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

/* renamed from: com.google.assistant.e.f.o */
/* compiled from: PG */
public final class C51220o extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C51220o f133350m;

    /* renamed from: n */
    private static volatile C63010eb f133351n;

    /* renamed from: a */
    public int f133352a;

    /* renamed from: b */
    public long f133353b;

    /* renamed from: c */
    public String f133354c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f133355d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f133356e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f133357f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f133358g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f133359h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f133360i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f133361j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public int f133362k;

    /* renamed from: l */
    public C51217l f133363l;

    static {
        C51220o oVar = new C51220o();
        f133350m = oVar;
        C62942bv.registerDefaultInstance(C51220o.class, oVar);
    }

    private C51220o() {
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
                return newMessageInfo(f133350m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\b\u0007ဌ\t\bဈ\u0005\tဈ\u0006\nဈ\u0007\u000bဉ\n", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, "j", C19621k.f54601a, C51219n.f133349a, C30325g.f82003a, C19618h.f54585a, "i", "l"});
            case 3:
                return new C51220o();
            case 4:
                return new C51218m();
            case 5:
                return f133350m;
            case 6:
                C63010eb ebVar = f133351n;
                if (ebVar == null) {
                    synchronized (C51220o.class) {
                        ebVar = f133351n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133350m);
                            f133351n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
