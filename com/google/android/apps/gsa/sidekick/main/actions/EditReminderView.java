package com.google.android.apps.gsa.sidekick.main.actions;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.gsa.search.shared.actions.util.C87481c;
import com.google.android.apps.gsa.search.shared.actions.util.C87498t;
import com.google.android.apps.gsa.shared.logger.p7065j.C89932c;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.apps.gsa.shared.p7148ui.C90635ak;
import com.google.android.apps.gsa.shared.p7148ui.SpinnerAlwaysCallback;
import com.google.android.apps.gsa.shared.p7148ui.p7155g.C90678a;
import com.google.android.apps.gsa.shared.util.p7187ui.C91108g;
import com.google.android.apps.gsa.shared.util.p7187ui.C91109h;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* compiled from: PG */
public class EditReminderView extends ScrollView {

    /* renamed from: a */
    EditText f254663a;

    /* renamed from: b */
    RadioButton f254664b;

    /* renamed from: c */
    RadioButton f254665c;

    /* renamed from: d */
    SpinnerAlwaysCallback f254666d;

    /* renamed from: e */
    SpinnerAlwaysCallback f254667e;

    /* renamed from: f */
    C91108g f254668f;

    /* renamed from: g */
    C91108g f254669g;

    /* renamed from: h */
    private final TextWatcher f254670h = new C91245d();

    /* renamed from: i */
    private final View.OnFocusChangeListener f254671i = new C91246e(this);

    /* renamed from: j */
    private final View.OnTouchListener f254672j = new C91247f(this);

    /* renamed from: k */
    private final View.OnTouchListener f254673k = new C91248g(this);

    /* renamed from: l */
    private final C90635ak f254674l = new C91249h();

    /* renamed from: m */
    private final C90635ak f254675m = new C91250i();

    /* renamed from: n */
    private final View.OnClickListener f254676n = new C91251j();

    /* renamed from: o */
    private final View.OnClickListener f254677o = new C91242a();

    /* renamed from: p */
    private final C90635ak f254678p = new C91243b();

    /* renamed from: q */
    private SpinnerAlwaysCallback f254679q;

    /* renamed from: r */
    private TextView f254680r;

    /* renamed from: s */
    private TextView f254681s;

    /* renamed from: t */
    private C90678a f254682t;

    /* renamed from: u */
    private C87481c f254683u;

    public EditReminderView(Context context) {
        super(context);
    }

    /* renamed from: a */
    protected static final void m149159a(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.setMarginEnd(0);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        this.f254683u = new C87481c(getContext());
        EditText editText = (EditText) findViewById(R.id.label);
        this.f254663a = editText;
        editText.addTextChangedListener(this.f254670h);
        this.f254663a.setOnFocusChangeListener(this.f254671i);
        this.f254663a.setOnTouchListener(new C91244c());
        C89941l.m146512c(this.f254663a, 7214);
        C89941l.m146512c(findViewById(R.id.trigger_toggle_container), 7222);
        RadioButton radioButton = (RadioButton) findViewById(R.id.time_trigger_radio_button);
        this.f254664b = radioButton;
        C89941l.m146512c(radioButton, 7223);
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.location_trigger_radio_button);
        this.f254665c = radioButton2;
        C89941l.m146512c(radioButton2, 7224);
        C89941l.m146512c(findViewById(R.id.trigger_container), 7221);
        C89941l.m146512c(findViewById(R.id.time_trigger_container), 7217);
        SpinnerAlwaysCallback spinnerAlwaysCallback = (SpinnerAlwaysCallback) findViewById(R.id.date);
        this.f254666d = spinnerAlwaysCallback;
        C89941l.m146512c(spinnerAlwaysCallback, 7218);
        SpinnerAlwaysCallback spinnerAlwaysCallback2 = (SpinnerAlwaysCallback) findViewById(R.id.time);
        this.f254667e = spinnerAlwaysCallback2;
        C89941l.m146512c(spinnerAlwaysCallback2, 7220);
        SpinnerAlwaysCallback spinnerAlwaysCallback3 = (SpinnerAlwaysCallback) findViewById(R.id.location);
        this.f254679q = spinnerAlwaysCallback3;
        C89941l.m146512c(spinnerAlwaysCallback3, 7216);
        TextView textView = (TextView) findViewById(R.id.set_reminder_done_message);
        this.f254681s = textView;
        C89941l.m146512c(textView, 7030);
        Context context = getContext();
        C91108g gVar = new C91108g(context, C87481c.m141993d(this.f254683u.mo81468a(Calendar.getInstance().getTimeInMillis())));
        this.f254668f = gVar;
        this.f254666d.setAdapter(gVar);
        SpinnerAlwaysCallback spinnerAlwaysCallback4 = this.f254666d;
        spinnerAlwaysCallback4.f253362a = this.f254674l;
        spinnerAlwaysCallback4.setOnTouchListener(this.f254672j);
        C89941l.m146512c(this.f254666d, 7218);
        C87481c cVar = this.f254683u;
        List<C87498t> b = C87481c.m141991b(System.currentTimeMillis());
        ArrayList d = C58597ky.m90213d(b.size() + 2);
        for (C87498t tVar : b) {
            C91109h hVar = (C91109h) cVar.f236307b.get(tVar);
            hVar.getClass();
            d.add(hVar);
        }
        d.add(cVar.f236308c);
        C91108g gVar2 = new C91108g(context, C87481c.m141993d(d));
        this.f254669g = gVar2;
        this.f254667e.setAdapter(gVar2);
        SpinnerAlwaysCallback spinnerAlwaysCallback5 = this.f254667e;
        spinnerAlwaysCallback5.f253362a = this.f254675m;
        spinnerAlwaysCallback5.setOnTouchListener(this.f254672j);
        C89941l.m146512c(this.f254667e, 7220);
        C90678a aVar = new C90678a(context, getResources().getStringArray(R.array.edit_reminder_location));
        this.f254682t = aVar;
        this.f254679q.setAdapter(aVar);
        SpinnerAlwaysCallback spinnerAlwaysCallback6 = this.f254679q;
        spinnerAlwaysCallback6.f253362a = this.f254678p;
        spinnerAlwaysCallback6.setOnTouchListener(this.f254672j);
        this.f254664b.setOnClickListener(this.f254676n);
        this.f254664b.setOnTouchListener(this.f254673k);
        this.f254665c.setOnClickListener(this.f254676n);
        this.f254665c.setOnTouchListener(this.f254673k);
        this.f254680r = (TextView) findViewById(R.id.recurrence_rule);
        findViewById(R.id.recurrence_rule_button).setVisibility(8);
        TextView textView2 = this.f254680r;
        int color = getResources().getColor(R.color.qp_text_b2);
        Drawable drawable = textView2.getCompoundDrawablesRelative()[2];
        if (drawable != null) {
            drawable.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
        }
        if (Build.VERSION.RELEASE.startsWith("6.") && Build.VERSION.RELEASE.compareToIgnoreCase("6.0.1") >= 0) {
            m149159a(this.f254666d);
            m149159a(this.f254667e);
        }
        this.f254680r.setOnClickListener(this.f254677o);
        this.f254680r.setEnabled(true);
        C89941l.m146512c(this.f254680r, 7219);
        C59071e eVar = C89932c.f246390a;
        super.onFinishInflate();
    }

    public EditReminderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EditReminderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
