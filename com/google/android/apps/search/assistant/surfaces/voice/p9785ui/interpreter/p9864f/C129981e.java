package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9864f;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.C127120a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9856a.C129855b;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.local.C46855i;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.f.e */
/* compiled from: PG */
public final class C129981e {

    /* renamed from: a */
    public final C129978b f356488a;

    /* renamed from: b */
    public final C127120a f356489b;

    /* renamed from: c */
    public final C46855i f356490c;

    /* renamed from: d */
    public final C129855b f356491d;

    public C129981e(C129978b bVar, C127120a aVar, C129855b bVar2, C46855i iVar) {
        C69664n.m101061g(iVar, "subscriptionMixin");
        this.f356488a = bVar;
        this.f356489b = aVar;
        this.f356491d = bVar2;
        this.f356490c = iVar;
    }

    /* renamed from: a */
    public final TextView mo109364a() {
        View findViewById = this.f356488a.requireView().findViewById(R.id.assistant_interpreter_message);
        C69664n.m101060f(findViewById, "fragment.requireView().f…tant_interpreter_message)");
        return (TextView) findViewById;
    }
}
