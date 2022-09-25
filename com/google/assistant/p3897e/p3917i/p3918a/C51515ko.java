package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.ko */
/* compiled from: PG */
public final class C51515ko extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51515ko f134212e;

    /* renamed from: g */
    private static volatile C63010eb f134213g;

    /* renamed from: a */
    public int f134214a;

    /* renamed from: b */
    public C51513km f134215b;

    /* renamed from: c */
    public C51509ki f134216c;

    /* renamed from: d */
    public String f134217d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private byte f134218f = 2;

    static {
        C51515ko koVar = new C51515ko();
        f134212e = koVar;
        C62942bv.registerDefaultInstance(C51515ko.class, koVar);
    }

    private C51515ko() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f134218f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f134218f = b;
                return null;
            case 2:
                return newMessageInfo(f134212e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0002\u0002ᐉ\u0000\u0003ᐉ\u0001\u0004ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C51515ko();
            case 4:
                return new C51514kn();
            case 5:
                return f134212e;
            case 6:
                C63010eb ebVar = f134213g;
                if (ebVar == null) {
                    synchronized (C51515ko.class) {
                        ebVar = f134213g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134212e);
                            f134213g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
