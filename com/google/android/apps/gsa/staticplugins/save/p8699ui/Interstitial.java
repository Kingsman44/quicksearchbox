package com.google.android.apps.gsa.staticplugins.save.p8699ui;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.imageviewer.p1874a.C22823b;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28290h;
import com.google.android.libraries.logging.C28291i;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.ui.Interstitial */
/* compiled from: PG */
public class Interstitial extends RelativeLayout {

    /* renamed from: a */
    public static final Interpolator f322858a = new AccelerateDecelerateInterpolator();

    /* renamed from: k */
    private static final C59071e f322859k = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.save.ui.Interstitial");

    /* renamed from: b */
    public final int f322860b = getResources().getDimensionPixelSize(R.dimen.list_end_margin);

    /* renamed from: c */
    public List f322861c = C58485gu.m89845m();

    /* renamed from: d */
    public final Runnable f322862d = new C116460m(this);

    /* renamed from: e */
    public C22823b f322863e;

    /* renamed from: f */
    public RecyclerView f322864f;

    /* renamed from: g */
    public C91189au f322865g;

    /* renamed from: h */
    public AlertDialog.Builder f322866h;

    /* renamed from: i */
    public final C0640fb f322867i = new C116465r(this);

    /* renamed from: j */
    public C116471x f322868j;

    /* renamed from: l */
    private TextView f322869l;

    /* renamed from: m */
    private final C28290h f322870m = new C116463p();

    public Interstitial(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo102703a() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.new_list_dialog_v2, this, false);
        C28295m.m52919e(inflate, new C28292j(39252));
        View findViewById = inflate.findViewById(R.id.create_new_list);
        C28292j jVar = new C28292j(37323);
        jVar.mo33795i(5);
        C28295m.m52919e(findViewById, jVar);
        View findViewById2 = inflate.findViewById(R.id.cancel_new_list);
        C28292j jVar2 = new C28292j(38842);
        jVar2.mo33795i(5);
        C28295m.m52919e(findViewById2, jVar2);
        AlertDialog.Builder builder = this.f322866h;
        if (builder != null) {
            AlertDialog create = builder.setView(inflate).create();
            create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            try {
                create.show();
                create.getWindow().addFlags(2);
                create.getWindow().setDimAmount(0.6f);
                create.getWindow().getAttributes().width = getResources().getDimensionPixelSize(R.dimen.new_tag_dialog_width);
                create.getWindow().setAttributes(create.getWindow().getAttributes());
                TextView textView = (TextView) inflate.findViewById(R.id.cancel_new_list);
                textView.setOnClickListener(new C116454g(create));
                create.setOnDismissListener(new C116455h(this));
                create.setOnCancelListener(new C116456i(textView));
                TextView textView2 = (TextView) inflate.findViewById(R.id.create_new_list);
                textView2.setAlpha(0.38f);
                EditText editText = (EditText) inflate.findViewById(R.id.new_list_edit_text);
                editText.addTextChangedListener(new C116466s(textView2));
                editText.post(new C116457j((InputMethodManager) getContext().getSystemService("input_method"), editText));
                textView2.setOnClickListener(new C89943l(new C116458k(this, create, editText)));
                C89949q.m146521e(C28285c.m52874a(inflate, 472), false);
                C89949q.m146521e(C28285c.m52881h(2, C28295m.m52916b(inflate), (View) null), false);
            } catch (WindowManager.BadTokenException e) {
                ((C59052c) ((C59052c) ((C59052c) f322859k.mo56225c()).mo56382g(e)).mo56372aa(31801)).mo56386p("Exception showing new list dialog");
            }
        }
    }

    /* renamed from: b */
    public final void mo102704b() {
        if (getVisibility() == 0) {
            removeCallbacks(this.f322862d);
            animate().alpha(0.0f).setDuration(350).withEndAction(new C116453f(this)).start();
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f322866h == null) {
            this.f322869l.setVisibility(8);
        } else {
            this.f322869l.setOnClickListener(new C89943l(new C116459l(this)));
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f322862d);
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f322869l = (TextView) findViewById(R.id.new_list_button_v2);
        SpannableString spannableString = new SpannableString("＋  ".concat(String.valueOf(getResources().getString(R.string.save_new_list_v2))));
        spannableString.setSpan(new StyleSpan(1), 0, 1, 0);
        this.f322869l.setText(spannableString);
        TextView textView = this.f322869l;
        C28292j jVar = new C28292j(37321);
        jVar.mo33795i(5);
        C28295m.m52919e(textView, jVar);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list_recycler_v2);
        this.f322864f = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView recyclerView2 = this.f322864f;
        recyclerView2.mHasFixedSize = true;
        new C28291i(recyclerView2, this.f322870m).mo33786b();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f322864f.getY() || this.f322864f.computeVerticalScrollOffset() <= 0) {
            return this.f322863e.onTouch(this, motionEvent) || super.onInterceptTouchEvent(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent) || motionEvent.getActionMasked() == 0;
    }
}
