package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.content.Context;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113255ah;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113362dc;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113363dd;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113365df;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113367dh;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113321r;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import dagger.C68214a;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.an */
/* compiled from: PG */
public final class C112734an extends C0640fb {

    /* renamed from: a */
    public final C68214a f312505a;

    /* renamed from: b */
    public final C68214a f312506b;

    /* renamed from: c */
    public C58485gu f312507c = C58485gu.m89845m();

    /* renamed from: d */
    private final C68214a f312508d;

    public C112734an(C68214a aVar, C68214a aVar2, C68214a aVar3) {
        this.f312508d = aVar;
        this.f312505a = aVar2;
        this.f312506b = aVar3;
    }

    /* renamed from: a */
    static C58485gu m186598a(C58485gu guVar, int i) {
        return (C58485gu) Collection.EL.stream(guVar).filter(C112731ak.f312499a).sorted(C112748ba.f312528b).limit((long) i).collect(C58370cn.f155946a);
    }

    public final int getItemCount() {
        return this.f312507c.size();
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        int i2;
        C112733am amVar = (C112733am) ghVar;
        if (i >= this.f312507c.size()) {
            amVar.itemView.setVisibility(8);
            return;
        }
        amVar.itemView.setVisibility(0);
        C113321r rVar = (C113321r) this.f312507c.get(i);
        ImageView imageView = amVar.f312501a;
        String str = rVar.f313842i;
        C113367dh dhVar = (C113367dh) this.f312508d.mo27525b();
        C113362dc d = C113363dd.m187554d();
        C113365df[] dfVarArr = new C113365df[1];
        Context context = imageView.getContext();
        if (C58890d.m90990e(str, context.getString(R.string.contact_call_disambig_item_label_home))) {
            i2 = R.drawable.quantum_gm_ic_home_grey600_24;
        } else if (C58890d.m90990e(str, context.getString(R.string.contact_call_disambig_item_label_mobile))) {
            i2 = R.drawable.quantum_gm_ic_smartphone_grey600_24;
        } else {
            i2 = C58890d.m90990e(str, context.getString(R.string.contact_call_disambig_item_label_work)) ? R.drawable.quantum_gm_ic_business_grey600_24 : R.drawable.quantum_gm_ic_phone_alt_grey600_24;
        }
        dfVarArr[0] = C113365df.m187558c(new C113255ah(i2));
        d.mo99987d(dfVarArr);
        dhVar.mo100144d(imageView, d.mo99984a());
        amVar.f312502b.setText(rVar.f313842i);
        amVar.f312503c.setText(rVar.f313835b);
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        C112733am amVar = new C112733am(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.contact_call_disambig_item, viewGroup, false));
        amVar.itemView.setOnClickListener(new C112732al(amVar));
        return amVar;
    }
}
