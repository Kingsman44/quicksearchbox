package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.search.core.p6513aj.C84535at;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.android.googlequicksearchbox.R;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.le */
/* compiled from: PG */
public final class C96371le extends C96363kx {

    /* renamed from: b */
    public String f269620b;

    /* renamed from: c */
    public C96325jm f269621c;

    /* renamed from: d */
    public C68214a f269622d;

    /* renamed from: e */
    public C84535at f269623e;

    /* renamed from: f */
    public C96094ay f269624f;

    /* renamed from: g */
    public boolean f269625g;

    /* renamed from: h */
    public LegacyOpaStandardPage f269626h;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final String mo89934e() {
        return "TOS";
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C124719q qVar;
        this.f269626h = (LegacyOpaStandardPage) layoutInflater.inflate(R.layout.tos, (ViewGroup) null);
        if ("00000006".equals(this.f269620b)) {
            this.f269626h.f228724c.mo77492b(R.string.apollo_learn_more_url);
        }
        String str = this.f269624f.f269039a;
        if (str == null) {
            qVar = C124719q.UNKNOWN_DEVICE_CATEGORY;
        } else {
            C124548d b = ((C89492cd) this.f269622d.mo27525b()).mo83401b(str);
            if (b != null) {
                qVar = b.mo106513k();
            } else {
                qVar = C124719q.UNKNOWN_DEVICE_CATEGORY;
            }
        }
        if (qVar == C124719q.CAR_ACCESSORY) {
            this.f269626h.f228724c.mo77493c(R.string.tos_accept_send_diagnostics_car);
        }
        this.f269626h.f228725d.mo77363d(this.f269625g);
        this.f269626h.f228724c.f228880c.setChecked(true);
        this.f269626h.f228725d.mo77360a().setOnClickListener(new C89943l(new C96369lc(this)));
        this.f269626h.f228725d.mo77361b().setVisibility(0);
        this.f269626h.f228725d.mo77361b().setOnClickListener(new C96370ld(this, qVar));
        return this.f269626h;
    }
}
