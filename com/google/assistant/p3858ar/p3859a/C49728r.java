package com.google.assistant.p3858ar.p3859a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3781ad.p3789d.C48578al;
import com.google.common.p4552o.p4553a.C59450aa;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ar.a.r */
/* compiled from: PG */
public final class C49728r extends C62937bq implements C62938br {

    /* renamed from: j */
    public static final C49728r f128339j;

    /* renamed from: l */
    private static volatile C63010eb f128340l;

    /* renamed from: a */
    public int f128341a;

    /* renamed from: b */
    public String f128342b;

    /* renamed from: c */
    public String f128343c;

    /* renamed from: d */
    public C62971cq f128344d;

    /* renamed from: e */
    public C49716f f128345e;

    /* renamed from: f */
    public C49725o f128346f;

    /* renamed from: g */
    public C49723m f128347g;

    /* renamed from: h */
    public int f128348h;

    /* renamed from: i */
    public C59450aa f128349i;

    /* renamed from: k */
    private byte f128350k = 2;

    static {
        C49728r rVar = new C49728r();
        f128339j = rVar;
        C62942bv.registerDefaultInstance(C49728r.class, rVar);
    }

    private C49728r() {
        emptyProtobufList();
        this.f128342b = BuildConfig.FLAVOR;
        this.f128343c = BuildConfig.FLAVOR;
        this.f128344d = emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f128350k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f128350k = b;
                return null;
            case 2:
                return newMessageInfo(f128339j, "\u0001\b\u0000\u0001\u0002\f\b\u0000\u0001\u0001\u0002ဈ\u0000\u0004Л\u0006ဉ\u0004\bဉ\u0006\tဉ\u0007\nဌ\b\u000bဈ\u0002\fဉ\t", new Object[]{"a", "b", "d", C48578al.class, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C49726p.f128338a, C45240c.f118157a, "i"});
            case 3:
                return new C49728r();
            case 4:
                return new C49721k();
            case 5:
                return f128339j;
            case 6:
                C63010eb ebVar = f128340l;
                if (ebVar == null) {
                    synchronized (C49728r.class) {
                        ebVar = f128340l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128339j);
                            f128340l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
