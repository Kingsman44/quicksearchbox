package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119851cs;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127045c;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34065ca;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.a.g.e */
/* compiled from: PG */
public final class C127457e extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C127457e f350939f;

    /* renamed from: h */
    private static volatile C63010eb f350940h;

    /* renamed from: a */
    public int f350941a;

    /* renamed from: b */
    public C119851cs f350942b;

    /* renamed from: c */
    public C127045c f350943c;

    /* renamed from: d */
    public C34065ca f350944d;

    /* renamed from: e */
    public C127455c f350945e;

    /* renamed from: g */
    private byte f350946g = 2;

    static {
        C127457e eVar = new C127457e();
        f350939f = eVar;
        C62942bv.registerDefaultInstance(C127457e.class, eVar);
    }

    private C127457e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f350946g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f350946g = b;
                return null;
            case 2:
                return newMessageInfo(f350939f, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001Љ\u0002Љ\u0003\t\u0004ဉ\u0000", new Object[]{"a", "b", "d", "e", C45240c.f118157a});
            case 3:
                return new C127457e();
            case 4:
                return new C127456d();
            case 5:
                return f350939f;
            case 6:
                C63010eb ebVar = f350940h;
                if (ebVar == null) {
                    synchronized (C127457e.class) {
                        ebVar = f350940h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f350939f);
                            f350940h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
