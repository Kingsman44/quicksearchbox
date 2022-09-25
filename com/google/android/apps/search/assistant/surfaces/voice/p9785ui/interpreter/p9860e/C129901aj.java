package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e;

import com.google.assistant.p3897e.p3921j.p3926e.C51910dq;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.aj */
/* compiled from: PG */
public final class C129901aj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C129901aj f356346c;

    /* renamed from: d */
    private static volatile C63010eb f356347d;

    /* renamed from: a */
    public C129966q f356348a;

    /* renamed from: b */
    public C51910dq f356349b;

    static {
        C129901aj ajVar = new C129901aj();
        f356346c = ajVar;
        C62942bv.registerDefaultInstance(C129901aj.class, ajVar);
    }

    private C129901aj() {
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
                return newMessageInfo(f356346c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C129901aj();
            case 4:
                return new C129900ai();
            case 5:
                return f356346c;
            case 6:
                C63010eb ebVar = f356347d;
                if (ebVar == null) {
                    synchronized (C129901aj.class) {
                        ebVar = f356347d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f356346c);
                            f356347d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
