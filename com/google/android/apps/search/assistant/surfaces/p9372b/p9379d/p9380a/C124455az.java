package com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.d.a.az */
/* compiled from: PG */
public final class C124455az extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C124455az f343464c;

    /* renamed from: e */
    private static volatile C63010eb f343465e;

    /* renamed from: a */
    public int f343466a = 0;

    /* renamed from: b */
    public Object f343467b;

    /* renamed from: d */
    private byte f343468d = 2;

    static {
        C124455az azVar = new C124455az();
        f343464c = azVar;
        C62942bv.registerDefaultInstance(C124455az.class, azVar);
    }

    private C124455az() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f343468d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f343468d = b;
                return null;
            case 2:
                return newMessageInfo(f343464c, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0001\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005м\u0000", new Object[]{"b", "a", C124452aw.class, C124445ap.class, C124454ay.class, C124447ar.class, C124450au.class});
            case 3:
                return new C124455az();
            case 4:
                return new C124448as();
            case 5:
                return f343464c;
            case 6:
                C63010eb ebVar = f343465e;
                if (ebVar == null) {
                    synchronized (C124455az.class) {
                        ebVar = f343465e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f343464c);
                            f343465e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
