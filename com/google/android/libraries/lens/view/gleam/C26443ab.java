package com.google.android.libraries.lens.view.gleam;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.p033v7.widget.LinearLayoutManager;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.p287f.C5592i;
import com.bumptech.glide.p291h.C5622i;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.p2069am.C25308ap;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.media.C47449e;
import com.google.common.base.C58833ax;
import com.google.lens.p4699e.C62214b;
import com.google.lens.p4699e.C62227h;

/* renamed from: com.google.android.libraries.lens.view.gleam.ab */
/* compiled from: PG */
final class C26443ab extends C26461at {

    /* renamed from: g */
    public final Drawable f71970g;

    /* renamed from: w */
    private final C47449e f71971w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26443ab(Context context, C26553ed edVar, C21370a aVar, C25308ap apVar, int i, int i2, C47449e eVar, C26244b bVar) {
        super(context, edVar, aVar, apVar, i, i2, bVar);
        C62227h hVar;
        C25308ap apVar2 = apVar;
        this.f71971w = eVar;
        Drawable drawable = context.getDrawable(R.drawable.quantum_ic_public_white_24);
        drawable.getClass();
        this.f71970g = drawable;
        drawable.setTint(this.f72070t.mo31836c().getColor());
        this.f72071u = C58833ax.m90834k(drawable);
        if (apVar2.f68843d == 19) {
            hVar = (C62227h) apVar2.f68844e;
        } else {
            hVar = C62227h.f168014f;
        }
        this.f72072v = hVar.f168018c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final float mo31658h() {
        return 1.2f;
    }

    /* renamed from: i */
    public final void mo31659i() {
    }

    /* renamed from: j */
    public final void mo31660j() {
        C62227h hVar;
        super.mo31660j();
        C25308ap apVar = this.f71963a;
        if (apVar.f68843d == 19) {
            hVar = (C62227h) apVar.f68844e;
        } else {
            hVar = C62227h.f168014f;
        }
        String str = hVar.f168019d;
        if (!str.isEmpty()) {
            C6007z zVar = (C6007z) this.f71971w.mo51286a().mo11870h(Uri.parse(str)).mo11961N(LinearLayoutManager.INVALID_OFFSET);
            zVar.mo12455s(new C26442aa(this, ((C26559ej) this.f71997h).f72403i), (C5592i) null, zVar, C5622i.f16959a);
        }
        mo31709I();
    }

    /* renamed from: k */
    public final void mo31661k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo31662l() {
        C62227h hVar;
        C25308ap apVar = this.f71963a;
        if (apVar.f68843d == 19) {
            hVar = (C62227h) apVar.f68844e;
        } else {
            hVar = C62227h.f168014f;
        }
        int a = C62214b.m94758a(hVar.f168020e);
        return a != 0 && a == 2;
    }
}
