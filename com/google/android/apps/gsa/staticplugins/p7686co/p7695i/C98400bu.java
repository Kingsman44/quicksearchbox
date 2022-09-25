package com.google.android.apps.gsa.staticplugins.p7686co.p7695i;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.i.bu */
/* compiled from: PG */
public final class C98400bu extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C98400bu f274688f;

    /* renamed from: h */
    private static volatile C63010eb f274689h;

    /* renamed from: a */
    public int f274690a;

    /* renamed from: b */
    public int f274691b;

    /* renamed from: c */
    public C98414ch f274692c;

    /* renamed from: d */
    public C98418cl f274693d;

    /* renamed from: e */
    public String f274694e = BuildConfig.FLAVOR;

    /* renamed from: g */
    private byte f274695g = 2;

    static {
        C98400bu buVar = new C98400bu();
        f274688f = buVar;
        C62942bv.registerDefaultInstance(C98400bu.class, buVar);
    }

    private C98400bu() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f274695g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f274695g = b;
                return null;
            case 2:
                return newMessageInfo(f274688f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001င\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C98400bu();
            case 4:
                return new C98399bt();
            case 5:
                return f274688f;
            case 6:
                C63010eb ebVar = f274689h;
                if (ebVar == null) {
                    synchronized (C98400bu.class) {
                        ebVar = f274689h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f274688f);
                            f274689h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
