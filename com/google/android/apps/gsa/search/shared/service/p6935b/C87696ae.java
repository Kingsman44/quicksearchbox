package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.p3804a.p3805a.C48783c;
import com.google.assistant.p3803ag.p3804a.p3805a.C48789i;
import com.google.assistant.p3980n.p3981a.p3982a.C53001d;
import com.google.assistant.p3980n.p3983b.p3984a.C53006b;
import com.google.assistant.p3980n.p3985c.C53017h;
import com.google.assistant.p3980n.p3986d.p3987a.C53028b;
import com.google.assistant.p3994s.p3995a.C53271hs;
import com.google.assistant.p3994s.p3995a.C53342ki;
import com.google.assistant.p4008y.p4009a.C53604m;
import com.google.assistant.p4008y.p4010b.C53621c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5036r.C65327m;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ae */
/* compiled from: PG */
public final class C87696ae extends C62942bv implements C63001dt {

    /* renamed from: p */
    public static final C87696ae f237132p;

    /* renamed from: s */
    private static volatile C63010eb f237133s;

    /* renamed from: a */
    public int f237134a;

    /* renamed from: b */
    public C53001d f237135b;

    /* renamed from: c */
    public C53271hs f237136c;

    /* renamed from: d */
    public C53028b f237137d;

    /* renamed from: e */
    public C53621c f237138e;

    /* renamed from: f */
    public C53271hs f237139f;

    /* renamed from: g */
    public C53271hs f237140g;

    /* renamed from: h */
    public C53342ki f237141h;

    /* renamed from: i */
    public C48789i f237142i;

    /* renamed from: j */
    public C48783c f237143j;

    /* renamed from: k */
    public boolean f237144k;

    /* renamed from: l */
    public boolean f237145l;

    /* renamed from: m */
    public C53006b f237146m;

    /* renamed from: n */
    public C65327m f237147n;

    /* renamed from: o */
    public C53604m f237148o;

    /* renamed from: q */
    private C53017h f237149q;

    /* renamed from: r */
    private byte f237150r = 2;

    static {
        C87696ae aeVar = new C87696ae();
        f237132p = aeVar;
        C62942bv.registerDefaultInstance(C87696ae.class, aeVar);
    }

    private C87696ae() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f237150r);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f237150r = b;
                return null;
            case 2:
                return newMessageInfo(f237132p, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\t\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005ဇ\n\u0006ဇ\u000b\u0007ᐉ\u0004\bဉ\f\tဉ\r\nᐉ\u0006\u000bᐉ\u0007\fᐉ\b\rᐉ\t\u000eᐉ\u000e\u000fᐉ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C19621k.f54601a, "l", C10662f.f35572a, "m", C48004n.f124238a, "q", C19618h.f54585a, "i", "j", C66412o.f180592a, C30325g.f82003a});
            case 3:
                return new C87696ae();
            case 4:
                return new C87695ad();
            case 5:
                return f237132p;
            case 6:
                C63010eb ebVar = f237133s;
                if (ebVar == null) {
                    synchronized (C87696ae.class) {
                        ebVar = f237133s;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237132p);
                            f237133s = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
