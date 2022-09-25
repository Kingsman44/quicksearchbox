package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.widget.TextView;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7019bc.C89407a;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.common.p4522b.C58485gu;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.bc */
/* compiled from: PG */
public abstract class C108232bc {

    /* renamed from: a */
    private static final AtomicLong f301023a = new AtomicLong();

    /* renamed from: A */
    public int f301024A;

    /* renamed from: B */
    public long f301025B;

    /* renamed from: C */
    public int f301026C;

    /* renamed from: i */
    public final long f301027i;

    /* renamed from: j */
    public String f301028j;

    /* renamed from: k */
    public final BitFlags f301029k;

    /* renamed from: l */
    public C28292j f301030l;

    /* renamed from: m */
    public boolean f301031m;

    /* renamed from: n */
    public boolean f301032n;

    /* renamed from: o */
    public boolean f301033o;

    /* renamed from: p */
    public int f301034p;

    /* renamed from: q */
    public long f301035q;

    /* renamed from: r */
    public CharSequence f301036r;

    /* renamed from: s */
    public String f301037s;

    /* renamed from: t */
    public long f301038t;

    /* renamed from: u */
    public int f301039u;

    /* renamed from: v */
    public WeakReference f301040v;

    /* renamed from: w */
    public C86124t f301041w;

    /* renamed from: x */
    public boolean f301042x;

    /* renamed from: y */
    public boolean f301043y;

    /* renamed from: z */
    public String f301044z;

    protected C108232bc() {
        this((byte[]) null);
    }

    /* renamed from: d */
    public boolean mo96597d() {
        return false;
    }

    /* renamed from: g */
    public abstract int mo95829g();

    /* renamed from: h */
    public abstract int mo95830h();

    /* renamed from: i */
    public abstract C28293k mo95831i();

    /* renamed from: j */
    public abstract void mo95832j(C108241bl blVar, C108237bh bhVar);

    /* renamed from: jz */
    public int mo96576jz(BitFlags bitFlags) {
        return 1;
    }

    /* renamed from: k */
    public void mo95833k(C108241bl blVar) {
    }

    /* renamed from: l */
    public int mo96602l() {
        return this.f301034p;
    }

    /* renamed from: m */
    public final C108241bl mo96603m() {
        WeakReference weakReference = this.f301040v;
        if (weakReference != null) {
            return (C108241bl) weakReference.get();
        }
        return null;
    }

    /* renamed from: n */
    public List mo96604n() {
        return C58485gu.m89846n(this);
    }

    /* renamed from: o */
    public List mo96605o() {
        return C58485gu.m89846n(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo96606p(View view, ViewGroup viewGroup) {
        C86124t tVar = this.f301041w;
        if ((tVar == null || !tVar.mo79746e(C90014bt.f247619ka)) && viewGroup != null) {
            ((TextView) viewGroup.findViewById(R.id.chatui_timestamp)).setText(C89407a.m145418a(viewGroup.getContext(), this.f301035q, 18, false));
            view.setOnClickListener(new C108231bb(viewGroup));
        }
    }

    /* renamed from: q */
    public void mo96607q(int i) {
        this.f301034p = i;
    }

    /* renamed from: r */
    public void mo96608r(C28292j jVar) {
        this.f301030l = jVar;
    }

    /* renamed from: s */
    public void mo96609s(boolean z) {
        C108241bl m = mo96603m();
        if (m != null) {
            ViewOverlay overlay = m.itemView.getOverlay();
            if (z) {
                Context context = m.itemView.getContext();
                ColorDrawable colorDrawable = new ColorDrawable(context.getResources().getColor(R.color.chatui_selection_color));
                colorDrawable.setBounds(0, context.getResources().getDimensionPixelSize(R.dimen.chatui_item_gap_top), m.itemView.getRight(), m.itemView.getBottom());
                overlay.add(colorDrawable);
                return;
            }
            overlay.clear();
        }
    }

    /* renamed from: t */
    public final boolean mo96610t() {
        return this.f301026C == 2;
    }

    protected C108232bc(byte[] bArr) {
        BitFlags bitFlags = new BitFlags(C108234be.class, "FLAG_", 3);
        this.f301033o = true;
        this.f301041w = null;
        this.f301042x = false;
        this.f301043y = false;
        this.f301026C = 1;
        this.f301044z = null;
        this.f301024A = 0;
        this.f301025B = 0;
        this.f301027i = f301023a.incrementAndGet();
        this.f301034p = 0;
        this.f301029k = bitFlags;
    }
}
