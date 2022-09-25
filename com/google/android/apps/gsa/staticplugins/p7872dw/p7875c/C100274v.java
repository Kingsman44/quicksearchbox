package com.google.android.apps.gsa.staticplugins.p7872dw.p7875c;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.p033v7.widget.Toolbar;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.p098j.p099a.C1998r;
import com.google.android.apps.gsa.shared.p7148ui.talkback.LinkTextView;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.staticplugins.p7872dw.p7874b.C100249a;
import com.google.android.apps.gsa.staticplugins.p7872dw.p7874b.C100250b;
import com.google.android.apps.gsa.staticplugins.p7872dw.p7874b.C100252d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.p579ar.sceneviewer.common.C10678R;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.dw.c.v */
/* compiled from: PG */
public final class C100274v extends C22939d {

    /* renamed from: a */
    public final Context f280401a;

    /* renamed from: b */
    public final C100249a f280402b;

    /* renamed from: c */
    public final C100252d f280403c;

    /* renamed from: d */
    EditText f280404d;

    /* renamed from: e */
    EditText f280405e;

    /* renamed from: f */
    public RadioButton f280406f;

    /* renamed from: g */
    public RadioButton f280407g;

    /* renamed from: h */
    public RadioButton f280408h;

    /* renamed from: i */
    public RadioButton f280409i;

    /* renamed from: j */
    public RadioButton f280410j;

    /* renamed from: k */
    public RadioButton f280411k;

    /* renamed from: l */
    public RadioButton f280412l;

    /* renamed from: m */
    TextView f280413m;

    /* renamed from: n */
    AlertDialog f280414n;

    /* renamed from: o */
    public MenuItem f280415o;

    /* renamed from: p */
    private RadioButton f280416p;

    /* renamed from: q */
    private Toolbar f280417q;

    public C100274v(C22945j jVar, C100252d dVar, Context context, C100249a aVar) {
        super(jVar);
        this.f280403c = dVar;
        this.f280401a = new ContextThemeWrapper(context, C10678R.style.Theme_GoogleMaterial_DayNight_NoActionBar);
        this.f280402b = aVar;
    }

    /* renamed from: e */
    public final void mo91853e(RadioButton radioButton, int i) {
        if (i != ((Integer) ((C100253a) this.f280403c).f280374d.f63720e).intValue()) {
            RadioButton radioButton2 = this.f280416p;
            if (radioButton2 != null) {
                radioButton2.setChecked(false);
            }
            this.f280416p = radioButton;
            if (this.f280405e.hasFocus()) {
                this.f280405e.clearFocus();
                C90772bp.m148317y(this.f280401a, this.f280405e);
            }
            C100249a aVar = this.f280402b;
            Bundle bundle = new Bundle();
            bundle.putInt("id", Integer.valueOf(i).intValue());
            ((C100250b) aVar).f280369a.mo28345s("onOptionIdSelectedChanged_int", "SuggestFeedbackEventsDispatcher", bundle);
        }
    }

    /* renamed from: g */
    public final void mo91854g(RadioButton radioButton) {
        radioButton.setChecked(true);
        RadioButton radioButton2 = this.f280416p;
        if (!(radioButton2 == null || radioButton2 == radioButton)) {
            radioButton2.setChecked(false);
        }
        this.f280416p = radioButton;
    }

    /* renamed from: h */
    public final void mo91855h() {
        C100249a aVar = this.f280402b;
        ((C100250b) aVar).f280369a.mo28345s("onDoneButtonClicked", "SuggestFeedbackEventsDispatcher", new Bundle());
    }

    /* renamed from: im */
    public final void mo28298im() {
        AlertDialog alertDialog = this.f280414n;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        ViewGroup viewGroup = (ViewGroup) View.inflate(this.f280401a, R.layout.suggestfeedback, (ViewGroup) null);
        mo28295iC(viewGroup);
        this.f280413m = (TextView) viewGroup.findViewById(R.id.suggestion_text);
        this.f280406f = (RadioButton) viewGroup.findViewById(R.id.option1);
        this.f280407g = (RadioButton) viewGroup.findViewById(R.id.option2);
        this.f280408h = (RadioButton) viewGroup.findViewById(R.id.option3);
        this.f280409i = (RadioButton) viewGroup.findViewById(R.id.option4);
        this.f280410j = (RadioButton) viewGroup.findViewById(R.id.option5);
        this.f280412l = (RadioButton) viewGroup.findViewById(R.id.option6);
        this.f280411k = (RadioButton) viewGroup.findViewById(R.id.option_other);
        this.f280404d = (EditText) viewGroup.findViewById(R.id.other_option_edit);
        this.f280405e = (EditText) viewGroup.findViewById(R.id.additional_comment_box);
        Toolbar toolbar = (Toolbar) viewGroup.findViewById(R.id.suggest_feedback_toolbar);
        this.f280417q = toolbar;
        toolbar.mo2419t(new C100261i(this));
        this.f280417q.mo2404n(R.menu.menu_send);
        MenuItem findItem = this.f280417q.mo2393g().findItem(R.id.menu_send);
        this.f280415o = findItem;
        findItem.setOnMenuItemClickListener(new C100262j(this));
        ((ScrollView) viewGroup.findViewById(R.id.suggest_feedback_scrollview)).setOnTouchListener(new C100260h(this));
        this.f280404d.addTextChangedListener(new C100272t(this));
        this.f280405e.addTextChangedListener(new C100273u(this));
        C23251a aVar = ((C100253a) this.f280403c).f280372b;
        EditText editText = this.f280405e;
        Objects.requireNonNull(editText);
        aVar.mo28726b(new C100269q(editText));
        C23251a aVar2 = ((C100253a) this.f280403c).f280373c;
        EditText editText2 = this.f280404d;
        Objects.requireNonNull(editText2);
        aVar2.mo28726b(new C100269q(editText2));
        LinkTextView linkTextView = (LinkTextView) viewGroup.findViewById(R.id.description);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
        linkTextView.setClickable(true);
        this.f280414n = new AlertDialog.Builder(this.f280401a).setTitle(R.string.thank_you_dialog_tilte).setMessage(R.string.thank_you_dialog_body).setPositiveButton(R.string.suggestfeedback_done, new C100270r(this)).setOnCancelListener(new C100271s(this)).create();
        this.f280406f.setOnClickListener(new C100254b(this));
        this.f280407g.setOnClickListener(new C100263k(this));
        this.f280408h.setOnClickListener(new C100264l(this));
        this.f280409i.setOnClickListener(new C100265m(this));
        this.f280410j.setOnClickListener(new C100266n(this));
        this.f280412l.setOnClickListener(new C100267o(this));
        this.f280411k.setOnClickListener(new C100268p(this));
        ((C100253a) this.f280403c).f280379i.mo28726b(new C100255c(this));
        ((C100253a) this.f280403c).f280376f.mo28726b(new C100256d(this));
        ((C100253a) this.f280403c).f280377g.mo28726b(new C100257e(this));
        ((C100253a) this.f280403c).f280374d.mo28726b(new C100258f(this));
        ((C100253a) this.f280403c).f280378h.mo28726b(new C100259g(this));
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f280401a.getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
            obtain.getText().add(this.f280401a.getString(R.string.action_send));
            obtain.setClassName(this.f280417q.getClass().getName());
            obtain.setPackageName(this.f280401a.getPackageName());
            obtain.setSource(this.f280417q);
            C1998r rVar = new C1998r(obtain);
            rVar.f5926a.setSource(this.f280417q);
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
    }
}
