package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13530f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.bn */
/* compiled from: PG */
public final class C87732bn extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C87732bn f237214d;

    /* renamed from: e */
    private static volatile C63010eb f237215e;

    /* renamed from: a */
    public int f237216a;

    /* renamed from: b */
    public C62971cq f237217b = emptyProtobufList();

    /* renamed from: c */
    public C51809dy f237218c;

    static {
        C87732bn bnVar = new C87732bn();
        f237214d = bnVar;
        C62942bv.registerDefaultInstance(C87732bn.class, bnVar);
    }

    private C87732bn() {
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
                return newMessageInfo(f237214d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", C13530f.class, C45240c.f118157a});
            case 3:
                return new C87732bn();
            case 4:
                return new C87731bm();
            case 5:
                return f237214d;
            case 6:
                C63010eb ebVar = f237215e;
                if (ebVar == null) {
                    synchronized (C87732bn.class) {
                        ebVar = f237215e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237214d);
                            f237215e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
