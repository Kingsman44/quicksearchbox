package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.o */
/* compiled from: PG */
public final class C124717o extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C124717o f344082m;

    /* renamed from: n */
    private static volatile C63010eb f344083n;

    /* renamed from: a */
    public int f344084a;

    /* renamed from: b */
    public int f344085b;

    /* renamed from: c */
    public int f344086c;

    /* renamed from: d */
    public boolean f344087d;

    /* renamed from: e */
    public int f344088e;

    /* renamed from: f */
    public int f344089f;

    /* renamed from: g */
    public String f344090g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f344091h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public C62971cq f344092i = C62942bv.emptyProtobufList();

    /* renamed from: j */
    public String f344093j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public String f344094k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public int f344095l;

    static {
        C124717o oVar = new C124717o();
        f344082m = oVar;
        C62942bv.registerDefaultInstance(C124717o.class, oVar);
    }

    private C124717o() {
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
                return newMessageInfo(f344082m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဈ\u0006\u0007\u001a\bဈ\u0005\tဈ\u0007\nဈ\b\u000bဌ\t", new Object[]{"a", "b", C124711i.m204375b(), C45240c.f118157a, C124707e.m204373b(), "d", "e", C124646bl.m204308b(), C10662f.f35572a, C124646bl.m204308b(), C19618h.f54585a, "i", C30325g.f82003a, "j", C19621k.f54601a, "l", C124655bu.f343909a});
            case 3:
                return new C124717o();
            case 4:
                return new C124716n();
            case 5:
                return f344082m;
            case 6:
                C63010eb ebVar = f344083n;
                if (ebVar == null) {
                    synchronized (C124717o.class) {
                        ebVar = f344083n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f344082m);
                            f344083n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
