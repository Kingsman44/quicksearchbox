package com.google.android.libraries.web.contrib.p3375f.p3377b.p3380c;

import android.content.Context;
import android.content.Intent;
import android.support.p031v4.app.Fragment;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.contrib.p3375f.p3381c.C43541a;
import com.google.android.libraries.web.p3353c.C43362g;
import com.google.android.libraries.web.p3353c.C43363h;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.android.libraries.web.shared.p3445e.C44096a;
import com.google.apps.tiktok.tracing.C47810es;

/* renamed from: com.google.android.libraries.web.contrib.f.b.c.a */
/* compiled from: PG */
public final class C43540a implements C43541a {

    /* renamed from: a */
    private final Context f113699a;

    /* renamed from: b */
    private final C43377v f113700b;

    /* renamed from: c */
    private final C44096a f113701c;

    public C43540a(Fragment fragment, C43377v vVar, C44096a aVar) {
        this.f113699a = fragment.requireContext();
        this.f113700b = vVar;
        this.f113701c = aVar;
    }

    /* renamed from: a */
    public final int mo46594a() {
        return R.id.webx_share_overflow_menu_item;
    }

    /* renamed from: b */
    public final int mo46595b() {
        return 146650;
    }

    /* renamed from: c */
    public final CharSequence mo46596c() {
        return this.f113699a.getResources().getString(R.string.webx_share_overflow_menu_item_label);
    }

    /* renamed from: d */
    public final void mo46597d() {
        Intent a = this.f113701c.mo47065a(this.f113700b.mo46468a());
        a.addFlags(536870912);
        C47810es.m84979s(this.f113699a, a);
    }

    /* renamed from: e */
    public final boolean mo46598e() {
        C43376u a = this.f113700b.mo46468a();
        String str = a.f113329b;
        if (str.isEmpty()) {
            C43367l lVar = a.f113335h;
            if (lVar == null) {
                lVar = C43367l.f113293h;
            }
            str = lVar.f113296b;
        }
        if (str.isEmpty()) {
            return false;
        }
        C43363h hVar = a.f113331d;
        if (hVar == null) {
            hVar = C43363h.f113275f;
        }
        C43362g a2 = C43362g.m76515a(hVar.f113278b);
        if (a2 == null) {
            a2 = C43362g.UNSPECIFIED;
        }
        return !a2.equals(C43362g.SSL);
    }
}
