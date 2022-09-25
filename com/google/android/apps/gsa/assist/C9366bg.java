package com.google.android.apps.gsa.assist;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assist.bg */
/* compiled from: PG */
public final class C9366bg extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C9366bg f32520f;

    /* renamed from: g */
    private static volatile C63010eb f32521g;

    /* renamed from: a */
    public int f32522a;

    /* renamed from: b */
    public String f32523b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f32524c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f32525d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public long f32526e;

    static {
        C9366bg bgVar = new C9366bg();
        f32520f = bgVar;
        C62942bv.registerDefaultInstance(C9366bg.class, bgVar);
    }

    private C9366bg() {
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
                return newMessageInfo(f32520f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဂ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C9366bg();
            case 4:
                return new C9365bf();
            case 5:
                return f32520f;
            case 6:
                C63010eb ebVar = f32521g;
                if (ebVar == null) {
                    synchronized (C9366bg.class) {
                        ebVar = f32521g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32520f);
                            f32521g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
