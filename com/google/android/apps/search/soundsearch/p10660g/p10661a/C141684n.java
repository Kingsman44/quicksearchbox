package com.google.android.apps.search.soundsearch.p10660g.p10661a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62960cg;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5224k.p5225a.C67184ab;

/* renamed from: com.google.android.apps.search.soundsearch.g.a.n */
/* compiled from: PG */
public final class C141684n extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C141684n f384546f;

    /* renamed from: h */
    private static volatile C63010eb f384547h;

    /* renamed from: a */
    public int f384548a;

    /* renamed from: b */
    public int f384549b;

    /* renamed from: c */
    public C62960cg f384550c = emptyFloatList();

    /* renamed from: d */
    public int f384551d;

    /* renamed from: e */
    public C67184ab f384552e;

    /* renamed from: g */
    private byte f384553g = 2;

    static {
        C141684n nVar = new C141684n();
        f384546f = nVar;
        C62942bv.registerDefaultInstance(C141684n.class, nVar);
    }

    private C141684n() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f384553g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f384553g = b;
                return null;
            case 2:
                return newMessageInfo(f384546f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0001\u0001ဌ\u0000\u0004\u0013\u0005င\u0002\u0006ᐉ\u0003", new Object[]{"a", "b", C141682l.f384545a, C45240c.f118157a, "d", "e"});
            case 3:
                return new C141684n();
            case 4:
                return new C141681k();
            case 5:
                return f384546f;
            case 6:
                C63010eb ebVar = f384547h;
                if (ebVar == null) {
                    synchronized (C141684n.class) {
                        ebVar = f384547h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f384546f);
                            f384547h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
