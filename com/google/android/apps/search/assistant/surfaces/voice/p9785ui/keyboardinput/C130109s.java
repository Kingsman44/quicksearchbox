package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput;

import android.content.Context;
import android.text.Editable;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127118j;
import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127407d;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127454b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129566ah;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.C129612d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.p9867a.C130078w;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.p9872c.C130186a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.utils.TranscriptionBackgroundColorSpan;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.assistant.p3897e.p3921j.C51682amp;
import com.google.assistant.p3897e.p3921j.alf;
import com.google.assistant.p3897e.p3921j.amm;
import com.google.assistant.p3897e.p3921j.amo;
import com.google.assistant.p3897e.p3921j.p3922a.C51648f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.s */
/* compiled from: PG */
public final class C130109s {

    /* renamed from: a */
    public static final C59071e f356751a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.s");

    /* renamed from: b */
    public final C130096f f356752b;

    /* renamed from: c */
    public final C129566ah f356753c;

    /* renamed from: d */
    public final C46439e f356754d;

    /* renamed from: e */
    public final C127118j f356755e;

    /* renamed from: f */
    public final C130110a f356756f = new C130110a();

    /* renamed from: g */
    public final C47770dh f356757g;

    /* renamed from: h */
    public final C130085af f356758h;

    /* renamed from: i */
    public final C130186a f356759i;

    /* renamed from: j */
    public final C46855i f356760j;

    /* renamed from: k */
    public final C129612d f356761k;

    /* renamed from: l */
    public final boolean f356762l;

    /* renamed from: m */
    public final String f356763m;

    /* renamed from: n */
    public final C129676j f356764n;

    /* renamed from: o */
    public int f356765o = 5;

    /* renamed from: p */
    public C130089aj f356766p = C130089aj.f356708f;

    /* renamed from: q */
    public final C130111t f356767q = new C130111t();

    /* renamed from: r */
    private final LayoutInflater f356768r;

    /* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.s$a */
    /* compiled from: PG */
    final class C130110a implements C46440f {
        public C130110a() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C59104x c = C130109s.f356751a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "KeyboardInputFragment");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(38678)).mo56386p("Interaction failed.");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C59104x b = C130109s.f356751a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "KeyboardInputFragment");
            ((C59052c) ((C59052c) b).mo56372aa(38679)).mo56386p("Interaction succeeded.");
            C130109s sVar = C130109s.this;
            EditText a = C130109s.m212407a(sVar.f356752b);
            InputMethodManager inputMethodManager = (InputMethodManager) sVar.f356752b.getContext().getSystemService("input_method");
            a.clearFocus();
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(a.getWindowToken(), 0);
            }
            C130109s sVar2 = C130109s.this;
            sVar2.f356753c.mo109105a(sVar2.f356764n);
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    public C130109s(C47215a aVar, C130096f fVar, C129566ah ahVar, C46439e eVar, C127118j jVar, C47770dh dhVar, C130085af afVar, C130186a aVar2, C46855i iVar, C129612d dVar, boolean z, C130092b bVar) {
        this.f356768r = LayoutInflater.from(aVar.mo51121p());
        this.f356752b = fVar;
        this.f356753c = ahVar;
        this.f356754d = eVar;
        this.f356755e = jVar;
        this.f356757g = dhVar;
        this.f356758h = afVar;
        this.f356759i = aVar2;
        this.f356760j = iVar;
        this.f356761k = dVar;
        this.f356762l = z;
        this.f356763m = bVar.f356724b;
        C129676j jVar2 = bVar.f356725c;
        this.f356764n = jVar2 == null ? C129676j.f355890c : jVar2;
    }

    /* renamed from: a */
    public static EditText m212407a(C130096f fVar) {
        return (EditText) C2043bi.m5589r(fVar.requireView(), R.id.assistant_keyboard_input_text);
    }

    /* renamed from: i */
    private static ViewGroup m212408i(C130096f fVar) {
        return (ViewGroup) C2043bi.m5589r(fVar.requireView(), R.id.assistant_keyboard_suggestion_container);
    }

    /* renamed from: j */
    private final void m212409j(CharSequence charSequence, String str, int i) {
        ViewGroup i2 = m212408i(this.f356752b);
        View inflate = this.f356768r.inflate(R.layout.assistant_keyboard_suggestion_item_layout, i2, false);
        ((TextView) C2043bi.m5589r(inflate, R.id.assistant_keyboard_suggestion_item_text)).setText(charSequence);
        inflate.setOnClickListener(new C47591co(this.f356757g, "Keyboard query suggestion clicked", new C130099i(this, str)));
        if (i != -1) {
            ((ImageView) C2043bi.m5589r(inflate, R.id.assistant_keyboard_suggestion_item_icon)).setImageResource(i);
        }
        ((ImageView) C2043bi.m5589r(inflate, R.id.assistant_keyboard_suggestion_query_builder_icon)).setOnClickListener(new C47591co(this.f356757g, "Keyboard query suggestion query builder clicked", new C130100j(this, str)));
        i2.addView(inflate);
    }

    /* renamed from: b */
    public final void mo109497b() {
        Editable text = m212407a(this.f356752b).getText();
        for (TranscriptionBackgroundColorSpan removeSpan : (TranscriptionBackgroundColorSpan[]) text.getSpans(0, text.length(), TranscriptionBackgroundColorSpan.class)) {
            text.removeSpan(removeSpan);
        }
    }

    /* renamed from: c */
    public final void mo109498c() {
        m212408i(this.f356752b).removeAllViews();
    }

    /* renamed from: d */
    public final void mo109499d(EditText editText) {
        C58976aa aaVar = C58975e.f156826a;
        InputMethodManager inputMethodManager = (InputMethodManager) this.f356752b.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editText, 1);
        }
    }

    /* renamed from: e */
    public final void mo109500e(String str) {
        C46439e eVar = this.f356754d;
        C127118j jVar = this.f356755e;
        C127454b bVar = C127454b.TEXT_SUBMIT;
        amm amm = (amm) C51682amp.f135384d.createBuilder();
        amm.copyOnWrite();
        C51682amp amp = (C51682amp) amm.instance;
        str.getClass();
        amp.f135386a |= 1;
        amp.f135387b = str;
        amo amo = amo.TRUSTED;
        amm.copyOnWrite();
        C51682amp amp2 = (C51682amp) amm.instance;
        amp2.f135388c = amo.f135383d;
        amp2.f135386a |= 2;
        eVar.mo50428h(C46438d.m82810b(jVar.mo107931g(C127407d.m208363c(bVar, (C51682amp) amm.build()))).f121541a, (Object) null, this.f356756f);
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: f */
    public final void mo109501f(C130089aj ajVar) {
        C130091al alVar;
        C130091al alVar2;
        C130087ah ahVar;
        C130087ah ahVar2;
        this.f356766p = ajVar;
        mo109498c();
        mo109503h();
        C130089aj ajVar2 = this.f356766p;
        int i = ajVar2.f356711b;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 2 : 1 : 3;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 0) {
            mo109497b();
            int i4 = this.f356765o;
            C130089aj ajVar3 = this.f356766p;
            if (ajVar3.f356711b == 1) {
                alVar = (C130091al) ajVar3.f356712c;
            } else {
                alVar = C130091al.f356716b;
            }
            for (int min = Math.min(i4, alVar.f356718a.size()) - 1; min >= 0; min--) {
                C130089aj ajVar4 = this.f356766p;
                if (ajVar4.f356711b == 1) {
                    alVar2 = (C130091al) ajVar4.f356712c;
                } else {
                    alVar2 = C130091al.f356716b;
                }
                C130078w wVar = (C130078w) alVar2.f356718a.get(min);
                m212409j(C130082ac.m212378b(this.f356752b.getContext(), wVar.f356683c), wVar.f356682b, C130082ac.m212377a(wVar));
            }
        } else if (i3 == 1) {
            int i5 = this.f356765o;
            if (i == 2) {
                ahVar = (C130087ah) ajVar2.f356712c;
            } else {
                ahVar = C130087ah.f356705b;
            }
            for (int min2 = Math.min(i5, ahVar.f356707a.size()) - 1; min2 >= 0; min2--) {
                C130089aj ajVar5 = this.f356766p;
                if (ajVar5.f356711b == 2) {
                    ahVar2 = (C130087ah) ajVar5.f356712c;
                } else {
                    ahVar2 = C130087ah.f356705b;
                }
                C51648f fVar = (C51648f) ahVar2.f356707a.get(min2);
                if ((fVar.f134582a & 8) != 0) {
                    Context context = this.f356752b.getContext();
                    alf alf = fVar.f134586e;
                    if (alf == null) {
                        alf = alf.f135314d;
                    }
                    Spanned c = C130082ac.m212379c(context, alf);
                    alf alf2 = fVar.f134586e;
                    if (alf2 == null) {
                        alf2 = alf.f135314d;
                    }
                    m212409j(c, alf2.f135317b, -1);
                } else {
                    String str = fVar.f134583b;
                    m212409j(str, str, -1);
                }
            }
        } else if (i3 == 2) {
            throw new AssertionError("Keyboard suggest type is not set.");
        }
    }

    /* renamed from: g */
    public final void mo109502g() {
        m212408i(this.f356752b).addOnLayoutChangeListener(new C130106p(this));
    }

    /* renamed from: h */
    public final void mo109503h() {
        EditText a = m212407a(this.f356752b);
        C130089aj ajVar = this.f356766p;
        int i = ajVar.f356710a;
        int i2 = -1;
        int i3 = (i & 4) != 0 ? ajVar.f356713d : -1;
        if ((i & 8) != 0) {
            i2 = ajVar.f356714e;
        }
        if (i3 >= 0 && i3 <= i2 && i2 <= a.getText().length()) {
            a.setSelection(i3, i2);
        }
    }
}
