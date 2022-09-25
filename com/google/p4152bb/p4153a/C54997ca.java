package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.ca */
/* compiled from: PG */
public final class C54997ca extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54997ca f144699d;

    /* renamed from: e */
    private static volatile C63010eb f144700e;

    /* renamed from: a */
    public int f144701a;

    /* renamed from: b */
    public int f144702b;

    /* renamed from: c */
    public String f144703c = BuildConfig.FLAVOR;

    static {
        C54997ca caVar = new C54997ca();
        f144699d = caVar;
        C62942bv.registerDefaultInstance(C54997ca.class, caVar);
    }

    private C54997ca() {
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
                return newMessageInfo(f144699d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002င\u0001\u0003ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54997ca();
            case 4:
                return new C54995bz();
            case 5:
                return f144699d;
            case 6:
                C63010eb ebVar = f144700e;
                if (ebVar == null) {
                    synchronized (C54997ca.class) {
                        ebVar = f144700e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144699d);
                            f144700e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
