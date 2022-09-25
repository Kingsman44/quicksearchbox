package com.google.assistant.p3739a.p3740a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.a.a.bf */
/* compiled from: PG */
public final class C48072bf extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48072bf f124413c;

    /* renamed from: d */
    private static volatile C63010eb f124414d;

    /* renamed from: a */
    public C48090bx f124415a;

    /* renamed from: b */
    public String f124416b = BuildConfig.FLAVOR;

    static {
        C48072bf bfVar = new C48072bf();
        f124413c = bfVar;
        C62942bv.registerDefaultInstance(C48072bf.class, bfVar);
    }

    private C48072bf() {
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
                return newMessageInfo(f124413c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C48072bf();
            case 4:
                return new C48071be();
            case 5:
                return f124413c;
            case 6:
                C63010eb ebVar = f124414d;
                if (ebVar == null) {
                    synchronized (C48072bf.class) {
                        ebVar = f124414d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124413c);
                            f124414d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
