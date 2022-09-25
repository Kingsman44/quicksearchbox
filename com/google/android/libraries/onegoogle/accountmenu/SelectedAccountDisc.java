package com.google.android.libraries.onegoogle.accountmenu;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.account.disc.C30190ar;
import com.google.android.libraries.onegoogle.account.disc.C30202bc;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.common.C30905ae;
import com.google.android.libraries.onegoogle.tooltip.C31065a;
import com.google.android.libraries.onegoogle.tooltip.C31067c;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import java.lang.ref.WeakReference;

/* compiled from: PG */
public final class SelectedAccountDisc extends FrameLayout implements C31067c, C31065a {

    /* renamed from: a */
    public final Rect f81900a;

    /* renamed from: b */
    public final ImageView f81901b;

    /* renamed from: c */
    public final AccountParticleDisc f81902c;

    /* renamed from: d */
    public View.OnClickListener f81903d;

    /* renamed from: e */
    public View.OnTouchListener f81904e;

    /* renamed from: f */
    public View.OnTouchListener f81905f;

    /* renamed from: g */
    public C30305n f81906g;

    /* renamed from: h */
    public C30190ar f81907h;

    /* renamed from: i */
    public int f81908i;

    /* renamed from: j */
    public WeakReference f81909j;

    /* renamed from: k */
    private final Rect f81910k;

    /* renamed from: l */
    private final int[] f81911l;

    public SelectedAccountDisc(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: e */
    static /* synthetic */ boolean m56353e(C58485gu guVar, View view, MotionEvent motionEvent) {
        int i = ((C58724pq) guVar).f156474d;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 |= ((View.OnTouchListener) guVar.get(i2)).onTouch(view, motionEvent);
        }
        if (z2) {
            if (motionEvent.getAction() != 0) {
                z = true;
            }
            C58838bb.m90884s(z, "Internal onTouchListeners may not consume ACTION_DOWN.");
        }
        return z2;
    }

    /* renamed from: a */
    public final int mo35803a() {
        if (this.f81901b.getVisibility() == 0) {
            return (this.f81901b.getHeight() - this.f81901b.getPaddingTop()) - this.f81901b.getPaddingBottom();
        }
        AccountParticleDisc accountParticleDisc = this.f81902c;
        if (accountParticleDisc.f81563q.mo56113h()) {
            return accountParticleDisc.f81552f.mo35656c(accountParticleDisc.mo35584a());
        }
        return accountParticleDisc.mo35584a();
    }

    /* renamed from: b */
    public final Rect mo35804b() {
        this.f81902c.getLocationInWindow(this.f81911l);
        float width = (((float) this.f81902c.getWidth()) * 0.5f) + ((float) this.f81911l[0]);
        float height = (((float) this.f81902c.getHeight()) * 0.5f) + ((float) this.f81911l[1]);
        float a = ((float) mo35803a()) * 0.5f;
        this.f81910k.set(Math.round(width - a), Math.round(height - a), Math.round(width + a), Math.round(height + a));
        return this.f81910k;
    }

    /* renamed from: c */
    public final void mo35805c(Activity activity) {
        this.f81909j = new WeakReference(activity);
    }

    /* renamed from: d */
    public final void mo35806d(int i) {
        C58838bb.m90884s(!this.f81902c.mo35599q(), "setMaxDiscContentSize is only allowed before calling initialize.");
        this.f81908i = i;
        AccountParticleDisc accountParticleDisc = this.f81902c;
        C58838bb.m90884s(!accountParticleDisc.mo35599q(), "setMaxDiscContentSize is only allowed before calling initialize.");
        accountParticleDisc.f81561o = i;
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(new C30783j(this, onClickListener));
    }

    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f81904e = onTouchListener;
    }

    public void setScale(float f) {
        AccountParticleDisc accountParticleDisc = this.f81902c;
        C58838bb.m90884s(accountParticleDisc.mo35599q(), "setDiscScale() may only be called after initialize() has been invoked.");
        if (accountParticleDisc.f81554h != null) {
            int a = accountParticleDisc.mo35584a();
            int round = Math.round(f * ((float) accountParticleDisc.f81552f.mo35656c(a)));
            C30202bc bcVar = accountParticleDisc.f81554h;
            C58838bb.m90884s(bcVar.f81656g, "RingViewHolder.setRingDiameter() may not be called when scaling isn't enabled.");
            int i = ((bcVar.f81652c - round) / 2) + bcVar.f81653d;
            bcVar.f81650a.setPadding(i, i, i, i);
            f = ((float) ((round - Math.round(accountParticleDisc.f81552f.mo35655b(round) * 4.0f)) - 2)) / ((float) a);
        }
        accountParticleDisc.f81547a.setScaleX(f);
        accountParticleDisc.f81547a.setScaleY(f);
    }

    public SelectedAccountDisc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public SelectedAccountDisc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f81910k = new Rect();
        this.f81911l = new int[2];
        this.f81900a = new Rect();
        this.f81909j = new WeakReference((Object) null);
        LayoutInflater.from(context).inflate(R.layout.selected_account_disc, this, true);
        AccountParticleDisc accountParticleDisc = (AccountParticleDisc) findViewById(R.id.og_selected_account_disc_apd);
        this.f81902c = accountParticleDisc;
        ImageView imageView = (ImageView) findViewById(R.id.incognito_on_image_view);
        this.f81901b = imageView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C30642g.f82731b, i, 0);
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            this.f81908i = dimensionPixelSize;
            if (dimensionPixelSize != -1) {
                mo35806d(dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            int a = C30905ae.m57695a(context);
            if (a != 0) {
                accountParticleDisc.setBackgroundResource(a);
                imageView.setBackgroundResource(a);
            }
            super.setOnTouchListener(new C30650h(this));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
