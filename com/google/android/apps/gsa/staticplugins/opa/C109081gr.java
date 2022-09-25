package com.google.android.apps.gsa.staticplugins.opa;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.apa.migration.C107227m;
import com.google.android.apps.gsa.staticplugins.opa.apa.migration.ChatUiFragmentElement;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C63088z;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.gr */
/* compiled from: PG */
public final /* synthetic */ class C109081gr implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C109258hw f303695a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f303696b;

    /* renamed from: c */
    public final /* synthetic */ C63088z f303697c;

    /* renamed from: d */
    public final /* synthetic */ String f303698d;

    /* renamed from: e */
    public final /* synthetic */ C58833ax f303699e;

    public /* synthetic */ C109081gr(C109258hw hwVar, C58833ax axVar, C63088z zVar, String str, C58833ax axVar2) {
        this.f303695a = hwVar;
        this.f303696b = axVar;
        this.f303697c = zVar;
        this.f303698d = str;
        this.f303699e = axVar2;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C109258hw hwVar = this.f303695a;
        C58833ax axVar = this.f303696b;
        C63088z zVar = this.f303697c;
        String str = this.f303698d;
        C58833ax axVar2 = this.f303699e;
        Fragment fragment = ((C107227m) ((Supplier) obj).get()).f298425a;
        if (fragment == null) {
            ((C59052c) ((C59052c) C109258hw.f304227a.mo56226d()).mo56372aa(22767)).mo56386p("Failed to render client op in TNG fragment.");
            hwVar.mo97725p(axVar, zVar, str, axVar2);
            return;
        }
        ChatUiFragmentElement chatUiFragmentElement = new ChatUiFragmentElement(C109258hw.m181891q(hwVar.f304303z, hwVar.f304279b), hwVar.f304284g, fragment);
        chatUiFragmentElement.f301038t = ((Long) hwVar.f304287j.mo6453a()).longValue();
        C108230ba baVar = hwVar.f304280c;
        C109258hw.m181892r(chatUiFragmentElement, hwVar.f304301x);
        baVar.mo95430s(chatUiFragmentElement);
        ((C89859i) hwVar.f304292o.mo27525b()).mo83702b(C89849ae.ASSISTANT_OPA_CLIENTOP_RENDER_END);
    }
}
