package com.google.speech.p5218j.p5220b.p5221a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.b.a.v */
/* compiled from: PG */
public final class C66818v extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62962ci f181695e = new C66816t();

    /* renamed from: g */
    public static final C66818v f181696g;

    /* renamed from: i */
    private static volatile C63010eb f181697i;

    /* renamed from: a */
    public String f181698a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f181699b;

    /* renamed from: c */
    public int f181700c;

    /* renamed from: d */
    public C62961ch f181701d = emptyIntList();

    /* renamed from: f */
    public C62971cq f181702f = emptyProtobufList();

    /* renamed from: h */
    private int f181703h;

    static {
        C66818v vVar = new C66818v();
        f181696g = vVar;
        C62942bv.registerDefaultInstance(C66818v.class, vVar);
    }

    private C66818v() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f181696g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003\u001e\u0004\u001b\u0005င\u0002", new Object[]{C19618h.f54585a, "a", "b", C66811o.f181679a, "d", C66814r.m97355b(), C10662f.f35572a, C66820x.class, C45240c.f118157a});
            case 3:
                return new C66818v();
            case 4:
                return new C66817u();
            case 5:
                return f181696g;
            case 6:
                C63010eb ebVar = f181697i;
                if (ebVar == null) {
                    synchronized (C66818v.class) {
                        ebVar = f181697i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181696g);
                            f181697i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
