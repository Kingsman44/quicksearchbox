package p5304e.p5305a.p5306a.p5431u.p5434b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: e.a.a.u.b.r */
/* compiled from: PG */
public final class C69252r extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62962ci f185363d = new C69250p();

    /* renamed from: f */
    public static final C69252r f185364f;

    /* renamed from: h */
    private static volatile C63010eb f185365h;

    /* renamed from: a */
    public int f185366a;

    /* renamed from: b */
    public int f185367b;

    /* renamed from: c */
    public C62961ch f185368c = emptyIntList();

    /* renamed from: e */
    public boolean f185369e;

    /* renamed from: g */
    private int f185370g;

    static {
        C69252r rVar = new C69252r();
        f185364f = rVar;
        C62942bv.registerDefaultInstance(C69252r.class, rVar);
    }

    private C69252r() {
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
                return newMessageInfo(f185364f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003\u001e\u0004ဇ\u0002", new Object[]{C30325g.f82003a, "a", "b", C45240c.f118157a, C53306j.m86810b(), "e"});
            case 3:
                return new C69252r();
            case 4:
                return new C69251q();
            case 5:
                return f185364f;
            case 6:
                C63010eb ebVar = f185365h;
                if (ebVar == null) {
                    synchronized (C69252r.class) {
                        ebVar = f185365h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f185364f);
                            f185365h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
