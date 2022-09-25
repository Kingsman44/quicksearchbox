package p211b.p212a.p216d;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: b.a.d.l */
/* compiled from: PG */
public final class C4665l extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C4665l f14619k;

    /* renamed from: l */
    private static volatile C63010eb f14620l;

    /* renamed from: a */
    public int f14621a;

    /* renamed from: b */
    public int f14622b = 0;

    /* renamed from: c */
    public Object f14623c;

    /* renamed from: d */
    public int f14624d = 0;

    /* renamed from: e */
    public Object f14625e;

    /* renamed from: f */
    public C4659f f14626f;

    /* renamed from: g */
    public C4661h f14627g;

    /* renamed from: h */
    public float f14628h;

    /* renamed from: i */
    public C4659f f14629i;

    /* renamed from: j */
    public C4655b f14630j;

    static {
        C4665l lVar = new C4665l();
        f14619k = lVar;
        C62942bv.registerDefaultInstance(C4665l.class, lVar);
    }

    private C4665l() {
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
                return newMessageInfo(f14619k, "\u0001\n\u0002\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဴ\u0000\u0004ခ\u0005\u0005ဉ\u0007\u0006ဴ\u0001\u0007ဉ\n\bြ\u0000\tြ\u0001\u000b်\u0000", new Object[]{C45240c.f118157a, "b", "e", "d", "a", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C4663j.class, C4657d.class});
            case 3:
                return new C4665l();
            case 4:
                return new C4664k();
            case 5:
                return f14619k;
            case 6:
                C63010eb ebVar = f14620l;
                if (ebVar == null) {
                    synchronized (C4665l.class) {
                        ebVar = f14620l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f14619k);
                            f14620l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
