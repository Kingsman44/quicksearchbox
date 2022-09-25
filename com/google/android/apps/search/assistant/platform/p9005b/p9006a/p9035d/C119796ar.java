package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.ar */
/* compiled from: PG */
public final class C119796ar extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C119796ar f333677c;

    /* renamed from: e */
    private static volatile C63010eb f333678e;

    /* renamed from: a */
    public C51809dy f333679a;

    /* renamed from: b */
    public C119793ao f333680b;

    /* renamed from: d */
    private byte f333681d = 2;

    static {
        C119796ar arVar = new C119796ar();
        f333677c = arVar;
        C62942bv.registerDefaultInstance(C119796ar.class, arVar);
    }

    private C119796ar() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f333681d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f333681d = b;
                return null;
            case 2:
                return newMessageInfo(f333677c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001\t\u0002Љ", new Object[]{"a", "b"});
            case 3:
                return new C119796ar();
            case 4:
                return new C119795aq();
            case 5:
                return f333677c;
            case 6:
                C63010eb ebVar = f333678e;
                if (ebVar == null) {
                    synchronized (C119796ar.class) {
                        ebVar = f333678e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333677c);
                            f333678e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
