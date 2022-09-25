package com.google.android.apps.gsa.staticplugins.opa.p8182af;

import android.accounts.Account;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.shared.aa;
import com.google.android.apps.gsa.assistant.settings.shared.ab;
import com.google.android.apps.gsa.assistant.settings.shared.ae;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.apps.gsa.staticplugins.opa.C108782dp;
import com.google.android.apps.gsa.staticplugins.opa.util.C113764ag;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4552o.aqp;
import com.google.common.p4552o.aqs;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.af.v */
/* compiled from: PG */
public final class C106145v extends C106118a implements View.OnClickListener {

    /* renamed from: A */
    private final Activity f296191A;

    /* renamed from: B */
    private AnimatorSet f296192B = null;

    /* renamed from: C */
    private final String f296193C;

    /* renamed from: D */
    private View f296194D = null;

    /* renamed from: E */
    private int f296195E = 0;

    /* renamed from: F */
    private int f296196F = 2;

    /* renamed from: G */
    private final C104149a f296197G;

    /* renamed from: a */
    public final View f296198a;

    /* renamed from: b */
    public final View f296199b;

    /* renamed from: c */
    public final View f296200c;

    /* renamed from: d */
    ArrayList f296201d = new ArrayList();

    /* renamed from: e */
    int f296202e = -1;

    /* renamed from: f */
    View f296203f = null;

    /* renamed from: g */
    public final C108782dp f296204g;

    /* renamed from: h */
    private final C86124t f296205h;

    /* renamed from: i */
    private final ae f296206i;

    /* renamed from: j */
    private final C68214a f296207j;

    /* renamed from: k */
    private final l f296208k;

    /* renamed from: l */
    private final Context f296209l;

    /* renamed from: m */
    private final View f296210m;

    /* renamed from: n */
    private final TextView f296211n;

    /* renamed from: o */
    private final TextView f296212o;

    /* renamed from: p */
    private final TextView f296213p;

    /* renamed from: q */
    private final View f296214q;

    /* renamed from: r */
    private final ImageView f296215r;

    /* renamed from: s */
    private final ScrollView f296216s;

    /* renamed from: t */
    private final RadioGroup f296217t;

    /* renamed from: u */
    private final Button f296218u;

    /* renamed from: v */
    private final Button f296219v;

    /* renamed from: w */
    private final Account f296220w;

    /* renamed from: x */
    private final ab f296221x;

    /* renamed from: y */
    private aa f296222y = null;

    /* renamed from: z */
    private final Resources f296223z;

    public C106145v(C108782dp dpVar, C86054o oVar, Context context, C86124t tVar, C104149a aVar, ae aeVar, ab abVar, C68214a aVar2, l lVar, Activity activity) {
        Account a = oVar.mo79668a();
        a.getClass();
        this.f296220w = a;
        this.f296205h = tVar;
        this.f296197G = aVar;
        this.f296191A = activity;
        this.f296206i = aeVar;
        this.f296204g = dpVar;
        this.f296223z = context.getResources();
        this.f296207j = aVar2;
        this.f296208k = lVar;
        this.f296209l = context;
        this.f296193C = aeVar.d(a.name).toLanguageTag();
        this.f296221x = abVar;
        View inflate = LayoutInflater.from(C106149z.m176813a(aVar, context)).inflate(R.layout.language_picker, (ViewGroup) null);
        this.f296210m = inflate;
        C28295m.m52919e(inflate, new C28292j(86558));
        this.f296211n = (TextView) inflate.findViewById(R.id.language_picker_intro);
        this.f296200c = inflate.findViewById(R.id.title_view);
        this.f296212o = (TextView) inflate.findViewById(R.id.language_picker_title);
        this.f296213p = (TextView) inflate.findViewById(R.id.header_text);
        this.f296215r = (ImageView) inflate.findViewById(R.id.opa_logo_view_large);
        this.f296217t = (RadioGroup) inflate.findViewById(R.id.language_list);
        this.f296198a = inflate.findViewById(R.id.header_shadow);
        this.f296214q = inflate.findViewById(R.id.opa_logo_view);
        this.f296199b = inflate.findViewById(R.id.header);
        this.f296216s = (ScrollView) inflate.findViewById(R.id.language_picker_scrollview);
        Button button = (Button) inflate.findViewById(R.id.no_thanks_button);
        this.f296218u = button;
        Button button2 = (Button) inflate.findViewById(R.id.confirm_button);
        this.f296219v = button2;
        C28292j jVar = new C28292j(86560);
        jVar.mo33795i(5);
        C28295m.m52919e(button, jVar);
        C28292j jVar2 = new C28292j(86561);
        jVar2.mo33795i(5);
        C28295m.m52919e(button2, jVar2);
    }

    /* renamed from: i */
    private static int m176799i(String[] strArr, String str) {
        if (strArr != null) {
            for (int i = 0; i < strArr.length; i++) {
                if (strArr[i].equals(str)) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final ViewGroup mo95289a() {
        return (ViewGroup) this.f296210m;
    }

    /* renamed from: b */
    public final void mo95290b() {
        this.f296210m.setVisibility(8);
    }

    /* renamed from: c */
    public final boolean mo95291c() {
        return this.f296210m.getVisibility() == 0;
    }

    /* renamed from: d */
    public final void mo95292d(int i) {
        int i2 = i;
        this.f296196F = i2;
        if (i2 == 4) {
            this.f296211n.setText(this.f296223z.getString(R.string.language_supported_introduction, new Object[]{Locale.forLanguageTag(Locale.getDefault().toLanguageTag()).getDisplayLanguage(), Locale.forLanguageTag(this.f296193C).getDisplayLanguage()}));
        } else {
            this.f296211n.setText(this.f296223z.getString(R.string.language_picker_introduction, new Object[]{Locale.getDefault().getDisplayLanguage()}));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f296223z.getString(R.string.select_assistant_language));
        spannableStringBuilder.append("  ");
        Drawable drawable = this.f296223z.getDrawable(R.drawable.info_icon);
        int dimension = (int) this.f296223z.getDimension(R.dimen.info_icon_width);
        drawable.setBounds(0, 0, dimension, dimension);
        int length = spannableStringBuilder.length();
        ImageSpan imageSpan = new ImageSpan(drawable, 0);
        int i3 = length - 1;
        spannableStringBuilder.setSpan(imageSpan, i3, length, 18);
        spannableStringBuilder.setSpan(new C106140q(this), i3, length, 18);
        this.f296213p.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        this.f296213p.setClickable(true);
        this.f296213p.setMovementMethod(LinkMovementMethod.getInstance());
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.f296223z.getString(R.string.select_assistant_language));
        spannableStringBuilder2.append("  ");
        int length2 = spannableStringBuilder2.length();
        Drawable drawable2 = this.f296223z.getDrawable(R.drawable.info_icon_with_extra_bottom_padding);
        drawable2.setBounds(0, 0, dimension, (int) this.f296223z.getDimension(R.dimen.info_icon_with_extra_space_height));
        ImageSpan imageSpan2 = new ImageSpan(drawable2, 0);
        int i4 = length2 - 1;
        spannableStringBuilder2.setSpan(imageSpan2, i4, length2, 18);
        spannableStringBuilder2.setSpan(new C106141r(this), i4, length2, 18);
        this.f296212o.setText(spannableStringBuilder2, TextView.BufferType.SPANNABLE);
        this.f296212o.setClickable(true);
        this.f296212o.setMovementMethod(LinkMovementMethod.getInstance());
        if (((SharedPreferences) this.f296207j.mo27525b()).getInt("opa_fre_language_picker_dismiss_count", 0) == ((int) this.f296205h.mo79743a(C90037cp.f248433aN)) - 1 || this.f296196F == 4) {
            this.f296218u.setText(this.f296223z.getString(R.string.no_thanks));
        } else {
            this.f296218u.setText(this.f296223z.getString(R.string.not_now));
        }
        this.f296219v.setText(this.f296223z.getString(R.string.confirm));
        LayoutInflater from = LayoutInflater.from(C106149z.m176813a(this.f296197G, this.f296209l));
        String languageTag = Locale.getDefault().toLanguageTag();
        if (this.f296196F == 4) {
            ArrayList arrayList = new ArrayList();
            this.f296201d = arrayList;
            arrayList.add(languageTag);
            this.f296201d.add(this.f296193C);
            this.f296222y = this.f296221x.a(this.f296201d, false);
        } else {
            List<String> c = this.f296206i.c();
            this.f296222y = this.f296221x.a(c, false);
            C58495hd r = this.f296205h.mo79752r(C90037cp.f248434aO);
            String str = this.f296193C;
            String str2 = (String) r.get(str);
            if (str2 == null) {
                str2 = null;
                int i5 = -1;
                for (Map.Entry entry : r.entrySet()) {
                    String str3 = (String) entry.getKey();
                    int length3 = str3.length() - 1;
                    if (str3.endsWith("*") && i5 < length3 && str.startsWith(str3.substring(0, length3))) {
                        str2 = (String) entry.getValue();
                        i5 = length3;
                    }
                }
            }
            String[] split = str2 != null ? str2.split(":") : null;
            this.f296201d = new ArrayList();
            HashMap hashMap = new HashMap();
            for (String str4 : c) {
                if (hashMap.get(str4) == null) {
                    hashMap.put(str4, true);
                    int i6 = m176799i(split, str4);
                    if (i6 != -1) {
                        int i7 = 0;
                        while (true) {
                            if (i7 >= this.f296201d.size()) {
                                this.f296201d.add(str4);
                                break;
                            }
                            int i8 = m176799i(split, (String) this.f296201d.get(i7));
                            if (i8 == -1 || i8 > i6) {
                                this.f296201d.add(i7, str4);
                            } else {
                                i7++;
                            }
                        }
                    } else {
                        this.f296201d.add(str4);
                    }
                }
            }
        }
        ArrayList arrayList2 = this.f296201d;
        int size = arrayList2.size();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            String str5 = (String) arrayList2.get(i9);
            aa aaVar = this.f296222y;
            String e = aaVar != null ? aaVar.e(str5) : str5;
            RadioButton radioButton = (RadioButton) from.inflate(R.layout.language_item, this.f296217t, false);
            if (this.f296194D == null) {
                this.f296194D = radioButton;
            }
            radioButton.setText(e);
            C28292j jVar = new C28292j(86559);
            int i11 = i10 + 1;
            aqp aqp = jVar.f76974b;
            aqp.copyOnWrite();
            aqs aqs = (aqs) aqp.instance;
            aqs aqs2 = aqs.f159780k;
            aqs.f159782a |= 2;
            aqs.f159784c = i10;
            int hashCode = str5.hashCode();
            aqp aqp2 = jVar.f76974b;
            aqp2.copyOnWrite();
            aqs aqs3 = (aqs) aqp2.instance;
            aqs3.f159782a |= 8;
            aqs3.f159787f = hashCode;
            jVar.mo33795i(5);
            C28295m.m52919e(radioButton, jVar);
            this.f296217t.addView(radioButton, -1, new ViewGroup.LayoutParams(-2, -2));
            radioButton.setOnClickListener(this);
            if (str5.equals(this.f296193C)) {
                this.f296202e = i11 - 1;
                this.f296203f = radioButton;
                radioButton.toggle();
            }
            i9++;
            i10 = i11;
        }
        this.f296218u.setOnClickListener(new C89943l(new C106137n(this)));
        this.f296219v.setEnabled(this.f296202e >= 0);
        this.f296219v.setOnClickListener(new C89943l(new C106138o(this)));
        this.f296216s.getViewTreeObserver().addOnScrollChangedListener(new C106129f(this));
        this.f296210m.setVisibility(0);
        C89949q.m146521e(C28285c.m52874a(this.f296210m, 87082), false);
        if (i2 == 3) {
            new AlertDialog.Builder(this.f296191A).setTitle(R.string.language_download_title).setMessage(R.string.language_download_wait).setPositiveButton(17039370, new C106139p(this)).create().show();
        }
    }

    /* renamed from: e */
    public final void mo95315e() {
        AnimatorSet animatorSet = this.f296192B;
        if (animatorSet == null || !animatorSet.isRunning()) {
            if (this.f296194D != null) {
                if (this.f296194D.getLocalVisibleRect(new Rect())) {
                    if (this.f296200c.getVisibility() == 0) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f296215r, View.TRANSLATION_X, new float[]{-10.0f, 0.0f});
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f296215r, View.TRANSLATION_Y, new float[]{-70.0f, 0.0f});
                        ofFloat.setDuration(66);
                        ofFloat2.setDuration(66);
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f296215r, View.ALPHA, new float[]{0.3f, 1.0f});
                        ofFloat3.setDuration(66);
                        ofFloat3.addListener(new C106132i(this));
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f296212o, View.TRANSLATION_Y, new float[]{-70.0f, 0.0f});
                        ofFloat4.setDuration(66);
                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f296212o, View.ALPHA, new float[]{0.3f, 1.0f});
                        ofFloat5.setDuration(66);
                        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f296199b, new C106144u(), new int[]{75, this.f296195E});
                        ofInt.setDuration(200);
                        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
                        ofInt.addListener(new C106133j(this));
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f296211n, View.ALPHA, new float[]{0.3f, 1.0f});
                        ofFloat6.setDuration(66);
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f296211n, View.TRANSLATION_Y, new float[]{-70.0f, 0.0f});
                        ofFloat7.setDuration(66);
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f296198a, View.ALPHA, new float[]{1.0f, 0.0f});
                        ofFloat8.setDuration(300);
                        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f296214q, View.ALPHA, new float[]{1.0f, 0.0f});
                        ofFloat9.setDuration(133);
                        ofFloat9.addListener(new C106134k(this));
                        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.f296214q, View.TRANSLATION_X, new float[]{0.0f, 10.0f});
                        ofFloat10.setDuration(133);
                        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(this.f296213p, View.ALPHA, new float[]{1.0f, 0.0f});
                        ofFloat11.setDuration(133);
                        animatorSet2.play(ofFloat10).with(ofFloat9).with(ofFloat11).with(ofInt).with(ofFloat8);
                        animatorSet2.play(ofFloat).after(ofFloat10);
                        animatorSet2.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5).with(ofFloat7).with(ofFloat6);
                        this.f296192B = animatorSet2;
                        animatorSet2.addListener(new C106142s(this));
                        this.f296192B.start();
                        return;
                    }
                    return;
                }
            }
            if (this.f296200c.getVisibility() == 4) {
                AnimatorSet animatorSet3 = new AnimatorSet();
                ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(this.f296215r, View.TRANSLATION_X, new float[]{0.0f, -10.0f});
                ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(this.f296215r, View.TRANSLATION_Y, new float[]{0.0f, -70.0f});
                ofFloat12.setDuration(66);
                ofFloat13.setDuration(66);
                ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(this.f296215r, View.ALPHA, new float[]{1.0f, 0.0f});
                ofFloat14.setDuration(66);
                ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(this.f296212o, View.TRANSLATION_Y, new float[]{0.0f, -70.0f});
                ofFloat15.setDuration(66);
                ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat(this.f296212o, View.ALPHA, new float[]{1.0f, 0.0f});
                ofFloat16.setDuration(66);
                ObjectAnimator ofInt2 = ObjectAnimator.ofInt(this.f296199b, new C106144u(), new int[]{this.f296199b.getHeight(), 0});
                ofInt2.setDuration(133);
                ofInt2.setInterpolator(new AccelerateDecelerateInterpolator());
                ofInt2.addListener(new C106130g(this));
                ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(this.f296211n, View.ALPHA, new float[]{1.0f, 0.0f});
                ofFloat17.setDuration(66);
                ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(this.f296211n, View.TRANSLATION_Y, new float[]{0.0f, -70.0f});
                ofFloat18.setDuration(66);
                ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(this.f296198a, View.ALPHA, new float[]{0.5f, 1.0f});
                ofFloat19.setDuration(300);
                ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(this.f296214q, View.ALPHA, new float[]{0.0f, 1.0f});
                ofFloat20.setDuration(133);
                ofFloat20.addListener(new C106131h(this));
                ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(this.f296214q, View.TRANSLATION_X, new float[]{10.0f, 0.0f});
                ofFloat21.setDuration(133);
                ObjectAnimator ofFloat22 = ObjectAnimator.ofFloat(this.f296213p, View.ALPHA, new float[]{0.0f, 1.0f});
                ofFloat22.setDuration(133);
                animatorSet3.play(ofFloat12).with(ofFloat13).with(ofFloat14).with(ofFloat15).with(ofFloat16).with(ofFloat17).with(ofFloat18).with(ofInt2).with(ofFloat19);
                animatorSet3.play(ofFloat12).before(ofFloat21);
                animatorSet3.play(ofFloat21).with(ofFloat20).with(ofFloat22);
                this.f296195E = this.f296199b.getHeight();
                this.f296192B = animatorSet3;
                animatorSet3.addListener(new C106143t(this));
                this.f296192B.start();
            }
        }
    }

    /* renamed from: f */
    public final void mo95316f() {
        new AlertDialog.Builder(this.f296191A).setMessage(R.string.info_dialog_content).setPositiveButton(17039370, (DialogInterface.OnClickListener) null).create().show();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo95317g(int i) {
        if (i != 2) {
            if (!this.f296206i.g(Locale.forLanguageTag((String) this.f296201d.get(this.f296202e)))) {
                new AlertDialog.Builder(this.f296191A).setTitle(R.string.language_download_title).setMessage(R.string.language_download_message).setPositiveButton(17039370, new C106136m(this)).create().show();
            } else {
                mo95318h(1);
            }
        } else if (((SharedPreferences) this.f296207j.mo27525b()).getInt("opa_fre_language_picker_dismiss_count", 0) != ((int) this.f296205h.mo79743a(C90037cp.f248433aN)) - 1 || C87566i.m142300ax(this.f296191A.getIntent().getExtras())) {
            mo95318h(2);
        } else {
            new AlertDialog.Builder(this.f296191A).setTitle(R.string.language_picker_dismissed_title).setMessage(R.string.language_picker_dismissed_message).setPositiveButton(17039370, new C106135l(this)).create().show();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo95318h(int i) {
        String str;
        boolean z = false;
        int i2 = ((SharedPreferences) this.f296207j.mo27525b()).getInt("opa_fre_language_picker_dismiss_count", 0);
        if (i != 2) {
            str = (String) this.f296201d.get(this.f296202e);
            C113764ag.m188331b(this.f296206i, this.f296208k, this.f296220w, str);
            C89949q.m146521e(C28285c.m52882i(this.f296203f, 5, (Integer) null), false);
        } else {
            if (this.f296196F != 4) {
                i2++;
            }
            str = BuildConfig.FLAVOR;
        }
        if (this.f296196F == 4) {
            i = 1;
        }
        SharedPreferences.Editor putInt = ((SharedPreferences) this.f296207j.mo27525b()).edit().putString("opa_fre_language_picker_user_selection", str).putBoolean("opa_fre_language_picker_shown", true).putInt("opa_fre_language_picker_dismiss_count", i2);
        if (this.f296196F == 4) {
            z = true;
        }
        putInt.putBoolean("opa_fre_language_picker_phone_language_supported_shown", z).apply();
        this.f296204g.mo97164a(i);
    }

    public final void onClick(View view) {
        this.f296202e = this.f296217t.indexOfChild(view);
        this.f296219v.setEnabled(true);
        this.f296203f = view;
    }
}
