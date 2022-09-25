package com.google.p3562ao.p3563a.p3568d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ao.a.d.e */
/* compiled from: PG */
public final class C45567e extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C45567e f119088f;

    /* renamed from: g */
    private static volatile C63010eb f119089g;

    /* renamed from: a */
    public int f119090a;

    /* renamed from: b */
    public int f119091b;

    /* renamed from: c */
    public int f119092c;

    /* renamed from: d */
    public String f119093d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f119094e = BuildConfig.FLAVOR;

    static {
        C45567e eVar = new C45567e();
        f119088f = eVar;
        C62942bv.registerDefaultInstance(C45567e.class, eVar);
    }

    private C45567e() {
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
                return newMessageInfo(f119088f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0005Ȉ", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C45567e();
            case 4:
                return new C45566d();
            case 5:
                return f119088f;
            case 6:
                C63010eb ebVar = f119089g;
                if (ebVar == null) {
                    synchronized (C45567e.class) {
                        ebVar = f119089g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119088f);
                            f119089g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
