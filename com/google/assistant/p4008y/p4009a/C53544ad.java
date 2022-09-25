package com.google.assistant.p4008y.p4009a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4495cl.p4497b.p4498a.p4499a.C58135f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.a.ad */
/* compiled from: PG */
public final class C53544ad extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53544ad f140512d;

    /* renamed from: e */
    private static volatile C63010eb f140513e;

    /* renamed from: a */
    public int f140514a;

    /* renamed from: b */
    public String f140515b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C58135f f140516c;

    static {
        C53544ad adVar = new C53544ad();
        f140512d = adVar;
        C62942bv.registerDefaultInstance(C53544ad.class, adVar);
    }

    private C53544ad() {
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
                return newMessageInfo(f140512d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C53544ad();
            case 4:
                return new C53543ac();
            case 5:
                return f140512d;
            case 6:
                C63010eb ebVar = f140513e;
                if (ebVar == null) {
                    synchronized (C53544ad.class) {
                        ebVar = f140513e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140512d);
                            f140513e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
