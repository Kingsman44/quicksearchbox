package p5535j.p5536a.p5562i.p5563a.p5566b.p5567a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4438c.p4439a.C57913b;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.a.b.a.f */
/* compiled from: PG */
public final class C71189f extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C71189f f189934k;

    /* renamed from: m */
    private static volatile C63010eb f189935m;

    /* renamed from: a */
    public int f189936a;

    /* renamed from: b */
    public int f189937b;

    /* renamed from: c */
    public C62971cq f189938c = emptyProtobufList();

    /* renamed from: d */
    public int f189939d;

    /* renamed from: e */
    public int f189940e;

    /* renamed from: f */
    public C57913b f189941f;

    /* renamed from: g */
    public C57913b f189942g;

    /* renamed from: h */
    public C62910ar f189943h;

    /* renamed from: i */
    public C71188e f189944i;

    /* renamed from: j */
    public int f189945j;

    /* renamed from: l */
    private byte f189946l = 2;

    static {
        C71189f fVar = new C71189f();
        f189934k = fVar;
        C62942bv.registerDefaultInstance(C71189f.class, fVar);
    }

    private C71189f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f189946l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f189946l = b;
                return null;
            case 2:
                return newMessageInfo(f189934k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0003\u0001ဌ\u0000\u0002Л\u0003င\u0001\u0004င\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ဉ\u0005\bဉ\u0006\tင\u0007", new Object[]{"a", "b", C71184a.f189928a, C45240c.f118157a, C57913b.class, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C71189f();
            case 4:
                return new C71186c();
            case 5:
                return f189934k;
            case 6:
                C63010eb ebVar = f189935m;
                if (ebVar == null) {
                    synchronized (C71189f.class) {
                        ebVar = f189935m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189934k);
                            f189935m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
