package com.google.android.libraries.assistant.hotword.p1516b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.hotword.b.i */
/* compiled from: PG */
public final class C18350i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C18350i f52041d;

    /* renamed from: e */
    private static volatile C63010eb f52042e;

    /* renamed from: a */
    public int f52043a;

    /* renamed from: b */
    public String f52044b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C18348g f52045c;

    static {
        C18350i iVar = new C18350i();
        f52041d = iVar;
        C62942bv.registerDefaultInstance(C18350i.class, iVar);
    }

    private C18350i() {
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
                return newMessageInfo(f52041d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C18350i();
            case 4:
                return new C18349h();
            case 5:
                return f52041d;
            case 6:
                C63010eb ebVar = f52042e;
                if (ebVar == null) {
                    synchronized (C18350i.class) {
                        ebVar = f52042e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f52041d);
                            f52042e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
