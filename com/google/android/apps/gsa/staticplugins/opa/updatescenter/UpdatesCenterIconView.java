package com.google.android.apps.gsa.staticplugins.opa.updatescenter;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.p033v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.gsa.assistant.shared.p5830s.C73907a;
import com.google.android.apps.gsa.assistant.shared.p5830s.C73908b;
import com.google.android.apps.gsa.assistant.shared.s.y;
import com.google.android.apps.gsa.shared.util.p7184t.C91093c;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.p8369hq.C109211a;
import com.google.android.apps.gsa.staticplugins.opa.p8369hq.C109245s;
import com.google.android.apps.gsa.staticplugins.opa.p8369hq.C109246t;
import com.google.android.apps.gsa.staticplugins.opa.p8369hq.C109248v;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.inject.C47266f;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50637am;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50654q;
import com.google.common.p4526f.C59071e;

/* compiled from: PG */
public class UpdatesCenterIconView extends AppCompatImageView implements View.OnClickListener {

    /* renamed from: a */
    public static final C59071e f314967a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.updatescenter.UpdatesCenterIconView");

    /* renamed from: b */
    public C73908b f314968b;

    /* renamed from: c */
    public C22871g f314969c;

    /* renamed from: d */
    public C109248v f314970d;

    /* renamed from: e */
    public C22871g f314971e;

    /* renamed from: f */
    public y f314972f;

    /* renamed from: g */
    public boolean f314973g;

    /* renamed from: h */
    private boolean f314974h;

    /* renamed from: i */
    private C91097g f314975i;

    /* renamed from: j */
    private int f314976j;

    /* renamed from: k */
    private int f314977k;

    /* renamed from: com.google.android.apps.gsa.staticplugins.opa.updatescenter.UpdatesCenterIconView$a */
    /* compiled from: PG */
    public interface C113733a {
        /* renamed from: qR */
        void mo100601qR(UpdatesCenterIconView updatesCenterIconView);
    }

    public UpdatesCenterIconView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo100595a() {
        int i;
        y yVar = this.f314972f;
        if (!yVar.k) {
            if (this.f314974h) {
                i = yVar.j;
            } else {
                i = yVar.i;
            }
            setImageResource(i);
        } else if (!this.f314974h) {
            this.f314976j = getVisibility();
            super.setVisibility(8);
        } else {
            setImageResource(yVar.j);
            setVisibility(this.f314976j);
        }
    }

    /* renamed from: b */
    public final void mo100596b(boolean z) {
        if (this.f314974h != z) {
            this.f314974h = z;
            mo100597c();
        }
    }

    /* renamed from: c */
    public final void mo100597c() {
        this.f314971e.mo28212l("Update icon drawable on UiThread.", new C113743j(this));
    }

    public final void onClick(View view) {
        boolean z = this.f314974h;
        if (z) {
            mo100596b(false);
        }
        C91097g gVar = this.f314975i;
        C109248v vVar = this.f314970d;
        C109245s j = C109246t.m181811j();
        C50637am amVar = (C50637am) C50638an.f131726h.createBuilder();
        amVar.copyOnWrite();
        C50638an anVar = (C50638an) amVar.instance;
        anVar.f131728a |= 1;
        anVar.f131733f = z;
        C109211a aVar = (C109211a) j;
        aVar.f304119f = (C50638an) amVar.build();
        j.mo97671b(true);
        aVar.f304121h = this.f314977k;
        gVar.mo65089a(vVar.mo97704a(j.mo97670a()));
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        setOnClickListener(this);
        if (!this.f314973g) {
            setImageResource(this.f314972f.i);
        }
        this.f314969c.mo28211k(this.f314968b.mo65439a(), "Verifies if a badge should be shown on the Updates Center entry point.", new C113744k(this));
    }

    public final void setVisibility(int i) {
        if (this.f314972f.k) {
            this.f314976j = i;
            if (this.f314974h) {
                super.setVisibility(i);
                return;
            }
            return;
        }
        super.setVisibility(i);
    }

    public UpdatesCenterIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UpdatesCenterIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        this.f314977k = 1;
        this.f314976j = 8;
        ((C113733a) C47266f.m84076a(context, C113733a.class)).mo100601qR(this);
        this.f314975i = new C91093c(context);
        int i3 = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C73907a.f195203a, 0, 0);
            int integer = obtainStyledAttributes.getInteger(0, 0);
            i2 = obtainStyledAttributes.getInteger(1, 0);
            i3 = integer;
        } else {
            i2 = 0;
        }
        this.f314972f = y.values()[i3];
        this.f314977k = C50654q.m85873a()[i2];
    }
}
