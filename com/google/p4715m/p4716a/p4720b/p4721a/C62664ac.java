package com.google.p4715m.p4716a.p4720b.p4721a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.m.a.b.a.ac */
/* compiled from: PG */
public final class C62664ac extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62664ac f169186b;

    /* renamed from: d */
    private static volatile C63010eb f169187d;

    /* renamed from: a */
    public String f169188a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f169189c;

    static {
        C62664ac acVar = new C62664ac();
        f169186b = acVar;
        C62942bv.registerDefaultInstance(C62664ac.class, acVar);
    }

    private C62664ac() {
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
                return newMessageInfo(f169186b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C62664ac();
            case 4:
                return new C62663ab();
            case 5:
                return f169186b;
            case 6:
                C63010eb ebVar = f169187d;
                if (ebVar == null) {
                    synchronized (C62664ac.class) {
                        ebVar = f169187d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169186b);
                            f169187d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
