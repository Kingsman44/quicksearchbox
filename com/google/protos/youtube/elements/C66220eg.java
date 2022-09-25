package com.google.protos.youtube.elements;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protobuf.C63088z;

/* renamed from: com.google.protos.youtube.elements.eg */
/* compiled from: PG */
public final class C66220eg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66220eg f180067c;

    /* renamed from: d */
    public static final C62940bt f180068d;

    /* renamed from: f */
    private static volatile C63010eb f180069f;

    /* renamed from: a */
    public String f180070a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C63088z f180071b = C63088z.f170246b;

    /* renamed from: e */
    private int f180072e;

    static {
        C66220eg egVar = new C66220eg();
        f180067c = egVar;
        C62942bv.registerDefaultInstance(C66220eg.class, egVar);
        f180068d = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, egVar, egVar, (C62958ce) null, 170382720, C63066gd.MESSAGE, C66220eg.class);
    }

    private C66220eg() {
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
                return newMessageInfo(f180067c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"e", "a", "b"});
            case 3:
                return new C66220eg();
            case 4:
                return new C66219ef();
            case 5:
                return f180067c;
            case 6:
                C63010eb ebVar = f180069f;
                if (ebVar == null) {
                    synchronized (C66220eg.class) {
                        ebVar = f180069f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180067c);
                            f180069f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
