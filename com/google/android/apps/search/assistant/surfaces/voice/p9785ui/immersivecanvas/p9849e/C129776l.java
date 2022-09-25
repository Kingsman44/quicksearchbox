package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9849e;

import android.content.Context;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.text.Editable;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.C119473g;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127050h;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127113e;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127114f;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127118j;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.C127120a;
import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127407d;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127454b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9793c.C129024a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.C129722e;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9845b.C129745a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9845b.p9846a.C129748c;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.C128582b;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.C128585c;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.C128586d;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.C128587e;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.C128593k;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.p9737a.C128580a;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.p9737a.C128581b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.assistant.p3897e.p3921j.C51682amp;
import com.google.assistant.p3897e.p3921j.amm;
import com.google.assistant.p3897e.p3921j.amo;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.e.l */
/* compiled from: PG */
public final class C129776l {

    /* renamed from: a */
    public static final C59071e f356094a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.e.l");

    /* renamed from: b */
    public final C129766b f356095b;

    /* renamed from: c */
    public final C47770dh f356096c;

    /* renamed from: d */
    public final C127120a f356097d;

    /* renamed from: e */
    public final C128580a f356098e;

    /* renamed from: f */
    public final C46855i f356099f;

    /* renamed from: g */
    public final C46439e f356100g;

    /* renamed from: h */
    public final C129777a f356101h = new C129777a();

    /* renamed from: i */
    public final C129748c f356102i;

    /* renamed from: j */
    public final C129745a f356103j;

    /* renamed from: k */
    public final C129024a f356104k;

    /* renamed from: l */
    public final C129722e f356105l;

    /* renamed from: m */
    private final AccountId f356106m;

    /* renamed from: n */
    private final InputMethodManager f356107n;

    /* renamed from: o */
    private final C119473g f356108o;

    /* renamed from: p */
    private final C127118j f356109p;

    /* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.e.l$a */
    /* compiled from: PG */
    final class C129777a implements C46440f {
        public C129777a() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C59052c) ((C59052c) ((C59052c) C129776l.f356094a.mo56225c()).mo56382g(th)).mo56372aa(38453)).mo56386p("Failed to start interaction.");
            C129776l.this.f356102i.mo109226b(false);
            Snackbar.m79661q((Context) null, C129776l.this.f356095b.requireView(), "Failed to execute requested Interaction", -1).mo48343h();
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            ((C59052c) ((C59052c) C129776l.f356094a.mo56224b()).mo56372aa(38454)).mo56386p("Interaction succeeded.");
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    public C129776l(AccountId accountId, C127120a aVar, C128580a aVar2, C46855i iVar, C46439e eVar, C127118j jVar, C47770dh dhVar, C129748c cVar, C129745a aVar3, C129722e eVar2, C129766b bVar, C129024a aVar4) {
        this.f356106m = accountId;
        this.f356100g = eVar;
        this.f356109p = jVar;
        this.f356102i = cVar;
        this.f356097d = aVar;
        this.f356098e = aVar2;
        this.f356099f = iVar;
        this.f356095b = bVar;
        this.f356107n = (InputMethodManager) bVar.getContext().getSystemService("input_method");
        this.f356096c = dhVar;
        C119473g gVar = new C119473g();
        this.f356108o = gVar;
        gVar.f333081e = new C129767c(aVar);
        this.f356103j = aVar3;
        this.f356105l = eVar2;
        this.f356104k = aVar4;
    }

    /* renamed from: a */
    public static ImageView m211869a(Fragment fragment) {
        return (ImageView) fragment.requireView().findViewById(R.id.assistant_canvas_plate_keyboard_indicator);
    }

    /* renamed from: b */
    public static ImageView m211870b(Fragment fragment) {
        return (ImageView) fragment.requireView().findViewById(R.id.assistant_canvas_plate_send_button);
    }

    /* renamed from: l */
    private static RelativeLayout m211871l(Fragment fragment) {
        return (RelativeLayout) fragment.requireView().findViewById(R.id.assistant_canvas_plate_type_container);
    }

    /* renamed from: c */
    public final void mo109249c() {
        if (this.f356095b.getChildFragmentManager().f634a.mo670b(R.id.assistant_canvas_p6glow_container) == null) {
            AccountId accountId = this.f356106m;
            C128585c cVar = (C128585c) C128586d.f353551d.createBuilder();
            cVar.copyOnWrite();
            C128586d dVar = (C128586d) cVar.instance;
            dVar.f353553a |= 1;
            dVar.f353554b = true;
            cVar.copyOnWrite();
            C128586d dVar2 = (C128586d) cVar.instance;
            dVar2.f353553a |= 2;
            dVar2.f353555c = 151865;
            int i = C128593k.f353562h;
            C128582b a = C128587e.m209855a(accountId, (C128586d) cVar.build());
            C0154a aVar = new C0154a(this.f356095b.getChildFragmentManager());
            aVar.mo511h(R.id.assistant_canvas_p6glow_container, a, (String) null, 1);
            aVar.mo509f();
        }
    }

    /* renamed from: d */
    public final void mo109250d(EditText editText) {
        this.f356104k.mo108811c(m211870b(this.f356095b));
        Editable text = editText.getText();
        this.f356102i.mo109226b(true);
        C46439e eVar = this.f356100g;
        C127118j jVar = this.f356109p;
        C127454b bVar = C127454b.TEXT_SUBMIT;
        amm amm = (amm) C51682amp.f135384d.createBuilder();
        String valueOf = String.valueOf(text);
        amm.copyOnWrite();
        C51682amp amp = (C51682amp) amm.instance;
        valueOf.getClass();
        amp.f135386a = 1 | amp.f135386a;
        amp.f135387b = valueOf;
        amo amo = amo.TRUSTED;
        amm.copyOnWrite();
        C51682amp amp2 = (C51682amp) amm.instance;
        amp2.f135388c = amo.f135383d;
        amp2.f135386a |= 2;
        eVar.mo50428h(C46438d.m82810b(jVar.mo107931g(C127407d.m208363c(bVar, (C51682amp) amm.build()))).f121541a, (Object) null, this.f356101h);
        mo109256j(false);
    }

    /* renamed from: e */
    public final void mo109251e(C127050h hVar) {
        C127113e eVar = (C127113e) C127114f.f350009c.createBuilder();
        eVar.copyOnWrite();
        C127114f fVar = (C127114f) eVar.instance;
        fVar.f350012b = hVar.getNumber();
        fVar.f350011a |= 1;
        this.f356100g.mo50428h(C46438d.m82810b(this.f356109p.mo107932h((C127114f) eVar.build())).f121541a, (Object) null, this.f356101h);
    }

    /* renamed from: f */
    public final void mo109252f() {
        mo109253g(C128581b.GONE);
        m211869a(this.f356095b).setVisibility(0);
    }

    /* renamed from: g */
    public final void mo109253g(C128581b bVar) {
        C128582b bVar2 = (C128582b) this.f356095b.getChildFragmentManager().f634a.mo670b(R.id.assistant_canvas_p6glow_container);
        if (bVar2 != null) {
            bVar2.mo17754z().mo108534d(bVar);
        }
    }

    /* renamed from: h */
    public final void mo109254h(boolean z) {
        ((FrameLayout) this.f356095b.requireView().findViewById(R.id.assistant_canvas_plate_text_container)).setVisibility(true != z ? 8 : 0);
    }

    /* renamed from: i */
    public final void mo109255i(EditText editText, boolean z) {
        if (z) {
            editText.setText(BuildConfig.FLAVOR);
            editText.requestFocus();
            InputMethodManager inputMethodManager = this.f356107n;
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(editText, 1);
                return;
            }
            return;
        }
        editText.clearFocus();
        InputMethodManager inputMethodManager2 = this.f356107n;
        if (inputMethodManager2 != null) {
            inputMethodManager2.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
    }

    /* renamed from: j */
    public final void mo109256j(boolean z) {
        if (z) {
            Fragment b = this.f356095b.getChildFragmentManager().f634a.mo670b(R.id.assistant_canvas_p6glow_container);
            if (b != null) {
                C0154a aVar = new C0154a(this.f356095b.getChildFragmentManager());
                aVar.mo516m(b);
                aVar.mo509f();
            }
            m211869a(this.f356095b).setVisibility(8);
            m211871l(this.f356095b).setVisibility(0);
            return;
        }
        mo109249c();
        m211869a(this.f356095b).setVisibility(0);
        m211871l(this.f356095b).setVisibility(8);
    }

    /* renamed from: k */
    public final void mo109257k() {
        C46439e eVar = this.f356100g;
        C46438d b = C46438d.m82810b(this.f356109p.mo107931g(C127407d.m208365e(C127454b.MIC_ICON)));
        eVar.mo50428h(b.f121541a, (Object) null, this.f356101h);
    }
}
