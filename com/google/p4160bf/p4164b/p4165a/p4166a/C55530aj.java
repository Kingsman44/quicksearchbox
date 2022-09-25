package com.google.p4160bf.p4164b.p4165a.p4166a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.a.aj */
/* compiled from: PG */
public final class C55530aj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55530aj f146536c;

    /* renamed from: e */
    private static volatile C63010eb f146537e;

    /* renamed from: a */
    public String f146538a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f146539b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f146540d;

    static {
        C55530aj ajVar = new C55530aj();
        f146536c = ajVar;
        C62942bv.registerDefaultInstance(C55530aj.class, ajVar);
    }

    private C55530aj() {
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
                return newMessageInfo(f146536c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002", new Object[]{"d", "a", "b"});
            case 3:
                return new C55530aj();
            case 4:
                return new C55529ai();
            case 5:
                return f146536c;
            case 6:
                C63010eb ebVar = f146537e;
                if (ebVar == null) {
                    synchronized (C55530aj.class) {
                        ebVar = f146537e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146536c);
                            f146537e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
