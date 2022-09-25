package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.js */
/* compiled from: PG */
public final class C55204js extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55204js f145297c;

    /* renamed from: d */
    public static final C62940bt f145298d;

    /* renamed from: f */
    private static volatile C63010eb f145299f;

    /* renamed from: a */
    public String f145300a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f145301b = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f145302e;

    static {
        C55204js jsVar = new C55204js();
        f145297c = jsVar;
        C62942bv.registerDefaultInstance(C55204js.class, jsVar);
        f145298d = C62942bv.newRepeatedGeneratedExtension(C55208jw.f145315y, jsVar, (C62958ce) null, 105713908, C63066gd.MESSAGE, false, C55204js.class);
    }

    private C55204js() {
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
                return newMessageInfo(f145297c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"e", "a", "b"});
            case 3:
                return new C55204js();
            case 4:
                return new C55203jr();
            case 5:
                return f145297c;
            case 6:
                C63010eb ebVar = f145299f;
                if (ebVar == null) {
                    synchronized (C55204js.class) {
                        ebVar = f145299f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145297c);
                            f145299f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
