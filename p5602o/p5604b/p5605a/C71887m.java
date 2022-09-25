package p5602o.p5604b.p5605a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import p5602o.p5604b.p5605a.p5606a.C71865c;
import p5602o.p5604b.p5605a.p5606a.C71867e;
import p5602o.p5604b.p5605a.p5606a.C71871i;

/* renamed from: o.b.a.m */
/* compiled from: PG */
public final class C71887m extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C71887m f191455g;

    /* renamed from: h */
    private static volatile C63010eb f191456h;

    /* renamed from: a */
    public int f191457a;

    /* renamed from: b */
    public int f191458b = 0;

    /* renamed from: c */
    public Object f191459c;

    /* renamed from: d */
    public int f191460d = 2;

    /* renamed from: e */
    public int f191461e;

    /* renamed from: f */
    public int f191462f;

    static {
        C71887m mVar = new C71887m();
        f191455g = mVar;
        C62942bv.registerDefaultInstance(C71887m.class, mVar);
    }

    private C71887m() {
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
                return newMessageInfo(f191455g, "\u0001\u0006\u0001\u0001\u0003\b\u0006\u0000\u0000\u0000\u0003ဌ\u0006\u0004ဌ\u0007\u0005ဌ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "e", C71872aa.f191423a, C10662f.f35572a, C71900z.f191499a, "d", C62722b.m94932b(), C71867e.class, C71865c.class, C71871i.class});
            case 3:
                return new C71887m();
            case 4:
                return new C71886l();
            case 5:
                return f191455g;
            case 6:
                C63010eb ebVar = f191456h;
                if (ebVar == null) {
                    synchronized (C71887m.class) {
                        ebVar = f191456h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f191455g);
                            f191456h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
