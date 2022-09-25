package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.a.be */
/* compiled from: PG */
public final class C71005be extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71005be f189366c;

    /* renamed from: d */
    private static volatile C63010eb f189367d;

    /* renamed from: a */
    public C62971cq f189368a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C62971cq f189369b = C62942bv.emptyProtobufList();

    static {
        C71005be beVar = new C71005be();
        f189366c = beVar;
        C62942bv.registerDefaultInstance(C71005be.class, beVar);
    }

    private C71005be() {
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
                return newMessageInfo(f189366c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001a\u0002\u001a", new Object[]{"a", "b"});
            case 3:
                return new C71005be();
            case 4:
                return new C71004bd();
            case 5:
                return f189366c;
            case 6:
                C63010eb ebVar = f189367d;
                if (ebVar == null) {
                    synchronized (C71005be.class) {
                        ebVar = f189367d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189366c);
                            f189367d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
