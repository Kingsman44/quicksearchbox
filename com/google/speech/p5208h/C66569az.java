package com.google.speech.p5208h;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.h.az */
/* compiled from: PG */
public final class C66569az extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66569az f181077c;

    /* renamed from: d */
    public static final C62940bt f181078d;

    /* renamed from: e */
    private static volatile C63010eb f181079e;

    /* renamed from: a */
    public int f181080a;

    /* renamed from: b */
    public String f181081b = BuildConfig.FLAVOR;

    static {
        C66569az azVar = new C66569az();
        f181077c = azVar;
        C62942bv.registerDefaultInstance(C66569az.class, azVar);
        f181078d = C62942bv.newSingularGeneratedExtension(C66603ca.f181183a, azVar, azVar, (C62958ce) null, 57599503, C63066gd.MESSAGE, C66569az.class);
    }

    private C66569az() {
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
                return newMessageInfo(f181077c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66569az();
            case 4:
                return new C66568ay();
            case 5:
                return f181077c;
            case 6:
                C63010eb ebVar = f181079e;
                if (ebVar == null) {
                    synchronized (C66569az.class) {
                        ebVar = f181079e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181077c);
                            f181079e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
