package p5682q.p5683a.p5684a.p5685a.p5686a.p5687a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: q.a.a.a.a.a.c */
/* compiled from: PG */
public final class C72755c extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C72755c f193428e;

    /* renamed from: f */
    private static volatile C63010eb f193429f;

    /* renamed from: a */
    public int f193430a;

    /* renamed from: b */
    public int f193431b;

    /* renamed from: c */
    public C62995dn f193432c = C62995dn.f170057a;

    /* renamed from: d */
    public C62961ch f193433d;

    static {
        C72755c cVar = new C72755c();
        f193428e = cVar;
        C62942bv.registerDefaultInstance(C72755c.class, cVar);
    }

    private C72755c() {
        emptyProtobufList();
        this.f193433d = emptyIntList();
        emptyIntList();
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f193428e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0001\u0001\u0000\u0002င\u0001\u00032\u0005'", new Object[]{"a", "b", C45240c.f118157a, C72754b.f193427a, "d"});
            case 3:
                return new C72755c();
            case 4:
                return new C72753a();
            case 5:
                return f193428e;
            case 6:
                C63010eb ebVar = f193429f;
                if (ebVar == null) {
                    synchronized (C72755c.class) {
                        ebVar = f193429f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f193428e);
                            f193429f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
