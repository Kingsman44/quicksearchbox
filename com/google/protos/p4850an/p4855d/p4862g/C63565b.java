package com.google.protos.p4850an.p4855d.p4862g;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4242bp.p4266g.C56358h;
import com.google.p4242bp.p4266g.C56364n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4850an.C63389bg;

/* renamed from: com.google.protos.an.d.g.b */
/* compiled from: PG */
public final class C63565b extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C63565b f171933j;

    /* renamed from: m */
    private static volatile C63010eb f171934m;

    /* renamed from: a */
    public int f171935a;

    /* renamed from: b */
    public String f171936b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f171937c;

    /* renamed from: d */
    public String f171938d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f171939e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f171940f = C62942bv.emptyProtobufList();

    /* renamed from: g */
    public C62971cq f171941g;

    /* renamed from: h */
    public boolean f171942h;

    /* renamed from: i */
    public C62971cq f171943i;

    /* renamed from: k */
    private C63389bg f171944k;

    /* renamed from: l */
    private byte f171945l = 2;

    static {
        C63565b bVar = new C63565b();
        f171933j = bVar;
        C62942bv.registerDefaultInstance(C63565b.class, bVar);
    }

    private C63565b() {
        emptyIntList();
        this.f171941g = emptyProtobufList();
        this.f171943i = emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo59219a() {
        C62971cq cqVar = this.f171941g;
        if (!cqVar.mo58948c()) {
            this.f171941g = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171945l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171945l = b;
                return null;
            case 2:
                return newMessageInfo(f171933j, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0003\u0002\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0005Л\u0006ဈ\u0003\u0007\u001a\tဇ\u0005\nᐉ\u0006\u000b\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", C30325g.f82003a, C56364n.class, "e", C10662f.f35572a, C19618h.f54585a, C19621k.f54601a, "i", C56358h.class});
            case 3:
                return new C63565b();
            case 4:
                return new C63564a();
            case 5:
                return f171933j;
            case 6:
                C63010eb ebVar = f171934m;
                if (ebVar == null) {
                    synchronized (C63565b.class) {
                        ebVar = f171934m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171933j);
                            f171934m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
