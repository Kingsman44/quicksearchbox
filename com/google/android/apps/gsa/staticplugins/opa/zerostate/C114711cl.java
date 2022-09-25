package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114735e;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114742l;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114757k;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28289g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cl */
/* compiled from: PG */
public final class C114711cl extends C0640fb implements C28289g {

    /* renamed from: a */
    public C58485gu f318305a;

    /* renamed from: b */
    private final List f318306b = new ArrayList();

    /* renamed from: c */
    private final C28292j f318307c;

    /* renamed from: d */
    private final C114742l f318308d;

    /* renamed from: e */
    private final LayoutInflater f318309e;

    /* renamed from: f */
    private final C53306j f318310f;

    /* renamed from: g */
    private final C68214a f318311g;

    /* renamed from: h */
    private boolean f318312h;

    public C114711cl(C53306j jVar, Context context, C114742l lVar, Activity activity, C68214a aVar) {
        this.f318309e = LayoutInflater.from(context);
        this.f318310f = jVar;
        this.f318311g = aVar;
        Intent intent = activity.getIntent();
        if (intent != null) {
            this.f318312h = C87566i.m142258aF(intent.getExtras());
        }
        if (jVar.ordinal() != 14) {
            this.f318307c = new C28292j(49852);
        } else {
            this.f318307c = new C28292j(75838);
        }
        this.f318308d = lVar;
    }

    /* renamed from: a */
    public final C28293k mo33782a() {
        return C28293k.m52907d(this.f318307c, this.f318306b);
    }

    /* renamed from: b */
    public final int mo101532b() {
        C58976aa aaVar = C58975e.f156826a;
        C58485gu guVar = this.f318305a;
        if (guVar != null && !guVar.isEmpty()) {
            C53306j jVar = C53306j.UNKNOWNN;
            if (this.f318310f.ordinal() == 1) {
                ((C114735e) this.f318311g.mo27525b()).mo101556d(C89849ae.OPA_ANDROID_ZERO_STATE_RENDERED);
            }
        }
        C58485gu guVar2 = this.f318305a;
        if (guVar2 != null) {
            return guVar2.size();
        }
        return 0;
    }

    public final int getItemCount() {
        int b = this.f318305a != null ? mo101532b() + 1 : 2;
        C58976aa aaVar = C58975e.f156826a;
        return b;
    }

    public final int getItemViewType(int i) {
        int i2 = -1;
        if (i != mo101532b() + 1) {
            i2 = (i == 0 || this.f318305a == null) ? -2 : -1 + i;
        }
        C58976aa aaVar = C58975e.f156826a;
        return i2;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C114710ck ckVar = (C114710ck) ghVar;
    }

    public final /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        C58976aa aaVar = C58975e.f156826a;
        if (i == -2) {
            this.f318306b.add(C28293k.f76979c);
            if (this.f318312h) {
                view = this.f318309e.inflate(R.layout.zero_state_dm_initial_position_placeholder, viewGroup, false);
            } else {
                view = this.f318309e.inflate(R.layout.zero_state_initial_position_placeholder, viewGroup, false);
            }
            return new C114710ck(view);
        } else if (i == -1) {
            return new C114710ck(this.f318309e.inflate(R.layout.zero_state_loading_spinner_view, viewGroup, false));
        } else {
            C58485gu guVar = this.f318305a;
            guVar.getClass();
            C114710ck ckVar = new C114710ck(this.f318309e.inflate(R.layout.zero_state_section_container_view, viewGroup, false));
            C114757k kVar = (C114757k) guVar.get(i);
            ((ViewGroup) ckVar.itemView).addView(kVar.mo101577a());
            C28293k c = kVar.mo101579c();
            kVar.mo101584i();
            if (c == null) {
                return ckVar;
            }
            this.f318306b.add(c);
            this.f318308d.mo101569d(c, this.f318307c);
            return ckVar;
        }
    }
}
