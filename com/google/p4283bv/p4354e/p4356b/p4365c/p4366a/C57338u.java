package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.bv.e.b.c.a.u */
/* compiled from: PG */
public final class C57338u extends C62937bq implements C62938br {

    /* renamed from: n */
    public static final C62962ci f153180n = new C57328k();

    /* renamed from: p */
    public static final C57338u f153181p;

    /* renamed from: r */
    private static volatile C63010eb f153182r;

    /* renamed from: a */
    public int f153183a;

    /* renamed from: b */
    public int f153184b;

    /* renamed from: c */
    public C57321dv f153185c;

    /* renamed from: d */
    public int f153186d;

    /* renamed from: e */
    public C57321dv f153187e;

    /* renamed from: f */
    public String f153188f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C62971cq f153189g = emptyProtobufList();

    /* renamed from: h */
    public String f153190h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f153191i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public C57225ag f153192j;

    /* renamed from: k */
    public int f153193k;

    /* renamed from: l */
    public int f153194l;

    /* renamed from: m */
    public C62961ch f153195m = emptyIntList();

    /* renamed from: o */
    public C62971cq f153196o = emptyProtobufList();

    /* renamed from: q */
    private byte f153197q = 2;

    static {
        C57338u uVar = new C57338u();
        f153181p = uVar;
        C62942bv.registerDefaultInstance(C57338u.class, uVar);
    }

    private C57338u() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153197q);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153197q = b;
                return null;
            case 2:
                return newMessageInfo(f153181p, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0003\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဉ\u0003\u0005ဈ\u0004\u0006\u001b\u0007ဈ\u0005\bဈ\u0006\nဉ\u0007\u000bဌ\b\f\u001e\r\u001b\u000eဌ\t", new Object[]{"a", "b", C57337t.m88328b(), C45240c.f118157a, "d", C57330m.m88322b(), "e", C10662f.f35572a, C30325g.f82003a, C57229ak.class, C19618h.f54585a, "i", "j", C19621k.f54601a, C57333p.m88324b(), "m", C57335r.m88326b(), C66412o.f180592a, C57278cf.class, "l", C57333p.m88324b()});
            case 3:
                return new C57338u();
            case 4:
                return new C57331n();
            case 5:
                return f153181p;
            case 6:
                C63010eb ebVar = f153182r;
                if (ebVar == null) {
                    synchronized (C57338u.class) {
                        ebVar = f153182r;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153181p);
                            f153182r = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
