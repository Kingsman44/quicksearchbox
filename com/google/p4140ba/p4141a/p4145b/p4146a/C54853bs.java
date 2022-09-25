package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.bs */
/* compiled from: PG */
public final class C54853bs extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54853bs f144078c;

    /* renamed from: d */
    private static volatile C63010eb f144079d;

    /* renamed from: a */
    public int f144080a;

    /* renamed from: b */
    public String f144081b = BuildConfig.FLAVOR;

    static {
        C54853bs bsVar = new C54853bs();
        f144078c = bsVar;
        C62942bv.registerDefaultInstance(C54853bs.class, bsVar);
    }

    private C54853bs() {
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
                return newMessageInfo(f144078c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C54853bs();
            case 4:
                return new C54852br();
            case 5:
                return f144078c;
            case 6:
                C63010eb ebVar = f144079d;
                if (ebVar == null) {
                    synchronized (C54853bs.class) {
                        ebVar = f144079d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144078c);
                            f144079d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
