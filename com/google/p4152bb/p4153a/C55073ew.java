package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.ew */
/* compiled from: PG */
public final class C55073ew extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C55073ew f144880e;

    /* renamed from: f */
    private static volatile C63010eb f144881f;

    /* renamed from: a */
    public int f144882a;

    /* renamed from: b */
    public String f144883b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C55097ft f144884c;

    /* renamed from: d */
    public boolean f144885d;

    static {
        C55073ew ewVar = new C55073ew();
        f144880e = ewVar;
        C62942bv.registerDefaultInstance(C55073ew.class, ewVar);
    }

    private C55073ew() {
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
                return newMessageInfo(f144880e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0005ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C55073ew();
            case 4:
                return new C55072ev();
            case 5:
                return f144880e;
            case 6:
                C63010eb ebVar = f144881f;
                if (ebVar == null) {
                    synchronized (C55073ew.class) {
                        ebVar = f144881f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144880e);
                            f144881f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
