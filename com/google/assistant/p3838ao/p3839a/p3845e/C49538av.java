package com.google.assistant.p3838ao.p3839a.p3845e;

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

/* renamed from: com.google.assistant.ao.a.e.av */
/* compiled from: PG */
public final class C49538av extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C49538av f127818f;

    /* renamed from: g */
    public static final C62940bt f127819g;

    /* renamed from: h */
    private static volatile C63010eb f127820h;

    /* renamed from: a */
    public int f127821a;

    /* renamed from: b */
    public String f127822b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f127823c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f127824d;

    /* renamed from: e */
    public C49534ar f127825e;

    static {
        C49538av avVar = new C49538av();
        f127818f = avVar;
        C62942bv.registerDefaultInstance(C49538av.class, avVar);
        f127819g = C62942bv.newSingularGeneratedExtension(C49520ad.f127756b, avVar, avVar, (C62958ce) null, 271568887, C63066gd.MESSAGE, C49538av.class);
    }

    private C49538av() {
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
                return newMessageInfo(f127818f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0005င\u0004\u0006ဉ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C49538av();
            case 4:
                return new C49537au();
            case 5:
                return f127818f;
            case 6:
                C63010eb ebVar = f127820h;
                if (ebVar == null) {
                    synchronized (C49538av.class) {
                        ebVar = f127820h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127818f);
                            f127820h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
