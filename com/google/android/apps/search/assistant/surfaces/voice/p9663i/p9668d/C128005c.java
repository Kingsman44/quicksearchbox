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

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.d.c */
/* compiled from: PG */
public final class C128005c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62962ci f352272c = new C127949a();

    /* renamed from: e */
    public static final C128005c f352273e;

    /* renamed from: g */
    private static volatile C63010eb f352274g;

    /* renamed from: a */
    public int f352275a;

    /* renamed from: b */
    public C62961ch f352276b = emptyIntList();

    /* renamed from: d */
    public C34053bp f352277d;

    /* renamed from: f */
    private byte f352278f = 2;

    static {
        C128005c cVar = new C128005c();
        f352273e = cVar;
        C62942bv.registerDefaultInstance(C128005c.class, cVar);
    }

    private C128005c() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f352278f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f352278f = b;
                return null;
            case 2:
                return newMessageInfo(f352273e, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0001\u0001,\u0003ᐉ\u0000", new Object[]{"a", "b", C51347ei.m86144b(), "d"});
            case 3:
                return new C128005c();
            case 4:
                return new C128004b();
            case 5:
                return f352273e;
            case 6:
                C63010eb ebVar = f352274g;
                if (ebVar == null) {
                    synchronized (C128005c.class) {
                        ebVar = f352274g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352273e);
                            f352274g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
