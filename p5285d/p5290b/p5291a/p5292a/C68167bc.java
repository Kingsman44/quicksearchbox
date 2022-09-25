package p5285d.p5290b.p5291a.p5292a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.b.a.a.bc */
/* compiled from: PG */
public final class C68167bc extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C68167bc f184457e;

    /* renamed from: f */
    private static volatile C63010eb f184458f;

    /* renamed from: a */
    public C62971cq f184459a = emptyProtobufList();

    /* renamed from: b */
    public C68179bo f184460b;

    /* renamed from: c */
    public int f184461c;

    /* renamed from: d */
    public String f184462d = BuildConfig.FLAVOR;

    static {
        C68167bc bcVar = new C68167bc();
        f184457e = bcVar;
        C62942bv.registerDefaultInstance(C68167bc.class, bcVar);
    }

    private C68167bc() {
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
                return newMessageInfo(f184457e, "\u0000\u0004\u0000\u0000\u0002\u0006\u0004\u0000\u0001\u0000\u0002\u001b\u0003\t\u0004\u0004\u0006Ȉ", new Object[]{"a", C68176bl.class, "b", C45240c.f118157a, "d"});
            case 3:
                return new C68167bc();
            case 4:
                return new C68166bb();
            case 5:
                return f184457e;
            case 6:
                C63010eb ebVar = f184458f;
                if (ebVar == null) {
                    synchronized (C68167bc.class) {
                        ebVar = f184458f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184457e);
                            f184458f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
