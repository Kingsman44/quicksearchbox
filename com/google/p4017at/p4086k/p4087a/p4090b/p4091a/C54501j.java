package com.google.p4017at.p4086k.p4087a.p4090b.p4091a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.k.a.b.a.j */
/* compiled from: PG */
public final class C54501j extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C54501j f143096g;

    /* renamed from: j */
    private static volatile C63010eb f143097j;

    /* renamed from: a */
    public String f143098a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C60214n f143099b;

    /* renamed from: c */
    public String f143100c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C60214n f143101d;

    /* renamed from: e */
    public C60214n f143102e;

    /* renamed from: f */
    public C60214n f143103f;

    /* renamed from: h */
    private C60214n f143104h;

    /* renamed from: i */
    private byte f143105i = 2;

    static {
        C54501j jVar = new C54501j();
        f143096g = jVar;
        C62942bv.registerDefaultInstance(C54501j.class, jVar);
    }

    private C54501j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f143105i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f143105i = b;
                return null;
            case 2:
                return newMessageInfo(f143096g, "\u0000\u0007\u0000\u0000\u0001\b\u0007\u0000\u0000\u0005\u0001Ȉ\u0002Ȉ\u0004Љ\u0005Љ\u0006Љ\u0007Љ\bЉ", new Object[]{"a", C45240c.f118157a, "b", "d", "e", C10662f.f35572a, C19618h.f54585a});
            case 3:
                return new C54501j();
            case 4:
                return new C54500i();
            case 5:
                return f143096g;
            case 6:
                C63010eb ebVar = f143097j;
                if (ebVar == null) {
                    synchronized (C54501j.class) {
                        ebVar = f143097j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143096g);
                            f143097j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
