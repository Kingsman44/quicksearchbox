package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.at */
/* compiled from: PG */
public final class C128071at extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C128071at f352396c;

    /* renamed from: e */
    private static volatile C63010eb f352397e;

    /* renamed from: a */
    public int f352398a = 0;

    /* renamed from: b */
    public Object f352399b;

    /* renamed from: d */
    private byte f352400d = 2;

    static {
        C128071at atVar = new C128071at();
        f352396c = atVar;
        C62942bv.registerDefaultInstance(C128071at.class, atVar);
    }

    private C128071at() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f352400d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f352400d = b;
                return null;
            case 2:
                return newMessageInfo(f352396c, "\u0001\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0001\u0001ြ\u0000\u0002ᐼ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000", new Object[]{"b", "a", C128070as.class, C128066ao.class, C128052aa.class, C128054ac.class, C128056ae.class, C128060ai.class});
            case 3:
                return new C128071at();
            case 4:
                return new C128124y();
            case 5:
                return f352396c;
            case 6:
                C63010eb ebVar = f352397e;
                if (ebVar == null) {
                    synchronized (C128071at.class) {
                        ebVar = f352397e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352396c);
                            f352397e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
