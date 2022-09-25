package com.google.assistant.p3814ai.p3815a.p3816a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ai.a.a.d */
/* compiled from: PG */
public final class C49170d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49170d f127143c;

    /* renamed from: d */
    private static volatile C63010eb f127144d;

    /* renamed from: a */
    public String f127145a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f127146b = C62942bv.emptyProtobufList();

    static {
        C49170d dVar = new C49170d();
        f127143c = dVar;
        C62942bv.registerDefaultInstance(C49170d.class, dVar);
    }

    private C49170d() {
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
                return newMessageInfo(f127143c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"a", "b"});
            case 3:
                return new C49170d();
            case 4:
                return new C49169c();
            case 5:
                return f127143c;
            case 6:
                C63010eb ebVar = f127144d;
                if (ebVar == null) {
                    synchronized (C49170d.class) {
                        ebVar = f127144d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127143c);
                            f127144d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
