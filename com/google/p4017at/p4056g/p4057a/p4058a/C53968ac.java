package com.google.p4017at.p4056g.p4057a.p4058a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.ac */
/* compiled from: PG */
public final class C53968ac extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C53968ac f141603f;

    /* renamed from: g */
    private static volatile C63010eb f141604g;

    /* renamed from: a */
    public int f141605a = 0;

    /* renamed from: b */
    public Object f141606b;

    /* renamed from: c */
    public String f141607c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f141608d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C53967ab f141609e;

    static {
        C53968ac acVar = new C53968ac();
        f141603f = acVar;
        C62942bv.registerDefaultInstance(C53968ac.class, acVar);
    }

    private C53968ac() {
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
                return newMessageInfo(f141603f, "\u0000\u0004\u0001\u0000\u0001\f\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\t\f<\u0000", new Object[]{"b", "a", C45240c.f118157a, "d", "e", C54073y.class});
            case 3:
                return new C53968ac();
            case 4:
                return new C54074z();
            case 5:
                return f141603f;
            case 6:
                C63010eb ebVar = f141604g;
                if (ebVar == null) {
                    synchronized (C53968ac.class) {
                        ebVar = f141604g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141603f);
                            f141604g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
