package com.google.speech.p5224k.p5225a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.p5208h.C66607ce;

/* renamed from: com.google.speech.k.a.bm */
/* compiled from: PG */
public final class C67222bm extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C67222bm f182693e;

    /* renamed from: f */
    public static final C62940bt f182694f;

    /* renamed from: g */
    private static volatile C63010eb f182695g;

    /* renamed from: a */
    public int f182696a;

    /* renamed from: b */
    public String f182697b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f182698c;

    /* renamed from: d */
    public C62971cq f182699d;

    static {
        C67222bm bmVar = new C67222bm();
        f182693e = bmVar;
        C62942bv.registerDefaultInstance(C67222bm.class, bmVar);
        f182694f = C62942bv.newSingularGeneratedExtension(C66607ce.f181191f, bmVar, bmVar, (C62958ce) null, 191953142, C63066gd.MESSAGE, C67222bm.class);
    }

    private C67222bm() {
        emptyProtobufList();
        emptyProtobufList();
        this.f182699d = emptyProtobufList();
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
                return newMessageInfo(f182693e, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0001\u0000\u0003\u001b\u0004ဈ\u0000\u0005င\u0001", new Object[]{"a", "d", C67220bk.class, "b", C45240c.f118157a});
            case 3:
                return new C67222bm();
            case 4:
                return new C67221bl();
            case 5:
                return f182693e;
            case 6:
                C63010eb ebVar = f182695g;
                if (ebVar == null) {
                    synchronized (C67222bm.class) {
                        ebVar = f182695g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182693e);
                            f182695g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
