package com.google.assistant.p4003x.p4004a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.x.a.o */
/* compiled from: PG */
public final class C53538o extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C53538o f140502f;

    /* renamed from: g */
    private static volatile C63010eb f140503g;

    /* renamed from: a */
    public int f140504a;

    /* renamed from: b */
    public int f140505b;

    /* renamed from: c */
    public String f140506c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f140507d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f140508e;

    static {
        C53538o oVar = new C53538o();
        f140502f = oVar;
        C62942bv.registerDefaultInstance(C53538o.class, oVar);
    }

    private C53538o() {
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
                return newMessageInfo(f140502f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", C53537n.m86859b(), C45240c.f118157a, "d", "e", C53534k.m86857b()});
            case 3:
                return new C53538o();
            case 4:
                return new C53535l();
            case 5:
                return f140502f;
            case 6:
                C63010eb ebVar = f140503g;
                if (ebVar == null) {
                    synchronized (C53538o.class) {
                        ebVar = f140503g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140502f);
                            f140503g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
