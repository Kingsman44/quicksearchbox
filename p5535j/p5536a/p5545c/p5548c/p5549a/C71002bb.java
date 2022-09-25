package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.android.apps.gsa.nga.engine.dictation.s;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.a.bb */
/* compiled from: PG */
public final class C71002bb extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71002bb f189353d;

    /* renamed from: e */
    private static volatile C63010eb f189354e;

    /* renamed from: a */
    public int f189355a;

    /* renamed from: b */
    public int f189356b;

    /* renamed from: c */
    public int f189357c;

    static {
        C71002bb bbVar = new C71002bb();
        f189353d = bbVar;
        C62942bv.registerDefaultInstance(C71002bb.class, bbVar);
    }

    private C71002bb() {
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
                return newMessageInfo(f189353d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", s.a, C45240c.f118157a});
            case 3:
                return new C71002bb();
            case 4:
                return new C71001ba();
            case 5:
                return f189353d;
            case 6:
                C63010eb ebVar = f189354e;
                if (ebVar == null) {
                    synchronized (C71002bb.class) {
                        ebVar = f189354e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189353d);
                            f189354e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
