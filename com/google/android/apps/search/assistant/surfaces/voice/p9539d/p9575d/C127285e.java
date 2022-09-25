package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119851cs;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.d.e */
/* compiled from: PG */
public final class C127285e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C127285e f350551c;

    /* renamed from: e */
    private static volatile C63010eb f350552e;

    /* renamed from: a */
    public int f350553a;

    /* renamed from: b */
    public C119851cs f350554b;

    /* renamed from: d */
    private byte f350555d = 2;

    static {
        C127285e eVar = new C127285e();
        f350551c = eVar;
        C62942bv.registerDefaultInstance(C127285e.class, eVar);
    }

    private C127285e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f350555d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f350555d = b;
                return null;
            case 2:
                return newMessageInfo(f350551c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C127285e();
            case 4:
                return new C127284d();
            case 5:
                return f350551c;
            case 6:
                C63010eb ebVar = f350552e;
                if (ebVar == null) {
                    synchronized (C127285e.class) {
                        ebVar = f350552e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f350551c);
                            f350552e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
