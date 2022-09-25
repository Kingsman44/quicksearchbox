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

/* renamed from: com.google.speech.h.ck */
/* compiled from: PG */
public final class C66613ck extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66613ck f181215c;

    /* renamed from: d */
    public static final C62940bt f181216d;

    /* renamed from: e */
    private static volatile C63010eb f181217e;

    /* renamed from: a */
    public int f181218a;

    /* renamed from: b */
    public String f181219b = BuildConfig.FLAVOR;

    static {
        C66613ck ckVar = new C66613ck();
        f181215c = ckVar;
        C62942bv.registerDefaultInstance(C66613ck.class, ckVar);
        f181216d = C62942bv.newSingularGeneratedExtension(C66607ce.f181191f, ckVar, ckVar, (C62958ce) null, 27423252, C63066gd.MESSAGE, C66613ck.class);
    }

    private C66613ck() {
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
                return newMessageInfo(f181215c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66613ck();
            case 4:
                return new C66612cj();
            case 5:
                return f181215c;
            case 6:
                C63010eb ebVar = f181217e;
                if (ebVar == null) {
                    synchronized (C66613ck.class) {
                        ebVar = f181217e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181215c);
                            f181217e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
