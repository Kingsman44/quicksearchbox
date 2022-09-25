package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e;

import com.google.protobuf.C62912at;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.ba */
/* compiled from: PG */
public final class C129926ba extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C129926ba f356387c;

    /* renamed from: d */
    private static volatile C63010eb f356388d;

    /* renamed from: a */
    public int f356389a = 0;

    /* renamed from: b */
    public Object f356390b;

    static {
        C129926ba baVar = new C129926ba();
        f356387c = baVar;
        C62942bv.registerDefaultInstance(C129926ba.class, baVar);
    }

    private C129926ba() {
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
                return newMessageInfo(f356387c, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"b", "a", C62912at.class, C62912at.class, C129917az.class});
            case 3:
                return new C129926ba();
            case 4:
                return new C129915ax();
            case 5:
                return f356387c;
            case 6:
                C63010eb ebVar = f356388d;
                if (ebVar == null) {
                    synchronized (C129926ba.class) {
                        ebVar = f356388d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f356387c);
                            f356388d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
