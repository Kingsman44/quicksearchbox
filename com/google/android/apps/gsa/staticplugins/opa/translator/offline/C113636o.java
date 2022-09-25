package com.google.android.apps.gsa.staticplugins.opa.translator.offline;

import android.content.Context;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.p8331bc.C107955f;
import com.google.android.apps.gsa.staticplugins.opa.translator.p8590a.C113611x;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.android.material.snackbar.C44893x;
import com.google.android.material.snackbar.Snackbar;
import com.google.assistant.p3897e.p3921j.p3926e.C51910dq;
import com.google.common.p4526f.C59052c;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.offline.o */
/* compiled from: PG */
public final class C113636o implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C51910dq f314683a;

    /* renamed from: b */
    final /* synthetic */ Context f314684b;

    /* renamed from: c */
    final /* synthetic */ View f314685c;

    /* renamed from: d */
    final /* synthetic */ OfflineSubController f314686d;

    /* renamed from: e */
    final /* synthetic */ C113611x f314687e;

    public C113636o(OfflineSubController offlineSubController, C51910dq dqVar, C113611x xVar, Context context, View view) {
        this.f314686d = offlineSubController;
        this.f314683a = dqVar;
        this.f314687e = xVar;
        this.f314684b = context;
        this.f314685c = view;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) OfflineSubController.f314597a.mo56226d()).mo56382g(th)).mo56372aa(28097)).mo56386p("fail to check model");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            OfflineSubController offlineSubController = this.f314686d;
            C51910dq dqVar = this.f314683a;
            C113611x xVar = this.f314687e;
            Context context = this.f314684b;
            View view = this.f314685c;
            xVar.mo100334a(C113615a.m188105a((String) null, (String) null, Locale.forLanguageTag(dqVar.f136163c).toLanguageTag(), Locale.forLanguageTag(dqVar.f136164d).toLanguageTag(), Locale.forLanguageTag(dqVar.f136162b).toLanguageTag(), false));
            Snackbar q = Snackbar.m79661q((Context) null, view, context.getString(R.string.interpreter_switch_to_offline_message), 0);
            C107955f fVar = offlineSubController.f314604h;
            fVar.mo96345b(fVar.mo96346c(q, new C44893x(), 0));
        }
    }
}
