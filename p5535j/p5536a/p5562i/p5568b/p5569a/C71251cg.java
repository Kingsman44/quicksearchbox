package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.cg */
/* compiled from: PG */
public final class C71251cg extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C71251cg f190215k;

    /* renamed from: m */
    private static volatile C63010eb f190216m;

    /* renamed from: a */
    public int f190217a;

    /* renamed from: b */
    public long f190218b;

    /* renamed from: c */
    public int f190219c;

    /* renamed from: d */
    public C62971cq f190220d = emptyProtobufList();

    /* renamed from: e */
    public float f190221e;

    /* renamed from: f */
    public C71247cc f190222f;

    /* renamed from: g */
    public C71262cr f190223g;

    /* renamed from: h */
    public long f190224h;

    /* renamed from: i */
    public long f190225i;

    /* renamed from: j */
    public long f190226j;

    /* renamed from: l */
    private byte f190227l = 2;

    static {
        C71251cg cgVar = new C71251cg();
        f190215k = cgVar;
        C62942bv.registerDefaultInstance(C71251cg.class, cgVar);
    }

    private C71251cg() {
    }

    /* renamed from: a */
    public final void mo62661a() {
        C62971cq cqVar = this.f190220d;
        if (!cqVar.mo58948c()) {
            this.f190220d = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f190227l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f190227l = b;
                return null;
            case 2:
                return newMessageInfo(f190215k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0001\u0001စ\u0000\u0002Л\u0003ဌ\u0001\u0004ခ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007စ\u0005\bဂ\u0006\tဂ\u0007", new Object[]{"a", "b", "d", C71255ck.class, C45240c.f118157a, C71250cf.f190214a, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C71251cg();
            case 4:
                return new C71249ce();
            case 5:
                return f190215k;
            case 6:
                C63010eb ebVar = f190216m;
                if (ebVar == null) {
                    synchronized (C71251cg.class) {
                        ebVar = f190216m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190215k);
                            f190216m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
