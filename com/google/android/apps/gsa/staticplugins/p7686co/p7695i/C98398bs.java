package com.google.android.apps.gsa.staticplugins.p7686co.p7695i;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.i.bs */
/* compiled from: PG */
public final class C98398bs extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C98398bs f274681f;

    /* renamed from: g */
    private static volatile C63010eb f274682g;

    /* renamed from: a */
    public int f274683a;

    /* renamed from: b */
    public String f274684b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f274685c;

    /* renamed from: d */
    public int f274686d;

    /* renamed from: e */
    public C62961ch f274687e = emptyIntList();

    static {
        C98398bs bsVar = new C98398bs();
        f274681f = bsVar;
        C62942bv.registerDefaultInstance(C98398bs.class, bsVar);
    }

    private C98398bs() {
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
                return newMessageInfo(f274681f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004\u0016", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C98398bs();
            case 4:
                return new C98397br();
            case 5:
                return f274681f;
            case 6:
                C63010eb ebVar = f274682g;
                if (ebVar == null) {
                    synchronized (C98398bs.class) {
                        ebVar = f274682g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f274681f);
                            f274682g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
