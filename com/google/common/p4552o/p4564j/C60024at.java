package com.google.common.p4552o.p4564j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.j.at */
/* compiled from: PG */
public final class C60024at extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C60024at f162232g;

    /* renamed from: l */
    private static volatile C63010eb f162233l;

    /* renamed from: a */
    public int f162234a;

    /* renamed from: b */
    public int f162235b;

    /* renamed from: c */
    public String f162236c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f162237d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C60014aj f162238e;

    /* renamed from: f */
    public C60051z f162239f;

    /* renamed from: h */
    private C60026av f162240h;

    /* renamed from: i */
    private C60016al f162241i;

    /* renamed from: j */
    private C60049x f162242j;

    /* renamed from: k */
    private byte f162243k = 2;

    static {
        C60024at atVar = new C60024at();
        f162232g = atVar;
        C62942bv.registerDefaultInstance(C60024at.class, atVar);
    }

    private C60024at() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f162243k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f162243k = b;
                return null;
            case 2:
                return newMessageInfo(f162232g, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0004\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bဉ\u0007\tᐉ\b", new Object[]{"a", "b", C60023as.f162231a, C45240c.f118157a, "d", C19618h.f54585a, "i", "j", "e", C10662f.f35572a});
            case 3:
                return new C60024at();
            case 4:
                return new C60022ar();
            case 5:
                return f162232g;
            case 6:
                C63010eb ebVar = f162233l;
                if (ebVar == null) {
                    synchronized (C60024at.class) {
                        ebVar = f162233l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162232g);
                            f162233l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
