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

/* renamed from: com.google.protos.youtube.elements.a.h */
/* compiled from: PG */
public final class C66020h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66020h f179540d;

    /* renamed from: e */
    public static final C62940bt f179541e;

    /* renamed from: f */
    private static volatile C63010eb f179542f;

    /* renamed from: a */
    public int f179543a;

    /* renamed from: b */
    public String f179544b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C66022j f179545c;

    static {
        C66020h hVar = new C66020h();
        f179540d = hVar;
        C62942bv.registerDefaultInstance(C66020h.class, hVar);
        f179541e = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, hVar, hVar, (C62958ce) null, 212720901, C63066gd.MESSAGE, C66020h.class);
    }

    private C66020h() {
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
                return newMessageInfo(f179540d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66020h();
            case 4:
                return new C66019g();
            case 5:
                return f179540d;
            case 6:
                C63010eb ebVar = f179542f;
                if (ebVar == null) {
                    synchronized (C66020h.class) {
                        ebVar = f179542f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179540d);
                            f179542f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
