package com.google.p4129b.p4130a.p4131a.p4132a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.b.a.a.a.ax */
/* compiled from: PG */
public final class C54680ax extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54680ax f143530c;

    /* renamed from: d */
    private static volatile C63010eb f143531d;

    /* renamed from: a */
    public String f143532a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C63088z f143533b = C63088z.f170246b;

    static {
        C54680ax axVar = new C54680ax();
        f143530c = axVar;
        C62942bv.registerDefaultInstance(C54680ax.class, axVar);
    }

    private C54680ax() {
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
                return newMessageInfo(f143530c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001Ȉ\u0003\n", new Object[]{"a", "b"});
            case 3:
                return new C54680ax();
            case 4:
                return new C54679aw();
            case 5:
                return f143530c;
            case 6:
                C63010eb ebVar = f143531d;
                if (ebVar == null) {
                    synchronized (C54680ax.class) {
                        ebVar = f143531d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143530c);
                            f143531d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
