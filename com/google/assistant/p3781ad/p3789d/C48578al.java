package com.google.assistant.p3781ad.p3789d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.al */
/* compiled from: PG */
public final class C48578al extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48578al f125505d;

    /* renamed from: f */
    private static volatile C63010eb f125506f;

    /* renamed from: a */
    public int f125507a;

    /* renamed from: b */
    public String f125508b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f125509c = emptyProtobufList();

    /* renamed from: e */
    private byte f125510e = 2;

    static {
        C48578al alVar = new C48578al();
        f125505d = alVar;
        C62942bv.registerDefaultInstance(C48578al.class, alVar);
    }

    private C48578al() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f125510e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f125510e = b;
                return null;
            case 2:
                return newMessageInfo(f125505d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဈ\u0000\u0002Л", new Object[]{"a", "b", C45240c.f118157a, C48576aj.class});
            case 3:
                return new C48578al();
            case 4:
                return new C48577ak();
            case 5:
                return f125505d;
            case 6:
                C63010eb ebVar = f125506f;
                if (ebVar == null) {
                    synchronized (C48578al.class) {
                        ebVar = f125506f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125505d);
                            f125506f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
