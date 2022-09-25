package com.google.android.apps.gsa.searchplate;

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.google.android.apps.gsa.searchplate.p6963a.C88896f;
import com.google.android.apps.gsa.searchplate.p6965c.C88927a;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.gsa.searchplate.ah */
/* compiled from: PG */
public final class C88906ah extends C88896f {

    /* renamed from: a */
    public final C88907ai f240830a;

    /* renamed from: b */
    private final ValueAnimator f240831b;

    /* renamed from: c */
    private final LayoutTransition f240832c;

    /* renamed from: d */
    private final ViewGroup f240833d;

    /* renamed from: e */
    private final boolean f240834e;

    /* renamed from: f */
    private final boolean f240835f;

    /* renamed from: g */
    private boolean f240836g;

    /* renamed from: h */
    private boolean f240837h;

    /* renamed from: i */
    private int f240838i = -1;

    /* renamed from: j */
    private int f240839j = -1;

    /* renamed from: k */
    private int f240840k;

    public C88906ah(C88907ai aiVar, ViewGroup viewGroup, Resources resources, boolean z) {
        this.f240830a = aiVar;
        this.f240833d = viewGroup;
        this.f240834e = resources.getBoolean(R.bool.use_full_bleed_voice_search);
        this.f240835f = resources.getBoolean(R.bool.clip_children_and_to_padding);
        if (z) {
            aiVar.mo82778c(2);
            this.f240836g = true;
            this.f240837h = true;
        }
        viewGroup.setBackground(aiVar);
        C58838bb.m90883r(viewGroup.getLayoutTransition() == null);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(4);
        layoutTransition.disableTransitionType(2);
        layoutTransition.disableTransitionType(3);
        layoutTransition.disableTransitionType(0);
        layoutTransition.disableTransitionType(1);
        layoutTransition.setInterpolator(4, C91107f.f254408d);
        viewGroup.setLayoutTransition(layoutTransition);
        this.f240832c = layoutTransition;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f240831b = ofFloat;
        ofFloat.setDuration(116);
        ofFloat.addUpdateListener(new C88905ag(this));
    }

    /* renamed from: m */
    private final boolean m144507m(int i) {
        return !C88927a.m144528c(this.f240838i) && C88927a.m144528c(i);
    }

    /* renamed from: a */
    public final void mo81837a(int i, int i2, boolean z) {
        boolean z2;
        if (this.f240831b.isStarted()) {
            this.f240831b.end();
        }
        this.f240833d.setLayoutTransition(z ? null : this.f240832c);
        C88907ai aiVar = this.f240830a;
        int i3 = 0;
        int i4 = 1;
        if (!this.f240836g || i != 1) {
            z2 = true;
        } else {
            i = 1;
            z2 = false;
        }
        aiVar.mo82776a(z2);
        if (this.f240834e) {
            this.f240830a.mo82777b(C88927a.m144530e(this.f240838i) && (!m144507m(i) || z));
            if (m144507m(i)) {
                if (z) {
                    C88907ai aiVar2 = this.f240830a;
                    aiVar2.f240842b = 0.0f;
                    aiVar2.invalidateSelf();
                } else {
                    this.f240831b.reverse();
                }
            } else if (C88927a.m144528c(this.f240838i) && !C88927a.m144528c(i)) {
                if (z) {
                    C88907ai aiVar3 = this.f240830a;
                    aiVar3.f240842b = 1.0f;
                    aiVar3.invalidateSelf();
                } else {
                    this.f240831b.start();
                }
            }
            this.f240840k = this.f240833d.getPaddingTop();
            this.f240833d.setClipChildren(this.f240835f);
            this.f240833d.setClipToPadding(this.f240835f);
            int paddingTop = this.f240833d.getPaddingTop();
            int i5 = this.f240840k;
            if (paddingTop != i5) {
                C91115n.m148874f(this.f240833d, 0, i5);
            }
        } else {
            this.f240830a.mo82777b(true);
        }
        int i6 = this.f240838i;
        this.f240839j = i6;
        this.f240838i = i;
        if (i6 == 1) {
            if (this.f240837h) {
                if (!this.f240836g || i != 1) {
                    C88907ai aiVar4 = this.f240830a;
                    if (i != 1) {
                        i4 = 0;
                    }
                    aiVar4.mo82778c(i4);
                    int i7 = this.f240839j;
                    int i8 = this.f240838i;
                    if (C88927a.m144528c(i7) || !C88927a.m144528c(i8)) {
                        if (z) {
                            C88907ai aiVar5 = this.f240830a;
                            aiVar5.f240842b = 1.0f;
                            aiVar5.invalidateSelf();
                        } else {
                            this.f240831b.start();
                        }
                    }
                    this.f240837h = false;
                    return;
                }
                i = 1;
            }
            i6 = 1;
        }
        if ((i6 != 1 || !this.f240837h) && this.f240836g && i == 1) {
            this.f240830a.mo82778c(2);
            this.f240837h = true;
        } else if (i6 != i && !this.f240837h) {
            if (i == 1) {
                i3 = 1;
            }
            mo82774i(i3);
        }
    }

    /* renamed from: i */
    public final void mo82774i(int i) {
        if (!this.f240836g || this.f240838i != 1) {
            this.f240837h = false;
        } else {
            this.f240837h = true;
            i = 2;
        }
        C88907ai aiVar = this.f240830a;
        if (i != aiVar.f240841a) {
            aiVar.mo82778c(i);
        }
    }

    /* renamed from: l */
    public final void mo82775l(boolean z) {
        this.f240836g = z;
        C88907ai aiVar = this.f240830a;
        boolean z2 = true;
        if (z && this.f240838i == 1) {
            z2 = false;
        }
        aiVar.mo82776a(z2);
    }
}
