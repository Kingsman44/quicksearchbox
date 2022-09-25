package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9981n.p9982a;

import android.content.Context;
import android.util.LruCache;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.n.a.f */
/* compiled from: PG */
public final class C131440f {

    /* renamed from: a */
    private final Context f359258a;

    /* renamed from: b */
    private final boolean f359259b;

    /* renamed from: c */
    private final Optional f359260c;

    /* renamed from: d */
    private final LruCache f359261d = new LruCache(1024);

    public C131440f(Context context, boolean z, Optional optional) {
        this.f359258a = context;
        this.f359259b = z;
        this.f359260c = optional;
    }

    /* renamed from: a */
    public final C60870cx mo110174a(String str, String str2, Instant instant) {
        C60870cx cxVar;
        C131439e eVar = (C131439e) this.f359261d.get(str2);
        if (eVar != null && !eVar.mo110169b().isBefore(instant)) {
            return eVar.mo110169b().isAfter(instant) ? C47633f.m84733g(C60856cj.m92900i(false)) : eVar.mo110168a();
        }
        if (str == null) {
            cxVar = C47633f.m84733g(C60856cj.m92900i(false));
        } else {
            Stream map = Collection.EL.stream(C58528ij.m90008H(this.f359258a.getResources().getStringArray(R.array.assistant_shopping_list_keywords))).map(C131436b.f359256a);
            String c = C58890d.m90988c(str);
            Objects.requireNonNull(c);
            if (map.anyMatch(new C131437c(c))) {
                cxVar = C47633f.m84733g(C60856cj.m92900i(true));
            } else if (this.f359259b) {
                cxVar = (C60870cx) this.f359260c.map(new C131438d()).orElse(C47633f.m84733g(C60856cj.m92900i(false)));
            } else {
                cxVar = C47633f.m84733g(C60856cj.m92900i(false));
            }
        }
        this.f359261d.put(str2, new C131434a(cxVar, instant));
        return cxVar;
    }
}
