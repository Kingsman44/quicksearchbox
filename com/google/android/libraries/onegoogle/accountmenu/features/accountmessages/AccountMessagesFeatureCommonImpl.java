package com.google.android.libraries.onegoogle.accountmenu.features.accountmessages;

import android.content.Context;
import android.support.p033v7.widget.C0678gm;
import androidx.lifecycle.C2332ag;
import androidx.lifecycle.C2391v;
import com.google.android.gms.p10815k.C144408h;
import com.google.android.gms.p10815k.C144416p;
import com.google.android.gms.p10815k.C144418r;
import com.google.android.gms.p10815k.p10816a.C144366ah;
import com.google.android.gms.p10815k.p10816a.C144376ar;
import com.google.android.gms.p10815k.p10816a.C144400y;
import com.google.android.gms.p10815k.p10816a.C144401z;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.account.disc.C30176ad;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30354ai;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30418cs;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30439g;
import com.google.android.libraries.onegoogle.accountmenu.features.AccountMessagesFeature;
import com.google.android.libraries.onegoogle.accountmenu.features.p2363d.C30543a;
import com.google.android.libraries.onegoogle.common.C30904ad;
import com.google.android.libraries.onegoogle.common.C30915b;
import com.google.android.libraries.onegoogle.common.C30916c;
import com.google.android.libraries.onegoogle.common.C30925l;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import p3186j$.util.Objects;

/* compiled from: PG */
public abstract class AccountMessagesFeatureCommonImpl extends AccountMessagesFeature {

    /* renamed from: a */
    public final C30158c f82396a;

    /* renamed from: b */
    public final C144416p f82397b;

    /* renamed from: c */
    public C30512d f82398c;

    /* renamed from: d */
    public Object f82399d;

    /* renamed from: e */
    public C30513e f82400e;

    /* renamed from: f */
    public C58495hd f82401f = C58729pv.f156485a;

    /* renamed from: g */
    public boolean f82402g;

    /* renamed from: h */
    private final C144418r f82403h;

    protected AccountMessagesFeatureCommonImpl(C30158c cVar, C144416p pVar) {
        this.f82396a = cVar;
        this.f82397b = pVar;
        this.f82403h = new C30514f(this);
    }

    /* renamed from: i */
    public static void m56933i(C30158c cVar, Object obj, C58495hd hdVar, C30512d dVar, boolean z) {
        C144408h hVar = (C144408h) C30543a.m57048a(cVar, obj, hdVar, z ? C144408h.f390991c : null);
        if (!Objects.equals(hVar, dVar.f82413l)) {
            dVar.mo36156f(hVar);
        }
    }

    /* renamed from: g */
    public final C30176ad mo36127g(Context context) {
        C30513e eVar = new C30513e(context, this.f82396a);
        this.f82400e = eVar;
        eVar.mo36158c(this.f82401f);
        return this.f82400e;
    }

    /* renamed from: gZ */
    public final void mo3524gZ(C2391v vVar) {
        C144416p pVar = this.f82397b;
        C144366ah.f390946b.mo119876b(this.f82403h, new C144400y((C144376ar) pVar));
    }

    /* renamed from: h */
    public final C30354ai mo36128h(Context context, C2332ag agVar, C2391v vVar) {
        C30925l b = C30925l.m57719b(context);
        String string = context.getString(R.string.og_recommended_actions_entry_point);
        C30915b bVar = (C30915b) b;
        return new C30439g(new C30515g(this, new C30517i(context.getString(R.string.og_account_is_in_good_shape_entry_point), string, context.getString(R.string.og_important_actions_available_a11y_label, new Object[]{string}), C30418cs.m56635d(C0678gm.m2375e().mo3100c(bVar.f83342a, true != ((C30916c) C30904ad.m57690e(context)).f83343a ? R.drawable.yellow_alert_dark_vd : R.drawable.yellow_alert_vd)), C30418cs.m56636e(C0678gm.m2375e().mo3100c(bVar.f83342a, R.drawable.quantum_gm_ic_check_vd_theme_24)), C30418cs.m56636e(C0678gm.m2375e().mo3100c(bVar.f83342a, R.drawable.safer_gshield_ic_outline_hero))), agVar, vVar));
    }

    /* renamed from: ha */
    public final void mo3525ha(C2391v vVar) {
        C144416p pVar = this.f82397b;
        C144366ah.f390946b.mo119877c(this.f82403h, new C144401z((C144376ar) pVar));
    }
}
