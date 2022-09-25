package com.google.assistant.p3838ao.p3839a.p3845e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ao.a.e.cg */
/* compiled from: PG */
public final class C49577cg extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49577cg f127922d;

    /* renamed from: g */
    private static volatile C63010eb f127923g;

    /* renamed from: a */
    public int f127924a = 0;

    /* renamed from: b */
    public Object f127925b;

    /* renamed from: c */
    public String f127926c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f127927e;

    /* renamed from: f */
    private byte f127928f = 2;

    static {
        C49577cg cgVar = new C49577cg();
        f127922d = cgVar;
        C62942bv.registerDefaultInstance(C49577cg.class, cgVar);
    }

    private C49577cg() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f127928f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f127928f = b;
                return null;
            case 2:
                return newMessageInfo(f127922d, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐼ\u0000\u0003ᐼ\u0000", new Object[]{"b", "a", "e", C45240c.f118157a, C49626q.class, C49626q.class});
            case 3:
                return new C49577cg();
            case 4:
                return new C49576cf();
            case 5:
                return f127922d;
            case 6:
                C63010eb ebVar = f127923g;
                if (ebVar == null) {
                    synchronized (C49577cg.class) {
                        ebVar = f127923g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127922d);
                            f127923g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
