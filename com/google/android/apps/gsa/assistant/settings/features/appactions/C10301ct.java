package com.google.android.apps.gsa.assistant.settings.features.appactions;

import android.support.p033v7.widget.RecyclerView;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.settings.features.appactions.data.C10325al;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p566b.C10222a;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p566b.C10224c;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10277v;
import com.google.android.apps.gsa.assistant.settings.shared.e.l;
import com.google.android.apps.gsa.assistant.shared.appactions.c.a;
import com.google.android.apps.gsa.assistant.shared.appactions.p5805d.C73812a;
import com.google.android.apps.gsa.assistant.shared.appactions.s;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90019by;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.assistant.p3861at.C49823ah;
import com.google.assistant.p3861at.C49826ak;
import com.google.assistant.p3861at.C49838aw;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.ct */
/* compiled from: PG */
public final class C10301ct {

    /* renamed from: a */
    public static final C59071e f34894a = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.features.appactions.ct");

    /* renamed from: b */
    public View f34895b;

    /* renamed from: c */
    public final C28310af f34896c;

    /* renamed from: d */
    public final C10291cj f34897d;

    /* renamed from: e */
    public final C10277v f34898e;

    /* renamed from: f */
    public final C10325al f34899f;

    /* renamed from: g */
    public final l f34900g;

    /* renamed from: h */
    public final C10224c f34901h;

    /* renamed from: i */
    public final C73812a f34902i;

    /* renamed from: j */
    private final C22871g f34903j;

    /* renamed from: k */
    private final InputMethodManager f34904k;

    /* renamed from: l */
    private final C90021c f34905l;

    public C10301ct(C10291cj cjVar, C10277v vVar, C10325al alVar, l lVar, C22871g gVar, C10224c cVar, C73812a aVar, C28310af afVar, InputMethodManager inputMethodManager, C90021c cVar2) {
        this.f34897d = cjVar;
        this.f34898e = vVar;
        this.f34899f = alVar;
        this.f34902i = aVar;
        this.f34900g = lVar;
        this.f34903j = gVar;
        this.f34901h = cVar;
        this.f34896c = afVar;
        this.f34904k = inputMethodManager;
        this.f34905l = cVar2;
    }

    /* renamed from: a */
    public final void mo18398a(boolean z) {
        if (this.f34905l.mo79746e(C90019by.f248088v)) {
            int i = 0;
            this.f34895b.findViewById(R.id.done_button).setVisibility(true != z ? 0 : 8);
            View findViewById = this.f34895b.findViewById(R.id.loading_ui);
            if (true != z) {
                i = 8;
            }
            findViewById.setVisibility(i);
        }
    }

    /* renamed from: b */
    public final void mo18399b(C49826ak akVar, boolean z) {
        String str;
        TextInputEditText textInputEditText = (TextInputEditText) this.f34895b.findViewById(R.id.shortcut_phrase_input);
        TextInputLayout textInputLayout = (TextInputLayout) this.f34895b.findViewById(R.id.shortcut_phrase_input_container);
        if (akVar.f129465b.isEmpty()) {
            str = akVar.f129471h;
        } else {
            str = (String) akVar.f129465b.get(0);
        }
        textInputEditText.setText(str);
        textInputEditText.addTextChangedListener(new C10300cs(this, textInputLayout));
        textInputEditText.setOnEditorActionListener(new C10292ck(this, akVar));
        textInputLayout.f117308b.mo48599i(2);
        ((TextView) this.f34895b.findViewById(R.id.action_text)).setText(akVar.f129468e);
        C58485gu guVar = (C58485gu) Collection.EL.stream(akVar.f129474k).collect(C58370cn.f155946a);
        if (!guVar.isEmpty()) {
            RecyclerView recyclerView = (RecyclerView) this.f34895b.findViewById(R.id.action_param_list);
            recyclerView.setVisibility(0);
            recyclerView.setAdapter(new s(guVar, 1));
        }
        Button button = (Button) this.f34895b.findViewById(R.id.done_button);
        a.a(button, false);
        this.f34896c.f76997b.mo33800a(C28427h.m53115a(106332)).mo33809b(button);
        button.setOnClickListener(new C10222a(this.f34901h, new C10299cr(this, akVar)));
        if (z) {
            this.f34895b.findViewById(R.id.edit_page_delete_button_container).setVisibility(0);
            ((Button) this.f34895b.findViewById(R.id.edit_page_delete_button)).setOnClickListener(new C10293cl(this, akVar));
        }
    }

    /* renamed from: c */
    public final void mo18400c(C49826ak akVar) {
        this.f34902i.mo65296c(C89849ae.APP_ACTIONS_SETTINGS_UPDATE_CLICKED);
        C49823ah ahVar = (C49823ah) akVar.toBuilder();
        ahVar.copyOnWrite();
        ((C49826ak) ahVar.instance).f129465b = C62942bv.emptyProtobufList();
        Editable text = ((TextInputEditText) this.f34895b.findViewById(R.id.shortcut_phrase_input)).getText();
        text.getClass();
        ahVar.mo53361a(text.toString());
        mo18401d((C49826ak) ahVar.build());
    }

    /* renamed from: d */
    public final void mo18401d(C49826ak akVar) {
        Optional optional;
        TextInputLayout textInputLayout = (TextInputLayout) this.f34895b.findViewById(R.id.shortcut_phrase_input_container);
        TextInputEditText textInputEditText = (TextInputEditText) this.f34895b.findViewById(R.id.shortcut_phrase_input);
        this.f34904k.hideSoftInputFromWindow(textInputEditText.getWindowToken(), 0);
        textInputEditText.clearFocus();
        mo18398a(true);
        C10325al alVar = this.f34899f;
        C49838aw awVar = this.f34898e.f34829d;
        if (awVar == null) {
            awVar = C49838aw.f129504g;
        }
        String str = awVar.f129507b;
        C10277v vVar = this.f34898e;
        if ((vVar.f34826a & 32) != 0) {
            optional = Optional.m71637of(Long.valueOf(vVar.f34832g));
        } else {
            optional = Optional.empty();
        }
        new C90873ag(alVar.mo18427i(str, akVar, optional), this.f34903j, "Handle result", new C10297cp(this, textInputLayout)).mo85223a(new C10298cq(this, textInputLayout));
    }
}
