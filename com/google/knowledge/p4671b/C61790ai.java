package com.google.knowledge.p4671b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;
import p001a.p007b.p011b.p012a.C0031g;

/* renamed from: com.google.knowledge.b.ai */
/* compiled from: PG */
public final class C61790ai extends C62937bq implements C62938br {

    /* renamed from: o */
    public static final C61790ai f166898o;

    /* renamed from: r */
    private static volatile C63010eb f166899r;

    /* renamed from: a */
    public int f166900a;

    /* renamed from: b */
    public long f166901b;

    /* renamed from: c */
    public C61788ag f166902c;

    /* renamed from: d */
    public C61814g f166903d;

    /* renamed from: e */
    public C61806ay f166904e;

    /* renamed from: f */
    public C61794am f166905f;

    /* renamed from: g */
    public String f166906g;

    /* renamed from: h */
    public int f166907h;

    /* renamed from: i */
    public C62971cq f166908i;

    /* renamed from: j */
    public boolean f166909j;

    /* renamed from: k */
    public boolean f166910k;

    /* renamed from: l */
    public boolean f166911l;

    /* renamed from: m */
    public boolean f166912m;

    /* renamed from: n */
    public C0031g f166913n;

    /* renamed from: p */
    private C60220t f166914p;

    /* renamed from: q */
    private byte f166915q = 2;

    static {
        C61790ai aiVar = new C61790ai();
        f166898o = aiVar;
        C62942bv.registerDefaultInstance(C61790ai.class, aiVar);
    }

    private C61790ai() {
        emptyProtobufList();
        this.f166906g = BuildConfig.FLAVOR;
        this.f166908i = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo58194a() {
        C62971cq cqVar = this.f166908i;
        if (!cqVar.mo58948c()) {
            this.f166908i = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f166915q);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f166915q = b;
                return null;
            case 2:
                return newMessageInfo(f166898o, "\u0001\u000e\u0000\u0001\u0003\u001e\u000e\u0000\u0001\u0004\u0003ᐉ\u0000\u0005ᐉ\u0003\u0006ဉ\u0004\u0007ဂ\u0001\bᐉ\u0005\tဉ\u0006\nဈ\u0007\u000eင\t\u000fЛ\u0014ဇ\u000f\u0015ဇ\u0010\u0016ဇ\u0011\u0019ဇ\u0012\u001eဉ\u0015", new Object[]{"a", "p", C45240c.f118157a, "d", "b", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", C61792ak.class, "j", C19621k.f54601a, "l", "m", C48004n.f124238a});
            case 3:
                return new C61790ai();
            case 4:
                return new C61789ah();
            case 5:
                return f166898o;
            case 6:
                C63010eb ebVar = f166899r;
                if (ebVar == null) {
                    synchronized (C61790ai.class) {
                        ebVar = f166899r;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166898o);
                            f166899r = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
