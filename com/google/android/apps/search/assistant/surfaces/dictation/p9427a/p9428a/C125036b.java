package com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.a.b */
/* compiled from: PG */
public final class C125036b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C125036b f344969b;

    /* renamed from: c */
    private static volatile C63010eb f344970c;

    /* renamed from: a */
    public String f344971a = BuildConfig.FLAVOR;

    static {
        C125036b bVar = new C125036b();
        f344969b = bVar;
        C62942bv.registerDefaultInstance(C125036b.class, bVar);
    }

    private C125036b() {
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
                return newMessageInfo(f344969b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C125036b();
            case 4:
                return new C125035a();
            case 5:
                return f344969b;
            case 6:
                C63010eb ebVar = f344970c;
                if (ebVar == null) {
                    synchronized (C125036b.class) {
                        ebVar = f344970c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f344969b);
                            f344970c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
