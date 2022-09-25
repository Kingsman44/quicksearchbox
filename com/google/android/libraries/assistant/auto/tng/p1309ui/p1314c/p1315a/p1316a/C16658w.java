package com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.c.a.a.w */
/* compiled from: PG */
public final class C16658w extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C16658w f48787e;

    /* renamed from: g */
    private static volatile C63010eb f48788g;

    /* renamed from: a */
    public int f48789a;

    /* renamed from: b */
    public String f48790b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C16654s f48791c;

    /* renamed from: d */
    public C16744be f48792d;

    /* renamed from: f */
    private byte f48793f = 2;

    static {
        C16658w wVar = new C16658w();
        f48787e = wVar;
        C62942bv.registerDefaultInstance(C16658w.class, wVar);
    }

    private C16658w() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f48793f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f48793f = b;
                return null;
            case 2:
                return newMessageInfo(f48787e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဉ\u0002\u0005ᐉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C16658w();
            case 4:
                return new C16657v();
            case 5:
                return f48787e;
            case 6:
                C63010eb ebVar = f48788g;
                if (ebVar == null) {
                    synchronized (C16658w.class) {
                        ebVar = f48788g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48787e);
                            f48788g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
