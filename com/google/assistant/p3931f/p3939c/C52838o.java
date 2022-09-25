package com.google.assistant.p3931f.p3939c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63037fb;

/* renamed from: com.google.assistant.f.c.o */
/* compiled from: PG */
public final class C52838o extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C52838o f138633f;

    /* renamed from: g */
    private static volatile C63010eb f138634g;

    /* renamed from: a */
    public int f138635a;

    /* renamed from: b */
    public String f138636b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f138637c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f138638d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public C63037fb f138639e;

    static {
        C52838o oVar = new C52838o();
        f138633f = oVar;
        C62942bv.registerDefaultInstance(C52838o.class, oVar);
    }

    private C52838o() {
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
                return newMessageInfo(f138633f, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ለ\u0000\u0002Ȉ\u0003Ț\u0004\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C52838o();
            case 4:
                return new C52837n();
            case 5:
                return f138633f;
            case 6:
                C63010eb ebVar = f138634g;
                if (ebVar == null) {
                    synchronized (C52838o.class) {
                        ebVar = f138634g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138633f);
                            f138634g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
