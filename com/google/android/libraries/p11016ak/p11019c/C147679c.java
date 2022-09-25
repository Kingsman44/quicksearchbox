package com.google.android.libraries.p11016ak.p11019c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import p5285d.p5290b.p5291a.p5292a.C68150am;

/* renamed from: com.google.android.libraries.ak.c.c */
/* compiled from: PG */
public final class C147679c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C147679c f398547d;

    /* renamed from: e */
    private static volatile C63010eb f398548e;

    /* renamed from: a */
    public C68150am f398549a;

    /* renamed from: b */
    public boolean f398550b;

    /* renamed from: c */
    public String f398551c = BuildConfig.FLAVOR;

    static {
        C147679c cVar = new C147679c();
        f398547d = cVar;
        C62942bv.registerDefaultInstance(C147679c.class, cVar);
    }

    private C147679c() {
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
                return newMessageInfo(f398547d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u0007\u0003Ȉ", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C147679c();
            case 4:
                return new C147645b();
            case 5:
                return f398547d;
            case 6:
                C63010eb ebVar = f398548e;
                if (ebVar == null) {
                    synchronized (C147679c.class) {
                        ebVar = f398548e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f398547d);
                            f398548e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
