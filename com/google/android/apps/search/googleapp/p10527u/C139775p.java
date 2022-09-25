package com.google.android.apps.search.googleapp.p10527u;

import com.google.android.apps.search.googleapp.collections.p10142a.C133493b;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135456b;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h;
import com.google.android.apps.search.googleapp.p10310h.C136123d;
import com.google.android.apps.search.googleapp.p10310h.C136135p;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.u.p */
/* compiled from: PG */
public final class C139775p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C139775p f379888c;

    /* renamed from: e */
    private static volatile C63010eb f379889e;

    /* renamed from: a */
    public int f379890a = 0;

    /* renamed from: b */
    public Object f379891b;

    /* renamed from: d */
    private byte f379892d = 2;

    static {
        C139775p pVar = new C139775p();
        f379888c = pVar;
        C62942bv.registerDefaultInstance(C139775p.class, pVar);
    }

    private C139775p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f379892d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f379892d = b;
                return null;
            case 2:
                return newMessageInfo(f379888c, "\u0001\u0006\u0001\u0000\u0001\u0007\u0006\u0000\u0000\u0002\u0001ᐼ\u0000\u0002ᐼ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0006ြ\u0000\u0007ြ\u0000", new Object[]{"b", "a", C137418g.class, C136123d.class, C136135p.class, C133493b.class, C135462h.class, C135456b.class});
            case 3:
                return new C139775p();
            case 4:
                return new C139774o();
            case 5:
                return f379888c;
            case 6:
                C63010eb ebVar = f379889e;
                if (ebVar == null) {
                    synchronized (C139775p.class) {
                        ebVar = f379889e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f379888c);
                            f379889e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
