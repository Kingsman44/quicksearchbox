package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.android.apps.search.googleapp.search.suggest.C138678v;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.co */
/* compiled from: PG */
public final class C138467co extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C138467co f376633f;

    /* renamed from: h */
    private static volatile C63010eb f376634h;

    /* renamed from: a */
    public int f376635a;

    /* renamed from: b */
    public long f376636b;

    /* renamed from: c */
    public C138678v f376637c;

    /* renamed from: d */
    public long f376638d;

    /* renamed from: e */
    public int f376639e = 2;

    /* renamed from: g */
    private byte f376640g = 2;

    static {
        C138467co coVar = new C138467co();
        f376633f = coVar;
        C62942bv.registerDefaultInstance(C138467co.class, coVar);
    }

    private C138467co() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f376640g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f376640g = b;
                return null;
            case 2:
                return newMessageInfo(f376633f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ဂ\u0000\u0003ᐉ\u0002\u0004ဂ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C138465cm.f376632a});
            case 3:
                return new C138467co();
            case 4:
                return new C138464cl();
            case 5:
                return f376633f;
            case 6:
                C63010eb ebVar = f376634h;
                if (ebVar == null) {
                    synchronized (C138467co.class) {
                        ebVar = f376634h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376633f);
                            f376634h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
