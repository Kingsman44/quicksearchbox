package com.google.android.apps.gsa.staticplugins.nga.p8061f.p8062a;

import android.os.Bundle;
import androidx.p104d.p105a.C2164c;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.api.C74738s;
import com.google.android.apps.gsa.nga.api.ForegroundSignalType;
import com.google.android.apps.gsa.nga.api.h;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82350by;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82353ca;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82580kl;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82582kn;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.f.a.d */
/* compiled from: PG */
final class C103192d extends C74738s {

    /* renamed from: a */
    final /* synthetic */ ForegroundSignalType f287937a;

    /* renamed from: b */
    final /* synthetic */ C2164c f287938b;

    /* renamed from: c */
    final /* synthetic */ C103193e f287939c;

    public C103192d(C103193e eVar, ForegroundSignalType foregroundSignalType, C2164c cVar) {
        this.f287939c = eVar;
        this.f287937a = foregroundSignalType;
        this.f287938b = cVar;
    }

    /* renamed from: e */
    public final void mo93699e(String str) {
        this.f287939c.mo93701f(this.f287937a, "AssistData is not available.");
        this.f287938b.mo5439d(new h(str));
    }

    /* renamed from: f */
    public final void mo93700f(Bundle bundle) {
        C103193e eVar = this.f287939c;
        if (this.f287937a.equals(ForegroundSignalType.c)) {
            C83305i iVar = eVar.f287941b;
            C82582kn e = C103193e.m171084e();
            e.mo75833b(true);
            ((C82353ca) e).f224974b = BuildConfig.FLAVOR;
            iVar.mo75579d(e.mo75832a());
        } else {
            C83305i iVar2 = eVar.f287941b;
            C82580kl d = C103193e.m171083d();
            d.mo75820c(true);
            ((C82350by) d).f224962c = BuildConfig.FLAVOR;
            iVar2.mo75579d(d.mo75818a());
        }
        this.f287938b.mo5437b(bundle);
    }
}
