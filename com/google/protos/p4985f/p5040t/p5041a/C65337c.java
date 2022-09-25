package com.google.protos.p4985f.p5040t.p5041a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.t.a.c */
/* compiled from: PG */
public final class C65337c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65337c f176687c;

    /* renamed from: d */
    private static volatile C63010eb f176688d;

    /* renamed from: a */
    public int f176689a;

    /* renamed from: b */
    public String f176690b = BuildConfig.FLAVOR;

    static {
        C65337c cVar = new C65337c();
        f176687c = cVar;
        C62942bv.registerDefaultInstance(C65337c.class, cVar);
    }

    private C65337c() {
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
                return newMessageInfo(f176687c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65337c();
            case 4:
                return new C65336b();
            case 5:
                return f176687c;
            case 6:
                C63010eb ebVar = f176688d;
                if (ebVar == null) {
                    synchronized (C65337c.class) {
                        ebVar = f176688d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176687c);
                            f176688d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
