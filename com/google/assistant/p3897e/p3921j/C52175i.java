package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.i */
/* compiled from: PG */
public final class C52175i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52175i f136907c;

    /* renamed from: d */
    private static volatile C63010eb f136908d;

    /* renamed from: a */
    public int f136909a;

    /* renamed from: b */
    public String f136910b = BuildConfig.FLAVOR;

    static {
        C52175i iVar = new C52175i();
        f136907c = iVar;
        C62942bv.registerDefaultInstance(C52175i.class, iVar);
    }

    private C52175i() {
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
                return newMessageInfo(f136907c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52175i();
            case 4:
                return new C52148h();
            case 5:
                return f136907c;
            case 6:
                C63010eb ebVar = f136908d;
                if (ebVar == null) {
                    synchronized (C52175i.class) {
                        ebVar = f136908d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136907c);
                            f136908d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
