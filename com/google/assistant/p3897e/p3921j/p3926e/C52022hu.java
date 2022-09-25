package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.j.e.hu */
/* compiled from: PG */
public final class C52022hu extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C52022hu f136532f;

    /* renamed from: g */
    private static volatile C63010eb f136533g;

    /* renamed from: a */
    public int f136534a;

    /* renamed from: b */
    public String f136535b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f136536c;

    /* renamed from: d */
    public float f136537d;

    /* renamed from: e */
    public boolean f136538e;

    static {
        C52022hu huVar = new C52022hu();
        f136532f = huVar;
        C62942bv.registerDefaultInstance(C52022hu.class, huVar);
    }

    private C52022hu() {
        emptyProtobufList();
        emptyProtobufList();
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f136532f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ခ\u0003\u0004ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C52022hu();
            case 4:
                return new C52021ht();
            case 5:
                return f136532f;
            case 6:
                C63010eb ebVar = f136533g;
                if (ebVar == null) {
                    synchronized (C52022hu.class) {
                        ebVar = f136533g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136532f);
                            f136533g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
