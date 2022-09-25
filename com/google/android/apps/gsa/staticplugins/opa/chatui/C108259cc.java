package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.method.MovementMethod;
import android.text.style.TypefaceSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import com.google.android.apps.gsa.searchplate.widget.StreamingTextView;
import com.google.android.apps.gsa.shared.util.p7162d.C90962a;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.C114059dy;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.cc */
/* compiled from: PG */
public final class C108259cc extends C108192a {

    /* renamed from: d */
    private static final C59071e f301152d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.chatui.cc");

    /* renamed from: a */
    public CharSequence f301153a;

    /* renamed from: b */
    public final C91097g f301154b;

    /* renamed from: c */
    public final C114059dy f301155c;

    /* renamed from: e */
    private final Context f301156e;

    /* renamed from: f */
    private final Activity f301157f;

    public C108259cc(C91097g gVar, Context context, Activity activity, C114059dy dyVar) {
        this.f301154b = gVar;
        this.f301156e = context;
        this.f301157f = activity;
        this.f301155c = dyVar;
        this.f301033o = false;
    }

    /* renamed from: b */
    public final boolean mo96575b() {
        return this.f301153a != null;
    }

    /* renamed from: c */
    public final void mo96707c() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f301157f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(this.f301156e.getResources().getString(R.string.opa_delete_drl_history_confirmation_title));
        spannableStringBuilder.setSpan(new TypefaceSpan("google-sans-medium"), 0, spannableStringBuilder.length(), 33);
        AlertDialog.Builder title = builder.setTitle(spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append(this.f301153a);
        int length = spannableStringBuilder2.length();
        spannableStringBuilder2.append(" ");
        spannableStringBuilder2.append(this.f301156e.getResources().getString(R.string.opa_delete_drl_history_confirmation_message));
        spannableStringBuilder2.setSpan(new TypefaceSpan("google-sans-medium"), 0, length, 33);
        try {
            title.setMessage(spannableStringBuilder2).setPositiveButton(R.string.common_delete, new C108255bz(this)).setNegativeButton(R.string.common_no, (DialogInterface.OnClickListener) null).create().show();
        } catch (WindowManager.BadTokenException e) {
            ((C59052c) ((C59052c) ((C59052c) f301152d.mo56225c()).mo56382g(e)).mo56372aa(23947)).mo56386p("error creating dialog.");
        }
    }

    /* renamed from: d */
    public final boolean mo96597d() {
        return true;
    }

    /* renamed from: h */
    public final int mo95830h() {
        return 23;
    }

    /* renamed from: j */
    public final void mo95832j(C108241bl blVar, C108237bh bhVar) {
        if (blVar.f301080g != null) {
            blVar.f301074a.setVisibility(0);
            Drawable background = blVar.f301080g.getBackground();
            if (C90962a.m148577a(blVar.f301080g.getContext())) {
                background.setColorFilter(new LightingColorFilter(Color.parseColor("#FFFFFF"), Color.parseColor("#101010")));
            }
            blVar.f301080g.getLineCount();
            CharSequence charSequence = this.f301153a;
            if (charSequence != null) {
                blVar.f301080g.mo82924c(charSequence);
                ImageView imageView = blVar.f301052B;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                ImageView imageView2 = blVar.f301054D;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
                ViewGroup viewGroup = blVar.f301057G;
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
                if (blVar != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) blVar.f301074a.getLayoutParams();
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, blVar.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.chatui_user_bubble_gap_bottom));
                }
            } else {
                StreamingTextView streamingTextView = blVar.f301080g;
                streamingTextView.f241132b = true;
                streamingTextView.f241131a = bhVar.mo96646S();
                blVar.f301080g.mo82923b((String) null, (String) null);
            }
            if (mo96575b() && !blVar.f301080g.hasOnClickListeners()) {
                mo96606p(blVar.f301080g, blVar.f301090q);
                blVar.f301080g.setOnLongClickListener(new C108257ca(this));
                if (this.f301153a != null) {
                    blVar.f301080g.setOnClickListener(new C108258cb(this));
                }
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
}
