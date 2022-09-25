package p5535j.p5536a.p5545c.p5548c;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.j */
/* compiled from: PG */
public final class C71156j extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C71156j f189822g;

    /* renamed from: h */
    private static volatile C63010eb f189823h;

    /* renamed from: a */
    public int f189824a;

    /* renamed from: b */
    public int f189825b;

    /* renamed from: c */
    public int f189826c;

    /* renamed from: d */
    public int f189827d;

    /* renamed from: e */
    public int f189828e;

    /* renamed from: f */
    public int f189829f;

    static {
        C71156j jVar = new C71156j();
        f189822g = jVar;
        C62942bv.registerDefaultInstance(C71156j.class, jVar);
    }

    private C71156j() {
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
                return newMessageInfo(f189822g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", C71155i.f189821a, C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C71156j();
            case 4:
                return new C71154h();
            case 5:
                return f189822g;
            case 6:
                C63010eb ebVar = f189823h;
                if (ebVar == null) {
                    synchronized (C71156j.class) {
                        ebVar = f189823h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189822g);
                            f189823h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
