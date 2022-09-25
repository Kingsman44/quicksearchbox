package p001a.p014d.p015a.p016a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: a.d.a.a.ak */
/* compiled from: PG */
public final class C0048ak extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C0048ak f131d;

    /* renamed from: e */
    private static volatile C63010eb f132e;

    /* renamed from: a */
    public C62995dn f133a = C62995dn.f170057a;

    /* renamed from: b */
    public C62995dn f134b;

    /* renamed from: c */
    public C62995dn f135c;

    static {
        C0048ak akVar = new C0048ak();
        f131d = akVar;
        C62942bv.registerDefaultInstance(C0048ak.class, akVar);
    }

    private C0048ak() {
        C62995dn dnVar = C62995dn.f170057a;
        this.f134b = dnVar;
        this.f135c = dnVar;
        emptyProtobufList();
    }

    /* renamed from: a */
    public final boolean mo21a(String str) {
        str.getClass();
        return this.f133a.containsKey(str);
    }

    /* renamed from: b */
    public final boolean mo22b(String str) {
        str.getClass();
        return this.f134b.containsKey(str);
    }

    /* renamed from: c */
    public final boolean mo23c(String str) {
        str.getClass();
        return this.f135c.containsKey(str);
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
                return newMessageInfo(f131d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0003\u0000\u0000\u00012\u00022\u00032", new Object[]{"a", C0046ai.f129a, "b", C0047aj.f130a, C45240c.f118157a, C0045ah.f128a});
            case 3:
                return new C0048ak();
            case 4:
                return new C0044ag();
            case 5:
                return f131d;
            case 6:
                C63010eb ebVar = f132e;
                if (ebVar == null) {
                    synchronized (C0048ak.class) {
                        ebVar = f132e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131d);
                            f132e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
