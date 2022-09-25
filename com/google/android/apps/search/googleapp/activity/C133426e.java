package com.google.android.apps.search.googleapp.activity;

import com.google.android.apps.gsa.h.e.d;
import com.google.android.apps.gsa.h.i.e;
import com.google.android.apps.gsa.h.j.c;
import com.google.android.apps.gsa.h.p.i;
import com.google.android.apps.gsa.h.t.b;
import com.google.android.apps.gsa.h.u.h;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.activity.e */
/* compiled from: PG */
public final class C133426e extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C133426e f363567e;

    /* renamed from: g */
    private static volatile C63010eb f363568g;

    /* renamed from: a */
    public int f363569a;

    /* renamed from: b */
    public int f363570b = 0;

    /* renamed from: c */
    public Object f363571c;

    /* renamed from: d */
    public int f363572d;

    /* renamed from: f */
    private byte f363573f = 2;

    static {
        C133426e eVar = new C133426e();
        f363567e = eVar;
        C62942bv.registerDefaultInstance(C133426e.class, eVar);
    }

    private C133426e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f363573f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f363573f = b;
                return null;
            case 2:
                return newMessageInfo(f363567e, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0003\u0001ဌ\u0000\u0002ᐼ\u0000\u0003ြ\u0000\u0004ᐼ\u0000\u0005ြ\u0000\u0006ᐼ\u0000\u0007ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C139779t.m227246b(), e.class, b.class, c.class, d.class, i.class, h.class});
            case 3:
                return new C133426e();
            case 4:
                return new C133425d();
            case 5:
                return f363567e;
            case 6:
                C63010eb ebVar = f363568g;
                if (ebVar == null) {
                    synchronized (C133426e.class) {
                        ebVar = f363568g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f363567e);
                            f363568g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
