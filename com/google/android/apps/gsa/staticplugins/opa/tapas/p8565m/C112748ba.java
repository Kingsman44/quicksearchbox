package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.content.Context;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113259al;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113362dc;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113363dd;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113365df;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113367dh;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113321r;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.util.Comparator;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.ba */
/* compiled from: PG */
final class C112748ba extends C0640fb {

    /* renamed from: a */
    public static final C59071e f312527a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.m.ba");

    /* renamed from: b */
    static final Comparator f312528b = C112738ar.f312511a;

    /* renamed from: c */
    public boolean f312529c = false;

    /* renamed from: d */
    public final C68214a f312530d;

    /* renamed from: e */
    private final C58485gu f312531e;

    /* renamed from: f */
    private final C58485gu f312532f;

    /* renamed from: g */
    private final C68214a f312533g;

    public C112748ba(C58485gu guVar, C68214a aVar, C86124t tVar, C68214a aVar2) {
        C58485gu guVar2;
        int a = (int) tVar.mo79743a(C90063do.f249301au);
        C58485gu b = m186606b(guVar, a);
        int i = 0;
        while (true) {
            if (i < b.size()) {
                if (((C113321r) b.get(i)).f313839f.equals("vnd.android.cursor.item/phone_v2")) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            guVar2 = (C58485gu) Collection.EL.stream(b).map(C112740at.f312513a).collect(C58370cn.f155946a);
        } else {
            C58480gp e = C58485gu.m89837e();
            int i2 = i == b.size() + -1 ? 3 : 2;
            e.mo55396h((Iterable) Collection.EL.stream(b.subList(0, i)).map(C112741au.f312514a).collect(C58370cn.f155946a));
            e.mo55395g(new C112723ac(i2, (C113321r) b.get(i)));
            guVar2 = e.mo55394f();
        }
        this.f312531e = guVar2;
        this.f312532f = (C58485gu) Collection.EL.stream(guVar).filter(C112736ap.f312509a).sorted(f312528b).limit((long) a).map(C112737aq.f312510a).collect(C58370cn.f155946a);
        this.f312533g = aVar;
        this.f312530d = aVar2;
    }

    /* renamed from: b */
    static C58485gu m186606b(C58485gu guVar, int i) {
        return (C58485gu) Collection.EL.stream(guVar).filter(C112739as.f312512a).sorted(f312528b).limit((long) i).collect(C58370cn.f155946a);
    }

    /* renamed from: c */
    private static String m186607c(C113321r rVar, Context context) {
        return rVar.f313839f.equals("vnd.android.cursor.item/phone_v2") ? context.getString(R.string.contact_disambig_item_sms) : rVar.f313842i;
    }

    /* renamed from: d */
    private final void m186608d(ImageView imageView, String str) {
        if (!str.isEmpty()) {
            C113362dc d = C113363dd.m187554d();
            d.mo99987d(C113365df.m187558c(C113259al.m187318c(str)));
            d.mo99988e(true);
            ((C113367dh) this.f312533g.mo27525b()).mo100144d(imageView, d.mo99984a());
        }
    }

    /* renamed from: e */
    private static void m186609e(C0673gh ghVar) {
        ghVar.itemView.setOnClickListener(new C112742av(ghVar));
    }

    /* renamed from: a */
    public final C58485gu mo99723a() {
        return this.f312529c ? this.f312532f : this.f312531e;
    }

    public final int getItemCount() {
        return mo99723a().size();
    }

    public final int getItemViewType(int i) {
        int b = ((C112746az) mo99723a().get(i)).mo99688b();
        int i2 = b - 1;
        if (b != 0) {
            return i2;
        }
        throw null;
    }

    public final void onBindViewHolder(C0673gh ghVar, int i) {
        ghVar.itemView.setVisibility(0);
        C112746az azVar = (C112746az) mo99723a().get(i);
        if (azVar.mo99688b() == 3) {
            C113321r a = azVar.mo99687a();
            C112745ay ayVar = (C112745ay) ghVar;
            if (ayVar != null) {
                m186608d(ayVar.f312522a, a.f313844k);
                ayVar.f312523b.setText(m186607c(a, ayVar.itemView.getContext()));
                ayVar.f312524c.setText(a.f313842i);
                ayVar.f312525d.setText(a.f313835b);
                return;
            }
            return;
        }
        C112744ax axVar = (C112744ax) ghVar;
        if (axVar != null) {
            m186608d(axVar.f312517a, azVar.mo99687a().f313844k);
            axVar.f312518b.setText(m186607c(azVar.mo99687a(), axVar.itemView.getContext()));
            if (azVar.mo99688b() == 1) {
                axVar.f312519c.setVisibility(4);
                axVar.f312520d.setVisibility(4);
                axVar.f312521e.setVisibility(8);
                return;
            }
            axVar.f312519c.setVisibility(0);
            axVar.f312520d.setVisibility(0);
            axVar.f312520d.setText(azVar.mo99687a().f313842i);
            axVar.f312521e.setVisibility(0);
        }
    }

    public final C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 2) {
            C112745ay ayVar = new C112745ay(from.inflate(R.layout.contact_disambig_dialog_expanded_item, viewGroup, false));
            m186609e(ayVar);
            return ayVar;
        }
        C112744ax axVar = new C112744ax(from.inflate(R.layout.contact_disambig_dialog_item, viewGroup, false));
        axVar.f312521e.setOnClickListener(new C112743aw(axVar));
        m186609e(axVar);
        return axVar;
    }
}
