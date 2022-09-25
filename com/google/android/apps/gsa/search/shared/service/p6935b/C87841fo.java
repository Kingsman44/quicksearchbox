package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.fo */
/* compiled from: PG */
public final class C87841fo extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C87841fo f237661f;

    /* renamed from: g */
    public static final C62940bt f237662g;

    /* renamed from: h */
    private static volatile C63010eb f237663h;

    /* renamed from: a */
    public int f237664a;

    /* renamed from: b */
    public String f237665b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f237666c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C63088z f237667d = C63088z.f170246b;

    /* renamed from: e */
    public String f237668e = BuildConfig.FLAVOR;

    static {
        C87841fo foVar = new C87841fo();
        f237661f = foVar;
        C62942bv.registerDefaultInstance(C87841fo.class, foVar);
        f237662g = C62942bv.newSingularGeneratedExtension(C87741bw.f237477c, foVar, foVar, (C62958ce) null, 146042611, C63066gd.MESSAGE, C87841fo.class);
    }

    private C87841fo() {
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
                return newMessageInfo(f237661f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C87841fo();
            case 4:
                return new C87840fn();
            case 5:
                return f237661f;
            case 6:
                C63010eb ebVar = f237663h;
                if (ebVar == null) {
                    synchronized (C87841fo.class) {
                        ebVar = f237663h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237661f);
                            f237663h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
