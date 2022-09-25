package com.google.assistant.p3886c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.i */
/* compiled from: PG */
public final class C50837i extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C50837i f132363f;

    /* renamed from: g */
    private static volatile C63010eb f132364g;

    /* renamed from: a */
    public int f132365a;

    /* renamed from: b */
    public String f132366b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f132367c;

    /* renamed from: d */
    public double f132368d;

    /* renamed from: e */
    public float f132369e;

    static {
        C50837i iVar = new C50837i();
        f132363f = iVar;
        C62942bv.registerDefaultInstance(C50837i.class, iVar);
    }

    private C50837i() {
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
                return newMessageInfo(f132363f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003က\u0002\u0004ခ\u0003", new Object[]{"a", "b", C45240c.f118157a, C50803d.m85942b(), "d", "e"});
            case 3:
                return new C50837i();
            case 4:
                return new C50836h();
            case 5:
                return f132363f;
            case 6:
                C63010eb ebVar = f132364g;
                if (ebVar == null) {
                    synchronized (C50837i.class) {
                        ebVar = f132364g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132363f);
                            f132364g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
