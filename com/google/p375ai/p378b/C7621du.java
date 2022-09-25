package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.du */
/* compiled from: PG */
public final class C7621du extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C7621du f26333f;

    /* renamed from: h */
    private static volatile C63010eb f26334h;

    /* renamed from: a */
    public int f26335a;

    /* renamed from: b */
    public String f26336b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f26337c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f26338d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f26339e = emptyProtobufList();

    /* renamed from: g */
    private byte f26340g = 2;

    static {
        C7621du duVar = new C7621du();
        f26333f = duVar;
        C62942bv.registerDefaultInstance(C7621du.class, duVar);
    }

    private C7621du() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f26340g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f26340g = b;
                return null;
            case 2:
                return newMessageInfo(f26333f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004Л", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C7620dt.class});
            case 3:
                return new C7621du();
            case 4:
                return new C7618dr();
            case 5:
                return f26333f;
            case 6:
                C63010eb ebVar = f26334h;
                if (ebVar == null) {
                    synchronized (C7621du.class) {
                        ebVar = f26334h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26333f);
                            f26334h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
