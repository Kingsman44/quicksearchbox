package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.db */
/* compiled from: PG */
public final class C71273db extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C71273db f190293g;

    /* renamed from: h */
    private static volatile C63010eb f190294h;

    /* renamed from: a */
    public int f190295a;

    /* renamed from: b */
    public String f190296b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f190297c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f190298d;

    /* renamed from: e */
    public long f190299e;

    /* renamed from: f */
    public String f190300f = BuildConfig.FLAVOR;

    static {
        C71273db dbVar = new C71273db();
        f190293g = dbVar;
        C62942bv.registerDefaultInstance(C71273db.class, dbVar);
    }

    private C71273db() {
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
                return newMessageInfo(f190293g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", C71272da.f190292a, "e", C10662f.f35572a});
            case 3:
                return new C71273db();
            case 4:
                return new C71270cz();
            case 5:
                return f190293g;
            case 6:
                C63010eb ebVar = f190294h;
                if (ebVar == null) {
                    synchronized (C71273db.class) {
                        ebVar = f190294h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190293g);
                            f190294h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
