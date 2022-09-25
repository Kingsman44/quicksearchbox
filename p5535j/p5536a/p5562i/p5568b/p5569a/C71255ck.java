package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.ck */
/* compiled from: PG */
public final class C71255ck extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C71255ck f190229m;

    /* renamed from: o */
    private static volatile C63010eb f190230o;

    /* renamed from: a */
    public int f190231a;

    /* renamed from: b */
    public String f190232b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f190233c;

    /* renamed from: d */
    public String f190234d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public long f190235e;

    /* renamed from: f */
    public long f190236f;

    /* renamed from: g */
    public long f190237g;

    /* renamed from: h */
    public long f190238h;

    /* renamed from: i */
    public int f190239i;

    /* renamed from: j */
    public long f190240j;

    /* renamed from: k */
    public int f190241k;

    /* renamed from: l */
    public C71207aq f190242l;

    /* renamed from: n */
    private byte f190243n = 2;

    static {
        C71255ck ckVar = new C71255ck();
        f190229m = ckVar;
        C62942bv.registerDefaultInstance(C71255ck.class, ckVar);
    }

    private C71255ck() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f190243n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f190243n = b;
                return null;
            case 2:
                return newMessageInfo(f190229m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0001\u0001ဈ\u0000\u0002စ\u0003\u0003စ\u0004\u0004ဂ\u0005\u0005ဂ\u0006\u0006ဂ\b\u0007ဌ\t\bစ\u0001\tဈ\u0002\nင\u0007\u000bᐉ\n", new Object[]{"a", "b", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "j", C19621k.f54601a, C71253ci.f190228a, C45240c.f118157a, "d", "i", "l"});
            case 3:
                return new C71255ck();
            case 4:
                return new C71252ch();
            case 5:
                return f190229m;
            case 6:
                C63010eb ebVar = f190230o;
                if (ebVar == null) {
                    synchronized (C71255ck.class) {
                        ebVar = f190230o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190229m);
                            f190230o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
