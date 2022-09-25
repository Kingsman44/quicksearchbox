package p5304e.p5305a.p5306a.p5431u.p5434b;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: e.a.a.u.b.m */
/* compiled from: PG */
public final class C69247m extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C69247m f185353e;

    /* renamed from: g */
    private static volatile C63010eb f185354g;

    /* renamed from: a */
    public int f185355a;

    /* renamed from: b */
    public C62961ch f185356b = emptyIntList();

    /* renamed from: c */
    public C62971cq f185357c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public C62971cq f185358d = C62942bv.emptyProtobufList();

    /* renamed from: f */
    private int f185359f;

    static {
        C69247m mVar = new C69247m();
        f185353e = mVar;
        C62942bv.registerDefaultInstance(C69247m.class, mVar);
    }

    private C69247m() {
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
                return newMessageInfo(f185353e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001ဌ\u0000\u0002\u0016\u0003\u001a\u0004\u001a", new Object[]{C10662f.f35572a, "a", C69245k.f185352a, "b", C45240c.f118157a, "d"});
            case 3:
                return new C69247m();
            case 4:
                return new C69244j();
            case 5:
                return f185353e;
            case 6:
                C63010eb ebVar = f185354g;
                if (ebVar == null) {
                    synchronized (C69247m.class) {
                        ebVar = f185354g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f185353e);
                            f185354g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
