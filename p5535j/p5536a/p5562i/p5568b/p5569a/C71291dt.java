package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.dt */
/* compiled from: PG */
public final class C71291dt extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C71291dt f190357f;

    /* renamed from: g */
    private static volatile C63010eb f190358g;

    /* renamed from: a */
    public int f190359a;

    /* renamed from: b */
    public String f190360b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62964ck f190361c = emptyLongList();

    /* renamed from: d */
    public long f190362d;

    /* renamed from: e */
    public int f190363e;

    static {
        C71291dt dtVar = new C71291dt();
        f190357f = dtVar;
        C62942bv.registerDefaultInstance(C71291dt.class, dtVar);
    }

    private C71291dt() {
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
                return newMessageInfo(f190357f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003(\u0004ဌ\u0002", new Object[]{"a", "b", "d", C45240c.f118157a, "e", C71290ds.m103951b()});
            case 3:
                return new C71291dt();
            case 4:
                return new C71288dq();
            case 5:
                return f190357f;
            case 6:
                C63010eb ebVar = f190358g;
                if (ebVar == null) {
                    synchronized (C71291dt.class) {
                        ebVar = f190358g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190357f);
                            f190358g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
