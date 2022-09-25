package com.google.android.apps.search.assistant.platform.appintegration.grpc;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119844cl;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.grpc.i */
/* compiled from: PG */
public final class C119627i extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C119627i f333384i;

    /* renamed from: k */
    private static volatile C63010eb f333385k;

    /* renamed from: a */
    public int f333386a;

    /* renamed from: b */
    public String f333387b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C119904w f333388c;

    /* renamed from: d */
    public String f333389d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C119626h f333390e;

    /* renamed from: f */
    public C119834cb f333391f;

    /* renamed from: g */
    public C119844cl f333392g;

    /* renamed from: h */
    public C119601au f333393h;

    /* renamed from: j */
    private byte f333394j = 2;

    static {
        C119627i iVar = new C119627i();
        f333384i = iVar;
        C62942bv.registerDefaultInstance(C119627i.class, iVar);
    }

    private C119627i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f333394j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f333394j = b;
                return null;
            case 2:
                return newMessageInfo(f333384i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0002\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005ဉ\u0004\u0006ᐉ\u0005\bဉ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C119627i();
            case 4:
                return new C119624f();
            case 5:
                return f333384i;
            case 6:
                C63010eb ebVar = f333385k;
                if (ebVar == null) {
                    synchronized (C119627i.class) {
                        ebVar = f333385k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333384i);
                            f333385k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
