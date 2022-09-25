package com.google.speech.p5218j.p5219a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.a.ah */
/* compiled from: PG */
public final class C66704ah extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66704ah f181450d;

    /* renamed from: e */
    private static volatile C63010eb f181451e;

    /* renamed from: a */
    public int f181452a;

    /* renamed from: b */
    public String f181453b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public float f181454c;

    static {
        C66704ah ahVar = new C66704ah();
        f181450d = ahVar;
        C62942bv.registerDefaultInstance(C66704ah.class, ahVar);
    }

    private C66704ah() {
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
                return newMessageInfo(f181450d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66704ah();
            case 4:
                return new C66703ag();
            case 5:
                return f181450d;
            case 6:
                C63010eb ebVar = f181451e;
                if (ebVar == null) {
                    synchronized (C66704ah.class) {
                        ebVar = f181451e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181450d);
                            f181451e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
