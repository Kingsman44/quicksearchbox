package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.ai.b.mb */
/* compiled from: PG */
public final class C7845mb extends C62937bq implements C62938br {

    /* renamed from: p */
    public static final C7845mb f27493p;

    /* renamed from: r */
    private static volatile C63010eb f27494r;

    /* renamed from: a */
    public int f27495a;

    /* renamed from: b */
    public C62971cq f27496b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f27497c = emptyProtobufList();

    /* renamed from: d */
    public int f27498d;

    /* renamed from: e */
    public int f27499e;

    /* renamed from: f */
    public boolean f27500f;

    /* renamed from: g */
    public boolean f27501g;

    /* renamed from: h */
    public boolean f27502h;

    /* renamed from: i */
    public int f27503i;

    /* renamed from: j */
    public C7536ax f27504j;

    /* renamed from: k */
    public String f27505k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public C7998rt f27506l;

    /* renamed from: m */
    public boolean f27507m;

    /* renamed from: n */
    public int f27508n;

    /* renamed from: o */
    public int f27509o;

    /* renamed from: q */
    private byte f27510q = 2;

    static {
        C7845mb mbVar = new C7845mb();
        f27493p = mbVar;
        C62942bv.registerDefaultInstance(C7845mb.class, mbVar);
    }

    private C7845mb() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27510q);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27510q = b;
                return null;
            case 2:
                return newMessageInfo(f27493p, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0004\u0001Л\u0002Л\u0003င\u0000\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဌ\u0005\u0007ᐉ\u0006\bဈ\u0007\tᐉ\b\nဇ\t\u000bင\n\fင\u000b\rင\u0001\u000eဇ\u0002", new Object[]{"a", "b", C7994rp.class, C45240c.f118157a, C7994rp.class, "d", C30325g.f82003a, C19618h.f54585a, "i", C7842lz.f27492a, "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, "e", C10662f.f35572a});
            case 3:
                return new C7845mb();
            case 4:
                return new C7841ly();
            case 5:
                return f27493p;
            case 6:
                C63010eb ebVar = f27494r;
                if (ebVar == null) {
                    synchronized (C7845mb.class) {
                        ebVar = f27494r;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27493p);
                            f27494r = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
