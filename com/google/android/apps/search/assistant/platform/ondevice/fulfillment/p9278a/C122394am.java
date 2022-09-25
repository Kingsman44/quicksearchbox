package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.am */
/* compiled from: PG */
public final class C122394am extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C122394am f339314f;

    /* renamed from: h */
    private static volatile C63010eb f339315h;

    /* renamed from: a */
    public C122461p f339316a;

    /* renamed from: b */
    public int f339317b;

    /* renamed from: c */
    public C52091ex f339318c;

    /* renamed from: d */
    public C122454i f339319d;

    /* renamed from: e */
    public int f339320e;

    /* renamed from: g */
    private byte f339321g = 2;

    static {
        C122394am amVar = new C122394am();
        f339314f = amVar;
        C62942bv.registerDefaultInstance(C122394am.class, amVar);
    }

    private C122394am() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f339321g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f339321g = b;
                return null;
            case 2:
                return newMessageInfo(f339314f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0001\u0001\t\u0002\u0004\u0003\t\u0004Љ\u0005\f", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C122394am();
            case 4:
                return new C122393al();
            case 5:
                return f339314f;
            case 6:
                C63010eb ebVar = f339315h;
                if (ebVar == null) {
                    synchronized (C122394am.class) {
                        ebVar = f339315h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339314f);
                            f339315h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
