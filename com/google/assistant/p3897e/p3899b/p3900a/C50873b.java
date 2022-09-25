package com.google.assistant.p3897e.p3899b.p3900a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.b.a.b */
/* compiled from: PG */
public final class C50873b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50873b f132459b;

    /* renamed from: d */
    private static volatile C63010eb f132460d;

    /* renamed from: a */
    public String f132461a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f132462c;

    static {
        C50873b bVar = new C50873b();
        f132459b = bVar;
        C62942bv.registerDefaultInstance(C50873b.class, bVar);
    }

    private C50873b() {
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
                return newMessageInfo(f132459b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C50873b();
            case 4:
                return new C50872a();
            case 5:
                return f132459b;
            case 6:
                C63010eb ebVar = f132460d;
                if (ebVar == null) {
                    synchronized (C50873b.class) {
                        ebVar = f132460d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132459b);
                            f132460d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
