package p5535j.p5536a.p5562i.p5568b.p5569a;

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

/* renamed from: j.a.i.b.a.m */
/* compiled from: PG */
public final class C71318m extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C71318m f190465k;

    /* renamed from: m */
    private static volatile C63010eb f190466m;

    /* renamed from: a */
    public int f190467a;

    /* renamed from: b */
    public int f190468b;

    /* renamed from: c */
    public long f190469c;

    /* renamed from: d */
    public String f190470d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f190471e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C71207aq f190472f;

    /* renamed from: g */
    public int f190473g;

    /* renamed from: h */
    public long f190474h;

    /* renamed from: i */
    public C71195ae f190475i;

    /* renamed from: j */
    public long f190476j;

    /* renamed from: l */
    private byte f190477l = 2;

    static {
        C71318m mVar = new C71318m();
        f190465k = mVar;
        C62942bv.registerDefaultInstance(C71318m.class, mVar);
    }

    private C71318m() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f190477l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f190477l = b;
                return null;
            case 2:
                return newMessageInfo(f190465k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0001\u0001ဌ\u0000\u0002ဌ\u0005\u0003ဂ\u0006\u0006ဉ\u0007\u0007ဂ\b\bစ\u0001\tဈ\u0002\nဈ\u0003\u000bᐉ\u0004", new Object[]{"a", "b", C71317l.m103957b(), C30325g.f82003a, C71317l.m103957b(), C19618h.f54585a, "i", "j", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C71318m();
            case 4:
                return new C71315j();
            case 5:
                return f190465k;
            case 6:
                C63010eb ebVar = f190466m;
                if (ebVar == null) {
                    synchronized (C71318m.class) {
                        ebVar = f190466m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190465k);
                            f190466m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
