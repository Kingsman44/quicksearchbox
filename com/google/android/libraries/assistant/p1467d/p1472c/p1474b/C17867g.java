package com.google.android.libraries.assistant.p1467d.p1472c.p1474b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17881ak;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.d.c.b.g */
/* compiled from: PG */
public final class C17867g extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C17867g f51196f;

    /* renamed from: h */
    private static volatile C63010eb f51197h;

    /* renamed from: a */
    public int f51198a;

    /* renamed from: b */
    public String f51199b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C17881ak f51200c;

    /* renamed from: d */
    public boolean f51201d;

    /* renamed from: e */
    public boolean f51202e;

    /* renamed from: g */
    private byte f51203g = 2;

    static {
        C17867g gVar = new C17867g();
        f51196f = gVar;
        C62942bv.registerDefaultInstance(C17867g.class, gVar);
    }

    private C17867g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f51203g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f51203g = b;
                return null;
            case 2:
                return newMessageInfo(f51196f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C17867g();
            case 4:
                return new C17866f();
            case 5:
                return f51196f;
            case 6:
                C63010eb ebVar = f51197h;
                if (ebVar == null) {
                    synchronized (C17867g.class) {
                        ebVar = f51197h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f51196f);
                            f51197h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
