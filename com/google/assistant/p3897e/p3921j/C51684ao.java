package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ao */
/* compiled from: PG */
public final class C51684ao extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51684ao f135470d;

    /* renamed from: e */
    private static volatile C63010eb f135471e;

    /* renamed from: a */
    public int f135472a;

    /* renamed from: b */
    public String f135473b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f135474c = C62942bv.emptyProtobufList();

    static {
        C51684ao aoVar = new C51684ao();
        f135470d = aoVar;
        C62942bv.registerDefaultInstance(C51684ao.class, aoVar);
    }

    private C51684ao() {
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
                return newMessageInfo(f135470d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C51684ao();
            case 4:
                return new C51683an();
            case 5:
                return f135470d;
            case 6:
                C63010eb ebVar = f135471e;
                if (ebVar == null) {
                    synchronized (C51684ao.class) {
                        ebVar = f135471e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135470d);
                            f135471e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
