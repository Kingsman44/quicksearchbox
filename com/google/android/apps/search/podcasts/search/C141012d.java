package com.google.android.apps.search.podcasts.search;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.google.android.apps.search.podcasts.search.C141001b;
import com.google.android.libraries.play.unison.binding.C31974aw;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46801dp;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.search.d */
/* compiled from: PG */
public final class C141012d implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ View f382827a;

    /* renamed from: b */
    final /* synthetic */ C141001b f382828b;

    public C141012d(View view, C141001b bVar) {
        this.f382827a = view;
        this.f382828b = bVar;
    }

    public final void afterTextChanged(Editable editable) {
        C69664n.m101061g(editable, C59002s.f156871a);
        this.f382827a.setVisibility(editable.length() > 0 ? 0 : 4);
        C141001b bVar = this.f382828b;
        C46801dp dpVar = bVar.f382805d;
        C46689ag a = bVar.f382806e.mo116072a(editable.toString());
        C141001b bVar2 = this.f382828b;
        C31974aw awVar = bVar2.f382811j;
        C69664n.m101058d(awVar);
        dpVar.mo50707a(a, new C141001b.C141002a(bVar2, awVar));
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
