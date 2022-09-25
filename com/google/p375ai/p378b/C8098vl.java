package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.vl */
/* compiled from: PG */
public final class C8098vl extends C62937bq implements C62938br {

    /* renamed from: k */
    public static final C8098vl f28472k;

    /* renamed from: m */
    private static volatile C63010eb f28473m;

    /* renamed from: a */
    public int f28474a;

    /* renamed from: b */
    public int f28475b;

    /* renamed from: c */
    public String f28476c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f28477d;

    /* renamed from: e */
    public boolean f28478e;

    /* renamed from: f */
    public int f28479f = 1;

    /* renamed from: g */
    public int f28480g;

    /* renamed from: h */
    public int f28481h = 1;

    /* renamed from: i */
    public C8084uy f28482i;

    /* renamed from: j */
    public C8091ve f28483j;

    /* renamed from: l */
    private byte f28484l = 2;

    static {
        C8098vl vlVar = new C8098vl();
        f28472k = vlVar;
        C62942bv.registerDefaultInstance(C8098vl.class, vlVar);
    }

    private C8098vl() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28484l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28484l = b;
                return null;
            case 2:
                return newMessageInfo(f28472k, "\u0001\b\u0000\u0002\u0005:\b\u0000\u0000\u0000\u0005ဌ\b\u0018ဇ\u0007#ဈ\u0000*ဌ\u0006+ဌ\f4ဉ)9ဌ\t:ဉ.", new Object[]{"a", "b", C10662f.f35572a, C8096vj.f28471a, "e", C45240c.f118157a, "d", C8169yb.m22960b(), C19618h.f54585a, C7858mo.f27541a, "i", C30325g.f82003a, C8079ut.f28436a, "j"});
            case 3:
                return new C8098vl();
            case 4:
                return new C8078us();
            case 5:
                return f28472k;
            case 6:
                C63010eb ebVar = f28473m;
                if (ebVar == null) {
                    synchronized (C8098vl.class) {
                        ebVar = f28473m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28472k);
                            f28473m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
