package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16730ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.bf */
/* compiled from: PG */
public final class C87724bf extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87724bf f237198c;

    /* renamed from: d */
    private static volatile C63010eb f237199d;

    /* renamed from: a */
    public int f237200a;

    /* renamed from: b */
    public int f237201b;

    static {
        C87724bf bfVar = new C87724bf();
        f237198c = bfVar;
        C62942bv.registerDefaultInstance(C87724bf.class, bfVar);
    }

    private C87724bf() {
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
                return newMessageInfo(f237198c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C16730ar.m33789b()});
            case 3:
                return new C87724bf();
            case 4:
                return new C87723be();
            case 5:
                return f237198c;
            case 6:
                C63010eb ebVar = f237199d;
                if (ebVar == null) {
                    synchronized (C87724bf.class) {
                        ebVar = f237199d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237198c);
                            f237199d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
