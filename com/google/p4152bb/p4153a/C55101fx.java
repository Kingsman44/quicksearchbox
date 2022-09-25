package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.fx */
/* compiled from: PG */
public final class C55101fx extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55101fx f144991c;

    /* renamed from: d */
    private static volatile C63010eb f144992d;

    /* renamed from: a */
    public int f144993a;

    /* renamed from: b */
    public String f144994b = BuildConfig.FLAVOR;

    static {
        C55101fx fxVar = new C55101fx();
        f144991c = fxVar;
        C62942bv.registerDefaultInstance(C55101fx.class, fxVar);
    }

    private C55101fx() {
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
                return newMessageInfo(f144991c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C55101fx();
            case 4:
                return new C55100fw();
            case 5:
                return f144991c;
            case 6:
                C63010eb ebVar = f144992d;
                if (ebVar == null) {
                    synchronized (C55101fx.class) {
                        ebVar = f144992d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144991c);
                            f144992d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
