package com.google.android.libraries.assistant.soda.p1606e.p1610d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.soda.e.d.b */
/* compiled from: PG */
public final class C19307b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C19307b f54033c;

    /* renamed from: d */
    private static volatile C63010eb f54034d;

    /* renamed from: a */
    public int f54035a;

    /* renamed from: b */
    public String f54036b = BuildConfig.FLAVOR;

    static {
        C19307b bVar = new C19307b();
        f54033c = bVar;
        C62942bv.registerDefaultInstance(C19307b.class, bVar);
    }

    private C19307b() {
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
                return newMessageInfo(f54033c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C19307b();
            case 4:
                return new C19306a();
            case 5:
                return f54033c;
            case 6:
                C63010eb ebVar = f54034d;
                if (ebVar == null) {
                    synchronized (C19307b.class) {
                        ebVar = f54034d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f54033c);
                            f54034d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
