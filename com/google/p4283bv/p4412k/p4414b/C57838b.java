package com.google.p4283bv.p4412k.p4414b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.k.b.b */
/* compiled from: PG */
public final class C57838b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C57838b f154532f;

    /* renamed from: g */
    private static volatile C63010eb f154533g;

    /* renamed from: a */
    public String f154534a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f154535b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f154536c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f154537d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C57842f f154538e;

    static {
        C57838b bVar = new C57838b();
        f154532f = bVar;
        C62942bv.registerDefaultInstance(C57838b.class, bVar);
    }

    private C57838b() {
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
                return newMessageInfo(f154532f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C57838b();
            case 4:
                return new C57837a();
            case 5:
                return f154532f;
            case 6:
                C63010eb ebVar = f154533g;
                if (ebVar == null) {
                    synchronized (C57838b.class) {
                        ebVar = f154533g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154532f);
                            f154533g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
