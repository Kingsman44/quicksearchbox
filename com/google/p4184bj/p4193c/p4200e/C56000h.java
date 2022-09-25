package com.google.p4184bj.p4193c.p4200e;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.c.e.h */
/* compiled from: PG */
public final class C56000h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56000h f149133c;

    /* renamed from: d */
    private static volatile C63010eb f149134d;

    /* renamed from: a */
    public int f149135a;

    /* renamed from: b */
    public String f149136b = BuildConfig.FLAVOR;

    static {
        C56000h hVar = new C56000h();
        f149133c = hVar;
        C62942bv.registerDefaultInstance(C56000h.class, hVar);
    }

    private C56000h() {
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
                return newMessageInfo(f149133c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C56000h();
            case 4:
                return new C55999g();
            case 5:
                return f149133c;
            case 6:
                C63010eb ebVar = f149134d;
                if (ebVar == null) {
                    synchronized (C56000h.class) {
                        ebVar = f149134d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149133c);
                            f149134d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
