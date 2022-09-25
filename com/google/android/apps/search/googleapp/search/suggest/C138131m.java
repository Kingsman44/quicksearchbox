package com.google.android.apps.search.googleapp.search.suggest;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.m */
/* compiled from: PG */
public final class C138131m extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C138131m f375814f;

    /* renamed from: h */
    private static volatile C63010eb f375815h;

    /* renamed from: a */
    public int f375816a;

    /* renamed from: b */
    public String f375817b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f375818c = emptyProtobufList();

    /* renamed from: d */
    public C138542t f375819d;

    /* renamed from: e */
    public C138133o f375820e;

    /* renamed from: g */
    private byte f375821g = 2;

    static {
        C138131m mVar = new C138131m();
        f375814f = mVar;
        C62942bv.registerDefaultInstance(C138131m.class, mVar);
    }

    private C138131m() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f375821g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f375821g = b;
                return null;
            case 2:
                return newMessageInfo(f375814f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, C138015ag.class, "d", "e"});
            case 3:
                return new C138131m();
            case 4:
                return new C138130l();
            case 5:
                return f375814f;
            case 6:
                C63010eb ebVar = f375815h;
                if (ebVar == null) {
                    synchronized (C138131m.class) {
                        ebVar = f375815h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f375814f);
                            f375815h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
