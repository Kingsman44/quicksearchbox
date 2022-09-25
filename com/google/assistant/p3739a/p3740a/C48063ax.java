package com.google.assistant.p3739a.p3740a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.a.a.ax */
/* compiled from: PG */
public final class C48063ax extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C48063ax f124391e;

    /* renamed from: f */
    private static volatile C63010eb f124392f;

    /* renamed from: a */
    public int f124393a;

    /* renamed from: b */
    public String f124394b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f124395c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f124396d = BuildConfig.FLAVOR;

    static {
        C48063ax axVar = new C48063ax();
        f124391e = axVar;
        C62942bv.registerDefaultInstance(C48063ax.class, axVar);
    }

    private C48063ax() {
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
                return newMessageInfo(f124391e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C48063ax();
            case 4:
                return new C48062aw();
            case 5:
                return f124391e;
            case 6:
                C63010eb ebVar = f124392f;
                if (ebVar == null) {
                    synchronized (C48063ax.class) {
                        ebVar = f124392f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124391e);
                            f124392f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
