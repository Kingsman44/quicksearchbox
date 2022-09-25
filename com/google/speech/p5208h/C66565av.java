package com.google.speech.p5208h;

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
import com.google.protobuf.C63088z;

/* renamed from: com.google.speech.h.av */
/* compiled from: PG */
public final class C66565av extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C66565av f181061f;

    /* renamed from: g */
    public static final C62940bt f181062g;

    /* renamed from: h */
    private static volatile C63010eb f181063h;

    /* renamed from: a */
    public int f181064a;

    /* renamed from: b */
    public String f181065b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f181066c;

    /* renamed from: d */
    public C63088z f181067d = C63088z.f170246b;

    /* renamed from: e */
    public boolean f181068e;

    static {
        C66565av avVar = new C66565av();
        f181061f = avVar;
        C62942bv.registerDefaultInstance(C66565av.class, avVar);
        f181062g = C62942bv.newSingularGeneratedExtension(C66611ci.f181206g, avVar, avVar, (C62958ce) null, 39442181, C63066gd.MESSAGE, C66565av.class);
    }

    private C66565av() {
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
                return newMessageInfo(f181061f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ည\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C66565av();
            case 4:
                return new C66564au();
            case 5:
                return f181061f;
            case 6:
                C63010eb ebVar = f181063h;
                if (ebVar == null) {
                    synchronized (C66565av.class) {
                        ebVar = f181063h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181061f);
                            f181063h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
