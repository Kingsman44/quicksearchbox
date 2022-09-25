package com.google.common.p4552o.p4553a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3781ad.p3789d.C48581ao;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.ct */
/* compiled from: PG */
public final class C59523ct extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C59523ct f157929n;

    /* renamed from: p */
    private static volatile C63010eb f157930p;

    /* renamed from: a */
    public int f157931a;

    /* renamed from: b */
    public int f157932b;

    /* renamed from: c */
    public int f157933c;

    /* renamed from: d */
    public String f157934d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f157935e = emptyProtobufList();

    /* renamed from: f */
    public int f157936f;

    /* renamed from: g */
    public C62971cq f157937g = emptyProtobufList();

    /* renamed from: h */
    public C59542dl f157938h;

    /* renamed from: i */
    public boolean f157939i;

    /* renamed from: j */
    public long f157940j;

    /* renamed from: k */
    public C62971cq f157941k;

    /* renamed from: l */
    public C62971cq f157942l;

    /* renamed from: m */
    public C59509cf f157943m;

    /* renamed from: o */
    private byte f157944o = 2;

    static {
        C59523ct ctVar = new C59523ct();
        f157929n = ctVar;
        C62942bv.registerDefaultInstance(C59523ct.class, ctVar);
    }

    private C59523ct() {
        emptyProtobufList();
        this.f157941k = emptyProtobufList();
        this.f157942l = emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f157944o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f157944o = b;
                return null;
            case 2:
                return newMessageInfo(f157929n, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0004\u0002\u0001င\u0000\u0002င\u0001\u0003Л\u0004ဌ\u0003\u0005Л\u0006ဉ\b\bဈ\u0002\tဉ\u0005\nဇ\u0006\u000bဂ\u0007\r\u001b\u000e\u001b", new Object[]{"a", "b", C45240c.f118157a, "e", C59527cx.class, C10662f.f35572a, C48581ao.f125556a, C30325g.f82003a, C59514ck.class, "m", "d", C19618h.f54585a, "i", "j", C19621k.f54601a, C59540dj.class, "l", C59532db.class});
            case 3:
                return new C59523ct();
            case 4:
                return new C59522cs();
            case 5:
                return f157929n;
            case 6:
                C63010eb ebVar = f157930p;
                if (ebVar == null) {
                    synchronized (C59523ct.class) {
                        ebVar = f157930p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157929n);
                            f157930p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
