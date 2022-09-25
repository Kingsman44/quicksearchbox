package com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83930q;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3861at.C50345tq;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.a.b */
/* compiled from: PG */
public final class C109770b extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C109770b f305851g;

    /* renamed from: h */
    private static volatile C63010eb f305852h;

    /* renamed from: a */
    public int f305853a;

    /* renamed from: b */
    public C109772d f305854b;

    /* renamed from: c */
    public C50345tq f305855c;

    /* renamed from: d */
    public String f305856d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f305857e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f305858f;

    static {
        C109770b bVar = new C109770b();
        f305851g = bVar;
        C62942bv.registerDefaultInstance(C109770b.class, bVar);
    }

    private C109770b() {
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
                return newMessageInfo(f305851g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C83930q.f228588a});
            case 3:
                return new C109770b();
            case 4:
                return new C109769a();
            case 5:
                return f305851g;
            case 6:
                C63010eb ebVar = f305852h;
                if (ebVar == null) {
                    synchronized (C109770b.class) {
                        ebVar = f305852h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f305851g);
                            f305852h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
