package p5535j.p5536a.p5537a.p5541c.p5542a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.a.c.a.d */
/* compiled from: PG */
public final class C70935d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C70935d f189149c;

    /* renamed from: d */
    private static volatile C63010eb f189150d;

    /* renamed from: a */
    public String f189151a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f189152b = C62942bv.emptyProtobufList();

    static {
        C70935d dVar = new C70935d();
        f189149c = dVar;
        C62942bv.registerDefaultInstance(C70935d.class, dVar);
    }

    private C70935d() {
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
                return newMessageInfo(f189149c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"a", "b"});
            case 3:
                return new C70935d();
            case 4:
                return new C70934c();
            case 5:
                return f189149c;
            case 6:
                C63010eb ebVar = f189150d;
                if (ebVar == null) {
                    synchronized (C70935d.class) {
                        ebVar = f189150d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189149c);
                            f189150d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
