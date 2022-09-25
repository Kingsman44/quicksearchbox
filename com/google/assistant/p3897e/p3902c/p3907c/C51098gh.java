package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.gh */
/* compiled from: PG */
public final class C51098gh extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51098gh f133009e;

    /* renamed from: f */
    private static volatile C63010eb f133010f;

    /* renamed from: a */
    public int f133011a;

    /* renamed from: b */
    public int f133012b = 0;

    /* renamed from: c */
    public Object f133013c;

    /* renamed from: d */
    public String f133014d = BuildConfig.FLAVOR;

    static {
        C51098gh ghVar = new C51098gh();
        f133009e = ghVar;
        C62942bv.registerDefaultInstance(C51098gh.class, ghVar);
    }

    private C51098gh() {
    }

    /* renamed from: a */
    public final C51058ev mo53517a() {
        if (this.f133012b == 1) {
            return (C51058ev) this.f133013c;
        }
        return C51058ev.f132941o;
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
                return newMessageInfo(f133009e, "\u0001\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ဈ\n\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000", new Object[]{C45240c.f118157a, "b", "a", C51058ev.class, C51066fc.class, C51075fl.class, C51104gn.class, C51089fz.class, "d", C51085fv.class, C51108gr.class, C51094gd.class, C51079fp.class, C51070fg.class});
            case 3:
                return new C51098gh();
            case 4:
                return new C51097gg();
            case 5:
                return f133009e;
            case 6:
                C63010eb ebVar = f133010f;
                if (ebVar == null) {
                    synchronized (C51098gh.class) {
                        ebVar = f133010f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133009e);
                            f133010f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
