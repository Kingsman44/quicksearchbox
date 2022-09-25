package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.t */
/* compiled from: PG */
public final class C16770t extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C16770t f49073f;

    /* renamed from: h */
    private static volatile C63010eb f49074h;

    /* renamed from: a */
    public int f49075a;

    /* renamed from: b */
    public int f49076b = 0;

    /* renamed from: c */
    public Object f49077c;

    /* renamed from: d */
    public C12991i f49078d;

    /* renamed from: e */
    public boolean f49079e;

    /* renamed from: g */
    private byte f49080g = 2;

    static {
        C16770t tVar = new C16770t();
        f49073f = tVar;
        C62942bv.registerDefaultInstance(C16770t.class, tVar);
    }

    private C16770t() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f49080g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f49080g = b;
                return null;
            case 2:
                return newMessageInfo(f49073f, "\u0001\u0007\u0001\u0001\u0001\b\u0007\u0000\u0000\u0002\u0001ျ\u0000\u0002ြ\u0000\u0003ᐉ\u0005\u0004ဇ\u0006\u0005ျ\u0000\u0006ျ\u0000\bᐼ\u0000", new Object[]{C45240c.f118157a, "b", "a", C51805du.class, "d", "e", C52560wg.class});
            case 3:
                return new C16770t();
            case 4:
                return new C16769s();
            case 5:
                return f49073f;
            case 6:
                C63010eb ebVar = f49074h;
                if (ebVar == null) {
                    synchronized (C16770t.class) {
                        ebVar = f49074h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f49073f);
                            f49074h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
