package com.google.android.apps.gsa.staticplugins.nowcards.p8117g;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.now.shared.p6421ui.C83420i;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91669h;
import com.google.android.apps.gsa.sidekick.shared.monet.util.C91857e;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104348l;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104350n;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.C105069f;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.C105070g;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9161ax;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C8011sf;
import com.google.p375ai.p378b.C8025st;
import com.google.p375ai.p378b.C8034tb;
import com.google.p375ai.p378b.C8150xj;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.g.x */
/* compiled from: PG */
public final class C104978x extends C104348l {

    /* renamed from: B */
    private static final C59071e f292473B = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowcards.g.x");

    /* renamed from: A */
    public final C83420i f292474A;

    /* renamed from: C */
    private final List f292475C;

    /* renamed from: D */
    private final C104977w f292476D;

    /* renamed from: y */
    public final C91669h f292477y;

    /* renamed from: z */
    public final C105069f f292478z;

    public C104978x(Context context, C91669h hVar, C104350n nVar, C105070g gVar) {
        super(context, nVar);
        this.f292477y = hVar;
        C83420i a = this.f290314i.f290349s.mo76756a(FrameLayout.class);
        this.f292474A = a;
        a.f227392b.put(R.layout.photo_with_attribution, 50);
        ArrayList arrayList = (ArrayList) a.f227391a.get(R.layout.photo_with_attribution);
        if (arrayList != null) {
            while (arrayList.size() > 50) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        this.f292475C = new ArrayList();
        this.f292478z = gVar.mo94516a(this.f290307b, this.f290308c.f256406b, (Map) null, mo94120n());
        this.f292476D = new C104977w(this);
    }

    /* renamed from: O */
    private final void m174041O() {
        ((ViewGroup) this.f290311f).removeAllViews();
        for (C104904ab c : this.f292475C) {
            c.mo94391c();
        }
        this.f292475C.clear();
    }

    /* renamed from: L */
    public final int mo94426L(int i) {
        return Math.round(C91115n.m148870b((float) i, this.f290307b));
    }

    /* renamed from: M */
    public final C104904ab mo94427M(C91857e eVar) {
        return new C104904ab(this.f292476D, eVar, this.f290314i.f290349s);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final View mo94018b(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(R.layout.grid_module, mo94115i(), false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final View mo94019c(C9277u uVar, ViewGroup viewGroup) {
        return this.f290308c.f256406b.inflate(R.layout.grid_module, viewGroup, false);
    }

    /* renamed from: h */
    public final View mo94114h(C9278v vVar) {
        m174041O();
        return super.mo94114h(vVar);
    }

    /* renamed from: q */
    public final void mo94036q() {
        super.mo94036q();
        m174041O();
    }

    /* renamed from: t */
    public final void mo94037t(boolean z) {
        if (z != this.f290318m) {
            this.f292478z.f292793e.mo94509a(z);
            super.mo94037t(z);
        }
    }

    /* renamed from: N */
    public final void mo94428N(C8034tb tbVar, View view) {
        if (tbVar != null) {
            view.setPaddingRelative(mo94426L(tbVar.f28227d), mo94426L(tbVar.f28225b), mo94426L(tbVar.f28228e), mo94426L(tbVar.f28226c));
        } else {
            view.setPaddingRelative(0, 0, 0, 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo94020e() {
        C9278v vVar = this.f290310e;
        if ((vVar.f32192a & 1048576) != 0) {
            ViewGroup viewGroup = (ViewGroup) this.f290311f;
            C9161ax axVar = vVar.f32216w;
            if (axVar == null) {
                axVar = C9161ax.f31622d;
            }
            if ((axVar.f31624a & 2) != 0) {
                C8150xj xjVar = axVar.f31626c;
                if (xjVar == null) {
                    xjVar = C8150xj.f28657d;
                }
                viewGroup.setContentDescription(xjVar.f28660b);
            }
            C8011sf sfVar = axVar.f31625b;
            if (sfVar == null) {
                sfVar = C8011sf.f28129c;
            }
            C8034tb tbVar = sfVar.f28132b;
            if (tbVar == null) {
                tbVar = C8034tb.f28222f;
            }
            mo94428N(tbVar, viewGroup);
            C8011sf sfVar2 = axVar.f31625b;
            if (sfVar2 == null) {
                sfVar2 = C8011sf.f28129c;
            }
            for (C8025st stVar : sfVar2.f28131a) {
                C9141ad adVar = null;
                C104904ab M = mo94427M((C91857e) null);
                this.f292475C.add(M);
                ViewGroup a = M.mo94389a();
                if ((vVar.f32192a & 67108864) != 0 && (adVar = vVar.f32169C) == null) {
                    adVar = C9141ad.f31521K;
                }
                M.mo94390b(stVar, adVar, (C8034tb) null, vVar.f32167A, this.f290318m);
                viewGroup.addView(a);
            }
            return;
        }
        ((C59052c) ((C59052c) f292473B.mo56226d()).mo56372aa(22068)).mo56389s("grid module not present: %s", vVar);
        int i = C90755l.f253831a;
    }
}
