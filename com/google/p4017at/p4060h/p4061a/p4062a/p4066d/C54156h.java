package com.google.p4017at.p4060h.p4061a.p4062a.p4066d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.d.h */
/* compiled from: PG */
public final class C54156h extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C54156h f142118g;

    /* renamed from: j */
    private static volatile C63010eb f142119j;

    /* renamed from: a */
    public int f142120a;

    /* renamed from: b */
    public String f142121b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f142122c;

    /* renamed from: d */
    public long f142123d;

    /* renamed from: e */
    public float f142124e;

    /* renamed from: f */
    public long f142125f;

    /* renamed from: h */
    private C60220t f142126h;

    /* renamed from: i */
    private byte f142127i = 2;

    static {
        C54156h hVar = new C54156h();
        f142118g = hVar;
        C62942bv.registerDefaultInstance(C54156h.class, hVar);
    }

    private C54156h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142127i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f142127i = b;
                return null;
            case 2:
                return newMessageInfo(f142118g, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005ဂ\u0005\u0007ᐉ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C19618h.f54585a});
            case 3:
                return new C54156h();
            case 4:
                return new C54155g();
            case 5:
                return f142118g;
            case 6:
                C63010eb ebVar = f142119j;
                if (ebVar == null) {
                    synchronized (C54156h.class) {
                        ebVar = f142119j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142118g);
                            f142119j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
