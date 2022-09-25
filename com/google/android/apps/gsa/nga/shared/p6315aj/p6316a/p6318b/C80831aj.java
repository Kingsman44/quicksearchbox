package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b;

import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9728d.C128537b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.b.aj */
/* compiled from: PG */
public final class C80831aj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80831aj f221751c;

    /* renamed from: e */
    private static volatile C63010eb f221752e;

    /* renamed from: a */
    public int f221753a = 0;

    /* renamed from: b */
    public Object f221754b;

    /* renamed from: d */
    private byte f221755d = 2;

    static {
        C80831aj ajVar = new C80831aj();
        f221751c = ajVar;
        C62942bv.registerDefaultInstance(C80831aj.class, ajVar);
    }

    private C80831aj() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f221755d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f221755d = b;
                return null;
            case 2:
                return newMessageInfo(f221751c, "\u0000\u0010\u0001\u0000\u0001\u0018\u0010\u0000\u0000\u0003\u0001<\u0000\u0002м\u0000\u0005м\u0000\t<\u0000\n<\u0000\u000b<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0015м\u0000\u0016<\u0000\u0018<\u0000", new Object[]{"b", "a", C80879y.class, C80865k.class, C80863i.class, C80869o.class, C80875u.class, C80830ai.class, C80826ae.class, C80824ac.class, C80828ag.class, C80861g.class, C80867m.class, C80877w.class, C80871q.class, C80873s.class, C128537b.class, C80822aa.class});
            case 3:
                return new C80831aj();
            case 4:
                return new C80859e();
            case 5:
                return f221751c;
            case 6:
                C63010eb ebVar = f221752e;
                if (ebVar == null) {
                    synchronized (C80831aj.class) {
                        ebVar = f221752e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221751c);
                            f221752e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
