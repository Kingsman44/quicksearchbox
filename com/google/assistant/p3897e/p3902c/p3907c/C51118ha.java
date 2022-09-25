package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.ha */
/* compiled from: PG */
public final class C51118ha extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C51118ha f133049g;

    /* renamed from: i */
    private static volatile C63010eb f133050i;

    /* renamed from: a */
    public int f133051a;

    /* renamed from: b */
    public int f133052b = 0;

    /* renamed from: c */
    public Object f133053c;

    /* renamed from: d */
    public String f133054d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C51012dc f133055e;

    /* renamed from: f */
    public int f133056f;

    /* renamed from: h */
    private byte f133057h = 2;

    static {
        C51118ha haVar = new C51118ha();
        f133049g = haVar;
        C62942bv.registerDefaultInstance(C51118ha.class, haVar);
    }

    private C51118ha() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f133057h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f133057h = b;
                return null;
            case 2:
                return newMessageInfo(f133049g, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐼ\u0000\u0004ြ\u0000\u0005င\u0004", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C51016dg.class, C51098gh.class, C10662f.f35572a});
            case 3:
                return new C51118ha();
            case 4:
                return new C51116gz();
            case 5:
                return f133049g;
            case 6:
                C63010eb ebVar = f133050i;
                if (ebVar == null) {
                    synchronized (C51118ha.class) {
                        ebVar = f133050i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133049g);
                            f133050i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
