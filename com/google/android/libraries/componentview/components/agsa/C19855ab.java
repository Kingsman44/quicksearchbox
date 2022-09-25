package com.google.android.libraries.componentview.components.agsa;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import android.view.View;
import com.google.android.libraries.componentview.components.agsa.p1684a.C19851j;
import com.google.android.libraries.componentview.components.base.p1687a.C19983f;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.p1699f.C20524l;

/* renamed from: com.google.android.libraries.componentview.components.agsa.ab */
/* compiled from: PG */
final class C19855ab implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C19856ac f55531a;

    public C19855ab(C19856ac acVar) {
        this.f55531a = acVar;
    }

    public final void onClick(View view) {
        Intent intent;
        C19851j jVar = this.f55531a.f55534c;
        if ((jVar.f55516a & 8) != 0) {
            String str = jVar.f55520e;
            int i = jVar.f55521f;
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.putExtra("log_event", "GoogleNowWeatherCard");
            intent2.putExtra("timestamp_key", System.currentTimeMillis());
            intent2.putExtra("location", Base64.decode(str, 0));
            intent2.addFlags(268435456);
            intent2.putExtra("default_tab_index", i);
            Uri.Builder appendPath = new Uri.Builder().scheme("dynact").authority("velour").appendPath("weather").appendPath("WeatherActivity");
            Uri data = intent2.getData();
            if (data != null) {
                appendPath.appendQueryParameter("data", data.toString());
            }
            intent = new Intent(intent2.getAction(), appendPath.build());
            intent.addFlags(intent2.getFlags());
            intent.setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.velour.DynamicActivityTrampoline"));
            intent.putExtra("com.google.android.libraries.velour.INNER_INTENT", intent2);
        } else {
            intent = null;
        }
        if (intent == null) {
            try {
                C19856ac acVar = this.f55531a;
                C19851j jVar2 = acVar.f55534c;
                if ((jVar2.f55516a & 2) != 0) {
                    C20524l lVar = acVar.f55532a;
                    C19983f fVar = jVar2.f55518c;
                    if (fVar == null) {
                        fVar = C19983f.f56002g;
                    }
                    lVar.mo25440b(fVar, this.f55531a.mo25419H());
                }
            } catch (Exception unused) {
                C20520h.m38497b(5, "WeatherLinkComponent", (Throwable) null, "Failed to parse Action proto", new Object[0]);
            }
        } else {
            this.f55531a.f55533b.mo21040b(intent);
        }
    }
}
