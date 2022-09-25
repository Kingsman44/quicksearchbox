package com.google.android.gms.p10815k;

import com.evernote.android.state.BuildConfig;
import com.google.p4017at.p4049f.p4050a.p4053b.p4054a.p4055a.C53943h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.k.h */
/* compiled from: PG */
public final class C144408h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C144408h f390991c;

    /* renamed from: e */
    private static volatile C63010eb f390992e;

    /* renamed from: a */
    public String f390993a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C53943h f390994b;

    /* renamed from: d */
    private int f390995d;

    static {
        C144408h hVar = new C144408h();
        f390991c = hVar;
        C62942bv.registerDefaultInstance(C144408h.class, hVar);
    }

    private C144408h() {
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
                return newMessageInfo(f390991c, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"d", "a", "b"});
            case 3:
                return new C144408h();
            case 4:
                return new C144407g();
            case 5:
                return f390991c;
            case 6:
                C63010eb ebVar = f390992e;
                if (ebVar == null) {
                    synchronized (C144408h.class) {
                        ebVar = f390992e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f390991c);
                            f390992e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
