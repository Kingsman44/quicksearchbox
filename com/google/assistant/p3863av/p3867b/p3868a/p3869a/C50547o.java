package com.google.assistant.p3863av.p3867b.p3868a.p3869a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.av.b.a.a.o */
/* compiled from: PG */
public final class C50547o extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50547o f131554e;

    /* renamed from: h */
    private static volatile C63010eb f131555h;

    /* renamed from: a */
    public int f131556a;

    /* renamed from: b */
    public C50544l f131557b;

    /* renamed from: c */
    public C50536d f131558c;

    /* renamed from: d */
    public String f131559d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private C50546n f131560f;

    /* renamed from: g */
    private byte f131561g = 2;

    static {
        C50547o oVar = new C50547o();
        f131554e = oVar;
        C62942bv.registerDefaultInstance(C50547o.class, oVar);
    }

    private C50547o() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f131561g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f131561g = b;
                return null;
            case 2:
                return newMessageInfo(f131554e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဈ\u0003\u0004ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C10662f.f35572a});
            case 3:
                return new C50547o();
            case 4:
                return new C50541i();
            case 5:
                return f131554e;
            case 6:
                C63010eb ebVar = f131555h;
                if (ebVar == null) {
                    synchronized (C50547o.class) {
                        ebVar = f131555h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131554e);
                            f131555h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
