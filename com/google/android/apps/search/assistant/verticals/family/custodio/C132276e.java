package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bumptech.glide.C6007z;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.media.C47449e;
import com.google.p427am.p432b.p433a.C8628ag;
import com.google.p427am.p432b.p433a.C8660bl;
import com.google.p427am.p432b.p433a.C8675e;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.e */
/* compiled from: PG */
public final class C132276e extends C0640fb {

    /* renamed from: a */
    public final C47449e f361041a;

    /* renamed from: b */
    public C8660bl f361042b = C8660bl.f29961c;

    /* renamed from: c */
    public C132305f f361043c;

    /* renamed from: d */
    public C132333g f361044d;

    /* renamed from: e */
    private final boolean f361045e;

    public C132276e(C47449e eVar, boolean z) {
        this.f361041a = eVar;
        this.f361045e = z;
    }

    public final int getItemCount() {
        return this.f361042b.f29964b.size() + (this.f361045e ? 1 : 0);
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C132242d dVar = (C132242d) ghVar;
        if (i != getItemCount() - 1 || !this.f361045e) {
            C8675e eVar = (C8675e) this.f361042b.f29964b.get(i);
            C47449e eVar2 = dVar.f360941d.f361041a;
            C8628ag agVar = eVar.f29994c;
            if (agVar == null) {
                agVar = C8628ag.f29890g;
            }
            ((C6007z) eVar2.mo51286a().mo11873k(agVar.f29894c).mo11963P(R.drawable.quantum_gm_ic_account_circle_gm_grey_24)).mo12454r(dVar.f360939b);
            TextView textView = dVar.f360940c;
            C8628ag agVar2 = eVar.f29994c;
            if (agVar2 == null) {
                agVar2 = C8628ag.f29890g;
            }
            textView.setText(agVar2.f29892a);
            dVar.f360938a.setOnClickListener(new C132200c(dVar, eVar));
            return;
        }
        dVar.f360939b.setImageResource(R.drawable.assistant_custodio_add_person);
        dVar.f360940c.setText(R.string.assistant_custodio_child_selection_add_kid_item_text);
        dVar.f360938a.setOnClickListener(new C132139b(dVar));
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C132242d(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.assistant_child_selection_item, viewGroup, false));
    }
}
