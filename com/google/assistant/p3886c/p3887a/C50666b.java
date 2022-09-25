package com.google.assistant.p3886c.p3887a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.a.b */
/* compiled from: PG */
public final class C50666b extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C50666b f131787l;

    /* renamed from: m */
    private static volatile C63010eb f131788m;

    /* renamed from: a */
    public int f131789a;

    /* renamed from: b */
    public String f131790b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f131791c;

    /* renamed from: d */
    public long f131792d;

    /* renamed from: e */
    public long f131793e;

    /* renamed from: f */
    public long f131794f;

    /* renamed from: g */
    public long f131795g;

    /* renamed from: h */
    public long f131796h;

    /* renamed from: i */
    public long f131797i;

    /* renamed from: j */
    public long f131798j;

    /* renamed from: k */
    public C62971cq f131799k = emptyProtobufList();

    static {
        C50666b bVar = new C50666b();
        f131787l = bVar;
        C62942bv.registerDefaultInstance(C50666b.class, bVar);
    }

    private C50666b() {
    }

    /* renamed from: a */
    public final void mo53419a() {
        C62971cq cqVar = this.f131799k;
        if (!cqVar.mo58948c()) {
            this.f131799k = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f131787l, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0001\u0000\u0001ဈ\u0000\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, C50670f.class});
            case 3:
                return new C50666b();
            case 4:
                return new C50665a();
            case 5:
                return f131787l;
            case 6:
                C63010eb ebVar = f131788m;
                if (ebVar == null) {
                    synchronized (C50666b.class) {
                        ebVar = f131788m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131787l);
                            f131788m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
