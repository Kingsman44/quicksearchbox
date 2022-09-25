package com.google.android.apps.search.googleapp.search;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10310h.C136135p;
import com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.e */
/* compiled from: PG */
public final class C137411e extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C137411e f373755g;

    /* renamed from: i */
    private static volatile C63010eb f373756i;

    /* renamed from: a */
    public int f373757a;

    /* renamed from: b */
    public int f373758b;

    /* renamed from: c */
    public C136135p f373759c;

    /* renamed from: d */
    public boolean f373760d;

    /* renamed from: e */
    public C137418g f373761e;

    /* renamed from: f */
    public String f373762f = BuildConfig.FLAVOR;

    /* renamed from: h */
    private byte f373763h = 2;

    static {
        C137411e eVar = new C137411e();
        f373755g = eVar;
        C62942bv.registerDefaultInstance(C137411e.class, eVar);
    }

    private C137411e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f373763h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f373763h = b;
                return null;
            case 2:
                return newMessageInfo(f373755g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ᐉ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", C139704d.m227142b(), C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C137411e();
            case 4:
                return new C137404d();
            case 5:
                return f373755g;
            case 6:
                C63010eb ebVar = f373756i;
                if (ebVar == null) {
                    synchronized (C137411e.class) {
                        ebVar = f373756i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f373755g);
                            f373756i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
