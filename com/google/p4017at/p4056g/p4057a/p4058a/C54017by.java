package com.google.p4017at.p4056g.p4057a.p4058a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.by */
/* compiled from: PG */
public final class C54017by extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54017by f141729d;

    /* renamed from: e */
    private static volatile C63010eb f141730e;

    /* renamed from: a */
    public String f141731a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f141732b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f141733c = BuildConfig.FLAVOR;

    static {
        C54017by byVar = new C54017by();
        f141729d = byVar;
        C62942bv.registerDefaultInstance(C54017by.class, byVar);
    }

    private C54017by() {
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
                return newMessageInfo(f141729d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54017by();
            case 4:
                return new C54016bx();
            case 5:
                return f141729d;
            case 6:
                C63010eb ebVar = f141730e;
                if (ebVar == null) {
                    synchronized (C54017by.class) {
                        ebVar = f141730e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141729d);
                            f141730e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
