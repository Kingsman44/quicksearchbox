package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4109av.p4110a.p4111a.C54604c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ow */
/* compiled from: PG */
public final class C50216ow extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50216ow f130573d;

    /* renamed from: f */
    private static volatile C63010eb f130574f;

    /* renamed from: a */
    public int f130575a;

    /* renamed from: b */
    public String f130576b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f130577c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f130578e;

    static {
        C50216ow owVar = new C50216ow();
        f130573d = owVar;
        C62942bv.registerDefaultInstance(C50216ow.class, owVar);
    }

    private C50216ow() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f130573d, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0005ဈ\u0002\u0006ဈ\u0003", new Object[]{"e", "a", C54604c.f143365a, "b", C45240c.f118157a});
            case 3:
                return new C50216ow();
            case 4:
                return new C50215ov();
            case 5:
                return f130573d;
            case 6:
                C63010eb ebVar = f130574f;
                if (ebVar == null) {
                    synchronized (C50216ow.class) {
                        ebVar = f130574f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130573d);
                            f130574f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
