package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ia */
/* compiled from: PG */
public final class C50032ia extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C50032ia f130065m;

    /* renamed from: n */
    private static volatile C63010eb f130066n;

    /* renamed from: a */
    public int f130067a;

    /* renamed from: b */
    public String f130068b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f130069c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f130070d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f130071e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f130072f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C50029hy f130073g;

    /* renamed from: h */
    public C62971cq f130074h = C62942bv.emptyProtobufList();

    /* renamed from: i */
    public String f130075i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public long f130076j;

    /* renamed from: k */
    public boolean f130077k;

    /* renamed from: l */
    public boolean f130078l = true;

    static {
        C50032ia iaVar = new C50032ia();
        f130065m = iaVar;
        C62942bv.registerDefaultInstance(C50032ia.class, iaVar);
    }

    private C50032ia() {
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
                return newMessageInfo(f130065m, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0003\u0005ဈ\u0004\u0006ဉ\u0005\u0007ဈ\u0002\b\u001a\tဂ\u0007\nဈ\u0006\u000bဇ\b\fဇ\t", new Object[]{"a", "b", C45240c.f118157a, "e", C10662f.f35572a, C30325g.f82003a, "d", C19618h.f54585a, "j", "i", C19621k.f54601a, "l"});
            case 3:
                return new C50032ia();
            case 4:
                return new C50030hz();
            case 5:
                return f130065m;
            case 6:
                C63010eb ebVar = f130066n;
                if (ebVar == null) {
                    synchronized (C50032ia.class) {
                        ebVar = f130066n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130065m);
                            f130066n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
