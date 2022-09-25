package com.google.android.libraries.assistant.portable.p1586b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3745ab.C48220af;
import com.google.assistant.p3745ab.C48228an;
import com.google.assistant.p3745ab.C48296cx;
import com.google.assistant.p3745ab.C48436z;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p4140ba.p4147b.p4148a.p4149a.C54937b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p4988b.p4992c.C64754b;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.libraries.assistant.portable.b.t */
/* compiled from: PG */
public final class C19088t extends C62937bq implements C62938br {

    /* renamed from: p */
    public static final C19088t f53533p;

    /* renamed from: r */
    private static volatile C63010eb f53534r;

    /* renamed from: a */
    public int f53535a;

    /* renamed from: b */
    public String f53536b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f53537c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C48220af f53538d;

    /* renamed from: e */
    public C54937b f53539e;

    /* renamed from: f */
    public C61752n f53540f;

    /* renamed from: g */
    public C19063ag f53541g;

    /* renamed from: h */
    public C19081m f53542h;

    /* renamed from: i */
    public C48228an f53543i;

    /* renamed from: j */
    public C62971cq f53544j = emptyProtobufList();

    /* renamed from: k */
    public C19086r f53545k;

    /* renamed from: l */
    public C62971cq f53546l;

    /* renamed from: m */
    public int f53547m;

    /* renamed from: n */
    public C62971cq f53548n;

    /* renamed from: o */
    public C48296cx f53549o;

    /* renamed from: q */
    private byte f53550q = 2;

    static {
        C19088t tVar = new C19088t();
        f53533p = tVar;
        C62942bv.registerDefaultInstance(C19088t.class, tVar);
    }

    private C19088t() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.f53546l = emptyProtobufList();
        emptyProtobufList();
        emptyLongList();
        this.f53548n = emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo24284a() {
        C62971cq cqVar = this.f53544j;
        if (!cqVar.mo58948c()) {
            this.f53544j = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f53550q);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f53550q = b;
                return null;
            case 2:
                return newMessageInfo(f53533p, "\u0001\u000e\u0000\u0001\u0001\u0018\u000e\u0000\u0003\u0005\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0006\u0006ဉ\u0007\u0007ᐉ\b\b\u001b\tᐉ\n\u000eᐉ\u0004\u0010\u001b\u0015ဌ\f\u0017\u001b\u0018ဉ\u000e", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C30325g.f82003a, C19618h.f54585a, "i", "j", C19077i.class, C19621k.f54601a, C10662f.f35572a, "l", C48436z.class, "m", C64754b.m96455b(), C48004n.f124238a, C19072d.class, C66412o.f180592a});
            case 3:
                return new C19088t();
            case 4:
                return new C19087s();
            case 5:
                return f53533p;
            case 6:
                C63010eb ebVar = f53534r;
                if (ebVar == null) {
                    synchronized (C19088t.class) {
                        ebVar = f53534r;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53533p);
                            f53534r = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
