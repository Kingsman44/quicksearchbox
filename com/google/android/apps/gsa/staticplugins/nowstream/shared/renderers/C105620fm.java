package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90233i;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a.C105416x;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105455y;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.p8154ui.C105654a;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.p8154ui.C105655b;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.p8154ui.RatingView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.fm */
/* compiled from: PG */
public final class C105620fm extends C22939d implements C90233i {

    /* renamed from: a */
    public final Context f294682a;

    /* renamed from: b */
    public final C105416x f294683b;

    /* renamed from: c */
    public ViewGroup f294684c;

    /* renamed from: d */
    public TextView f294685d;

    /* renamed from: e */
    public TextView f294686e;

    /* renamed from: f */
    public TextView f294687f;

    /* renamed from: g */
    public RatingView f294688g;

    /* renamed from: h */
    private final C105455y f294689h;

    /* renamed from: i */
    private View f294690i;

    /* renamed from: j */
    private View f294691j;

    public C105620fm(C22945j jVar, Context context, C105455y yVar, C105416x xVar) {
        super(jVar);
        this.f294682a = context;
        this.f294689h = yVar;
        this.f294683b = xVar;
    }

    /* renamed from: e */
    public static void m175753e(RatingView ratingView, int i) {
        if (ratingView != null) {
            ImageView[] imageViewArr = ratingView.f294760a;
            int length = imageViewArr.length;
            for (int i2 = 0; i2 < 5; i2++) {
                imageViewArr[i2].setColorFilter(i);
            }
        }
    }

    /* renamed from: g */
    public static void m175754g(TextView textView, String str) {
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* renamed from: h */
    public static void m175755h(TextView textView, int i) {
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    /* renamed from: j */
    public static void m175756j(TextView textView, String str) {
        if (str.isEmpty()) {
            m175757k(textView, 8);
            return;
        }
        m175754g(textView, str);
        m175757k(textView, 0);
    }

    /* renamed from: k */
    public static void m175757k(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    /* renamed from: a */
    public final int mo83944a() {
        return 0;
    }

    /* renamed from: b */
    public final View mo83945b() {
        return this.f294691j;
    }

    /* renamed from: c */
    public final String mo83946c() {
        ViewGroup viewGroup = this.f294684c;
        if (viewGroup != null) {
            viewGroup.setFocusable(true);
            this.f294684c.sendAccessibilityEvent(8);
        }
        return this.f294682a.getString(R.string.survey_talkback_string);
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        ViewGroup viewGroup;
        View inflate = LayoutInflater.from(this.f294682a).inflate(R.layout.nsat_survey, (ViewGroup) null);
        this.f294691j = inflate;
        mo28295iC(inflate);
        this.f294688g = (RatingView) this.f294691j.findViewById(R.id.rating_view);
        this.f294691j.addOnAttachStateChangeListener(new C105619fl(this));
        this.f294684c = (ViewGroup) this.f294691j.findViewById(R.id.survey_question_rating_container);
        this.f294685d = (TextView) this.f294691j.findViewById(R.id.question_text);
        ViewGroup viewGroup2 = this.f294684c;
        if (viewGroup2 != null) {
            viewGroup2.setOnTouchListener(C105612fe.f294674a);
        }
        ((C105591ek) this.f294689h).f294624c.mo28726b(new C105613ff(this));
        this.f294686e = (TextView) this.f294691j.findViewById(R.id.negative_label);
        ((C105591ek) this.f294689h).f294622a.mo28726b(new C105614fg(this));
        this.f294687f = (TextView) this.f294691j.findViewById(R.id.positive_label);
        ((C105591ek) this.f294689h).f294623b.mo28726b(new C105615fh(this));
        ((C105591ek) this.f294689h).f294625d.mo28726b(new C105616fi(this));
        View findViewById = this.f294691j.findViewById(R.id.survey_close_button);
        this.f294690i = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new C105617fj(this));
        }
        RatingView ratingView = this.f294688g;
        if (ratingView != null) {
            C105618fk fkVar = new C105618fk(this);
            int i = 0;
            while (true) {
                int length = ratingView.f294760a.length;
                if (i >= 5) {
                    break;
                }
                ratingView.f294760a[i].setOnClickListener(new C105654a(fkVar, C105655b.values()[i]));
                i++;
            }
        }
        if (this.f294682a.getResources().getConfiguration().orientation == 2 && (viewGroup = this.f294684c) != null) {
            viewGroup.setLayoutParams(new FrameLayout.LayoutParams(this.f294682a.getResources().getDimensionPixelOffset(R.dimen.smile_survey_width_landscape), -2, 8388613));
        }
    }
}
