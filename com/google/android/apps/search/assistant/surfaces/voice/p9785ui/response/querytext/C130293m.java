package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.querytext;

import android.widget.TextView;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.C127120a;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9538d.C127170c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9793c.C129024a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.C130085af;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.p9872c.C130186a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.utils.C130304b;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.querytext.m */
/* compiled from: PG */
public final class C130293m {

    /* renamed from: a */
    public static final C59071e f357149a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.response.querytext.m");

    /* renamed from: b */
    public final C130288h f357150b;

    /* renamed from: c */
    public final C127120a f357151c;

    /* renamed from: d */
    public final C130186a f357152d;

    /* renamed from: e */
    public final C130085af f357153e;

    /* renamed from: f */
    public final C46855i f357154f;

    /* renamed from: g */
    public final C129024a f357155g;

    /* renamed from: h */
    public QueryTextViewModel f357156h;

    /* renamed from: i */
    public boolean f357157i;

    /* renamed from: j */
    public boolean f357158j;

    public C130293m(C130288h hVar, C127120a aVar, C130186a aVar2, C130085af afVar, C46855i iVar, C129024a aVar3) {
        this.f357150b = hVar;
        this.f357151c = aVar;
        this.f357152d = aVar2;
        this.f357153e = afVar;
        this.f357154f = iVar;
        this.f357155g = aVar3;
    }

    /* renamed from: a */
    public static TextView m212719a(C130288h hVar) {
        return (TextView) hVar.requireView().findViewById(R.id.assistant_query_text);
    }

    /* renamed from: b */
    public final CharSequence mo109628b() {
        QueryTextViewModel queryTextViewModel = this.f357156h;
        queryTextViewModel.getClass();
        return queryTextViewModel.f357133a;
    }

    /* renamed from: c */
    public final void mo109629c(int i) {
        this.f357150b.requireView().findViewById(R.id.assistant_query_text_container).setVisibility(i);
    }

    /* renamed from: e */
    public final void mo109631e() {
        m212719a(this.f357150b).setText(mo109628b());
        TextView a = m212719a(this.f357150b);
        a.setTextSize(2, 20.0f);
        if (a.getPaint().measureText(a.getText(), 0, a.getText().length()) > ((float) a.getWidth())) {
            a.setTextSize(2, 16.0f);
        }
        a.getText();
        a.getTextSize();
    }

    /* renamed from: f */
    public final void mo109632f(C127170c cVar) {
        if (cVar != null && !cVar.mo107982c()) {
            this.f357158j = false;
            TextView a = m212719a(this.f357150b);
            cVar.mo107980a(a);
            CharSequence text = a.getText();
            mo109630d(text);
            C47393f.m84236g(new C130304b(cVar), this.f357150b);
            ((C59052c) ((C59052c) f357149a.mo56224b()).mo56372aa(38803)).mo56389s("Transcription updated to %s", text);
        }
    }

    /* renamed from: d */
    public final void mo109630d(CharSequence charSequence) {
        QueryTextViewModel queryTextViewModel = this.f357156h;
        queryTextViewModel.getClass();
        queryTextViewModel.f357133a = charSequence;
        mo109631e();
    }
}
