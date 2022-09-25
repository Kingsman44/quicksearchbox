package p5451f.p5452a.p5453a.p5454a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7818lb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: f.a.a.a.av */
/* compiled from: PG */
public final class C69400av extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C69400av f185693h;

    /* renamed from: i */
    private static volatile C63010eb f185694i;

    /* renamed from: a */
    public int f185695a;

    /* renamed from: b */
    public int f185696b;

    /* renamed from: c */
    public C62971cq f185697c = emptyProtobufList();

    /* renamed from: d */
    public int f185698d;

    /* renamed from: e */
    public String f185699e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C69455t f185700f;

    /* renamed from: g */
    public boolean f185701g;

    static {
        C69400av avVar = new C69400av();
        f185693h = avVar;
        C62942bv.registerDefaultInstance(C69400av.class, avVar);
    }

    private C69400av() {
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
                return newMessageInfo(f185693h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003င\u0001\u0005ဈ\u0003\u0006ဉ\u0004\u0007ဇ\u0005", new Object[]{"a", "b", C69399au.m100749b(), C45240c.f118157a, C7818lb.class, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C69400av();
            case 4:
                return new C69397as();
            case 5:
                return f185693h;
            case 6:
                C63010eb ebVar = f185694i;
                if (ebVar == null) {
                    synchronized (C69400av.class) {
                        ebVar = f185694i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f185693h);
                            f185694i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
