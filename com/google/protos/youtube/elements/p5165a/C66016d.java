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

/* renamed from: com.google.protos.youtube.elements.a.d */
/* compiled from: PG */
public final class C66016d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66016d f179532c;

    /* renamed from: d */
    public static final C62940bt f179533d;

    /* renamed from: e */
    private static volatile C63010eb f179534e;

    /* renamed from: a */
    public int f179535a;

    /* renamed from: b */
    public String f179536b = BuildConfig.FLAVOR;

    static {
        C66016d dVar = new C66016d();
        f179532c = dVar;
        C62942bv.registerDefaultInstance(C66016d.class, dVar);
        f179533d = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, dVar, dVar, (C62958ce) null, 360463768, C63066gd.MESSAGE, C66016d.class);
    }

    private C66016d() {
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
                return newMessageInfo(f179532c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66016d();
            case 4:
                return new C66015c();
            case 5:
                return f179532c;
            case 6:
                C63010eb ebVar = f179534e;
                if (ebVar == null) {
                    synchronized (C66016d.class) {
                        ebVar = f179534e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179532c);
                            f179534e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
