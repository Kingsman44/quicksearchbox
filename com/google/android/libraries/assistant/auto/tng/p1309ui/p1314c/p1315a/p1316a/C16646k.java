package com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a;

import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.c.a.a.k */
/* compiled from: PG */
public final class C16646k extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C16646k f48751g;

    /* renamed from: i */
    private static volatile C63010eb f48752i;

    /* renamed from: a */
    public int f48753a;

    /* renamed from: b */
    public C16632ad f48754b;

    /* renamed from: c */
    public C16632ad f48755c;

    /* renamed from: d */
    public C16654s f48756d;

    /* renamed from: e */
    public C16744be f48757e;

    /* renamed from: f */
    public boolean f48758f;

    /* renamed from: h */
    private byte f48759h = 2;

    static {
        C16646k kVar = new C16646k();
        f48751g = kVar;
        C62942bv.registerDefaultInstance(C16646k.class, kVar);
    }

    private C16646k() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f48759h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f48759h = b;
                return null;
            case 2:
                return newMessageInfo(f48751g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0002\u0004ဇ\u0004\u0005ᐉ\u0003\u0006ဉ\u0001", new Object[]{"a", "b", "d", C10662f.f35572a, "e", C45240c.f118157a});
            case 3:
                return new C16646k();
            case 4:
                return new C16645j();
            case 5:
                return f48751g;
            case 6:
                C63010eb ebVar = f48752i;
                if (ebVar == null) {
                    synchronized (C16646k.class) {
                        ebVar = f48752i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48751g);
                            f48752i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
