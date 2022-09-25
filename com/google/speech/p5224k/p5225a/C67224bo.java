package com.google.speech.p5224k.p5225a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.p5208h.C66611ci;

/* renamed from: com.google.speech.k.a.bo */
/* compiled from: PG */
public final class C67224bo extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67224bo f182700b;

    /* renamed from: c */
    public static final C62940bt f182701c;

    /* renamed from: e */
    private static volatile C63010eb f182702e;

    /* renamed from: a */
    public String f182703a = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f182704d;

    static {
        C67224bo boVar = new C67224bo();
        f182700b = boVar;
        C62942bv.registerDefaultInstance(C67224bo.class, boVar);
        f182701c = C62942bv.newSingularGeneratedExtension(C66611ci.f181206g, boVar, boVar, (C62958ce) null, 194275321, C63066gd.MESSAGE, C67224bo.class);
    }

    private C67224bo() {
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
                return newMessageInfo(f182700b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C67224bo();
            case 4:
                return new C67223bn();
            case 5:
                return f182700b;
            case 6:
                C63010eb ebVar = f182702e;
                if (ebVar == null) {
                    synchronized (C67224bo.class) {
                        ebVar = f182702e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182700b);
                            f182702e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
