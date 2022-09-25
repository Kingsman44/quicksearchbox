package com.google.speech.p5230n.p5232b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.n.b.h */
/* compiled from: PG */
public final class C67411h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67411h f183215a;

    /* renamed from: e */
    private static volatile C63010eb f183216e;

    /* renamed from: b */
    private int f183217b;

    /* renamed from: c */
    private String f183218c = BuildConfig.FLAVOR;

    /* renamed from: d */
    private byte f183219d = 2;

    static {
        C67411h hVar = new C67411h();
        f183215a = hVar;
        C62942bv.registerDefaultInstance(C67411h.class, hVar);
    }

    private C67411h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f183219d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f183219d = b;
                return null;
            case 2:
                return newMessageInfo(f183215a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔈ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C67411h();
            case 4:
                return new C67410g();
            case 5:
                return f183215a;
            case 6:
                C63010eb ebVar = f183216e;
                if (ebVar == null) {
                    synchronized (C67411h.class) {
                        ebVar = f183216e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183215a);
                            f183216e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
