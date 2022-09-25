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

/* renamed from: j.a.i.b.a.e */
/* compiled from: PG */
public final class C71298e extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C71298e f190385j;

    /* renamed from: k */
    private static volatile C63010eb f190386k;

    /* renamed from: a */
    public int f190387a;

    /* renamed from: b */
    public String f190388b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f190389c;

    /* renamed from: d */
    public int f190390d;

    /* renamed from: e */
    public int f190391e;

    /* renamed from: f */
    public long f190392f;

    /* renamed from: g */
    public long f190393g;

    /* renamed from: h */
    public long f190394h;

    /* renamed from: i */
    public boolean f190395i;

    static {
        C71298e eVar = new C71298e();
        f190385j = eVar;
        C62942bv.registerDefaultInstance(C71298e.class, eVar);
    }

    private C71298e() {
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
                return newMessageInfo(f190385j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ဌ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဇ\u0007", new Object[]{"a", "b", C45240c.f118157a, C71244c.f190203a, "d", "e", C71217b.f190107a, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C71298e();
            case 4:
                return new C71190a();
            case 5:
                return f190385j;
            case 6:
                C63010eb ebVar = f190386k;
                if (ebVar == null) {
                    synchronized (C71298e.class) {
                        ebVar = f190386k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190385j);
                            f190386k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
