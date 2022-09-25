package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.og */
/* compiled from: PG */
public final class C50200og extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50200og f130495e;

    /* renamed from: f */
    private static volatile C63010eb f130496f;

    /* renamed from: a */
    public int f130497a;

    /* renamed from: b */
    public String f130498b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f130499c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public boolean f130500d;

    static {
        C50200og ogVar = new C50200og();
        f130495e = ogVar;
        C62942bv.registerDefaultInstance(C50200og.class, ogVar);
    }

    private C50200og() {
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
                return newMessageInfo(f130495e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C50200og();
            case 4:
                return new C50199of();
            case 5:
                return f130495e;
            case 6:
                C63010eb ebVar = f130496f;
                if (ebVar == null) {
                    synchronized (C50200og.class) {
                        ebVar = f130496f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130495e);
                            f130496f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
