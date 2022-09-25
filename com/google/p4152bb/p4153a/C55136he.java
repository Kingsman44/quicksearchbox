package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.bb.a.he */
/* compiled from: PG */
public final class C55136he extends C62937bq implements C62938br {

    /* renamed from: j */
    public static final C55136he f145130j;

    /* renamed from: l */
    private static volatile C63010eb f145131l;

    /* renamed from: a */
    public int f145132a;

    /* renamed from: b */
    public String f145133b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f145134c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public int f145135d;

    /* renamed from: e */
    public boolean f145136e;

    /* renamed from: f */
    public double f145137f;

    /* renamed from: g */
    public C62971cq f145138g;

    /* renamed from: h */
    public C62971cq f145139h;

    /* renamed from: i */
    public C63088z f145140i;

    /* renamed from: k */
    private byte f145141k = 2;

    static {
        C55136he heVar = new C55136he();
        f145130j = heVar;
        C62942bv.registerDefaultInstance(C55136he.class, heVar);
    }

    private C55136he() {
        emptyProtobufList();
        emptyIntList();
        this.f145138g = emptyProtobufList();
        this.f145139h = emptyProtobufList();
        this.f145140i = C63088z.f170246b;
    }

    /* renamed from: a */
    public final void mo54201a() {
        C62971cq cqVar = this.f145138g;
        if (!cqVar.mo58948c()) {
            this.f145138g = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145141k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145141k = b;
                return null;
            case 2:
                return newMessageInfo(f145130j, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0003\u0002\u0001ဈ\u0000\u0002Л\u0003\u001a\u0006င\u0002\u0007ဇ\u0003\bက\u0004\nЛ\u000bည\u0006", new Object[]{"a", "b", C30325g.f82003a, C55134hc.class, C45240c.f118157a, "d", "e", C10662f.f35572a, C19618h.f54585a, C55005ci.class, "i"});
            case 3:
                return new C55136he();
            case 4:
                return new C55135hd();
            case 5:
                return f145130j;
            case 6:
                C63010eb ebVar = f145131l;
                if (ebVar == null) {
                    synchronized (C55136he.class) {
                        ebVar = f145131l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145130j);
                            f145131l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
