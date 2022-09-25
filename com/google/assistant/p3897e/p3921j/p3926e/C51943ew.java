package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.ew */
/* compiled from: PG */
public final class C51943ew extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C51943ew f136285f;

    /* renamed from: h */
    private static volatile C63010eb f136286h;

    /* renamed from: a */
    public int f136287a;

    /* renamed from: b */
    public C62971cq f136288b = emptyProtobufList();

    /* renamed from: c */
    public String f136289c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f136290d;

    /* renamed from: e */
    public int f136291e;

    /* renamed from: g */
    private byte f136292g = 2;

    static {
        C51943ew ewVar = new C51943ew();
        f136285f = ewVar;
        C62942bv.registerDefaultInstance(C51943ew.class, ewVar);
    }

    private C51943ew() {
    }

    /* renamed from: a */
    public final void mo53761a() {
        C62971cq cqVar = this.f136288b;
        if (!cqVar.mo58948c()) {
            this.f136288b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f136292g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f136292g = b;
                return null;
            case 2:
                return newMessageInfo(f136285f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001Л\u0002ဈ\u0000\u0003ဇ\u0001\u0004င\u0002", new Object[]{"a", "b", C51941eu.class, C45240c.f118157a, "d", "e"});
            case 3:
                return new C51943ew();
            case 4:
                return new C51942ev();
            case 5:
                return f136285f;
            case 6:
                C63010eb ebVar = f136286h;
                if (ebVar == null) {
                    synchronized (C51943ew.class) {
                        ebVar = f136286h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136285f);
                            f136286h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
