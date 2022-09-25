package com.google.android.apps.gsa.shared.p6986aj;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.shared.aj.c */
/* compiled from: PG */
public final class C89184c extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C89184c f241789k;

    /* renamed from: l */
    private static volatile C63010eb f241790l;

    /* renamed from: a */
    public int f241791a;

    /* renamed from: b */
    public String f241792b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f241793c;

    /* renamed from: d */
    public float f241794d;

    /* renamed from: e */
    public int f241795e;

    /* renamed from: f */
    public long f241796f;

    /* renamed from: g */
    public String f241797g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C62971cq f241798h = C62942bv.emptyProtobufList();

    /* renamed from: i */
    public C63088z f241799i = C63088z.f170246b;

    /* renamed from: j */
    public C62961ch f241800j = emptyIntList();

    static {
        C89184c cVar = new C89184c();
        f241789k = cVar;
        C62942bv.registerDefaultInstance(C89184c.class, cVar);
    }

    private C89184c() {
    }

    /* renamed from: a */
    public final void mo83150a() {
        C62971cq cqVar = this.f241798h;
        if (!cqVar.mo58948c()) {
            this.f241798h = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f241789k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ခ\u0002\u0004င\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007\u001a\bည\u0006\t\u0016", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C89184c();
            case 4:
                return new C89183b();
            case 5:
                return f241789k;
            case 6:
                C63010eb ebVar = f241790l;
                if (ebVar == null) {
                    synchronized (C89184c.class) {
                        ebVar = f241790l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f241789k);
                            f241790l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
