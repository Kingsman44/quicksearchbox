package com.google.android.libraries.search.p3055n;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.p5218j.C67087ko;

/* renamed from: com.google.android.libraries.search.n.ar */
/* compiled from: PG */
public final class C39268ar extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C39268ar f103439d;

    /* renamed from: e */
    public static final C62940bt f103440e;

    /* renamed from: f */
    private static volatile C63010eb f103441f;

    /* renamed from: a */
    public int f103442a;

    /* renamed from: b */
    public int f103443b;

    /* renamed from: c */
    public String f103444c = BuildConfig.FLAVOR;

    static {
        C39268ar arVar = new C39268ar();
        f103439d = arVar;
        C62942bv.registerDefaultInstance(C39268ar.class, arVar);
        f103440e = C62942bv.newSingularGeneratedExtension(C67087ko.f182366n, arVar, arVar, (C62958ce) null, 443553021, C63066gd.MESSAGE, C39268ar.class);
    }

    private C39268ar() {
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
                return newMessageInfo(f103439d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C39267aq.m68688b(), C45240c.f118157a});
            case 3:
                return new C39268ar();
            case 4:
                return new C39265ao();
            case 5:
                return f103439d;
            case 6:
                C63010eb ebVar = f103441f;
                if (ebVar == null) {
                    synchronized (C39268ar.class) {
                        ebVar = f103441f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f103439d);
                            f103441f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
