package com.google.android.ssb;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4671b.C61790ai;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.ssb.d */
/* compiled from: PG */
public final class C45347d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C45347d f118533e;

    /* renamed from: g */
    private static volatile C63010eb f118534g;

    /* renamed from: a */
    public int f118535a;

    /* renamed from: b */
    public C61790ai f118536b;

    /* renamed from: c */
    public String f118537c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f118538d;

    /* renamed from: f */
    private byte f118539f = 2;

    static {
        C45347d dVar = new C45347d();
        f118533e = dVar;
        C62942bv.registerDefaultInstance(C45347d.class, dVar);
    }

    private C45347d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f118539f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f118539f = b;
                return null;
            case 2:
                return newMessageInfo(f118533e, "\u0001\u0003\u0000\u0001\u0002\u0006\u0003\u0000\u0000\u0001\u0002ᐉ\u0001\u0004ဈ\u0003\u0006ဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C45347d();
            case 4:
                return new C45346c();
            case 5:
                return f118533e;
            case 6:
                C63010eb ebVar = f118534g;
                if (ebVar == null) {
                    synchronized (C45347d.class) {
                        ebVar = f118534g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f118533e);
                            f118534g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
