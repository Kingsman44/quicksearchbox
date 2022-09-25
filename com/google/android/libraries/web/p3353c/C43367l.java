package com.google.android.libraries.web.p3353c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.web.c.l */
/* compiled from: PG */
public final class C43367l extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C43367l f113293h;

    /* renamed from: j */
    private static volatile C63010eb f113294j;

    /* renamed from: a */
    public int f113295a;

    /* renamed from: b */
    public String f113296b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f113297c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f113298d;

    /* renamed from: e */
    public int f113299e;

    /* renamed from: f */
    public C43323b f113300f;

    /* renamed from: g */
    public boolean f113301g;

    /* renamed from: i */
    private byte f113302i = 2;

    static {
        C43367l lVar = new C43367l();
        f113293h = lVar;
        C62942bv.registerDefaultInstance(C43367l.class, lVar);
    }

    private C43367l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f113302i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f113302i = b;
                return null;
            case 2:
                return newMessageInfo(f113293h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဈ\u0001\u0002ဌ\u0003\u0003ဈ\u0000\u0004ᐉ\u0004\u0005ဇ\u0005\u0006ဇ\u0002", new Object[]{"a", C45240c.f118157a, "e", C43366k.m76518b(), "b", C10662f.f35572a, C30325g.f82003a, "d"});
            case 3:
                return new C43367l();
            case 4:
                return new C43364i();
            case 5:
                return f113293h;
            case 6:
                C63010eb ebVar = f113294j;
                if (ebVar == null) {
                    synchronized (C43367l.class) {
                        ebVar = f113294j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f113293h);
                            f113294j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
