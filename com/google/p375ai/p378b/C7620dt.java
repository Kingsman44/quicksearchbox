package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.dt */
/* compiled from: PG */
public final class C7620dt extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C7620dt f26326d;

    /* renamed from: g */
    private static volatile C63010eb f26327g;

    /* renamed from: a */
    public int f26328a = 0;

    /* renamed from: b */
    public Object f26329b;

    /* renamed from: c */
    public String f26330c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f26331e;

    /* renamed from: f */
    private byte f26332f = 2;

    static {
        C7620dt dtVar = new C7620dt();
        f26326d = dtVar;
        C62942bv.registerDefaultInstance(C7620dt.class, dtVar);
    }

    private C7620dt() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f26332f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f26332f = b;
                return null;
            case 2:
                return newMessageInfo(f26326d, "\u0001\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0003ြ\u0000\u0004ᐼ\u0000\u0005ြ\u0000", new Object[]{"b", "a", "e", C45240c.f118157a, C7577cd.class, C7605de.class, C7617dq.class});
            case 3:
                return new C7620dt();
            case 4:
                return new C7619ds();
            case 5:
                return f26326d;
            case 6:
                C63010eb ebVar = f26327g;
                if (ebVar == null) {
                    synchronized (C7620dt.class) {
                        ebVar = f26327g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26326d);
                            f26327g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
