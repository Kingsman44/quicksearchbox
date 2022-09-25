package com.google.apps.tiktok.tracing;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.tiktok.tracing.bg */
/* compiled from: PG */
public final class C47556bg extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C47556bg f123404j;

    /* renamed from: k */
    private static volatile C63010eb f123405k;

    /* renamed from: a */
    public int f123406a;

    /* renamed from: b */
    public String f123407b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f123408c;

    /* renamed from: d */
    public int f123409d;

    /* renamed from: e */
    public long f123410e;

    /* renamed from: f */
    public long f123411f;

    /* renamed from: g */
    public int f123412g;

    /* renamed from: h */
    public boolean f123413h;

    /* renamed from: i */
    public int f123414i;

    static {
        C47556bg bgVar = new C47556bg();
        f123404j = bgVar;
        C62942bv.registerDefaultInstance(C47556bg.class, bgVar);
    }

    private C47556bg() {
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
                return newMessageInfo(f123404j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဇ\u0006\u0007င\u0005\bဌ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C19618h.f54585a, C30325g.f82003a, "i", C47555bf.f123403a});
            case 3:
                return new C47556bg();
            case 4:
                return new C47554be();
            case 5:
                return f123404j;
            case 6:
                C63010eb ebVar = f123405k;
                if (ebVar == null) {
                    synchronized (C47556bg.class) {
                        ebVar = f123405k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f123404j);
                            f123405k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
