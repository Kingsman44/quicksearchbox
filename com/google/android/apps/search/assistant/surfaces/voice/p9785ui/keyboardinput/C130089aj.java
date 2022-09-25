package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.aj */
/* compiled from: PG */
public final class C130089aj extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C130089aj f356708f;

    /* renamed from: h */
    private static volatile C63010eb f356709h;

    /* renamed from: a */
    public int f356710a;

    /* renamed from: b */
    public int f356711b = 0;

    /* renamed from: c */
    public Object f356712c;

    /* renamed from: d */
    public int f356713d;

    /* renamed from: e */
    public int f356714e;

    /* renamed from: g */
    private byte f356715g = 2;

    static {
        C130089aj ajVar = new C130089aj();
        f356708f = ajVar;
        C62942bv.registerDefaultInstance(C130089aj.class, ajVar);
    }

    private C130089aj() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f356715g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f356715g = b;
                return null;
            case 2:
                return newMessageInfo(f356708f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᐼ\u0000\u0002ြ\u0000\u0003င\u0002\u0004င\u0003", new Object[]{C45240c.f118157a, "b", "a", C130091al.class, C130087ah.class, "d", "e"});
            case 3:
                return new C130089aj();
            case 4:
                return new C130088ai();
            case 5:
                return f356708f;
            case 6:
                C63010eb ebVar = f356709h;
                if (ebVar == null) {
                    synchronized (C130089aj.class) {
                        ebVar = f356709h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f356708f);
                            f356709h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
