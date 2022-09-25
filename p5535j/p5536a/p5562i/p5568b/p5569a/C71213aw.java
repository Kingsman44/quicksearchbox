package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.android.libraries.assistant.pcp.p1578m.C18973c;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: j.a.i.b.a.aw */
/* compiled from: PG */
public final class C71213aw extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C71213aw f190093f;

    /* renamed from: g */
    public static final C62940bt f190094g;

    /* renamed from: h */
    private static volatile C63010eb f190095h;

    /* renamed from: a */
    public int f190096a;

    /* renamed from: b */
    public int f190097b = 0;

    /* renamed from: c */
    public Object f190098c;

    /* renamed from: d */
    public int f190099d;

    /* renamed from: e */
    public int f190100e;

    static {
        C71213aw awVar = new C71213aw();
        f190093f = awVar;
        C62942bv.registerDefaultInstance(C71213aw.class, awVar);
        f190094g = C62942bv.newSingularGeneratedExtension(C71207aq.f190077a, awVar, awVar, (C62958ce) null, 455160663, C63066gd.MESSAGE, C71213aw.class);
    }

    private C71213aw() {
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
                return newMessageInfo(f190093f, "\u0001\u0003\u0001\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဌ\u0002\u0005ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C53306j.m86810b(), "e", C18973c.f53303a, C71211au.class});
            case 3:
                return new C71213aw();
            case 4:
                return new C71212av();
            case 5:
                return f190093f;
            case 6:
                C63010eb ebVar = f190095h;
                if (ebVar == null) {
                    synchronized (C71213aw.class) {
                        ebVar = f190095h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190093f);
                            f190095h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
