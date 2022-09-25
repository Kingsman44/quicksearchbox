package com.google.android.libraries.assistant.auto.tng.suggestions.p1263k;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.k.ad */
/* compiled from: PG */
public final class C16330ad extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C16330ad f48065f;

    /* renamed from: h */
    private static volatile C63010eb f48066h;

    /* renamed from: a */
    public int f48067a;

    /* renamed from: b */
    public int f48068b = 0;

    /* renamed from: c */
    public Object f48069c;

    /* renamed from: d */
    public String f48070d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f48071e = BuildConfig.FLAVOR;

    /* renamed from: g */
    private byte f48072g = 2;

    static {
        C16330ad adVar = new C16330ad();
        f48065f = adVar;
        C62942bv.registerDefaultInstance(C16330ad.class, adVar);
    }

    private C16330ad() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f48072g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f48072g = b;
                return null;
            case 2:
                return newMessageInfo(f48065f, "\u0001\u0007\u0001\u0001\u0001\u000b\u0007\u0000\u0000\u0001\u0001်\u0000\u0002ျ\u0000\u0003ြ\u0000\u0004ျ\u0000\u0007ᐼ\u0000\bဈ\u0007\u000bဈ\t", new Object[]{C45240c.f118157a, "b", "a", C51805du.class, C52560wg.class, "d", "e"});
            case 3:
                return new C16330ad();
            case 4:
                return new C16328ab();
            case 5:
                return f48065f;
            case 6:
                C63010eb ebVar = f48066h;
                if (ebVar == null) {
                    synchronized (C16330ad.class) {
                        ebVar = f48066h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48065f);
                            f48066h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
