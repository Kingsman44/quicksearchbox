package com.google.android.apps.search.assistant.verticals.p9880a.p9892h.p9893a;

import android.content.pm.ShortcutInfo;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.h.a.l */
/* compiled from: PG */
final class C130419l implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f357374a;

    /* renamed from: b */
    final /* synthetic */ C130420m f357375b;

    public C130419l(C130420m mVar, String str) {
        this.f357375b = mVar;
        this.f357374a = str;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C130420m.f357376a.mo56226d()).mo56382g(th)).mo56372aa(39438)).mo56389s("Error when refreshing cache for package %s", this.f357374a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58485gu guVar = (C58485gu) obj;
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            Optional c = C130414g.m212853c((ShortcutInfo) guVar.get(i));
            Objects.requireNonNull(synchronizedList);
            c.ifPresent(new C130418k(synchronizedList));
        }
        this.f357375b.f357377b.put(this.f357374a, synchronizedList);
    }
}
