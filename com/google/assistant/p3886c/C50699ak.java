package com.google.assistant.p3886c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.ak */
/* compiled from: PG */
public final class C50699ak extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50699ak f131906e;

    /* renamed from: f */
    private static volatile C63010eb f131907f;

    /* renamed from: a */
    public int f131908a;

    /* renamed from: b */
    public C62971cq f131909b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public int f131910c;

    /* renamed from: d */
    public String f131911d = BuildConfig.FLAVOR;

    static {
        C50699ak akVar = new C50699ak();
        f131906e = akVar;
        C62942bv.registerDefaultInstance(C50699ak.class, akVar);
    }

    private C50699ak() {
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
                return newMessageInfo(f131906e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0004ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C50699ak();
            case 4:
                return new C50698aj();
            case 5:
                return f131906e;
            case 6:
                C63010eb ebVar = f131907f;
                if (ebVar == null) {
                    synchronized (C50699ak.class) {
                        ebVar = f131907f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131906e);
                            f131907f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
