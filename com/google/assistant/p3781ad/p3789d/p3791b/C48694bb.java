package com.google.assistant.p3781ad.p3789d.p3791b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.bb */
/* compiled from: PG */
public final class C48694bb extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48694bb f125972d;

    /* renamed from: e */
    private static volatile C63010eb f125973e;

    /* renamed from: a */
    public int f125974a;

    /* renamed from: b */
    public String f125975b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f125976c = BuildConfig.FLAVOR;

    static {
        C48694bb bbVar = new C48694bb();
        f125972d = bbVar;
        C62942bv.registerDefaultInstance(C48694bb.class, bbVar);
    }

    private C48694bb() {
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
                return newMessageInfo(f125972d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C48694bb();
            case 4:
                return new C48693ba();
            case 5:
                return f125972d;
            case 6:
                C63010eb ebVar = f125973e;
                if (ebVar == null) {
                    synchronized (C48694bb.class) {
                        ebVar = f125973e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125972d);
                            f125973e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
