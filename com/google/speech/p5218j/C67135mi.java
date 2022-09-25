package com.google.speech.p5218j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.speech.j.mi */
/* compiled from: PG */
public final class C67135mi extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67135mi f182484c;

    /* renamed from: d */
    private static volatile C63010eb f182485d;

    /* renamed from: a */
    public int f182486a;

    /* renamed from: b */
    public String f182487b = BuildConfig.FLAVOR;

    static {
        C67135mi miVar = new C67135mi();
        f182484c = miVar;
        C62942bv.registerDefaultInstance(C67135mi.class, miVar);
    }

    private C67135mi() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f182484c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C67135mi();
            case 4:
                return new C67134mh();
            case 5:
                return f182484c;
            case 6:
                C63010eb ebVar = f182485d;
                if (ebVar == null) {
                    synchronized (C67135mi.class) {
                        ebVar = f182485d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182484c);
                            f182485d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
