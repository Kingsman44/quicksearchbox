package com.google.assistant.p3897e.p3921j;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.assistant.e.j.cy */
/* compiled from: PG */
public final class C51772cy extends C62942bv implements C63001dt {

    /* renamed from: p */
    public static final C51772cy f135824p;

    /* renamed from: r */
    private static volatile C63010eb f135825r;

    /* renamed from: a */
    public int f135826a;

    /* renamed from: b */
    public C62971cq f135827b = emptyProtobufList();

    /* renamed from: c */
    public C52265li f135828c;

    /* renamed from: d */
    public C62971cq f135829d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f135830e = emptyProtobufList();

    /* renamed from: f */
    public C51720br f135831f;

    /* renamed from: g */
    public C51791dg f135832g;

    /* renamed from: h */
    public C51787dc f135833h;

    /* renamed from: i */
    public C51748ca f135834i;

    /* renamed from: j */
    public C51768cu f135835j;

    /* renamed from: k */
    public C51752ce f135836k;

    /* renamed from: l */
    public C51750cc f135837l;

    /* renamed from: m */
    public C51718bp f135838m;

    /* renamed from: n */
    public C62995dn f135839n = C62995dn.f170057a;

    /* renamed from: o */
    public C51711bi f135840o;

    /* renamed from: q */
    private byte f135841q = 2;

    static {
        C51772cy cyVar = new C51772cy();
        f135824p = cyVar;
        C62942bv.registerDefaultInstance(C51772cy.class, cyVar);
    }

    private C51772cy() {
        emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo53724a() {
        C62971cq cqVar = this.f135827b;
        if (!cqVar.mo58948c()) {
            this.f135827b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: b */
    public final void mo53725b() {
        C62971cq cqVar = this.f135829d;
        if (!cqVar.mo58948c()) {
            this.f135829d = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: c */
    public final void mo53726c() {
        C62971cq cqVar = this.f135830e;
        if (!cqVar.mo58948c()) {
            this.f135830e = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f135841q);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f135841q = b;
                return null;
            case 2:
                return newMessageInfo(f135824p, "\u0001\u000e\u0000\u0001\u0001\u0019\u000e\u0001\u0003\u0001\u0001\u001b\u0002ဉ\u0000\u0004\u001b\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bᐉ\u0007\tဉ\b\fဉ\t\rဉ\n\u000eဉ\f\u000f\u001b\u00162\u0019ဉ\u0011", new Object[]{"a", "b", C51785da.class, C45240c.f118157a, "d", C51691as.class, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", "e", C51693au.class, C48004n.f124238a, C51770cw.f135823a, C66412o.f180592a});
            case 3:
                return new C51772cy();
            case 4:
                return new C51771cx();
            case 5:
                return f135824p;
            case 6:
                C63010eb ebVar = f135825r;
                if (ebVar == null) {
                    synchronized (C51772cy.class) {
                        ebVar = f135825r;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135824p);
                            f135825r = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
