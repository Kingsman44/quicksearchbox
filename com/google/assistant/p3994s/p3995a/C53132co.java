package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.s.a.co */
/* compiled from: PG */
public final class C53132co extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C53132co f139250l;

    /* renamed from: n */
    private static volatile C63010eb f139251n;

    /* renamed from: a */
    public int f139252a;

    /* renamed from: b */
    public int f139253b;

    /* renamed from: c */
    public C53424nj f139254c;

    /* renamed from: d */
    public C48952az f139255d;

    /* renamed from: e */
    public int f139256e;

    /* renamed from: f */
    public String f139257f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C63088z f139258g = C63088z.f170246b;

    /* renamed from: h */
    public C53131cn f139259h;

    /* renamed from: i */
    public C53308jb f139260i;

    /* renamed from: j */
    public C53128ck f139261j;

    /* renamed from: k */
    public String f139262k = BuildConfig.FLAVOR;

    /* renamed from: m */
    private byte f139263m = 2;

    static {
        C53132co coVar = new C53132co();
        f139250l = coVar;
        C62942bv.registerDefaultInstance(C53132co.class, coVar);
    }

    private C53132co() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139263m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139263m = b;
                return null;
            case 2:
                return newMessageInfo(f139250l, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0000\u0003\u0001ဌ\u0000\u0004ᐉ\u0001\u0007င\u0005\bဈ\u0006\tည\u0007\nဉ\b\fဈ\u000b\rᐉ\t\u000eဉ\u0004\u000fᐉ\n", new Object[]{"a", "b", C53306j.m86810b(), C45240c.f118157a, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C19621k.f54601a, "i", "d", "j"});
            case 3:
                return new C53132co();
            case 4:
                return new C53129cl();
            case 5:
                return f139250l;
            case 6:
                C63010eb ebVar = f139251n;
                if (ebVar == null) {
                    synchronized (C53132co.class) {
                        ebVar = f139251n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139250l);
                            f139251n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
