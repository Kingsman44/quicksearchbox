package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.o */
/* compiled from: PG */
public final class C52337o extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52337o f137364c;

    /* renamed from: e */
    private static volatile C63010eb f137365e;

    /* renamed from: a */
    public String f137366a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C52283m f137367b;

    /* renamed from: d */
    private int f137368d;

    static {
        C52337o oVar = new C52337o();
        f137364c = oVar;
        C62942bv.registerDefaultInstance(C52337o.class, oVar);
    }

    private C52337o() {
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
                return newMessageInfo(f137364c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C52337o();
            case 4:
                return new C52310n();
            case 5:
                return f137364c;
            case 6:
                C63010eb ebVar = f137365e;
                if (ebVar == null) {
                    synchronized (C52337o.class) {
                        ebVar = f137365e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137364c);
                            f137365e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
