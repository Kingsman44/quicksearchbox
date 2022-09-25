package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.bq */
/* compiled from: PG */
public final class C54986bq extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54986bq f144675d;

    /* renamed from: e */
    private static volatile C63010eb f144676e;

    /* renamed from: a */
    public int f144677a;

    /* renamed from: b */
    public int f144678b;

    /* renamed from: c */
    public String f144679c = BuildConfig.FLAVOR;

    static {
        C54986bq bqVar = new C54986bq();
        f144675d = bqVar;
        C62942bv.registerDefaultInstance(C54986bq.class, bqVar);
    }

    private C54986bq() {
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
                return newMessageInfo(f144675d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C54984bo.f144674a, C45240c.f118157a});
            case 3:
                return new C54986bq();
            case 4:
                return new C54983bn();
            case 5:
                return f144675d;
            case 6:
                C63010eb ebVar = f144676e;
                if (ebVar == null) {
                    synchronized (C54986bq.class) {
                        ebVar = f144676e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144675d);
                            f144676e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
