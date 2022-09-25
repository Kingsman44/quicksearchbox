package com.google.assistant.p3803ag.p3804a.p3806b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.a.b.e */
/* compiled from: PG */
public final class C48824e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48824e f126322d;

    /* renamed from: f */
    private static volatile C63010eb f126323f;

    /* renamed from: a */
    public String f126324a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f126325b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f126326c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f126327e;

    static {
        C48824e eVar = new C48824e();
        f126322d = eVar;
        C62942bv.registerDefaultInstance(C48824e.class, eVar);
    }

    private C48824e() {
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
                return newMessageInfo(f126322d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C48824e();
            case 4:
                return new C48823d();
            case 5:
                return f126322d;
            case 6:
                C63010eb ebVar = f126323f;
                if (ebVar == null) {
                    synchronized (C48824e.class) {
                        ebVar = f126323f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126322d);
                            f126323f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
