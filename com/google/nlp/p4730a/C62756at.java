package com.google.nlp.p4730a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;

/* renamed from: com.google.nlp.a.at */
/* compiled from: PG */
public final class C62756at extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62756at f169482e;

    /* renamed from: g */
    private static volatile C63010eb f169483g;

    /* renamed from: a */
    public int f169484a;

    /* renamed from: b */
    public int f169485b = 0;

    /* renamed from: c */
    public Object f169486c;

    /* renamed from: d */
    public String f169487d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private byte f169488f = 2;

    static {
        C62756at atVar = new C62756at();
        f169482e = atVar;
        C62942bv.registerDefaultInstance(C62756at.class, atVar);
    }

    private C62756at() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169488f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f169488f = b;
                return null;
            case 2:
                return newMessageInfo(f169482e, "\u0001\u000e\u0001\u0001\u0001\u0011\u000e\u0000\u0000\u0004\u0001ဈ\u0000\u0002ᐼ\u0000\u0003်\u0000\u0004ျ\u0000\u0005ဵ\u0000\u0006ဳ\u0000\t့\u0000\u000bြ\u0000\fြ\u0000\rြ\u0000\u000eြ\u0000\u000fᐼ\u0000\u0010ᐼ\u0000\u0011ᐼ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C62793m.class, C62754ar.class, C62789i.class, C63070h.class, C62760ax.class, C62795o.class, C62758av.class, C62762az.class});
            case 3:
                return new C62756at();
            case 4:
                return new C62755as();
            case 5:
                return f169482e;
            case 6:
                C63010eb ebVar = f169483g;
                if (ebVar == null) {
                    synchronized (C62756at.class) {
                        ebVar = f169483g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169482e);
                            f169483g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
