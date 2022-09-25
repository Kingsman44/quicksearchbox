package p001a.p014d.p015a.p016a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: a.d.a.a.w */
/* compiled from: PG */
public final class C0078w extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C0078w f208d;

    /* renamed from: e */
    private static volatile C63010eb f209e;

    /* renamed from: a */
    public C62995dn f210a = C62995dn.f170057a;

    /* renamed from: b */
    public C62995dn f211b = C62995dn.f170057a;

    /* renamed from: c */
    public C62971cq f212c = C62942bv.emptyProtobufList();

    static {
        C0078w wVar = new C0078w();
        f208d = wVar;
        C62942bv.registerDefaultInstance(C0078w.class, wVar);
    }

    private C0078w() {
    }

    /* renamed from: a */
    public final boolean mo29a(String str) {
        str.getClass();
        return this.f210a.containsKey(str);
    }

    /* renamed from: b */
    public final boolean mo30b(String str) {
        str.getClass();
        return this.f211b.containsKey(str);
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
                return newMessageInfo(f208d, "\u0000\u0003\u0000\u0000\u0001\u0005\u0003\u0002\u0001\u0000\u00012\u00042\u0005Ț", new Object[]{"a", C0077v.f207a, "b", C0076u.f206a, C45240c.f118157a});
            case 3:
                return new C0078w();
            case 4:
                return new C0075t();
            case 5:
                return f208d;
            case 6:
                C63010eb ebVar = f209e;
                if (ebVar == null) {
                    synchronized (C0078w.class) {
                        ebVar = f209e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f208d);
                            f209e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
