package com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8493b;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111252o;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111254q;
import com.google.android.googlequicksearchbox.R;
import java.util.concurrent.CopyOnWriteArrayList;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.c.b.s */
/* compiled from: PG */
final class C111274s extends C0640fb {

    /* renamed from: a */
    public final CopyOnWriteArrayList f309652a = new CopyOnWriteArrayList();

    public final int getItemCount() {
        return this.f309652a.size();
    }

    public final int getItemViewType(int i) {
        return ((C111254q) this.f309652a.get(i)).mo99060b() - 1;
    }

    public final void onBindViewHolder(C0673gh ghVar, int i) {
        if (getItemViewType(i) == 1) {
            C111252o a = ((C111254q) this.f309652a.get(i)).mo99059a();
            C111272q qVar = (C111272q) ghVar;
            qVar.f309647b.setText(a.mo99072c());
            ((ImageButton) Objects.requireNonNull(qVar.f309648c)).setImageResource(true != a.mo99073d() ? R.drawable.quantum_ic_expand_less_white_24 : R.drawable.quantum_ic_expand_more_white_24);
            ((TextView) Objects.requireNonNull(qVar.f309649d)).setText(a.mo99071b());
            ((TextView) Objects.requireNonNull(qVar.f309649d)).setVisibility(true != a.mo99073d() ? 8 : 0);
            return;
        }
        ((C111273r) ghVar).f309651a.setText(((C111254q) this.f309652a.get(i)).mo99064c());
    }

    public final C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i != 1) {
            return new C111273r(from.inflate(R.layout.debug_panel_page_list_item, viewGroup, false));
        }
        C111272q qVar = new C111272q(this, from.inflate(R.layout.debug_panel_page_expandable_list_item, viewGroup, false));
        qVar.f309646a.setOnClickListener(new C111271p(qVar));
        return qVar;
    }
}
