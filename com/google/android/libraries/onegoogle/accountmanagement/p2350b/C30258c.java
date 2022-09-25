package com.google.android.libraries.onegoogle.accountmanagement.p2350b;

import android.content.Context;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.p098j.C2043bi;
import androidx.lifecycle.C2333ah;
import androidx.lifecycle.C2391v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.account.disc.C30190ar;
import com.google.android.libraries.onegoogle.account.disc.C30213m;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.account.particle.AccountParticle;
import com.google.android.libraries.onegoogle.account.particle.C30230d;
import com.google.android.libraries.onegoogle.account.particle.C30233g;
import com.google.android.libraries.onegoogle.account.particle.C30238l;
import com.google.android.libraries.onegoogle.accountmanagement.p2349a.C30254a;
import com.google.android.libraries.onegoogle.accountmenu.features.criticalalert.C30528d;
import com.google.android.libraries.onegoogle.common.C30922i;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.onegoogle.accountmanagement.b.c */
/* compiled from: PG */
public final class C30258c extends C0673gh {

    /* renamed from: a */
    public final AccountParticle f81814a;

    /* renamed from: b */
    public final C58833ax f81815b;

    /* renamed from: c */
    public final C30158c f81816c;

    /* renamed from: d */
    public final C2333ah f81817d;

    /* renamed from: e */
    public final C58833ax f81818e;

    /* renamed from: f */
    public final C30897z f81819f;

    /* renamed from: g */
    public Object f81820g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30258c(ViewGroup viewGroup, Context context, C30158c cVar, C30213m mVar, C58833ax axVar, boolean z, C58833ax axVar2, int i, C30897z zVar, C30922i iVar) {
        super(LayoutInflater.from(context).inflate(R.layout.account_list_item, viewGroup, false));
        C58833ax axVar3 = axVar2;
        ViewGroup viewGroup2 = viewGroup;
        int i2 = i;
        m56287b(this.itemView, i2, i2);
        this.f81816c = cVar;
        AccountParticle accountParticle = (AccountParticle) this.itemView.findViewById(R.id.account_list_item_particle);
        this.f81814a = accountParticle;
        this.f81815b = axVar;
        this.f81818e = axVar3;
        this.f81819f = zVar;
        m56287b(accountParticle, accountParticle.getResources().getDimensionPixelSize(R.dimen.account_particle_avatar_margin_start), 0);
        accountParticle.f81716b.mo35593k(z);
        accountParticle.f81716b.mo35590h();
        C30213m mVar2 = mVar;
        accountParticle.f81716b.mo35600r(mVar, cVar);
        accountParticle.f81715a = new C30230d(accountParticle, cVar, axVar3);
        C30190ar arVar = null;
        if (axVar2.mo56113h()) {
            C58833ax e = ((C30233g) axVar2.mo56107c()).mo35710e();
            if (e.mo56113h()) {
                C2391v a = ((C30233g) axVar2.mo56107c()).mo35706a();
                arVar = new C30190ar(C58485gu.m89846n(new C30528d(accountParticle.getContext(), a, (C30238l) e.mo56107c())), a);
            }
        }
        if (arVar != null) {
            accountParticle.f81716b.mo35595m(arVar);
        }
        if (axVar.mo56113h()) {
            C30254a aVar = (C30254a) axVar.mo56107c();
            ((ImageView) accountParticle.findViewById(R.id.og_account_deactivated_help_tooltip)).setImageResource(R.drawable.quantum_gm_ic_info_outline_vd_theme_24);
        }
        this.f81817d = new C30257b(this, axVar2, (ViewGroup) this.itemView.findViewById(R.id.account_list_item_critical_alert_container), iVar, zVar);
    }

    /* renamed from: b */
    private static void m56287b(View view, int i, int i2) {
        C2043bi.m5556aj(view, C2043bi.m5583l(view) + i, view.getPaddingTop(), C2043bi.m5582k(view) + i2, view.getPaddingBottom());
    }

    /* renamed from: a */
    public final void mo35768a() {
        this.f81814a.mo35632lk(this.f81819f);
        this.f81814a.f81719e = false;
        if (this.f81818e.mo56113h() && ((C30233g) this.f81818e.mo56107c()).mo35710e().mo56113h()) {
            ((C30238l) ((C30233g) this.f81818e.mo56107c()).mo35710e().mo56107c()).mo5679j(this.f81817d);
        }
    }
}
