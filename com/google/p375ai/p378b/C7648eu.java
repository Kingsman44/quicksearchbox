package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.eu */
/* compiled from: PG */
public final class C7648eu extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C7648eu f26542o;

    /* renamed from: q */
    private static volatile C63010eb f26543q;

    /* renamed from: a */
    public int f26544a;

    /* renamed from: b */
    public String f26545b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f26546c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f26547d;

    /* renamed from: e */
    public int f26548e;

    /* renamed from: f */
    public int f26549f;

    /* renamed from: g */
    public boolean f26550g;

    /* renamed from: h */
    public int f26551h;

    /* renamed from: i */
    public int f26552i;

    /* renamed from: j */
    public int f26553j;

    /* renamed from: k */
    public boolean f26554k;

    /* renamed from: l */
    public long f26555l;

    /* renamed from: m */
    public C8150xj f26556m;

    /* renamed from: n */
    public C7536ax f26557n;

    /* renamed from: p */
    private byte f26558p = 2;

    static {
        C7648eu euVar = new C7648eu();
        f26542o = euVar;
        C62942bv.registerDefaultInstance(C7648eu.class, euVar);
    }

    private C7648eu() {
        emptyProtobufList();
        this.f26549f = 1;
        this.f26550g = true;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f26558p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f26558p = b;
                return null;
            case 2:
                return newMessageInfo(f26542o, "\u0001\r\u0000\u0001\u0001\u0013\r\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဆ\u0002\u0004ဆ\u0003\u0006ဌ\u0005\tဇ\t\nင\n\u000bင\u000b\fဇ\u000e\rဈ\u0001\u000eင\f\u0011ဂ\u000f\u0012ဉ\u0010\u0013ᐉ\u0011", new Object[]{"a", "b", "d", "e", C10662f.f35572a, C7646es.f26541a, C30325g.f82003a, C19618h.f54585a, "i", C19621k.f54601a, C45240c.f118157a, "j", "l", "m", C48004n.f124238a});
            case 3:
                return new C7648eu();
            case 4:
                return new C7645er();
            case 5:
                return f26542o;
            case 6:
                C63010eb ebVar = f26543q;
                if (ebVar == null) {
                    synchronized (C7648eu.class) {
                        ebVar = f26543q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26542o);
                            f26543q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
