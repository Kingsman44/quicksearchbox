package p5682q.p5683a.p5684a.p5685a.p5686a.p5687a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4972d.p4983c.C64640i;

/* renamed from: q.a.a.a.a.a.e */
/* compiled from: PG */
public final class C72757e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C72757e f193434d;

    /* renamed from: e */
    private static volatile C63010eb f193435e;

    /* renamed from: a */
    public int f193436a;

    /* renamed from: b */
    public C62961ch f193437b = emptyIntList();

    /* renamed from: c */
    public int f193438c;

    static {
        C72757e eVar = new C72757e();
        f193434d = eVar;
        C62942bv.registerDefaultInstance(C72757e.class, eVar);
    }

    private C72757e() {
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
                return newMessageInfo(f193434d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002,\u0003င\u0001", new Object[]{"a", "b", C64640i.f175227a, C45240c.f118157a});
            case 3:
                return new C72757e();
            case 4:
                return new C72756d();
            case 5:
                return f193434d;
            case 6:
                C63010eb ebVar = f193435e;
                if (ebVar == null) {
                    synchronized (C72757e.class) {
                        ebVar = f193435e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f193434d);
                            f193435e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
