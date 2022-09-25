package p001a.p007b.p008a.p009a.p010a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: a.b.a.a.a.k */
/* compiled from: PG */
public final class C0015k extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C0015k f27g;

    /* renamed from: h */
    private static volatile C63010eb f28h;

    /* renamed from: a */
    public int f29a;

    /* renamed from: b */
    public long f30b;

    /* renamed from: c */
    public C62971cq f31c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public C63088z f32d = C63088z.f170246b;

    /* renamed from: e */
    public String f33e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f34f;

    static {
        C0015k kVar = new C0015k();
        f27g = kVar;
        C62942bv.registerDefaultInstance(C0015k.class, kVar);
    }

    private C0015k() {
        C62942bv.emptyProtobufList();
        this.f34f = BuildConfig.FLAVOR;
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
                return newMessageInfo(f27g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001a\u0003ည\u0001\u0004ဈ\u0002\u0006ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C0015k();
            case 4:
                return new C0014j();
            case 5:
                return f27g;
            case 6:
                C63010eb ebVar = f28h;
                if (ebVar == null) {
                    synchronized (C0015k.class) {
                        ebVar = f28h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27g);
                            f28h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
