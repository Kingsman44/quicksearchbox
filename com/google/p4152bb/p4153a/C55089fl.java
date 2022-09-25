package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.fl */
/* compiled from: PG */
public final class C55089fl extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C62962ci f144953f = new C55087fj();

    /* renamed from: j */
    public static final C55089fl f144954j;

    /* renamed from: k */
    private static volatile C63010eb f144955k;

    /* renamed from: a */
    public int f144956a;

    /* renamed from: b */
    public C62971cq f144957b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public C62971cq f144958c = emptyProtobufList();

    /* renamed from: d */
    public String f144959d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62961ch f144960e = emptyIntList();

    /* renamed from: g */
    public C55097ft f144961g;

    /* renamed from: h */
    public C62971cq f144962h = emptyProtobufList();

    /* renamed from: i */
    public String f144963i = BuildConfig.FLAVOR;

    static {
        C55089fl flVar = new C55089fl();
        f144954j = flVar;
        C62942bv.registerDefaultInstance(C55089fl.class, flVar);
    }

    private C55089fl() {
    }

    /* renamed from: a */
    public final void mo54188a() {
        C62971cq cqVar = this.f144957b;
        if (!cqVar.mo58948c()) {
            this.f144957b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: b */
    public final void mo54189b() {
        C62961ch chVar = this.f144960e;
        if (!chVar.mo58948c()) {
            this.f144960e = C62942bv.mutableCopy(chVar);
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
                return newMessageInfo(f144954j, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001\u001a\u0002ဈ\u0000\u0003\u001e\u0004ဉ\u0001\u0005\u001b\u0006\u001b\u0007ဈ\u0002", new Object[]{"a", "b", "d", "e", C55084fg.m87581b(), C30325g.f82003a, C45240c.f118157a, C55101fx.class, C19618h.f54585a, C55086fi.class, "i"});
            case 3:
                return new C55089fl();
            case 4:
                return new C55088fk();
            case 5:
                return f144954j;
            case 6:
                C63010eb ebVar = f144955k;
                if (ebVar == null) {
                    synchronized (C55089fl.class) {
                        ebVar = f144955k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144954j);
                            f144955k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
