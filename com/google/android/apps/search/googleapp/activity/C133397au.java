package com.google.android.apps.search.googleapp.activity;

import com.google.android.apps.search.googleapp.p10527u.C139767h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.activity.au */
/* compiled from: PG */
public final class C133397au extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C133397au f363485c;

    /* renamed from: e */
    private static volatile C63010eb f363486e;

    /* renamed from: a */
    public int f363487a = 0;

    /* renamed from: b */
    public Object f363488b;

    /* renamed from: d */
    private byte f363489d = 2;

    static {
        C133397au auVar = new C133397au();
        f363485c = auVar;
        C62942bv.registerDefaultInstance(C133397au.class, auVar);
    }

    private C133397au() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f363489d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f363489d = b;
                return null;
            case 2:
                return newMessageInfo(f363485c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐼ\u0000\u0002ᐼ\u0000", new Object[]{"b", "a", C133426e.class, C139767h.class});
            case 3:
                return new C133397au();
            case 4:
                return new C133396at();
            case 5:
                return f363485c;
            case 6:
                C63010eb ebVar = f363486e;
                if (ebVar == null) {
                    synchronized (C133397au.class) {
                        ebVar = f363486e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f363485c);
                            f363486e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
