package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.rc */
/* compiled from: PG */
public final class C50277rc extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C50277rc f130740k;

    /* renamed from: l */
    private static volatile C63010eb f130741l;

    /* renamed from: a */
    public int f130742a;

    /* renamed from: b */
    public int f130743b;

    /* renamed from: c */
    public String f130744c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f130745d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f130746e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f130747f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f130748g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public int f130749h;

    /* renamed from: i */
    public int f130750i;

    /* renamed from: j */
    public int f130751j;

    static {
        C50277rc rcVar = new C50277rc();
        f130740k = rcVar;
        C62942bv.registerDefaultInstance(C50277rc.class, rcVar);
    }

    private C50277rc() {
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
                return newMessageInfo(f130740k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0005\u0005င\u0006\u0006င\u0007\u0007င\b\bဈ\u0003\tဈ\u0004", new Object[]{"a", "b", C50286rl.m85799b(), C45240c.f118157a, "d", C30325g.f82003a, C19618h.f54585a, "i", "j", "e", C10662f.f35572a});
            case 3:
                return new C50277rc();
            case 4:
                return new C50276rb();
            case 5:
                return f130740k;
            case 6:
                C63010eb ebVar = f130741l;
                if (ebVar == null) {
                    synchronized (C50277rc.class) {
                        ebVar = f130741l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130740k);
                            f130741l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
