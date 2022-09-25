package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.p9867a.C130078w;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.al */
/* compiled from: PG */
public final class C130091al extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C130091al f356716b;

    /* renamed from: d */
    private static volatile C63010eb f356717d;

    /* renamed from: a */
    public C62971cq f356718a = emptyProtobufList();

    /* renamed from: c */
    private byte f356719c = 2;

    static {
        C130091al alVar = new C130091al();
        f356716b = alVar;
        C62942bv.registerDefaultInstance(C130091al.class, alVar);
    }

    private C130091al() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f356719c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f356719c = b;
                return null;
            case 2:
                return newMessageInfo(f356716b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C130078w.class});
            case 3:
                return new C130091al();
            case 4:
                return new C130090ak();
            case 5:
                return f356716b;
            case 6:
                C63010eb ebVar = f356717d;
                if (ebVar == null) {
                    synchronized (C130091al.class) {
                        ebVar = f356717d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f356716b);
                            f356717d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
