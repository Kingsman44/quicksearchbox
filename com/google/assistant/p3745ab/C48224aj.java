package com.google.assistant.p3745ab;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.aj */
/* compiled from: PG */
public final class C48224aj extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C48224aj f124762g;

    /* renamed from: h */
    private static volatile C63010eb f124763h;

    /* renamed from: a */
    public int f124764a = 0;

    /* renamed from: b */
    public Object f124765b;

    /* renamed from: c */
    public int f124766c;

    /* renamed from: d */
    public long f124767d;

    /* renamed from: e */
    public C48236av f124768e;

    /* renamed from: f */
    public C48236av f124769f;

    static {
        C48224aj ajVar = new C48224aj();
        f124762g = ajVar;
        C62942bv.registerDefaultInstance(C48224aj.class, ajVar);
    }

    private C48224aj() {
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
                return newMessageInfo(f124762g, "\u0000\u0006\u0001\u0000\u0001\b\u0006\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u00035\u0000\u00045\u0000\u0006\t\b\t", new Object[]{"b", "a", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C48224aj();
            case 4:
                return new C48223ai();
            case 5:
                return f124762g;
            case 6:
                C63010eb ebVar = f124763h;
                if (ebVar == null) {
                    synchronized (C48224aj.class) {
                        ebVar = f124763h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124762g);
                            f124763h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
