package com.google.knowledge.p4671b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4152bb.p4153a.C54946ad;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.b.aa */
/* compiled from: PG */
public final class C61782aa extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C61782aa f166880d;

    /* renamed from: g */
    private static volatile C63010eb f166881g;

    /* renamed from: a */
    public int f166882a;

    /* renamed from: b */
    public int f166883b;

    /* renamed from: c */
    public String f166884c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private C54946ad f166885e;

    /* renamed from: f */
    private byte f166886f = 2;

    static {
        C61782aa aaVar = new C61782aa();
        f166880d = aaVar;
        C62942bv.registerDefaultInstance(C61782aa.class, aaVar);
    }

    private C61782aa() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f166886f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f166886f = b;
                return null;
            case 2:
                return newMessageInfo(f166880d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001င\u0000\u0003ဈ\u0002\u0004ᐉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "e"});
            case 3:
                return new C61782aa();
            case 4:
                return new C61833z();
            case 5:
                return f166880d;
            case 6:
                C63010eb ebVar = f166881g;
                if (ebVar == null) {
                    synchronized (C61782aa.class) {
                        ebVar = f166881g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166880d);
                            f166881g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
