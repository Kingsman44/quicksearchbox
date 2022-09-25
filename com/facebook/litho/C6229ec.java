package com.facebook.litho;

import com.facebook.p313c.C6063v;
import com.facebook.p313c.p314a.C6021a;
import com.facebook.p313c.p314a.C6022b;
import java.util.Map;

/* renamed from: com.facebook.litho.ec */
/* compiled from: PG */
public final class C6229ec extends C6022b {

    /* renamed from: a */
    public static final C6229ec f18407a = new C6229ec();

    private C6229ec() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo12574a() {
        return new C6228eb();
    }

    /* renamed from: b */
    public final void mo12575b(C6021a aVar, C6063v vVar, Object obj) {
        C6185de deVar = ((C6201du) vVar).f18345a;
        C6228eb ebVar = (C6228eb) aVar.f17741b;
        long j = deVar.f18263m;
        Map map = ebVar.f18406a;
        Long valueOf = Long.valueOf(j);
        if (!map.containsKey(valueOf)) {
            ebVar.f18406a.put(valueOf, Integer.valueOf(C6198dr.m16448a(obj)));
        }
        C6239em.m16529z(obj, deVar);
    }

    /* renamed from: c */
    public final void mo12576c(C6021a aVar, C6063v vVar, Object obj) {
        C6185de deVar = ((C6201du) vVar).f18345a;
        Integer num = (Integer) ((C6228eb) aVar.f17741b).f18406a.get(Long.valueOf(deVar.f18263m));
        if (num != null) {
            C6239em.m16511F(obj, deVar, num.intValue());
            return;
        }
        throw new IllegalStateException("View attributes not found, did you call onUnbindItem without onBindItem?");
    }
}
