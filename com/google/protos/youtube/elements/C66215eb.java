package com.google.protos.youtube.elements;

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

/* renamed from: com.google.protos.youtube.elements.eb */
/* compiled from: PG */
public final class C66215eb extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66215eb f180056d;

    /* renamed from: e */
    public static final C62940bt f180057e;

    /* renamed from: f */
    private static volatile C63010eb f180058f;

    /* renamed from: a */
    public int f180059a;

    /* renamed from: b */
    public long f180060b;

    /* renamed from: c */
    public String f180061c = BuildConfig.FLAVOR;

    static {
        C66215eb ebVar = new C66215eb();
        f180056d = ebVar;
        C62942bv.registerDefaultInstance(C66215eb.class, ebVar);
        f180057e = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, ebVar, ebVar, (C62958ce) null, 428067722, C63066gd.MESSAGE, C66215eb.class);
    }

    private C66215eb() {
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
                return newMessageInfo(f180056d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66215eb();
            case 4:
                return new C66214ea();
            case 5:
                return f180056d;
            case 6:
                C63010eb ebVar = f180058f;
                if (ebVar == null) {
                    synchronized (C66215eb.class) {
                        ebVar = f180058f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180056d);
                            f180058f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
