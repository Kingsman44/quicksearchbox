package p5602o.p5607c.p5608a.p5609a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: o.c.a.a.l */
/* compiled from: PG */
public final class C71913l extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C71913l f191523f;

    /* renamed from: g */
    private static volatile C63010eb f191524g;

    /* renamed from: a */
    public int f191525a;

    /* renamed from: b */
    public int f191526b;

    /* renamed from: c */
    public C71920s f191527c;

    /* renamed from: d */
    public C71910i f191528d;

    /* renamed from: e */
    public C71917p f191529e;

    static {
        C71913l lVar = new C71913l();
        f191523f = lVar;
        C62942bv.registerDefaultInstance(C71913l.class, lVar);
    }

    private C71913l() {
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
                return newMessageInfo(f191523f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C71915n.f191531a, C45240c.f118157a, "d", "e"});
            case 3:
                return new C71913l();
            case 4:
                return new C71912k();
            case 5:
                return f191523f;
            case 6:
                C63010eb ebVar = f191524g;
                if (ebVar == null) {
                    synchronized (C71913l.class) {
                        ebVar = f191524g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f191523f);
                            f191524g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
