package com.google.protos.youtube.elements.p5165a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.youtube.elements.a.t */
/* compiled from: PG */
public final class C66032t extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66032t f179581b;

    /* renamed from: c */
    public static final C62940bt f179582c;

    /* renamed from: e */
    private static volatile C63010eb f179583e;

    /* renamed from: a */
    public String f179584a = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f179585d;

    static {
        C66032t tVar = new C66032t();
        f179581b = tVar;
        C62942bv.registerDefaultInstance(C66032t.class, tVar);
        f179582c = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, tVar, tVar, (C62958ce) null, 315253727, C63066gd.MESSAGE, C66032t.class);
    }

    private C66032t() {
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
                return newMessageInfo(f179581b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C66032t();
            case 4:
                return new C66031s();
            case 5:
                return f179581b;
            case 6:
                C63010eb ebVar = f179583e;
                if (ebVar == null) {
                    synchronized (C66032t.class) {
                        ebVar = f179583e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179581b);
                            f179583e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
