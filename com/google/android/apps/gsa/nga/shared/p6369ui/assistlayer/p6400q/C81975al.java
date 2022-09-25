package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.q.al */
/* compiled from: PG */
public final class C81975al {

    /* renamed from: a */
    public static final C59071e f224108a = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.ui.assistlayer.q.al");

    /* renamed from: b */
    public final View f224109b;

    /* renamed from: c */
    public final Optional f224110c;

    /* renamed from: d */
    public final Optional f224111d;

    /* renamed from: e */
    public final int f224112e;

    /* renamed from: f */
    public final C22869e f224113f;

    /* renamed from: g */
    public final Context f224114g;

    /* renamed from: h */
    private final C22871g f224115h;

    /* renamed from: i */
    private final C22871g f224116i;

    /* renamed from: j */
    private C60870cx f224117j;

    public C81975al(View view, Optional optional, Optional optional2, int i, C22869e eVar, Context context, C22871g gVar, C22871g gVar2) {
        this.f224109b = view;
        this.f224110c = optional;
        this.f224111d = optional2;
        this.f224112e = i;
        this.f224113f = eVar;
        this.f224114g = context;
        this.f224115h = gVar;
        this.f224116i = gVar2;
    }

    /* renamed from: c */
    public static void m130219c(View view, Optional optional, Optional optional2, int i) {
        Typeface typeface;
        if (view instanceof ViewGroup) {
            int i2 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i2 >= viewGroup.getChildCount()) {
                    break;
                }
                m130219c(viewGroup.getChildAt(i2), optional, optional2, i);
                i2++;
            }
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (textView.getTextSize() / textView.getResources().getDisplayMetrics().scaledDensity >= ((float) i)) {
                typeface = (Typeface) optional.orElse((Typeface) optional2.orElse(null));
            } else {
                typeface = (Typeface) optional2.orElse((Typeface) optional.orElse(null));
            }
            if (typeface != null) {
                Typeface typeface2 = textView.getTypeface();
                if (typeface2 == null) {
                    typeface2 = Typeface.defaultFromStyle(0);
                }
                int isBold = typeface2.isBold();
                if (typeface2.isItalic()) {
                    isBold = isBold == 1 ? 3 : 2;
                }
                textView.setTypeface(typeface, isBold);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo75423a() {
        C60870cx cxVar = this.f224117j;
        if (cxVar != null) {
            if (!cxVar.isDone()) {
                this.f224117j.cancel(true);
                this.f224117j = null;
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo75424b() {
        if (this.f224117j == null) {
            C60870cx a = this.f224116i.mo28201a("[NGA] loadFont", new C81971ah(this));
            this.f224117j = a;
            new C90873ag(a, this.f224115h, "[NGA] setFont", new C81972ai(this)).mo85223a(new C81973aj(this));
        }
    }
}
