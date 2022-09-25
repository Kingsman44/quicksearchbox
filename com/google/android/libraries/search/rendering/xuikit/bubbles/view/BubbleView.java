package com.google.android.libraries.search.rendering.xuikit.bubbles.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.core.p097i.C1967b;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.C40155aa;

/* compiled from: PG */
public final class BubbleView extends FrameLayout {

    /* renamed from: a */
    public Runnable f105746a;

    /* renamed from: b */
    public C28439i f105747b;

    /* renamed from: c */
    private C1967b f105748c;

    /* renamed from: d */
    private int f105749d = 0;

    /* renamed from: e */
    private Runnable f105750e;

    /* renamed from: f */
    private int f105751f = 1;

    public BubbleView(Context context) {
        super(context);
        m69874e();
    }

    /* renamed from: e */
    private final void m69874e() {
        this.f105751f = m69875f(getVisibility());
    }

    /* renamed from: f */
    private static int m69875f(int i) {
        return i == 0 ? 1 : 2;
    }

    /* renamed from: a */
    public final void mo42360a(int i, boolean z) {
        Runnable runnable;
        int f = m69875f(i);
        C28439i iVar = this.f105747b;
        if (iVar != null) {
            iVar.mo33892i(f);
            if (!(f == this.f105751f || !z || (runnable = this.f105750e) == null)) {
                ((C40155aa) runnable).f105478a.mo42280k();
            }
        }
        this.f105751f = f;
    }

    /* renamed from: b */
    public final void mo42361b(Runnable runnable) {
        this.f105750e = runnable;
        this.f105751f = m69875f(getVisibility());
    }

    /* renamed from: c */
    public final void mo42362c(C1967b bVar) {
        this.f105748c = bVar;
        this.f105749d = getContext().getResources().getConfiguration().orientation;
    }

    /* renamed from: d */
    public final void mo42363d(int i, boolean z) {
        super.setVisibility(i);
        mo42360a(i, z);
    }

    public final void dispatchConfigurationChanged(Configuration configuration) {
        super.dispatchConfigurationChanged(configuration);
        if (this.f105748c != null && configuration.orientation != this.f105749d) {
            this.f105749d = configuration.orientation;
            this.f105748c.mo3353a(Integer.valueOf(configuration.orientation));
        }
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        mo42360a(i, true);
    }

    public BubbleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m69874e();
    }

    public BubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m69874e();
    }
}
