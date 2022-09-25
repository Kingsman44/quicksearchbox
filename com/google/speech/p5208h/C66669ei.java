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

/* renamed from: com.google.speech.h.ei */
/* compiled from: PG */
public final class C66669ei extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66669ei f181356c;

    /* renamed from: d */
    public static final C62940bt f181357d;

    /* renamed from: e */
    private static volatile C63010eb f181358e;

    /* renamed from: a */
    public int f181359a;

    /* renamed from: b */
    public String f181360b = BuildConfig.FLAVOR;

    static {
        C66669ei eiVar = new C66669ei();
        f181356c = eiVar;
        C62942bv.registerDefaultInstance(C66669ei.class, eiVar);
        f181357d = C62942bv.newSingularGeneratedExtension(C66607ce.f181191f, eiVar, eiVar, (C62958ce) null, 245289190, C63066gd.MESSAGE, C66669ei.class);
    }

    private C66669ei() {
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
                return newMessageInfo(f181356c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66669ei();
            case 4:
                return new C66668eh();
            case 5:
                return f181356c;
            case 6:
                C63010eb ebVar = f181358e;
                if (ebVar == null) {
                    synchronized (C66669ei.class) {
                        ebVar = f181358e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181356c);
                            f181358e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
