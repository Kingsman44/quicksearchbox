package com.google.assistant.p4008y.p4013d.p4014a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.p3809c.C49007d;
import com.google.assistant.p4008y.p4013d.C53652d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.d.a.j */
/* compiled from: PG */
public final class C53641j extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C53641j f140781l;

    /* renamed from: m */
    private static volatile C63010eb f140782m;

    /* renamed from: a */
    public int f140783a;

    /* renamed from: b */
    public long f140784b;

    /* renamed from: c */
    public String f140785c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f140786d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C53639h f140787e;

    /* renamed from: f */
    public int f140788f;

    /* renamed from: g */
    public int f140789g;

    /* renamed from: h */
    public C53652d f140790h;

    /* renamed from: i */
    public boolean f140791i;

    /* renamed from: j */
    public C49007d f140792j;

    /* renamed from: k */
    public C62971cq f140793k = emptyProtobufList();

    static {
        C53641j jVar = new C53641j();
        f140781l = jVar;
        C62942bv.registerDefaultInstance(C53641j.class, jVar);
    }

    private C53641j() {
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
                return newMessageInfo(f140781l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005င\u0004\u0006င\u0005\u0007ဉ\u0006\bဇ\u0007\tဉ\b\n\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, C53633b.class});
            case 3:
                return new C53641j();
            case 4:
                return new C53640i();
            case 5:
                return f140781l;
            case 6:
                C63010eb ebVar = f140782m;
                if (ebVar == null) {
                    synchronized (C53641j.class) {
                        ebVar = f140782m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140781l);
                            f140782m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
