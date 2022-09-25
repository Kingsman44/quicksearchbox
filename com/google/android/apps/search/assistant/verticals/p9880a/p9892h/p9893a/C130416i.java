package com.google.android.apps.search.assistant.verticals.p9880a.p9892h.p9893a;

import android.content.pm.ShortcutInfo;
import com.google.assistant.p3825an.p3830c.p3831a.C49330g;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import java.util.List;
import p3186j$.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.h.a.i */
/* compiled from: PG */
public final /* synthetic */ class C130416i implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C130420m f357371a;

    public /* synthetic */ C130416i(C130420m mVar) {
        this.f357371a = mVar;
    }

    public final Object apply(Object obj) {
        C130420m mVar = this.f357371a;
        C58485gu guVar = (C58485gu) obj;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            ShortcutInfo shortcutInfo = (ShortcutInfo) guVar.get(i);
            String str = shortcutInfo.getPackage();
            Optional c = C130414g.m212853c(shortcutInfo);
            if (c.isPresent()) {
                ((List) Map.EL.computeIfAbsent(mVar.f357377b, str, C130417j.f357372a)).add((C49330g) c.get());
            }
        }
        return null;
    }
}
