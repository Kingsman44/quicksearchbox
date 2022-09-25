package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9763f.p9766b;

import android.view.View;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128833h;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128839n;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.f.b.c */
/* compiled from: PG */
final class C128864c implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C128866e f354179a;

    public C128864c(C128866e eVar) {
        this.f354179a = eVar;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        C128833h hVar = (C128833h) obj;
        C69664n.m101061g(hVar, "data");
        View findViewById = this.f354179a.f354185a.requireView().findViewById(R.id.assistant_voice_plate_greeting);
        C69664n.m101060f(findViewById, "fragment.requireView().f…ant_voice_plate_greeting)");
        TextView textView = (TextView) findViewById;
        C128839n nVar = hVar.f354117a;
        C128839n nVar2 = C128839n.UNKNOWN;
        int ordinal = nVar.ordinal();
        if (ordinal == 0) {
            textView.setText(BuildConfig.FLAVOR);
        } else if (ordinal == 1) {
            textView.setText(R.string.assistant_voice_plate_greeting_hi_text);
        }
    }
}
