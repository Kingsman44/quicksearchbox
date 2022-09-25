package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p965b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.b.l */
/* compiled from: PG */
public final class C13458l extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C13458l f41299e;

    /* renamed from: f */
    private static volatile C63010eb f41300f;

    /* renamed from: a */
    public C62971cq f41301a = emptyProtobufList();

    /* renamed from: b */
    public int f41302b;

    /* renamed from: c */
    public String f41303c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public float f41304d;

    static {
        C13458l lVar = new C13458l();
        f41299e = lVar;
        C62942bv.registerDefaultInstance(C13458l.class, lVar);
    }

    private C13458l() {
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
                return newMessageInfo(f41299e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002\f\u0003Ȉ\u0004\u0001", new Object[]{"a", C13457k.class, "b", C45240c.f118157a, "d"});
            case 3:
                return new C13458l();
            case 4:
                return new C13455i();
            case 5:
                return f41299e;
            case 6:
                C63010eb ebVar = f41300f;
                if (ebVar == null) {
                    synchronized (C13458l.class) {
                        ebVar = f41300f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f41299e);
                            f41300f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
