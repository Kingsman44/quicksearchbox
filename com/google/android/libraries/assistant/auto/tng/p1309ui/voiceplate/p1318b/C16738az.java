package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.az */
/* compiled from: PG */
public final class C16738az extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C16738az f48952d;

    /* renamed from: e */
    private static volatile C63010eb f48953e;

    /* renamed from: a */
    public int f48954a;

    /* renamed from: b */
    public C62971cq f48955b = emptyProtobufList();

    /* renamed from: c */
    public String f48956c = BuildConfig.FLAVOR;

    static {
        C16738az azVar = new C16738az();
        f48952d = azVar;
        C62942bv.registerDefaultInstance(C16738az.class, azVar);
    }

    private C16738az() {
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
                return newMessageInfo(f48952d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"a", "b", C16742bc.class, C45240c.f118157a});
            case 3:
                return new C16738az();
            case 4:
                return new C16737ay();
            case 5:
                return f48952d;
            case 6:
                C63010eb ebVar = f48953e;
                if (ebVar == null) {
                    synchronized (C16738az.class) {
                        ebVar = f48953e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48952d);
                            f48953e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
