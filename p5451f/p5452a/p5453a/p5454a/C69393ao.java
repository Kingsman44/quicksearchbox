package p5451f.p5452a.p5453a.p5454a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: f.a.a.a.ao */
/* compiled from: PG */
public final class C69393ao extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C69393ao f185657i;

    /* renamed from: j */
    private static volatile C63010eb f185658j;

    /* renamed from: a */
    public int f185659a;

    /* renamed from: b */
    public C69455t f185660b;

    /* renamed from: c */
    public C69455t f185661c;

    /* renamed from: d */
    public C69455t f185662d;

    /* renamed from: e */
    public C69455t f185663e;

    /* renamed from: f */
    public String f185664f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f185665g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public boolean f185666h;

    static {
        C69393ao aoVar = new C69393ao();
        f185657i = aoVar;
        C62942bv.registerDefaultInstance(C69393ao.class, aoVar);
    }

    private C69393ao() {
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
                return newMessageInfo(f185657i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C69393ao();
            case 4:
                return new C69392an();
            case 5:
                return f185657i;
            case 6:
                C63010eb ebVar = f185658j;
                if (ebVar == null) {
                    synchronized (C69393ao.class) {
                        ebVar = f185658j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f185657i);
                            f185658j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
