package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.ah */
/* compiled from: PG */
public final class C16720ah extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C16720ah f48888b;

    /* renamed from: c */
    private static volatile C63010eb f48889c;

    /* renamed from: a */
    public C62971cq f48890a = C62942bv.emptyProtobufList();

    static {
        C16720ah ahVar = new C16720ah();
        f48888b = ahVar;
        C62942bv.registerDefaultInstance(C16720ah.class, ahVar);
    }

    private C16720ah() {
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
                return newMessageInfo(f48888b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C16720ah();
            case 4:
                return new C16719ag();
            case 5:
                return f48888b;
            case 6:
                C63010eb ebVar = f48889c;
                if (ebVar == null) {
                    synchronized (C16720ah.class) {
                        ebVar = f48889c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48888b);
                            f48889c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
