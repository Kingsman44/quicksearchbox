package com.google.p3562ao.p3563a.p3568d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ao.a.d.s */
/* compiled from: PG */
public final class C45581s extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C45581s f119121e;

    /* renamed from: f */
    private static volatile C63010eb f119122f;

    /* renamed from: a */
    public C45558bb f119123a;

    /* renamed from: b */
    public String f119124b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f119125c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f119126d = BuildConfig.FLAVOR;

    static {
        C45581s sVar = new C45581s();
        f119121e = sVar;
        C62942bv.registerDefaultInstance(C45581s.class, sVar);
    }

    private C45581s() {
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
                return newMessageInfo(f119121e, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C45581s();
            case 4:
                return new C45580r();
            case 5:
                return f119121e;
            case 6:
                C63010eb ebVar = f119122f;
                if (ebVar == null) {
                    synchronized (C45581s.class) {
                        ebVar = f119122f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119121e);
                            f119122f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
