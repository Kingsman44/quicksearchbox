package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ajn */
/* compiled from: PG */
public final class ajn extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final ajn f158887l;

    /* renamed from: m */
    private static volatile C63010eb f158888m;

    /* renamed from: a */
    public int f158889a;

    /* renamed from: b */
    public int f158890b;

    /* renamed from: c */
    public String f158891c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f158892d;

    /* renamed from: e */
    public long f158893e;

    /* renamed from: f */
    public C62971cq f158894f = C62942bv.emptyProtobufList();

    /* renamed from: g */
    public String f158895g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C62961ch f158896h = emptyIntList();

    /* renamed from: i */
    public int f158897i;

    /* renamed from: j */
    public String f158898j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public int f158899k;

    static {
        ajn ajn = new ajn();
        f158887l = ajn;
        C62942bv.registerDefaultInstance(ajn.class, ajn);
    }

    private ajn() {
    }

    /* renamed from: a */
    public final void mo57011a() {
        C62971cq cqVar = this.f158894f;
        if (!cqVar.mo58948c()) {
            this.f158894f = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: b */
    public final void mo57012b() {
        C62961ch chVar = this.f158896h;
        if (!chVar.mo58948c()) {
            this.f158896h = C62942bv.mutableCopy(chVar);
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
                return newMessageInfo(f158887l, "\u0001\n\u0000\u0001\u0002\f\n\u0000\u0002\u0000\u0002င\u0000\u0003ဈ\u0001\u0004\u001a\u0005ဈ\u0004\u0006\u0016\u0007င\u0005\tဂ\u0002\nဂ\u0003\u000bင\u0007\fဈ\u0006", new Object[]{"a", "b", C45240c.f118157a, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "d", "e", C19621k.f54601a, "j"});
            case 3:
                return new ajn();
            case 4:
                return new ajm();
            case 5:
                return f158887l;
            case 6:
                C63010eb ebVar = f158888m;
                if (ebVar == null) {
                    synchronized (ajn.class) {
                        ebVar = f158888m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158887l);
                            f158888m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
