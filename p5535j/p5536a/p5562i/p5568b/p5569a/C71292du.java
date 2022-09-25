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

/* renamed from: j.a.i.b.a.du */
/* compiled from: PG */
public final class C71292du extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C71292du f190364k;

    /* renamed from: l */
    private static volatile C63010eb f190365l;

    /* renamed from: a */
    public int f190366a;

    /* renamed from: b */
    public long f190367b;

    /* renamed from: c */
    public long f190368c;

    /* renamed from: d */
    public long f190369d;

    /* renamed from: e */
    public long f190370e;

    /* renamed from: f */
    public long f190371f;

    /* renamed from: g */
    public long f190372g;

    /* renamed from: h */
    public long f190373h;

    /* renamed from: i */
    public long f190374i;

    /* renamed from: j */
    public C62971cq f190375j = emptyProtobufList();

    static {
        C71292du duVar = new C71292du();
        f190364k = duVar;
        C62942bv.registerDefaultInstance(C71292du.class, duVar);
    }

    private C71292du() {
    }

    /* renamed from: a */
    public final void mo62663a() {
        C62971cq cqVar = this.f190375j;
        if (!cqVar.mo58948c()) {
            this.f190375j = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f190364k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\n\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C71291dt.class});
            case 3:
                return new C71292du();
            case 4:
                return new C71287dp();
            case 5:
                return f190364k;
            case 6:
                C63010eb ebVar = f190365l;
                if (ebVar == null) {
                    synchronized (C71292du.class) {
                        ebVar = f190365l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190364k);
                            f190365l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
