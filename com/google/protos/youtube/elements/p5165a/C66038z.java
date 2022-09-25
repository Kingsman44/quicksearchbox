package com.google.protos.youtube.elements.p5165a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.youtube.elements.a.z */
/* compiled from: PG */
public final class C66038z extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66038z f179597d;

    /* renamed from: e */
    public static final C62940bt f179598e;

    /* renamed from: f */
    private static volatile C63010eb f179599f;

    /* renamed from: a */
    public int f179600a;

    /* renamed from: b */
    public String f179601b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f179602c = BuildConfig.FLAVOR;

    static {
        C66038z zVar = new C66038z();
        f179597d = zVar;
        C62942bv.registerDefaultInstance(C66038z.class, zVar);
        f179598e = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, zVar, zVar, (C62958ce) null, 197074932, C63066gd.MESSAGE, C66038z.class);
    }

    private C66038z() {
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
                return newMessageInfo(f179597d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66038z();
            case 4:
                return new C66037y();
            case 5:
                return f179597d;
            case 6:
                C63010eb ebVar = f179599f;
                if (ebVar == null) {
                    synchronized (C66038z.class) {
                        ebVar = f179599f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179597d);
                            f179599f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
