package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9994b;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123787p;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131179d;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131253v;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.C131596c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60948g;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.b.a */
/* compiled from: PG */
public final class C131598a {

    /* renamed from: a */
    public final C58974d f359553a;

    /* renamed from: b */
    public final Context f359554b;

    /* renamed from: c */
    public final C21370a f359555c;

    /* renamed from: d */
    public final C131596c f359556d;

    /* renamed from: e */
    public final boolean f359557e;

    public C131598a(Context context, C21370a aVar, C131596c cVar, C130603a aVar2, boolean z) {
        this.f359554b = context;
        this.f359555c = aVar;
        this.f359556d = cVar;
        this.f359553a = aVar2.mo109740b(this);
        this.f359557e = z;
    }

    /* renamed from: a */
    public final String mo110206a(C123787p pVar) {
        CharSequence charSequence;
        C123787p pVar2 = pVar;
        StringBuilder sb = new StringBuilder();
        long millis = Duration.ofSeconds(pVar2.f341954e).toMillis();
        long millis2 = (pVar2.f341950a & 16) != 0 ? Duration.ofSeconds(pVar2.f341955f).toMillis() : millis;
        Context context = this.f359554b;
        C60948g gVar = C60948g.f165068a;
        CharSequence c = C131253v.m213756c(context, millis, Instant.now().toEpochMilli(), this.f359557e);
        if ((pVar2.f341950a & 16) != 0) {
            if (C131253v.m213754a(millis, millis2)) {
                charSequence = C131253v.m213755b(this.f359554b, millis2, this.f359557e);
            } else {
                charSequence = C131253v.m213756c(this.f359554b, millis2, Instant.now().toEpochMilli(), this.f359557e);
            }
            sb.append(this.f359554b.getString(R.string.assistant_calendar_event_time_range, new Object[]{c, charSequence}));
        } else {
            sb.append(c);
        }
        if (!pVar2.f341956g.isEmpty()) {
            sb.append(" · ");
            sb.append(pVar2.f341956g);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public final boolean mo110207b(C123787p pVar) {
        long seconds = Duration.ofMillis(this.f359555c.mo26870b()).getSeconds();
        long j = pVar.f341954e;
        long j2 = C131179d.f358773i;
        if (j <= seconds && seconds - j <= j2) {
            return true;
        }
        return j >= seconds && j - seconds <= C131179d.f358772h;
    }
}
