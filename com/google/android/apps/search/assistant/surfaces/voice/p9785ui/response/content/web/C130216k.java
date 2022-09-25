package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.content.web;

import com.google.assistant.p3897e.p3921j.p3926e.C51971fx;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.content.web.k */
/* compiled from: PG */
public final class C130216k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C130216k f356979c;

    /* renamed from: d */
    private static volatile C63010eb f356980d;

    /* renamed from: a */
    public int f356981a;

    /* renamed from: b */
    public C51971fx f356982b;

    static {
        C130216k kVar = new C130216k();
        f356979c = kVar;
        C62942bv.registerDefaultInstance(C130216k.class, kVar);
    }

    private C130216k() {
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
                return newMessageInfo(f356979c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C130216k();
            case 4:
                return new C130215j();
            case 5:
                return f356979c;
            case 6:
                C63010eb ebVar = f356980d;
                if (ebVar == null) {
                    synchronized (C130216k.class) {
                        ebVar = f356980d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f356979c);
                            f356980d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
