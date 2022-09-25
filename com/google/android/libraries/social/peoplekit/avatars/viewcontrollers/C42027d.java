package com.google.android.libraries.social.peoplekit.avatars.viewcontrollers;

import android.accounts.Account;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.support.p033v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C1878d;
import androidx.core.graphics.drawable.C1929b;
import androidx.core.p098j.C2043bi;
import com.bumptech.glide.C5514ad;
import com.bumptech.glide.C5543d;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.p287f.C5593j;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.glide.fife.C22011a;
import com.google.android.libraries.glide.fife.C22012b;
import com.google.android.libraries.glide.fife.C22017g;
import com.google.android.libraries.glide.fife.ProvidedFifeUrl;
import com.google.android.libraries.social.p3267c.p3268a.C41921c;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.p3281c.C42087a;
import com.google.android.libraries.social.peoplekit.common.p3283e.C42131a;
import com.google.android.libraries.social.peoplekit.configs.C42141b;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.p4140ba.p4150c.p4151a.C54941a;

/* renamed from: com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.d */
/* compiled from: PG */
public final class C42027d {

    /* renamed from: a */
    public final View f109785a;

    /* renamed from: b */
    public final AvatarView f109786b;

    /* renamed from: c */
    public final GroupAvatarView f109787c;

    /* renamed from: d */
    final C58833ax f109788d;

    /* renamed from: e */
    public int f109789e = 1;

    /* renamed from: f */
    public int f109790f;

    /* renamed from: g */
    public C42141b f109791g = new C42141b(C42141b.m73964a());

    /* renamed from: h */
    private final Context f109792h;

    /* renamed from: i */
    private final C42075e f109793i;

    /* renamed from: j */
    private final PeopleKitVisualElementPath f109794j;

    /* renamed from: k */
    private final TextView f109795k;

    /* renamed from: l */
    private final View f109796l;

    /* renamed from: m */
    private final C58833ax f109797m;

    /* renamed from: n */
    private String f109798n;

    /* renamed from: o */
    private int f109799o;

    /* renamed from: p */
    private final boolean f109800p;

    /* renamed from: q */
    private final int f109801q;

    /* renamed from: r */
    private final int f109802r;

    public C42027d(C42026c cVar) {
        C58833ax axVar;
        Context context = cVar.f109780a;
        this.f109792h = context;
        this.f109793i = cVar.f109781b;
        this.f109794j = cVar.f109782c;
        C58833ax j = C58833ax.m90833j(cVar.f109783d);
        this.f109797m = j;
        C42141b bVar = cVar.f109784e;
        if (bVar != null) {
            C42087a.m73675a(bVar);
            this.f109791g = bVar;
        }
        C42087a.m73676b(this.f109791g);
        View inflate = LayoutInflater.from(context).inflate(R.layout.avatar_group_or_monogram, (ViewGroup) null);
        this.f109785a = inflate;
        this.f109786b = (AvatarView) inflate.findViewById(R.id.peoplekit_avatars_avatar);
        this.f109787c = (GroupAvatarView) inflate.findViewById(R.id.peoplekit_avatars_group);
        this.f109795k = (TextView) inflate.findViewById(R.id.peoplekit_avatars_monogram);
        this.f109796l = inflate.findViewById(R.id.peoplekit_avatars_selected_avatar);
        mo44512h();
        this.f109800p = C2043bi.m5577f(inflate) == 1;
        this.f109801q = context.getResources().getDimensionPixelSize(R.dimen.peoplekit_avatar_default_size);
        this.f109802r = C1878d.m5128a(context, R.color.google_grey300);
        if (j.mo56113h()) {
            String c = ((PeopleKitConfig) j.mo56107c()).mo44758c();
            String d = ((PeopleKitConfig) j.mo56107c()).mo44759d();
            if (!TextUtils.isEmpty(c)) {
                axVar = C58833ax.m90834k(new Account(c, true == TextUtils.isEmpty(d) ? "com.google" : d));
                this.f109788d = axVar;
            }
        }
        axVar = C58836b.f156633a;
        this.f109788d = axVar;
    }

    /* renamed from: j */
    private final void m73581j() {
        mo44506b(this.f109802r, true);
    }

    /* renamed from: a */
    public final void mo44505a() {
        try {
            Context context = this.f109792h;
            C5543d.m14323c(context).mo12423b(context).mo11876n(this.f109786b);
            Context context2 = this.f109792h;
            C5543d.m14323c(context2).mo12423b(context2).mo11876n(this.f109787c);
        } catch (IllegalArgumentException unused) {
            if (Log.isLoggable("AvatarViewController", 3)) {
                Log.d("AvatarViewController", "Attempting to clear avatar after activity finished");
            }
        }
    }

    /* renamed from: b */
    public final void mo44506b(int i, boolean z) {
        this.f109786b.mo44500a(true, i, z);
    }

    /* renamed from: c */
    public final void mo44507c() {
        this.f109789e = 1;
        ((GradientDrawable) this.f109796l.getBackground()).setStroke(0, 0);
        this.f109786b.setVisibility(0);
        this.f109786b.f109750a = null;
        this.f109787c.setVisibility(8);
        this.f109795k.setVisibility(8);
        mo44511g(1);
        this.f109798n = BuildConfig.FLAVOR;
        ((ImageView) this.f109785a.findViewById(R.id.peoplekit_avatars_in_app_indicator)).setVisibility(8);
    }

    /* renamed from: d */
    public final void mo44508d(String str, String str2) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        if (str.length() <= 3) {
            this.f109798n = str;
            this.f109799o = C42025b.m73580b(this.f109792h, str2, this.f109791g);
            if (str.isEmpty()) {
                this.f109786b.mo44500a(true, this.f109799o, true);
                return;
            }
            this.f109789e = 3;
            this.f109786b.setVisibility(8);
            this.f109795k.setVisibility(0);
            this.f109795k.setText(this.f109798n);
            ((GradientDrawable) this.f109795k.getBackground()).setColor(this.f109799o);
            float a = C42025b.m73579a(this.f109792h, this.f109798n, this.f109801q);
            Paint paint = new Paint();
            Rect rect = new Rect();
            Typeface typeface = this.f109795k.getTypeface();
            this.f109795k.setTypeface(typeface);
            paint.setTypeface(typeface);
            paint.setTextSize(a);
            String str3 = this.f109798n;
            paint.getTextBounds(str3, 0, str3.length(), rect);
            this.f109795k.setTextSize(0, a);
            return;
        }
        throw new IllegalArgumentException("Invalid length of monogramText (max of 3): " + str.length());
    }

    /* renamed from: e */
    public final void mo44509e(Channel channel) {
        if (!TextUtils.isEmpty(channel.mo44638s())) {
            mo44510f(channel.mo44638s(), channel);
        } else {
            mo44508d(channel.mo44634o(), channel.mo44631l(this.f109792h));
        }
    }

    /* renamed from: f */
    public final void mo44510f(String str, Channel channel) {
        Object obj;
        this.f109789e = 1;
        mo44505a();
        if (str == null) {
            return;
        }
        if (!str.startsWith("content://")) {
            if (C41921c.m73452a(str)) {
                C22017g gVar = new C22017g();
                gVar.mo27321b(4);
                gVar.mo27321b(1);
                gVar.mo27321b(16);
                gVar.mo27321b(32);
                if (!C42131a.m73920c() || !this.f109788d.mo56113h()) {
                    obj = new C22012b(str, gVar);
                } else {
                    obj = new C22012b(new ProvidedFifeUrl(str), gVar, new C22011a((Account) this.f109788d.mo56107c()));
                }
            } else {
                obj = null;
            }
            m73581j();
            Context context = this.f109792h;
            C5514ad b = C5543d.m14323c(context).mo12423b(context);
            if (obj == null) {
                obj = str;
            }
            C6007z j = b.mo11872j(obj);
            int i = this.f109801q;
            j.mo11982o(C5593j.m14523g(i, i)).mo12442d(new C42024a(str, this, channel)).mo12454r(this.f109786b);
            return;
        }
        m73581j();
        Context context2 = this.f109792h;
        C6007z k = C5543d.m14323c(context2).mo12423b(context2).mo11873k(str);
        int i2 = this.f109801q;
        k.mo11982o(C5593j.m14523g(i2, i2)).mo12442d(new C42024a(str, this, channel)).mo12454r(this.f109786b);
    }

    /* renamed from: g */
    public final void mo44511g(int i) {
        if (i == 2) {
            this.f109796l.setVisibility(0);
            this.f109786b.setVisibility(8);
            this.f109787c.setVisibility(8);
            this.f109795k.setVisibility(8);
            return;
        }
        this.f109796l.setVisibility(8);
        int i2 = this.f109789e;
        if (i2 == 1) {
            this.f109786b.setVisibility(0);
        } else if (i2 == 2) {
            this.f109787c.setVisibility(0);
        } else {
            this.f109795k.setVisibility(0);
        }
    }

    /* renamed from: h */
    public final void mo44512h() {
        if (this.f109791g.f110297p != 0) {
            ((GradientDrawable) this.f109796l.getBackground()).setColor(C1878d.m5128a(this.f109792h, this.f109791g.f110297p));
        }
        if (this.f109791g.f110298q != 0) {
            C1929b.m5225f(((AppCompatImageView) this.f109785a.findViewById(R.id.peoplekit_avatars_selected_avatar_inner)).getDrawable().mutate(), C1878d.m5128a(this.f109792h, this.f109791g.f110298q));
        }
    }

    /* renamed from: i */
    public final void mo44513i(int i, int i2) {
        ImageView imageView = (ImageView) this.f109785a.findViewById(R.id.peoplekit_avatars_in_app_indicator);
        int i3 = this.f109790f;
        if (i3 == 0) {
            int dimensionPixelSize = this.f109792h.getResources().getDimensionPixelSize(R.dimen.peoplekit_avatar_in_app_indicator_offset);
            if (this.f109800p) {
                dimensionPixelSize = -dimensionPixelSize;
            }
            float f = (float) dimensionPixelSize;
            imageView.setTranslationX(f);
            imageView.setTranslationY(f);
        } else {
            imageView.setTranslationX((float) i3);
            imageView.setTranslationY((float) this.f109790f);
        }
        imageView.setImageResource(i);
        if (i2 == 0) {
            imageView.setBackgroundResource(0);
        } else {
            ((GradientDrawable) imageView.getBackground()).setColor(i2);
        }
        imageView.setVisibility(0);
        C42075e eVar = this.f109793i;
        if (eVar != null) {
            PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
            peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144438A));
            peopleKitVisualElementPath.mo44564a(this.f109794j.f109973a);
            eVar.mo44577c(-1, peopleKitVisualElementPath);
        }
    }
}
