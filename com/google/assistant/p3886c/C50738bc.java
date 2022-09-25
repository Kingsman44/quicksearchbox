package com.google.assistant.p3886c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.p3809c.C49156z;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.bc */
/* compiled from: PG */
public final class C50738bc extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C50738bc f132032l;

    /* renamed from: n */
    private static volatile C63010eb f132033n;

    /* renamed from: a */
    public int f132034a;

    /* renamed from: b */
    public int f132035b = 0;

    /* renamed from: c */
    public Object f132036c;

    /* renamed from: d */
    public String f132037d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f132038e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C50710av f132039f;

    /* renamed from: g */
    public int f132040g;

    /* renamed from: h */
    public C49156z f132041h;

    /* renamed from: i */
    public boolean f132042i;

    /* renamed from: j */
    public C62971cq f132043j = emptyProtobufList();

    /* renamed from: k */
    public C50706ar f132044k;

    /* renamed from: m */
    private byte f132045m = 2;

    static {
        C50738bc bcVar = new C50738bc();
        f132032l = bcVar;
        C62942bv.registerDefaultInstance(C50738bc.class, bcVar);
    }

    private C50738bc() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f132045m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f132045m = b;
                return null;
            case 2:
                return newMessageInfo(f132032l, "\u0001\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0001\u0003\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဌ\u0003\u0005ဉ\u0004\u0006ျ\u0000\u0007ြ\u0000\bᐼ\u0000\tЛ\nᐉ\t\u000bဇ\b", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C10662f.f35572a, C30325g.f82003a, C50701am.m85888b(), C19618h.f54585a, C50737bb.class, C50712ax.class, "j", C50704ap.class, C19621k.f54601a, "i"});
            case 3:
                return new C50738bc();
            case 4:
                return new C50702an();
            case 5:
                return f132032l;
            case 6:
                C63010eb ebVar = f132033n;
                if (ebVar == null) {
                    synchronized (C50738bc.class) {
                        ebVar = f132033n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132032l);
                            f132033n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
