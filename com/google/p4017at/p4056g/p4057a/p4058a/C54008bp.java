package com.google.p4017at.p4056g.p4057a.p4058a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4538j.p4539a.C59308f;
import com.google.lens.p4707j.C62398ab;
import com.google.lens.p4707j.C62439bp;
import com.google.lens.p4707j.C62573go;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56228ai;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56244ay;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56304dd;
import com.google.p4280bt.C56488d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.at.g.a.a.bp */
/* compiled from: PG */
public final class C54008bp extends C62942bv implements C63001dt {

    /* renamed from: q */
    public static final C54008bp f141704q;

    /* renamed from: s */
    private static volatile C63010eb f141705s;

    /* renamed from: a */
    public C56244ay f141706a;

    /* renamed from: b */
    public boolean f141707b;

    /* renamed from: c */
    public C56488d f141708c;

    /* renamed from: d */
    public C56228ai f141709d;

    /* renamed from: e */
    public C62971cq f141710e = emptyProtobufList();

    /* renamed from: f */
    public C59308f f141711f;

    /* renamed from: g */
    public C63088z f141712g = C63088z.f170246b;

    /* renamed from: h */
    public C54005bm f141713h;

    /* renamed from: i */
    public C54038cs f141714i;

    /* renamed from: j */
    public C62439bp f141715j;

    /* renamed from: k */
    public C54054f f141716k;

    /* renamed from: l */
    public C54007bo f141717l;

    /* renamed from: m */
    public C56304dd f141718m;

    /* renamed from: n */
    public C62573go f141719n;

    /* renamed from: o */
    public C62971cq f141720o;

    /* renamed from: p */
    public String f141721p;

    /* renamed from: r */
    private byte f141722r = 2;

    static {
        C54008bp bpVar = new C54008bp();
        f141704q = bpVar;
        C62942bv.registerDefaultInstance(C54008bp.class, bpVar);
    }

    private C54008bp() {
        emptyProtobufList();
        emptyProtobufList();
        this.f141720o = emptyProtobufList();
        this.f141721p = BuildConfig.FLAVOR;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f141722r);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f141722r = b;
                return null;
            case 2:
                return newMessageInfo(f141704q, "\u0000\u0010\u0000\u0000\u0001\u001d\u0010\u0000\u0002\u0003\u0001\t\u0002Л\u0003Љ\u0004\t\u0007\t\b\u0007\u000b\t\f\t\u000eЉ\u000f\t\u0010\t\u0017\t\u001a\t\u001b\u001b\u001c\n\u001dȈ", new Object[]{"a", "e", C54024ce.class, C19618h.f54585a, "i", C19621k.f54601a, "b", C45240c.f118157a, "l", "m", C48004n.f124238a, "d", "j", C10662f.f35572a, C66412o.f180592a, C62398ab.class, C30325g.f82003a, "p"});
            case 3:
                return new C54008bp();
            case 4:
                return new C54003bk();
            case 5:
                return f141704q;
            case 6:
                C63010eb ebVar = f141705s;
                if (ebVar == null) {
                    synchronized (C54008bp.class) {
                        ebVar = f141705s;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141704q);
                            f141705s = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
