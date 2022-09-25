package com.google.android.libraries.mdi.download;

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
import com.google.protobuf.C63070h;

/* renamed from: com.google.android.libraries.mdi.download.an */
/* compiled from: PG */
public final class C28708an extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C28708an f77994l;

    /* renamed from: m */
    private static volatile C63010eb f77995m;

    /* renamed from: a */
    public int f77996a;

    /* renamed from: b */
    public String f77997b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f77998c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f77999d;

    /* renamed from: e */
    public C63070h f78000e;

    /* renamed from: f */
    public long f78001f;

    /* renamed from: g */
    public C28716av f78002g;

    /* renamed from: h */
    public C62971cq f78003h = emptyProtobufList();

    /* renamed from: i */
    public long f78004i;

    /* renamed from: j */
    public String f78005j;

    /* renamed from: k */
    public C62971cq f78006k;

    static {
        C28708an anVar = new C28708an();
        f77994l = anVar;
        C62942bv.registerDefaultInstance(C28708an.class, anVar);
    }

    private C28708an() {
        emptyProtobufList();
        this.f78005j = BuildConfig.FLAVOR;
        this.f78006k = C62942bv.emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo34330a() {
        C62971cq cqVar = this.f78003h;
        if (!cqVar.mo58948c()) {
            this.f78003h = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f77994l, "\u0001\n\u0000\u0001\u0001\u001a\n\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဂ\b\u0006ဈ\u0001\nင\u0002\rဉ\n\u0014ဉ\u0003\u0017ဂ\u000e\u0019\u001a\u001aဈ\u000f", new Object[]{"a", "b", C19618h.f54585a, C28706al.class, C10662f.f35572a, C45240c.f118157a, "d", C30325g.f82003a, "e", "i", C19621k.f54601a, "j"});
            case 3:
                return new C28708an();
            case 4:
                return new C28707am();
            case 5:
                return f77994l;
            case 6:
                C63010eb ebVar = f77995m;
                if (ebVar == null) {
                    synchronized (C28708an.class) {
                        ebVar = f77995m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f77994l);
                            f77995m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
