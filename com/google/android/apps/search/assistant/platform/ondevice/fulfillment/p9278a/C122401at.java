package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.at */
/* compiled from: PG */
public final class C122401at extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C122401at f339337e;

    /* renamed from: g */
    private static volatile C63010eb f339338g;

    /* renamed from: a */
    public C122445cj f339339a;

    /* renamed from: b */
    public C122419bk f339340b;

    /* renamed from: c */
    public C122454i f339341c;

    /* renamed from: d */
    public int f339342d;

    /* renamed from: f */
    private byte f339343f = 2;

    static {
        C122401at atVar = new C122401at();
        f339337e = atVar;
        C62942bv.registerDefaultInstance(C122401at.class, atVar);
    }

    private C122401at() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f339343f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f339343f = b;
                return null;
            case 2:
                return newMessageInfo(f339337e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0001\u0001\t\u0002\t\u0003Љ\u0004\f", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C122401at();
            case 4:
                return new C122400as();
            case 5:
                return f339337e;
            case 6:
                C63010eb ebVar = f339338g;
                if (ebVar == null) {
                    synchronized (C122401at.class) {
                        ebVar = f339338g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339337e);
                            f339338g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
