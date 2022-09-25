package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ma */
/* compiled from: PG */
public final class C14514ma extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14514ma f43883b;

    /* renamed from: c */
    private static volatile C63010eb f43884c;

    /* renamed from: a */
    public String f43885a = BuildConfig.FLAVOR;

    static {
        C14514ma maVar = new C14514ma();
        f43883b = maVar;
        C62942bv.registerDefaultInstance(C14514ma.class, maVar);
    }

    private C14514ma() {
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
                return newMessageInfo(f43883b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C14514ma();
            case 4:
                return new C14512lz();
            case 5:
                return f43883b;
            case 6:
                C63010eb ebVar = f43884c;
                if (ebVar == null) {
                    synchronized (C14514ma.class) {
                        ebVar = f43884c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43883b);
                            f43884c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
