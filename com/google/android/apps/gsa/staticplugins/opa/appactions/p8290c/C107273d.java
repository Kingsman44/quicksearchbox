package com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.proactive.p2774f.C36265d;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3825an.p3830c.p3831a.C49349z;
import com.google.assistant.p3861at.C49840ay;
import com.google.assistant.p3861at.C49845bc;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.c.d */
/* compiled from: PG */
public final class C107273d extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C107273d f298572i;

    /* renamed from: j */
    private static volatile C63010eb f298573j;

    /* renamed from: a */
    public int f298574a;

    /* renamed from: b */
    public C36265d f298575b;

    /* renamed from: c */
    public String f298576c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C63088z f298577d = C63088z.f170246b;

    /* renamed from: e */
    public String f298578e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f298579f;

    /* renamed from: g */
    public C49845bc f298580g;

    /* renamed from: h */
    public C49840ay f298581h;

    static {
        C107273d dVar = new C107273d();
        f298572i = dVar;
        C62942bv.registerDefaultInstance(C107273d.class, dVar);
    }

    private C107273d() {
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
                return newMessageInfo(f298572i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဈ\u0003\u0005ဌ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C49349z.f127554a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C107273d();
            case 4:
                return new C107272c();
            case 5:
                return f298572i;
            case 6:
                C63010eb ebVar = f298573j;
                if (ebVar == null) {
                    synchronized (C107273d.class) {
                        ebVar = f298573j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f298572i);
                            f298573j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
