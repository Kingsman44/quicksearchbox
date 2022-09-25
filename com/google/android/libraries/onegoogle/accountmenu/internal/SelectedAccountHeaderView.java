package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0678gm;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import androidx.core.widget.C2124k;
import androidx.core.widget.C2134u;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.account.disc.C30208h;
import com.google.android.libraries.onegoogle.account.disc.C30213m;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.account.p2347c.C30167a;
import com.google.android.libraries.onegoogle.account.particle.C30230d;
import com.google.android.libraries.onegoogle.account.particle.C30231e;
import com.google.android.libraries.onegoogle.accountmanagement.C30281j;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.accountmenu.p2376g.C30643a;
import com.google.android.libraries.onegoogle.common.C30905ae;
import com.google.android.libraries.onegoogle.common.C30906af;
import com.google.android.libraries.onegoogle.common.C30923j;
import com.google.common.base.C58838bb;

/* compiled from: PG */
public class SelectedAccountHeaderView extends FrameLayout implements C30231e {

    /* renamed from: a */
    public final View f82892a;

    /* renamed from: b */
    public final View f82893b;

    /* renamed from: c */
    public final TextView f82894c;

    /* renamed from: d */
    public final AccountParticleDisc f82895d;

    /* renamed from: e */
    public final AccountParticleDisc f82896e;

    /* renamed from: f */
    public final AccountParticleDisc f82897f;

    /* renamed from: g */
    public final ImageView f82898g;

    /* renamed from: h */
    public boolean f82899h;

    /* renamed from: i */
    public C30305n f82900i;

    /* renamed from: j */
    public C30230d f82901j;

    /* renamed from: k */
    private final boolean f82902k;

    /* renamed from: l */
    private final TextView f82903l;

    /* renamed from: m */
    private final TextView f82904m;

    /* renamed from: n */
    private final C30643a f82905n;

    /* renamed from: o */
    private final C30208h f82906o;

    /* renamed from: p */
    private final C30208h f82907p;

    /* renamed from: q */
    private final C30208h f82908q;

    public SelectedAccountHeaderView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: k */
    private final String m57369k(Context context) {
        return " ".concat(String.valueOf(context.getString(true != this.f82899h ? R.string.og_expand_account_menu_a11y : R.string.og_collapse_account_menu_a11y)));
    }

    /* renamed from: l */
    private final void m57370l(AccountParticleDisc accountParticleDisc) {
        Object obj = accountParticleDisc.f81559m;
        if (obj == null) {
            accountParticleDisc.setContentDescription((CharSequence) null);
            return;
        }
        String string = getContext().getString(R.string.og_switch_account_to_recent_a11y, new Object[]{C30167a.m56043a(obj, this.f82900i.mo35852b())});
        String e = accountParticleDisc.mo35587e();
        if (!e.isEmpty()) {
            string = string + ". " + e;
        }
        accountParticleDisc.setContentDescription(string);
    }

    /* renamed from: a */
    public final TextView mo35698a() {
        return null;
    }

    /* renamed from: b */
    public final void mo36392b(AccountParticleDisc accountParticleDisc) {
        accountParticleDisc.mo35593k(this.f82900i.mo35859j().mo36092d());
        C30213m c = this.f82900i.mo35853c();
        C30158c b = this.f82900i.mo35852b();
        this.f82900i.mo35867r();
        accountParticleDisc.mo35600r(c, b);
    }

    /* renamed from: c */
    public final TextView mo35699c() {
        return this.f82903l;
    }

    /* renamed from: d */
    public final void mo36393d(boolean z) {
        C58838bb.m90884s(this.f82902k, "Cannot change expand state on non expandable view");
        if (this.f82899h != z) {
            this.f82899h = z;
            mo36394g();
            mo36397j();
        }
    }

    /* renamed from: e */
    public final TextView mo35700e() {
        return this.f82904m;
    }

    /* renamed from: f */
    public final AccountParticleDisc mo35701f() {
        return this.f82895d;
    }

    /* renamed from: g */
    public final void mo36394g() {
        C30305n nVar;
        BitmapDrawable bitmapDrawable;
        if (this.f82902k && (nVar = this.f82900i) != null) {
            C30306o i = nVar.mo35858i();
            TextView textView = this.f82894c;
            if (C30281j.m56319c(i.f81934a.f81883d) != null) {
                textView = this.f82904m.getVisibility() == 0 ? this.f82904m : this.f82903l;
                if (textView == this.f82904m) {
                    C2134u.m5913e(this.f82903l, 0, 0, 0, 0);
                }
            }
            if (!i.f81934a.mo35794b().isEmpty()) {
                int i2 = true != this.f82899h ? R.drawable.keyboard_arrow_down_gm_24dp : R.drawable.keyboard_arrow_up_gm_24dp;
                int currentTextColor = textView.getCurrentTextColor();
                Drawable c = C0678gm.m2375e().mo3100c(getContext(), i2);
                C30905ae.m57696b(c, currentTextColor);
                Bitmap createBitmap = Bitmap.createBitmap(c.getIntrinsicWidth(), c.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                c.setBounds(2, 2, canvas.getWidth() - 2, canvas.getHeight() - 2);
                c.draw(canvas);
                bitmapDrawable = new BitmapDrawable(getResources(), createBitmap);
            } else {
                bitmapDrawable = null;
            }
            C2134u.m5914f(textView, (Drawable) null, (Drawable) null, bitmapDrawable, (Drawable) null);
        }
    }

    /* renamed from: h */
    public final void mo36395h() {
        if (this.f82900i != null) {
            m57370l(this.f82896e);
        }
    }

    /* renamed from: i */
    public final void mo36396i() {
        if (this.f82900i != null) {
            m57370l(this.f82897f);
        }
    }

    /* renamed from: j */
    public final void mo36397j() {
        String str;
        C30305n nVar = this.f82900i;
        if (nVar != null) {
            C30306o i = nVar.mo35858i();
            boolean isEmpty = i.f81934a.mo35794b().isEmpty();
            Object c = C30281j.m56319c(i.f81934a.f81883d);
            Context context = getContext();
            Object obj = this.f82895d.f81559m;
            if (!isEmpty) {
                String str2 = BuildConfig.FLAVOR;
                if (c == null) {
                    String string = context.getString(R.string.og_choose_an_account);
                    if (this.f82902k) {
                        str2 = m57369k(context);
                    }
                    str = string + "." + str2;
                } else if (obj == null) {
                    str = null;
                } else {
                    String string2 = context.getString(R.string.og_signed_in_user_a11y_, new Object[]{C30167a.m56043a(obj, this.f82900i.mo35852b())});
                    String e = this.f82895d.mo35587e();
                    if (!e.isEmpty()) {
                        string2 = string2 + " " + e;
                    }
                    if (this.f82902k) {
                        str2 = m57369k(context);
                    }
                    str = String.valueOf(string2).concat(str2);
                }
            } else {
                str = context.getString(R.string.og_sign_in);
            }
            setContentDescription(str);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AccountParticleDisc accountParticleDisc = this.f82895d;
        accountParticleDisc.f81550d.add(this.f82906o);
        mo36397j();
        AccountParticleDisc accountParticleDisc2 = this.f82896e;
        accountParticleDisc2.f81550d.add(this.f82907p);
        mo36395h();
        AccountParticleDisc accountParticleDisc3 = this.f82897f;
        accountParticleDisc3.f81550d.add(this.f82908q);
        mo36396i();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        AccountParticleDisc accountParticleDisc = this.f82895d;
        accountParticleDisc.f81550d.remove(this.f82906o);
        AccountParticleDisc accountParticleDisc2 = this.f82896e;
        accountParticleDisc2.f81550d.remove(this.f82907p);
        AccountParticleDisc accountParticleDisc3 = this.f82897f;
        accountParticleDisc3.f81550d.remove(this.f82908q);
        super.onDetachedFromWindow();
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        boolean z = true;
        if (onClickListener != null && !this.f82902k) {
            z = false;
        }
        C58838bb.m90884s(z, "Click listener should only be set if the header is expandable");
        super.setOnClickListener(onClickListener);
    }

    /* JADX INFO: finally extract failed */
    public SelectedAccountHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f82906o = new C30748bs(this);
        this.f82907p = new C30749bt(this);
        this.f82908q = new C30750bu(this);
        C30643a aVar = new C30643a(getContext());
        this.f82905n = aVar;
        LayoutInflater.from(C30923j.m57716b(context)).inflate(true != aVar.f82739h ? R.layout.selected_account_header_small_disc : R.layout.selected_account_header, this);
        this.f82892a = findViewById(R.id.no_selected_account);
        this.f82893b = findViewById(R.id.has_selected_account);
        TextView textView = (TextView) findViewById(R.id.no_selected_account_text);
        this.f82894c = textView;
        this.f82895d = (AccountParticleDisc) findViewById(R.id.account_avatar);
        this.f82896e = (AccountParticleDisc) findViewById(R.id.avatar_recents_one);
        this.f82897f = (AccountParticleDisc) findViewById(R.id.avatar_recents_two);
        ImageView imageView = (ImageView) findViewById(R.id.close_button);
        this.f82898g = imageView;
        this.f82903l = (TextView) findViewById(R.id.og_primary_account_information);
        this.f82904m = (TextView) findViewById(R.id.og_secondary_account_information);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C30747br.f82994c, 0, 0);
        try {
            boolean z = obtainStyledAttributes.getBoolean(0, false);
            this.f82902k = z;
            obtainStyledAttributes.recycle();
            findViewById(R.id.close_and_recents).setVisibility(true != z ? 8 : 0);
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C30747br.f82992a, R.attr.ogAccountMenuStyle, 2132149621);
            try {
                textView.setTextColor(obtainStyledAttributes2.getColor(7, 0));
                C2124k.m5892c(imageView, C30906af.m57697a(context, obtainStyledAttributes2, 11));
                int resourceId = obtainStyledAttributes2.getResourceId(1, 0);
                if (resourceId != 0) {
                    C2043bi.m5530X(imageView, C0678gm.m2375e().mo3100c(context, resourceId));
                }
            } finally {
                obtainStyledAttributes2.recycle();
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
