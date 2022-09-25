package p001a.p007b.p008a.p009a.p010a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: a.b.a.a.a.g */
/* compiled from: PG */
public final class C0011g extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C0011g f14f;

    /* renamed from: g */
    private static volatile C63010eb f15g;

    /* renamed from: a */
    public int f16a;

    /* renamed from: b */
    public String f17b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f18c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f19d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f20e;

    static {
        C0011g gVar = new C0011g();
        f14f = gVar;
        C62942bv.registerDefaultInstance(C0011g.class, gVar);
    }

    private C0011g() {
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
                return newMessageInfo(f14f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C0011g();
            case 4:
                return new C0010f();
            case 5:
                return f14f;
            case 6:
                C63010eb ebVar = f15g;
                if (ebVar == null) {
                    synchronized (C0011g.class) {
                        ebVar = f15g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f14f);
                            f15g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
