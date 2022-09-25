package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.cd */
/* compiled from: PG */
public final class C64497cd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64497cd f174927c;

    /* renamed from: d */
    private static volatile C63010eb f174928d;

    /* renamed from: a */
    public String f174929a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f174930b = BuildConfig.FLAVOR;

    static {
        C64497cd cdVar = new C64497cd();
        f174927c = cdVar;
        C62942bv.registerDefaultInstance(C64497cd.class, cdVar);
    }

    private C64497cd() {
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
                return newMessageInfo(f174927c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C64497cd();
            case 4:
                return new C64496cc();
            case 5:
                return f174927c;
            case 6:
                C63010eb ebVar = f174928d;
                if (ebVar == null) {
                    synchronized (C64497cd.class) {
                        ebVar = f174928d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174927c);
                            f174928d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
