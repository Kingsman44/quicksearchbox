package com.google.protos.p5129p.p5130a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65813cq;
import com.google.protos.p5129p.p5131b.C65814cr;
import com.google.protos.p5129p.p5131b.C65816ct;

/* renamed from: com.google.protos.p.a.e */
/* compiled from: PG */
public final class C65720e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62962ci f178549c = new C65718c();

    /* renamed from: l */
    public static final C65720e f178550l;

    /* renamed from: m */
    private static volatile C63010eb f178551m;

    /* renamed from: a */
    public int f178552a;

    /* renamed from: b */
    public C62961ch f178553b = emptyIntList();

    /* renamed from: d */
    public String f178554d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f178555e;

    /* renamed from: f */
    public int f178556f;

    /* renamed from: g */
    public int f178557g;

    /* renamed from: h */
    public boolean f178558h;

    /* renamed from: i */
    public String f178559i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f178560j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public String f178561k = BuildConfig.FLAVOR;

    static {
        C65720e eVar = new C65720e();
        f178550l = eVar;
        C62942bv.registerDefaultInstance(C65720e.class, eVar);
    }

    private C65720e() {
    }

    /* renamed from: a */
    public final void mo59420a() {
        C62961ch chVar = this.f178553b;
        if (!chVar.mo58948c()) {
            this.f178553b = C62942bv.mutableCopy(chVar);
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
                return newMessageInfo(f178550l, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဌ\u0003", new Object[]{"a", "b", C65753ak.m96798c(), "d", "e", C65813cq.m96812b(), C10662f.f35572a, C65814cr.f178924a, C19618h.f54585a, "i", "j", C19621k.f54601a, C30325g.f82003a, C65816ct.f178925a});
            case 3:
                return new C65720e();
            case 4:
                return new C65719d();
            case 5:
                return f178550l;
            case 6:
                C63010eb ebVar = f178551m;
                if (ebVar == null) {
                    synchronized (C65720e.class) {
                        ebVar = f178551m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178550l);
                            f178551m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
