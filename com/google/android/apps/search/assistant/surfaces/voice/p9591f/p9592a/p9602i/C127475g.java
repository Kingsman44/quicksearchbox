package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i;

import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.C127487q;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34039bb;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.a.i.g */
/* compiled from: PG */
public final class C127475g extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C127475g f350983f;

    /* renamed from: h */
    private static volatile C63010eb f350984h;

    /* renamed from: a */
    public int f350985a;

    /* renamed from: b */
    public C34039bb f350986b;

    /* renamed from: c */
    public C127471c f350987c;

    /* renamed from: d */
    public C62910ar f350988d;

    /* renamed from: e */
    public C127487q f350989e;

    /* renamed from: g */
    private byte f350990g = 2;

    static {
        C127475g gVar = new C127475g();
        f350983f = gVar;
        C62942bv.registerDefaultInstance(C127475g.class, gVar);
    }

    private C127475g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f350990g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f350990g = b;
                return null;
            case 2:
                return newMessageInfo(f350983f, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001Љ\u0002\t\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C127475g();
            case 4:
                return new C127474f();
            case 5:
                return f350983f;
            case 6:
                C63010eb ebVar = f350984h;
                if (ebVar == null) {
                    synchronized (C127475g.class) {
                        ebVar = f350984h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f350983f);
                            f350984h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
