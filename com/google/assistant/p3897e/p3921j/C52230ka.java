package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.j.ka */
/* compiled from: PG */
public final class C52230ka extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52230ka f137057d;

    /* renamed from: e */
    private static volatile C63010eb f137058e;

    /* renamed from: a */
    public int f137059a;

    /* renamed from: b */
    public String f137060b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C63088z f137061c = C63088z.f170246b;

    static {
        C52230ka kaVar = new C52230ka();
        f137057d = kaVar;
        C62942bv.registerDefaultInstance(C52230ka.class, kaVar);
    }

    private C52230ka() {
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
                return newMessageInfo(f137057d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C52230ka();
            case 4:
                return new C52228jz();
            case 5:
                return f137057d;
            case 6:
                C63010eb ebVar = f137058e;
                if (ebVar == null) {
                    synchronized (C52230ka.class) {
                        ebVar = f137058e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137057d);
                            f137058e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
