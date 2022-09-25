package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.abp */
/* compiled from: PG */
public final class abp extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final abp f128788d;

    /* renamed from: g */
    private static volatile C63010eb f128789g;

    /* renamed from: a */
    public String f128790a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f128791b = true;

    /* renamed from: c */
    public C62971cq f128792c = emptyProtobufList();

    /* renamed from: e */
    private int f128793e;

    /* renamed from: f */
    private byte f128794f = 2;

    static {
        abp abp = new abp();
        f128788d = abp;
        C62942bv.registerDefaultInstance(abp.class, abp);
    }

    private abp() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f128794f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f128794f = b;
                return null;
            case 2:
                return newMessageInfo(f128788d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001ဈ\u0000\u0003ဇ\u0002\u0004Л", new Object[]{"e", "a", "b", C45240c.f118157a, abn.class});
            case 3:
                return new abp();
            case 4:
                return new abo();
            case 5:
                return f128788d;
            case 6:
                C63010eb ebVar = f128789g;
                if (ebVar == null) {
                    synchronized (abp.class) {
                        ebVar = f128789g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128788d);
                            f128789g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
