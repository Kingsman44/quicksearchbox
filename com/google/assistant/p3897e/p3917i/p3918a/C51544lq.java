package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.lq */
/* compiled from: PG */
public final class C51544lq extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C51544lq f134342j;

    /* renamed from: l */
    private static volatile C63010eb f134343l;

    /* renamed from: a */
    public int f134344a;

    /* renamed from: b */
    public C51541ln f134345b;

    /* renamed from: c */
    public String f134346c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62961ch f134347d = emptyIntList();

    /* renamed from: e */
    public String f134348e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f134349f;

    /* renamed from: g */
    public boolean f134350g;

    /* renamed from: h */
    public C51543lp f134351h;

    /* renamed from: i */
    public boolean f134352i;

    /* renamed from: k */
    private byte f134353k = 2;

    static {
        C51544lq lqVar = new C51544lq();
        f134342j = lqVar;
        C62942bv.registerDefaultInstance(C51544lq.class, lqVar);
    }

    private C51544lq() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f134353k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f134353k = b;
                return null;
            case 2:
                return newMessageInfo(f134342j, "\u0001\b\u0000\u0001\u0003\u0016\b\u0000\u0001\u0000\u0003ဈ\u0003\u0006\u0016\u0007ဇ\u0007\nဈ\u0006\u000bဉ\u0001\u0012ဇ\b\u0015ဉ\t\u0016ဇ\u0011", new Object[]{"a", C45240c.f118157a, "d", C10662f.f35572a, "e", "b", C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C51544lq();
            case 4:
                return new C51537lj();
            case 5:
                return f134342j;
            case 6:
                C63010eb ebVar = f134343l;
                if (ebVar == null) {
                    synchronized (C51544lq.class) {
                        ebVar = f134343l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134342j);
                            f134343l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
