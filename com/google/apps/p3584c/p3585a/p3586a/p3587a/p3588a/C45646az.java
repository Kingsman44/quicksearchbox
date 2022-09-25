package com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.c.a.a.a.a.az */
/* compiled from: PG */
public final class C45646az extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C45646az f120085f;

    /* renamed from: g */
    private static volatile C63010eb f120086g;

    /* renamed from: a */
    public int f120087a;

    /* renamed from: b */
    public long f120088b;

    /* renamed from: c */
    public String f120089c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f120090d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C45670p f120091e;

    static {
        C45646az azVar = new C45646az();
        f120085f = azVar;
        C62942bv.registerDefaultInstance(C45646az.class, azVar);
    }

    private C45646az() {
        emptyProtobufList();
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
                return newMessageInfo(f120085f, "\u0001\u0004\u0000\u0001\u0001\t\u0004\u0000\u0000\u0000\u0001ဈ\u0002\u0002ဈ\u0003\u0004ဂ\u0001\tဉ\b", new Object[]{"a", C45240c.f118157a, "d", "b", "e"});
            case 3:
                return new C45646az();
            case 4:
                return new C45645ay();
            case 5:
                return f120085f;
            case 6:
                C63010eb ebVar = f120086g;
                if (ebVar == null) {
                    synchronized (C45646az.class) {
                        ebVar = f120086g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f120085f);
                            f120086g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
