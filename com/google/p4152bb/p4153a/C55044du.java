package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.du */
/* compiled from: PG */
public final class C55044du extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55044du f144814d;

    /* renamed from: e */
    private static volatile C63010eb f144815e;

    /* renamed from: a */
    public int f144816a;

    /* renamed from: b */
    public int f144817b;

    /* renamed from: c */
    public String f144818c = BuildConfig.FLAVOR;

    static {
        C55044du duVar = new C55044du();
        f144814d = duVar;
        C62942bv.registerDefaultInstance(C55044du.class, duVar);
    }

    private C55044du() {
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
                return newMessageInfo(f144814d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C55044du();
            case 4:
                return new C55043dt();
            case 5:
                return f144814d;
            case 6:
                C63010eb ebVar = f144815e;
                if (ebVar == null) {
                    synchronized (C55044du.class) {
                        ebVar = f144815e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144814d);
                            f144815e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
