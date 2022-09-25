package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput;

import com.google.assistant.p3897e.p3921j.p3922a.C51648f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.ah */
/* compiled from: PG */
public final class C130087ah extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C130087ah f356705b;

    /* renamed from: c */
    private static volatile C63010eb f356706c;

    /* renamed from: a */
    public C62971cq f356707a = emptyProtobufList();

    static {
        C130087ah ahVar = new C130087ah();
        f356705b = ahVar;
        C62942bv.registerDefaultInstance(C130087ah.class, ahVar);
    }

    private C130087ah() {
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
                return newMessageInfo(f356705b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C51648f.class});
            case 3:
                return new C130087ah();
            case 4:
                return new C130086ag();
            case 5:
                return f356705b;
            case 6:
                C63010eb ebVar = f356706c;
                if (ebVar == null) {
                    synchronized (C130087ah.class) {
                        ebVar = f356706c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f356705b);
                            f356706c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
