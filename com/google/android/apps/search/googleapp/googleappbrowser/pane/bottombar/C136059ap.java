package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar;

import android.view.View;
import com.google.android.apps.search.googleapp.googleappbrowser.p10264e.p10268d.C135583a;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.p10308a.C136039a;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28441k;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60425pt;
import com.google.common.p4552o.C60426pu;
import com.google.common.p4552o.C60427pv;
import com.google.protobuf.C62940bt;
import java.util.HashSet;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.ap */
/* compiled from: PG */
public final class C136059ap implements C136039a {

    /* renamed from: c */
    private static final C59071e f370543c = C59071e.m91332i("com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.ap");

    /* renamed from: a */
    public final C28443m f370544a;

    /* renamed from: b */
    public boolean f370545b;

    /* renamed from: d */
    private final Optional f370546d;

    /* renamed from: e */
    private final HashSet f370547e = new HashSet();

    public C136059ap(Optional optional, C28443m mVar) {
        this.f370546d = optional;
        this.f370544a = mVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo112532a(View view, float f) {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo112533b(View view, int i) {
    }

    /* renamed from: c */
    public final boolean mo112723c(C60425pt ptVar, View view) {
        if (!this.f370547e.add(ptVar)) {
            return false;
        }
        ((C59052c) ((C59052c) f370543c.mo56224b()).mo56372aa(40667)).mo56389s("GIL metadata: %s", ptVar);
        C28443m mVar = this.f370544a;
        C28440j d = C28442l.m53138d();
        C62940bt btVar = C135583a.f369321a;
        C60426pu puVar = (C60426pu) C60427pv.f163530c.createBuilder();
        puVar.copyOnWrite();
        C60427pv pvVar = (C60427pv) puVar.instance;
        pvVar.f163534b = ptVar.f163529g;
        pvVar.f163533a |= 1;
        d.mo33895b(new C28441k(btVar, (C60427pv) puVar.build()));
        mVar.mo33853c(d.mo33894a(), C28485y.m53234a(view));
        return true;
    }

    /* renamed from: e */
    public final void mo112536e(View view) {
        mo112723c(C60425pt.BOTTOM_SHEET_PEEK_AUTO, view);
    }

    /* renamed from: f */
    public final void mo112537f(View view) {
        mo112723c(C60425pt.BOTTOM_SHEET_PEEK_DISMISSED, view);
    }

    /* renamed from: g */
    public final /* synthetic */ void mo112538g(View view) {
    }

    /* renamed from: h */
    public final /* synthetic */ void mo112539h(View view) {
    }

    /* renamed from: i */
    public final /* synthetic */ void mo112540i(View view) {
    }

    /* renamed from: j */
    public final void mo112541j() {
        this.f370547e.clear();
    }

    /* renamed from: k */
    public final void mo112542k(View view) {
        this.f370545b = false;
        this.f370546d.ifPresent(new C136058ao(this, view));
    }

    /* renamed from: l */
    public final /* synthetic */ void mo112543l(View view) {
    }

    /* renamed from: m */
    public final void mo112544m(View view) {
        mo112723c(C60425pt.BOTTOM_SHEET_PEEK, view);
        if (this.f370545b) {
            mo112723c(C60425pt.BOTTOM_SHEET_MANUAL_OPEN, view);
        }
    }

    /* renamed from: n */
    public final void mo112545n(View view) {
        if (this.f370545b) {
            mo112723c(C60425pt.BOTTOM_SHEET_MANUAL_OPEN, view);
        }
    }

    /* renamed from: o */
    public final void mo112546o(View view) {
        mo112723c(C60425pt.BOTTOM_SHEET_PEEK, view);
    }

    /* renamed from: p */
    public final /* synthetic */ void mo112547p(float f) {
    }

    /* renamed from: q */
    public final /* synthetic */ void mo112548q(float f) {
    }

    /* renamed from: r */
    public final /* synthetic */ void mo112549r(float f) {
    }

    /* renamed from: s */
    public final /* synthetic */ void mo112550s(float f) {
    }

    /* renamed from: t */
    public final /* synthetic */ void mo112551t() {
    }

    /* renamed from: u */
    public final /* synthetic */ void mo112552u() {
    }
}
