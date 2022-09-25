package com.google.assistant.p3861at;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.zp */
/* compiled from: PG */
public final class C50506zp extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C50506zp f131470f;

    /* renamed from: h */
    private static volatile C63010eb f131471h;

    /* renamed from: a */
    public boolean f131472a = true;

    /* renamed from: b */
    public boolean f131473b;

    /* renamed from: c */
    public boolean f131474c;

    /* renamed from: d */
    public boolean f131475d = true;

    /* renamed from: e */
    public boolean f131476e = true;

    /* renamed from: g */
    private int f131477g;

    static {
        C50506zp zpVar = new C50506zp();
        f131470f = zpVar;
        C62942bv.registerDefaultInstance(C50506zp.class, zpVar);
    }

    private C50506zp() {
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
                return newMessageInfo(f131470f, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{C30325g.f82003a, "a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C50506zp();
            case 4:
                return new C50505zo();
            case 5:
                return f131470f;
            case 6:
                C63010eb ebVar = f131471h;
                if (ebVar == null) {
                    synchronized (C50506zp.class) {
                        ebVar = f131471h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131470f);
                            f131471h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
