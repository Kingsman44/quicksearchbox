package com.google.android.apps.p489g;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8852u.C118571d;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C8142xb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.g */
/* compiled from: PG */
public final class C9289g extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C62962ci f32241f = new C9283e();

    /* renamed from: l */
    public static final C9289g f32242l;

    /* renamed from: m */
    private static volatile C63010eb f32243m;

    /* renamed from: a */
    public int f32244a;

    /* renamed from: b */
    public long f32245b;

    /* renamed from: c */
    public String f32246c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f32247d;

    /* renamed from: e */
    public C62961ch f32248e = emptyIntList();

    /* renamed from: g */
    public long f32249g;

    /* renamed from: h */
    public boolean f32250h;

    /* renamed from: i */
    public String f32251i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public int f32252j;

    /* renamed from: k */
    public int f32253k;

    static {
        C9289g gVar = new C9289g();
        f32242l = gVar;
        C62942bv.registerDefaultInstance(C9289g.class, gVar);
    }

    private C9289g() {
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
                return newMessageInfo(f32242l, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0005\u001e\u0006ဂ\u0003\bဇ\u0004\nဈ\u0005\u000bင\u0006\fဌ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C118571d.m196863b(), C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, C8142xb.m22955b()});
            case 3:
                return new C9289g();
            case 4:
                return new C9288f();
            case 5:
                return f32242l;
            case 6:
                C63010eb ebVar = f32243m;
                if (ebVar == null) {
                    synchronized (C9289g.class) {
                        ebVar = f32243m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32242l);
                            f32243m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
