package com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a;

import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.c.a.a.u */
/* compiled from: PG */
public final class C16656u extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C16656u f48779f;

    /* renamed from: h */
    private static volatile C63010eb f48780h;

    /* renamed from: a */
    public int f48781a;

    /* renamed from: b */
    public C16632ad f48782b;

    /* renamed from: c */
    public C16632ad f48783c;

    /* renamed from: d */
    public C16654s f48784d;

    /* renamed from: e */
    public C16744be f48785e;

    /* renamed from: g */
    private byte f48786g = 2;

    static {
        C16656u uVar = new C16656u();
        f48779f = uVar;
        C62942bv.registerDefaultInstance(C16656u.class, uVar);
    }

    private C16656u() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f48786g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f48786g = b;
                return null;
            case 2:
                return newMessageInfo(f48779f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0002\u0005ᐉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C16656u();
            case 4:
                return new C16655t();
            case 5:
                return f48779f;
            case 6:
                C63010eb ebVar = f48780h;
                if (ebVar == null) {
                    synchronized (C16656u.class) {
                        ebVar = f48780h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48779f);
                            f48780h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
