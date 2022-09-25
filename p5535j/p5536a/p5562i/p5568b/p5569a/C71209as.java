package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

@Deprecated
/* renamed from: j.a.i.b.a.as */
/* compiled from: PG */
public final class C71209as extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C71209as f190080g;

    /* renamed from: h */
    public static final C62940bt f190081h;

    /* renamed from: i */
    private static volatile C63010eb f190082i;

    /* renamed from: a */
    public int f190083a;

    /* renamed from: b */
    public C62961ch f190084b = emptyIntList();

    /* renamed from: c */
    public boolean f190085c;

    /* renamed from: d */
    public int f190086d;

    /* renamed from: e */
    public int f190087e;

    /* renamed from: f */
    public C62971cq f190088f = C62942bv.emptyProtobufList();

    static {
        C71209as asVar = new C71209as();
        f190080g = asVar;
        C62942bv.registerDefaultInstance(C71209as.class, asVar);
        f190081h = C62942bv.newSingularGeneratedExtension(C71207aq.f190077a, asVar, asVar, (C62958ce) null, 17, C63066gd.MESSAGE, C71209as.class);
    }

    private C71209as() {
    }

    /* renamed from: a */
    public final void mo62658a() {
        C62961ch chVar = this.f190084b;
        if (!chVar.mo58948c()) {
            this.f190084b = C62942bv.mutableCopy(chVar);
        }
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
                return newMessageInfo(f190080g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u0016\u0002ဇ\u0000\u0003င\u0001\u0004င\u0002\u0005\u001a", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C71209as();
            case 4:
                return new C71208ar();
            case 5:
                return f190080g;
            case 6:
                C63010eb ebVar = f190082i;
                if (ebVar == null) {
                    synchronized (C71209as.class) {
                        ebVar = f190082i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190080g);
                            f190082i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
