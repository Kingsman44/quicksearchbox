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

/* renamed from: com.google.protos.youtube.elements.a.v */
/* compiled from: PG */
public final class C66034v extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66034v f179586b;

    /* renamed from: c */
    public static final C62940bt f179587c;

    /* renamed from: e */
    private static volatile C63010eb f179588e;

    /* renamed from: a */
    public String f179589a = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f179590d;

    static {
        C66034v vVar = new C66034v();
        f179586b = vVar;
        C62942bv.registerDefaultInstance(C66034v.class, vVar);
        f179587c = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, vVar, vVar, (C62958ce) null, 315254111, C63066gd.MESSAGE, C66034v.class);
    }

    private C66034v() {
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
                return newMessageInfo(f179586b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C66034v();
            case 4:
                return new C66033u();
            case 5:
                return f179586b;
            case 6:
                C63010eb ebVar = f179588e;
                if (ebVar == null) {
                    synchronized (C66034v.class) {
                        ebVar = f179588e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179586b);
                            f179588e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
