package com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.p1104b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.C59755el;
import com.google.common.p4552o.C60003j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;
import p5535j.p5536a.p5543b.C70965l;
import p5535j.p5536a.p5543b.C70967n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.o.a.b.b */
/* compiled from: PG */
public final class C15474b extends C62937bq implements C62938br {

    /* renamed from: j */
    public static final C15474b f46404j;

    /* renamed from: l */
    private static volatile C63010eb f46405l;

    /* renamed from: a */
    public int f46406a;

    /* renamed from: b */
    public String f46407b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f46408c;

    /* renamed from: d */
    public C62971cq f46409d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f46410e = emptyProtobufList();

    /* renamed from: f */
    public String f46411f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f46412g;

    /* renamed from: h */
    public boolean f46413h;

    /* renamed from: i */
    public C70965l f46414i;

    /* renamed from: k */
    private byte f46415k = 2;

    static {
        C15474b bVar = new C15474b();
        f46404j = bVar;
        C62942bv.registerDefaultInstance(C15474b.class, bVar);
    }

    private C15474b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f46415k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f46415k = b;
                return null;
            case 2:
                return newMessageInfo(f46404j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003\u001b\u0004\u001b\u0005ဈ\u0002\u0006ဌ\u0003\u0007ဇ\u0004\bဉ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", C59755el.class, "e", C60003j.class, C10662f.f35572a, C30325g.f82003a, C70967n.m103851b(), C19618h.f54585a, "i"});
            case 3:
                return new C15474b();
            case 4:
                return new C15471a();
            case 5:
                return f46404j;
            case 6:
                C63010eb ebVar = f46405l;
                if (ebVar == null) {
                    synchronized (C15474b.class) {
                        ebVar = f46405l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f46404j);
                            f46405l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
