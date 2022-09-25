package com.google.android.libraries.mdi;

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

/* renamed from: com.google.android.libraries.mdi.f */
/* compiled from: PG */
public final class C29690f extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C29690f f80408m;

    /* renamed from: n */
    private static volatile C63010eb f80409n;

    /* renamed from: a */
    public int f80410a;

    /* renamed from: b */
    public String f80411b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f80412c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f80413d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f80414e;

    /* renamed from: f */
    public int f80415f;

    /* renamed from: g */
    public C62971cq f80416g = emptyProtobufList();

    /* renamed from: h */
    public long f80417h;

    /* renamed from: i */
    public String f80418i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public C62971cq f80419j = C62942bv.emptyProtobufList();

    /* renamed from: k */
    public C63070h f80420k;

    /* renamed from: l */
    public C63070h f80421l;

    static {
        C29690f fVar = new C29690f();
        f80408m = fVar;
        C62942bv.registerDefaultInstance(C29690f.class, fVar);
    }

    private C29690f() {
    }

    /* renamed from: a */
    public final void mo34847a() {
        C62971cq cqVar = this.f80416g;
        if (!cqVar.mo58948c()) {
            this.f80416g = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f80408m, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဈ\u0001\u0004င\u0003\u0005ဌ\u0004\u0006ဈ\u0002\bဂ\u0005\n\u001a\u000bဉ\u0007\fဈ\u0006\rဉ\b", new Object[]{"a", "b", C30325g.f82003a, C28595b.class, C45240c.f118157a, "e", C10662f.f35572a, C29689e.m54782b(), "d", C19618h.f54585a, "j", C19621k.f54601a, "i", "l"});
            case 3:
                return new C29690f();
            case 4:
                return new C28597c();
            case 5:
                return f80408m;
            case 6:
                C63010eb ebVar = f80409n;
                if (ebVar == null) {
                    synchronized (C29690f.class) {
                        ebVar = f80409n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f80408m);
                            f80409n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
