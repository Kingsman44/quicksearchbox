package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.aa */
/* compiled from: PG */
public final class C129541aa extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C129541aa f355591c;

    /* renamed from: d */
    private static volatile C63010eb f355592d;

    /* renamed from: a */
    public int f355593a = 0;

    /* renamed from: b */
    public Object f355594b;

    static {
        C129541aa aaVar = new C129541aa();
        f355591c = aaVar;
        C62942bv.registerDefaultInstance(C129541aa.class, aaVar);
    }

    private C129541aa() {
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
                return newMessageInfo(f355591c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C129688v.class, C129690x.class});
            case 3:
                return new C129541aa();
            case 4:
                return new C129691y();
            case 5:
                return f355591c;
            case 6:
                C63010eb ebVar = f355592d;
                if (ebVar == null) {
                    synchronized (C129541aa.class) {
                        ebVar = f355592d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f355591c);
                            f355592d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
