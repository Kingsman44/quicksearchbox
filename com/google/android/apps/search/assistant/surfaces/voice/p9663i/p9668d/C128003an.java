package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.assistant.p3897e.p3917i.p3918a.C51347ei;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.d.an */
/* compiled from: PG */
public final class C128003an extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62962ci f352265c = new C128001al();

    /* renamed from: e */
    public static final C128003an f352266e;

    /* renamed from: g */
    private static volatile C63010eb f352267g;

    /* renamed from: a */
    public int f352268a;

    /* renamed from: b */
    public C62961ch f352269b = emptyIntList();

    /* renamed from: d */
    public C34053bp f352270d;

    /* renamed from: f */
    private byte f352271f = 2;

    static {
        C128003an anVar = new C128003an();
        f352266e = anVar;
        C62942bv.registerDefaultInstance(C128003an.class, anVar);
    }

    private C128003an() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f352271f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f352271f = b;
                return null;
            case 2:
                return newMessageInfo(f352266e, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0001\u0001,\u0003ᐉ\u0000", new Object[]{"a", "b", C51347ei.m86144b(), "d"});
            case 3:
                return new C128003an();
            case 4:
                return new C128002am();
            case 5:
                return f352266e;
            case 6:
                C63010eb ebVar = f352267g;
                if (ebVar == null) {
                    synchronized (C128003an.class) {
                        ebVar = f352267g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352266e);
                            f352267g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
