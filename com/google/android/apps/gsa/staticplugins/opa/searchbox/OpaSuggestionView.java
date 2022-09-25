package com.google.android.apps.gsa.staticplugins.opa.searchbox;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88795af;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88805ap;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class OpaSuggestionView extends C88795af {

    /* renamed from: a */
    public C88805ap f307806a;

    /* renamed from: b */
    private TextView f307807b;

    /* renamed from: c */
    private View f307808c;

    /* renamed from: d */
    private final View.OnClickListener f307809d = new C110436k(this);

    public OpaSuggestionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f240416m = 37;
    }

    /* renamed from: b */
    public final boolean mo82342b(int i) {
        return true;
    }

    /* renamed from: d */
    public final void mo82350d(Spanned spanned, int i) {
        this.f307807b.setText(spanned);
        if (i == 2) {
            this.f307807b.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        } else {
            this.f307807b.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    /* renamed from: hQ */
    public final void mo82553hQ(C88805ap apVar) {
        this.f307806a = apVar;
        View view = this.f307808c;
        if (view == null) {
            return;
        }
        if (apVar.mo82592a()) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f307808c = findViewById(R.id.opa_suggestion_divider);
        View findViewById = findViewById(R.id.opa_suggestion_text);
        findViewById.getClass();
        TextView textView = (TextView) findViewById;
        this.f307807b = textView;
        textView.setOnClickListener(this.f307809d);
        this.f307807b.setClickable(isClickable());
        setBackground((Drawable) null);
    }
}
