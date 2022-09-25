package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.searchplate.widget.StreamingTextView;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.shared.util.p7162d.C90962a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.assistant.p3897e.p3921j.p3922a.C51655m;
import com.google.assistant.p3897e.p3921j.p3922a.C51656n;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.je */
/* compiled from: PG */
public final class C108451je extends C108192a {

    /* renamed from: a */
    public static final C59071e f301649a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.chatui.je");

    /* renamed from: D */
    public boolean f301650D = false;

    /* renamed from: E */
    public boolean f301651E = false;

    /* renamed from: F */
    public boolean f301652F = false;

    /* renamed from: G */
    public C51656n f301653G;

    /* renamed from: H */
    public String f301654H = BuildConfig.FLAVOR;

    /* renamed from: I */
    public int f301655I = 0;

    /* renamed from: J */
    public int f301656J = 1;

    /* renamed from: K */
    private boolean f301657K = false;

    /* renamed from: L */
    private boolean f301658L = false;

    /* renamed from: M */
    private Drawable f301659M;

    /* renamed from: b */
    public String f301660b;

    /* renamed from: c */
    public String f301661c;

    /* renamed from: d */
    public int f301662d;

    /* renamed from: e */
    public CharSequence f301663e;

    /* renamed from: f */
    public boolean f301664f = true;

    /* renamed from: g */
    public boolean f301665g = true;

    /* renamed from: h */
    public boolean f301666h = false;

    /* renamed from: A */
    private static void m180272A(View view, int i, int i2) {
        C28292j jVar = new C28292j(i2);
        jVar.mo33795i(i);
        C28295m.m52919e(view, jVar);
        C89949q.m146521e(C28285c.m52874a(view, i2), false);
    }

    /* renamed from: e */
    public static void m180273e(C108241bl blVar) {
        if (blVar != null) {
            Context context = blVar.f301080g.getContext();
            blVar.f301080g.setBackgroundResource(R.drawable.chatui_suggestion_background);
            blVar.f301080g.setPaddingRelative(m180275y(context, 50), 0, m180275y(context, 50), 0);
            blVar.f301080g.setGravity(8388627);
            ViewGroup viewGroup = blVar.f301056F;
            if (viewGroup != null) {
                ViewParent parent = viewGroup.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(blVar.f301056F);
                }
                blVar.f301055E.addView(blVar.f301056F);
                blVar.f301080g.setWidth(blVar.f301056F.getWidth());
            }
            ((ViewGroup.MarginLayoutParams) blVar.f301054D.getLayoutParams()).setMargins(m180275y(context, 15), 0, 0, 0);
            blVar.f301054D.setElevation((float) m180275y(context, 20));
            ViewGroup.LayoutParams layoutParams = blVar.f301052B.getLayoutParams();
            layoutParams.width = m180275y(context, 48);
            layoutParams.height = m180275y(context, 48);
            blVar.f301052B.setLayoutParams(layoutParams);
            blVar.f301052B.setPaddingRelative(m180275y(context, 12), m180275y(context, 12), m180275y(context, 12), m180275y(context, 12));
            blVar.f301052B.setElevation((float) m180275y(context, 20));
        }
    }

    /* renamed from: v */
    public static void m180274v(Context context, SpannableStringBuilder spannableStringBuilder, int i, int i2, C51655m mVar) {
        spannableStringBuilder.setSpan(new C108432im(context, mVar), i, i2, 17);
    }

    /* renamed from: y */
    private static int m180275y(Context context, int i) {
        return (int) ((((float) i) * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: z */
    private final void m180276z() {
        int i;
        C108241bl m = mo96603m();
        if (m != null && m.f301080g != null) {
            ViewGroup viewGroup = m.f301074a;
            if ((viewGroup instanceof LinearLayout) && ((LinearLayout) viewGroup).getOrientation() != 1) {
                if (this.f301657K) {
                    i = 0;
                } else {
                    i = m.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.chatui_bubble_textview_no_logo_start_padding);
                }
                StreamingTextView streamingTextView = m.f301080g;
                streamingTextView.setPaddingRelative(i, streamingTextView.getPaddingTop(), m.f301080g.getPaddingEnd(), m.f301080g.getPaddingBottom());
                this.f301658L = true;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo96575b() {
        return this.f301663e != null;
    }

    /* renamed from: c */
    public final String mo96890c() {
        CharSequence charSequence = this.f301663e;
        if (charSequence == null) {
            return null;
        }
        return charSequence.toString();
    }

    /* renamed from: d */
    public final boolean mo96597d() {
        return true;
    }

    /* renamed from: f */
    public final void mo96891f(boolean z) {
        ImageView imageView;
        this.f301657K = z;
        C108241bl m = mo96603m();
        if (!(m == null || (imageView = m.f301054D) == null)) {
            imageView.setVisibility(true != z ? 8 : 0);
        }
        m180276z();
    }

    /* renamed from: h */
    public final int mo95830h() {
        return mo96894x() ? 25 : 0;
    }

    /* renamed from: j */
    public final void mo95832j(C108241bl blVar, C108237bh bhVar) {
        if (blVar.f301080g != null) {
            int i = 8;
            if (!this.f301664f) {
                blVar.f301074a.setVisibility(8);
                return;
            }
            int i2 = 0;
            blVar.f301074a.setVisibility(0);
            C86124t tVar = this.f301041w;
            boolean a = C90962a.m148577a(blVar.f301080g.getContext());
            int color = blVar.f301080g.getContext().getColor(R.color.chatui_user_bubble_text);
            if (tVar != null && tVar.mo79746e(C90029ch.f248194H)) {
                if (TextUtils.isEmpty(this.f301654H)) {
                    blVar.f301080g.setTextColor(color);
                } else {
                    blVar.f301080g.setTextColor(Color.parseColor(this.f301654H));
                }
                int i3 = this.f301655I;
                if (i3 > 0) {
                    blVar.f301080g.setTextSize((float) i3);
                } else {
                    blVar.f301080g.setTextSize(16.0f);
                }
            }
            Drawable background = blVar.f301080g.getBackground();
            if (a) {
                background.setColorFilter(new LightingColorFilter(Color.parseColor("#FFFFFF"), Color.parseColor("#101010")));
            }
            this.f301662d = blVar.f301080g.getLineCount();
            if (blVar.f301052B != null) {
                mo96893w();
            }
            ImageView imageView = blVar.f301054D;
            if (imageView != null) {
                imageView.setVisibility(true != this.f301657K ? 8 : 0);
                m180276z();
                Drawable drawable = this.f301659M;
                if (drawable == null) {
                    blVar.f301054D.setImageResource(R.drawable.opa_assistant_logo);
                } else {
                    blVar.f301054D.setImageDrawable(drawable);
                }
            }
            CharSequence charSequence = this.f301663e;
            if (charSequence != null) {
                blVar.f301080g.mo82924c(charSequence);
                if (this.f301652F) {
                    C108321ej ejVar = blVar.f301070T;
                    if (ejVar != null) {
                        blVar.f301080g.setMovementMethod(new C108434io(ejVar));
                    } else {
                        return;
                    }
                }
                ViewGroup viewGroup = blVar.f301057G;
                if (viewGroup != null) {
                    if (true == this.f301650D) {
                        i = 0;
                    }
                    viewGroup.setVisibility(i);
                    if (blVar != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) blVar.f301074a.getLayoutParams();
                        int i4 = marginLayoutParams.leftMargin;
                        int i5 = marginLayoutParams.topMargin;
                        int i6 = marginLayoutParams.rightMargin;
                        if (!this.f301650D || !this.f301651E) {
                            i2 = blVar.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.chatui_user_bubble_gap_bottom);
                        }
                        marginLayoutParams.setMargins(i4, i5, i6, i2);
                    }
                }
                blVar.f301080g.setMaxWidth(blVar.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.chatui_google_bubble_text_max_width));
            } else {
                StreamingTextView streamingTextView = blVar.f301080g;
                streamingTextView.f241132b = true;
                streamingTextView.f241131a = bhVar.mo96646S();
                blVar.f301080g.mo82923b(this.f301660b, this.f301661c);
            }
            if (mo96575b() && !blVar.f301080g.hasOnClickListeners()) {
                mo96606p(blVar.f301080g, blVar.f301090q);
                C108321ej ejVar2 = blVar.f301070T;
                if (ejVar2 != null) {
                    C86124t tVar2 = this.f301041w;
                    if (tVar2 == null || !tVar2.mo79746e(C90014bt.f247509iW)) {
                        m180272A(blVar.f301080g, 32, 63837);
                    }
                    blVar.f301080g.setOnLongClickListener(new C108450jd(this, ejVar2));
                }
                C108324em emVar = blVar.f301071U;
                if (!(emVar == null || this.f301663e == null)) {
                    C86124t tVar3 = this.f301041w;
                    if (tVar3 == null || !tVar3.mo79746e(C90014bt.f247509iW)) {
                        m180272A(blVar.f301080g, 5, 63837);
                    }
                    C108490y yVar = new C108490y();
                    CharSequence charSequence2 = this.f301663e;
                    if (charSequence2 != null) {
                        yVar.f301871a = charSequence2.toString();
                    }
                    blVar.f301080g.setOnClickListener(new C89943l(new C108449jc(emVar, yVar)));
                    C108490y yVar2 = new C108490y();
                    yVar2.f301873c = true;
                    CharSequence charSequence3 = this.f301663e;
                    if (charSequence3 != null) {
                        yVar2.f301871a = charSequence3.toString();
                    }
                    ViewGroup viewGroup2 = blVar.f301057G;
                    if (viewGroup2 != null && viewGroup2.getVisibility() == 0) {
                        m180272A(viewGroup2, 5, 67493);
                        viewGroup2.setOnClickListener(new C89943l(new C108447ja(this, yVar2, emVar)));
                    }
                }
            }
            if (this.f301652F) {
                m180272A(blVar.f301080g, 39, 75813);
            }
            if (this.f301666h) {
                m180273e(blVar);
            }
        }
    }

    /* renamed from: k */
    public final void mo95833k(C108241bl blVar) {
        ViewGroup viewGroup = blVar.f301090q;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        StreamingTextView streamingTextView = blVar.f301080g;
        if (streamingTextView != null) {
            streamingTextView.setOnClickListener((View.OnClickListener) null);
            blVar.f301080g.setOnLongClickListener((View.OnLongClickListener) null);
            blVar.f301080g.setMovementMethod((MovementMethod) null);
            if (this.f301658L) {
                blVar.f301080g.setPaddingRelative(0, 0, 0, 0);
            }
        }
        ImageView imageView = blVar.f301052B;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ImageView imageView2 = blVar.f301054D;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
    }

    /* renamed from: s */
    public final void mo96609s(boolean z) {
        StreamingTextView streamingTextView;
        C108241bl m = mo96603m();
        if (m != null && (streamingTextView = m.f301080g) != null) {
            streamingTextView.setSelected(z);
        }
    }

    /* renamed from: u */
    public final void mo96892u(Drawable drawable) {
        ImageView imageView;
        this.f301659M = drawable;
        C108241bl m = mo96603m();
        if (m != null && (imageView = m.f301054D) != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    /* renamed from: w */
    public final void mo96893w() {
        C108241bl m = mo96603m();
        if (m != null) {
            C86124t tVar = this.f301041w;
            int i = 0;
            if (tVar == null || !tVar.mo79746e(C90029ch.f248274bh)) {
                ImageView imageView = m.f301052B;
                if (imageView != null) {
                    imageView.setVisibility(true != this.f301665g ? 8 : 0);
                }
                SelectedAccountDisc selectedAccountDisc = m.f301053C;
                if (selectedAccountDisc != null) {
                    selectedAccountDisc.setVisibility(8);
                }
            } else {
                SelectedAccountDisc selectedAccountDisc2 = m.f301053C;
                if (selectedAccountDisc2 != null) {
                    selectedAccountDisc2.setVisibility(true != this.f301665g ? 8 : 0);
                }
                ImageView imageView2 = m.f301052B;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
            }
            C108241bl m2 = mo96603m();
            if (m2 != null && m2.f301080g != null) {
                ViewGroup viewGroup = m2.f301074a;
                if (!(viewGroup instanceof LinearLayout) || ((LinearLayout) viewGroup).getOrientation() != 1) {
                    if (!this.f301665g) {
                        i = m2.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.chatui_bubble_textview_no_avatar_end_padding);
                    }
                    StreamingTextView streamingTextView = m2.f301080g;
                    streamingTextView.setPaddingRelative(streamingTextView.getPaddingStart(), m2.f301080g.getPaddingTop(), i, m2.f301080g.getPaddingBottom());
                    this.f301658L = true;
                }
            }
        }
    }

    /* renamed from: x */
    public final boolean mo96894x() {
        return this.f301656J == 2;
    }
}
