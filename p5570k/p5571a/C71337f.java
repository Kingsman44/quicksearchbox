package p5570k.p5571a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: k.a.f */
/* compiled from: PG */
public final class C71337f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71337f f190517c;

    /* renamed from: d */
    private static volatile C63010eb f190518d;

    /* renamed from: a */
    public C62971cq f190519a = emptyProtobufList();

    /* renamed from: b */
    public C62961ch f190520b = emptyIntList();

    static {
        C71337f fVar = new C71337f();
        f190517c = fVar;
        C62942bv.registerDefaultInstance(C71337f.class, fVar);
    }

    private C71337f() {
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
                return newMessageInfo(f190517c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002'", new Object[]{"a", C71334c.class, "b"});
            case 3:
                return new C71337f();
            case 4:
                return new C71332a();
            case 5:
                return f190517c;
            case 6:
                C63010eb ebVar = f190518d;
                if (ebVar == null) {
                    synchronized (C71337f.class) {
                        ebVar = f190518d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190517c);
                            f190518d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
