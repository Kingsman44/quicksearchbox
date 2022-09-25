package com.google.android.apps.gsa.staticplugins.opa.deviceregistration.p8359ui.textview;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58471gg;
import com.google.common.p4522b.C58724pq;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ui.textview.ExpandableSection */
/* compiled from: PG */
public class ExpandableSection extends RelativeLayout {

    /* renamed from: a */
    public boolean f302477a;

    /* renamed from: b */
    public ScrollView f302478b;

    /* renamed from: c */
    public ImageView f302479c;

    /* renamed from: d */
    private TextView f302480d;

    /* renamed from: e */
    private TextView f302481e;

    public ExpandableSection(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: c */
    private static void m180925c(View view, int i) {
        if (view != null) {
            String string = view.getContext().getString(i);
            if (C58837ba.m90859h(string)) {
                view.setVisibility(8);
                return;
            }
            ((TextView) view).setText(string);
            view.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo97153a(int i, int i2, int i3, List list, List list2, ScrollView scrollView) {
        this.f302478b = scrollView;
        LayoutInflater.from(getContext()).inflate(R.layout.expandable_section, this);
        this.f302480d = (TextView) findViewById(R.id.body_text_collapsed);
        this.f302481e = (TextView) findViewById(R.id.body_text_expanded);
        ImageView imageView = (ImageView) findViewById(R.id.expand_button);
        this.f302479c = imageView;
        imageView.setImageResource(true != this.f302477a ? R.drawable.quantum_ic_keyboard_arrow_down_black_24 : R.drawable.quantum_ic_keyboard_arrow_up_black_24);
        int i4 = 8;
        this.f302480d.setVisibility(true != this.f302477a ? 0 : 8);
        TextView textView = this.f302481e;
        if (true == this.f302477a) {
            i4 = 0;
        }
        textView.setVisibility(i4);
        findViewById(R.id.expandable_divider);
        setOnClickListener(new C108765b(this));
        m180925c(findViewById(R.id.title_text), i);
        m180925c(this.f302480d, i2);
        if (!list.isEmpty()) {
            this.f302481e.setText(getResources().getString(i3, ((C58471gg) list).toArray(C58471gg.f156097c)));
            for (int i5 = 0; i5 < ((C58724pq) list).f156474d; i5++) {
                String str = (String) list.get(i5);
                String str2 = (String) list2.get(i5);
                if (!C58837ba.m90859h(str2)) {
                    URLSpan uRLSpan = new URLSpan(str2);
                    TextView textView2 = this.f302481e;
                    textView2.setLinksClickable(true);
                    textView2.setMovementMethod(LinkMovementMethod.getInstance());
                    SpannableString valueOf = SpannableString.valueOf(textView2.getText());
                    int i6 = 0;
                    while (i6 < str.length() && Character.getType(str.charAt(0)) == 16) {
                        i6++;
                    }
                    if (i6 > 0) {
                        str = str.substring(i6);
                    }
                    Matcher matcher = Pattern.compile(str, 2).matcher(valueOf);
                    while (matcher.find()) {
                        valueOf.setSpan(uRLSpan, matcher.start(), matcher.end(), 33);
                    }
                }
            }
            return;
        }
        m180925c(this.f302481e, i3);
    }

    /* renamed from: b */
    public final void mo97154b() {
        TextView textView;
        TextView textView2;
        boolean z = !this.f302477a;
        this.f302477a = z;
        if (z) {
            textView = this.f302480d;
        } else {
            textView = this.f302481e;
        }
        if (z) {
            textView2 = this.f302481e;
        } else {
            textView2 = this.f302480d;
        }
        textView2.getViewTreeObserver().addOnPreDrawListener(new C108766c(this, textView2, textView.getMeasuredHeight()));
        this.f302479c.setImageResource(true != this.f302477a ? R.drawable.quantum_ic_keyboard_arrow_down_black_24 : R.drawable.quantum_ic_keyboard_arrow_up_black_24);
        textView.setVisibility(8);
        textView2.setVisibility(0);
        textView.setOnClickListener((View.OnClickListener) null);
        textView2.setOnClickListener(new C108764a(this));
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            if (this.f302477a != bundle.getBoolean("isExpand")) {
                mo97154b();
            }
            parcelable = bundle.getParcelable("savedState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("savedState", super.onSaveInstanceState());
        bundle.putBoolean("isExpand", this.f302477a);
        return bundle;
    }

    public ExpandableSection(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExpandableSection(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f302477a = false;
    }
}
