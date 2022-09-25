package com.google.android.apps.gsa.opa.p6441f.p6442a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.p3926e.C51994gt;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.f.a.ax */
/* compiled from: PG */
public final class C83635ax extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C83635ax f227995e;

    /* renamed from: f */
    private static volatile C63010eb f227996f;

    /* renamed from: a */
    public int f227997a;

    /* renamed from: b */
    public String f227998b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C51994gt f227999c;

    /* renamed from: d */
    public String f228000d = BuildConfig.FLAVOR;

    static {
        C83635ax axVar = new C83635ax();
        f227995e = axVar;
        C62942bv.registerDefaultInstance(C83635ax.class, axVar);
    }

    private C83635ax() {
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
                return newMessageInfo(f227995e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C83635ax();
            case 4:
                return new C83634aw();
            case 5:
                return f227995e;
            case 6:
                C63010eb ebVar = f227996f;
                if (ebVar == null) {
                    synchronized (C83635ax.class) {
                        ebVar = f227996f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f227995e);
                            f227996f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
