package com.google.assistant.p3886c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.dh */
/* compiled from: PG */
public final class C50811dh extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C50811dh f132269h;

    /* renamed from: i */
    private static volatile C63010eb f132270i;

    /* renamed from: a */
    public int f132271a;

    /* renamed from: b */
    public String f132272b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f132273c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f132274d = 1;

    /* renamed from: e */
    public String f132275e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f132276f;

    /* renamed from: g */
    public int f132277g;

    static {
        C50811dh dhVar = new C50811dh();
        f132269h = dhVar;
        C62942bv.registerDefaultInstance(C50811dh.class, dhVar);
    }

    private C50811dh() {
        emptyIntList();
        this.f132276f = 1;
        this.f132277g = 1;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f132269h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဈ\u0003\u0006ဌ\u0004\u0007ဌ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", C50808de.m85946b(), "e", C10662f.f35572a, C50810dg.m85948b(), C30325g.f82003a, C50806dc.m85944b()});
            case 3:
                return new C50811dh();
            case 4:
                return new C50804da();
            case 5:
                return f132269h;
            case 6:
                C63010eb ebVar = f132270i;
                if (ebVar == null) {
                    synchronized (C50811dh.class) {
                        ebVar = f132270i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132269h);
                            f132270i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
