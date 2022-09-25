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

@Deprecated
/* renamed from: com.google.protos.youtube.elements.ff */
/* compiled from: PG */
public final class C66246ff extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66246ff f180134c;

    /* renamed from: d */
    public static final C62940bt f180135d;

    /* renamed from: f */
    private static volatile C63010eb f180136f;

    /* renamed from: a */
    public String f180137a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C63088z f180138b = C63088z.f170246b;

    /* renamed from: e */
    private int f180139e;

    static {
        C66246ff ffVar = new C66246ff();
        f180134c = ffVar;
        C62942bv.registerDefaultInstance(C66246ff.class, ffVar);
        f180135d = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, ffVar, ffVar, (C62958ce) null, 170382760, C63066gd.MESSAGE, C66246ff.class);
    }

    private C66246ff() {
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
                return newMessageInfo(f180134c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"e", "a", "b"});
            case 3:
                return new C66246ff();
            case 4:
                return new C66245fe();
            case 5:
                return f180134c;
            case 6:
                C63010eb ebVar = f180136f;
                if (ebVar == null) {
                    synchronized (C66246ff.class) {
                        ebVar = f180136f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180134c);
                            f180136f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
