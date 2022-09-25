package com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.apps.gsa.assistant.shared.C73841bf;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.p7162d.C90962a;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114735e;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114756j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.material.bottomsheet.C44565p;
import com.google.assistant.p3994s.p3995a.C53070ag;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.a.x */
/* compiled from: PG */
public final class C114946x implements C114906ae {

    /* renamed from: a */
    public final C44565p f318928a;

    /* renamed from: b */
    public final C114919ar f318929b;

    /* renamed from: c */
    public final C114756j f318930c;

    /* renamed from: d */
    public C53070ag f318931d;

    /* renamed from: e */
    public boolean f318932e;

    /* renamed from: f */
    private final Context f318933f;

    /* renamed from: g */
    private final C68214a f318934g;

    /* renamed from: h */
    private final C68214a f318935h;

    /* renamed from: i */
    private EditText f318936i;

    /* renamed from: j */
    private C28293k f318937j;

    public C114946x(Context context, C114919ar arVar, C68214a aVar, C68214a aVar2, C44565p pVar, C114756j jVar) {
        this.f318933f = context;
        this.f318929b = arVar;
        this.f318934g = aVar;
        this.f318935h = aVar2;
        this.f318928a = pVar;
        this.f318930c = jVar;
    }

    /* renamed from: h */
    public final View mo101694h() {
        ColorStateList colorStateList;
        View inflate = View.inflate(this.f318933f, R.layout.zero_state_fab_add_note_sheet, (ViewGroup) null);
        EditText editText = (EditText) inflate.findViewById(R.id.zero_state_fab_add_note_edit_text);
        this.f318936i = editText;
        editText.setHint(((C73841bf) this.f318935h.mo27525b()).mo65322a().getString(R.string.zero_state_fab_add_note_edit_hint));
        Button button = (Button) inflate.findViewById(R.id.zero_state_fab_save_button);
        button.setText(((C73841bf) this.f318935h.mo27525b()).mo65322a().getString(R.string.zero_state_fab_save_button_title));
        if (C90962a.m148577a(this.f318929b.f318856a)) {
            colorStateList = this.f318933f.getResources().getColorStateList(R.color.zero_state_fab_save_button_text_color_dark_mode);
        } else {
            colorStateList = this.f318933f.getResources().getColorStateList(R.color.zero_state_fab_save_button_text_color);
        }
        button.setTextColor(colorStateList);
        button.setEnabled(false);
        EditText editText2 = this.f318936i;
        editText2.getClass();
        button.setOnClickListener(new C89943l(new C114944v(this, editText2)));
        EditText editText3 = this.f318936i;
        editText3.getClass();
        editText3.addTextChangedListener(new C114945w(button));
        this.f318937j = C114919ar.m190496a(button, 96733, C28293k.m52908e(new C28292j(81092), new C28293k[0]));
        this.f318932e = false;
        return inflate;
    }

    /* renamed from: i */
    public final View mo101695i() {
        return this.f318936i;
    }

    /* renamed from: j */
    public final C28293k mo101696j() {
        return this.f318937j;
    }

    /* renamed from: l */
    public final void mo101697l() {
        if (!this.f318932e) {
            ((C114735e) this.f318934g.mo27525b()).mo101557e(C89849ae.OPA_ZERO_STATE_FAB_V2_FLOW_DISMISSED);
        }
    }

    /* renamed from: m */
    public final void mo101698m(C53070ag agVar) {
        this.f318931d = agVar;
    }
}
