package com.google.android.libraries.lens.view.p2065ai;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2078at.C25536s;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26743al;
import com.google.apps.tiktok.tracing.C47591co;

/* renamed from: com.google.android.libraries.lens.view.ai.ak */
/* compiled from: PG */
public final /* synthetic */ class C25150ak implements C25536s {

    /* renamed from: a */
    public final /* synthetic */ C25155ap f68493a;

    public /* synthetic */ C25150ak(C25155ap apVar) {
        this.f68493a = apVar;
    }

    /* renamed from: a */
    public final boolean mo30290a(int i, Intent intent) {
        C25155ap apVar = this.f68493a;
        if (i != -1 || intent == null || intent.getData() == null) {
            return true;
        }
        C25172j jVar = apVar.f68525x;
        Uri data = intent.getData();
        data.getClass();
        if (!jVar.f68570a.mo56113h()) {
            return true;
        }
        View findViewById = jVar.f68571b.findViewById(R.id.data_source_pause);
        View findViewById2 = jVar.f68571b.findViewById(R.id.data_source_play);
        if (findViewById != null) {
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new C47591co(jVar.f68572c, "Pause DataSource", new C25170h(jVar)));
        }
        if (findViewById2 != null) {
            findViewById2.setVisibility(0);
            findViewById2.setOnClickListener(new C47591co(jVar.f68572c, "Play DataSource", new C25171i(jVar)));
        }
        ((C26743al) jVar.f68570a.mo56107c()).mo32031k(data);
        return true;
    }
}
