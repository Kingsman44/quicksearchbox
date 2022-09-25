package com.google.android.apps.search.googleapp.discover.streamui.impl.p10234a;

import android.text.format.DateUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.search.googleapp.discover.p10248y.C135264o;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21385h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.a.p */
/* compiled from: PG */
final class C134796p implements C21385h {

    /* renamed from: a */
    final /* synthetic */ View f367027a;

    /* renamed from: b */
    final /* synthetic */ C134799s f367028b;

    /* renamed from: c */
    final /* synthetic */ C135264o f367029c;

    public C134796p(View view, C134799s sVar, C135264o oVar) {
        this.f367027a = view;
        this.f367028b = sVar;
        this.f367029c = oVar;
    }

    /* renamed from: a */
    public final void mo25386a() {
        TextView textView = (TextView) this.f367027a.findViewById(R.id.googleapp_discover_message);
        if (textView == null) {
            C59052c cVar = (C59052c) C134799s.f367033a.mo56226d();
            cVar.mo56379ah(new C59094n(40522));
            cVar.mo56386p("Could not find message view");
            return;
        }
        C134799s sVar = this.f367028b;
        Instant instant = this.f367029c.f368493a;
        if (Duration.between(instant, sVar.f367034b.mo57444a()).compareTo(sVar.f367036d) > 0) {
            textView.setText(textView.getContext().getString(R.string.googleapp_discover_error_card_no_internet_stale_content_message, new Object[]{DateUtils.getRelativeTimeSpanString(instant.toEpochMilli(), System.currentTimeMillis(), 60000)}));
        }
    }
}
