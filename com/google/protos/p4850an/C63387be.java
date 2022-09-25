package com.google.protos.p4850an;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.nlp.saft.C62849c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p4102au.p4103a.p4104a.p4105a.C54564b;
import com.google.p4242bp.p4257f.p4262c.C56342d;
import com.google.p4242bp.p4266g.C56366p;
import com.google.p4481ch.p4482a.p4483a.p4484a.C58085b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63010eb;
import com.google.protos.p4813ah.p4814a.p4815a.C63171d;
import com.google.protos.p4850an.p4867g.C63623e;
import com.google.protos.p4881ar.p4882a.C63771b;
import com.google.protos.p4893av.p4894a.C63847d;
import com.google.protos.p5121k.p5122a.C65591g;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.protos.an.be */
/* compiled from: PG */
public final class C63387be extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C63387be f171288a;

    /* renamed from: q */
    private static volatile C63010eb f171289q;

    /* renamed from: b */
    private int f171290b;

    /* renamed from: c */
    private int f171291c;

    /* renamed from: d */
    private C62849c f171292d;

    /* renamed from: e */
    private C63771b f171293e;

    /* renamed from: f */
    private C63171d f171294f;

    /* renamed from: g */
    private C63847d f171295g;

    /* renamed from: h */
    private C56342d f171296h;

    /* renamed from: i */
    private C63771b f171297i;

    /* renamed from: j */
    private C56366p f171298j;

    /* renamed from: k */
    private C63623e f171299k;

    /* renamed from: l */
    private C54564b f171300l;

    /* renamed from: m */
    private C62995dn f171301m = C62995dn.f170057a;

    /* renamed from: n */
    private C58085b f171302n;

    /* renamed from: o */
    private C65591g f171303o;

    /* renamed from: p */
    private byte f171304p = 2;

    static {
        C63387be beVar = new C63387be();
        f171288a = beVar;
        C62942bv.registerDefaultInstance(C63387be.class, beVar);
    }

    private C63387be() {
        emptyProtobufList();
        C62942bv.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171304p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171304p = b;
                return null;
            case 2:
                return newMessageInfo(f171288a, "\u0001\f\u0000\u0002\u00013\f\u0001\u0000\n\u0001ᐉ\u0000\u0002ᐉ\u0001\tᐉ\u0005\u000bᐉ\u0007\u0016ᐉ\u0015\u0018ᐉ\u0019\u001dᐉ\u001f\u001fဉ!\"в(ᐉ%1ᐉ-3ဉ.", new Object[]{"b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "m", C63386bd.f171287a, "l", C48004n.f124238a, C66412o.f180592a});
            case 3:
                return new C63387be();
            case 4:
                return new C63385bc();
            case 5:
                return f171288a;
            case 6:
                C63010eb ebVar = f171289q;
                if (ebVar == null) {
                    synchronized (C63387be.class) {
                        ebVar = f171289q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171288a);
                            f171289q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
