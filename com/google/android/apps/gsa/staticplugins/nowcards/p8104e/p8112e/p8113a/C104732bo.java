package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a;

import android.content.Context;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.sidekick.shared.monet.p7248d.C91820a;
import com.google.android.apps.gsa.sidekick.shared.monet.util.C91858f;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8106b.C104474j;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.bo */
/* compiled from: PG */
public final class C104732bo extends C22939d implements C91858f {

    /* renamed from: a */
    public final C91820a f291717a;

    /* renamed from: b */
    private final C104474j f291718b;

    /* renamed from: c */
    private final Context f291719c;

    public C104732bo(C22945j jVar, C104474j jVar2, Context context, C58833ax axVar) {
        super(jVar);
        this.f291718b = jVar2;
        this.f291719c = context;
        this.f291717a = (C91820a) axVar.mo56111f();
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        ((C104789dr) this.f291718b).f291939b.mo28726b(new C104730bm(this));
        LinearLayout linearLayout = new LinearLayout(this.f291719c);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        ((C104789dr) this.f291718b).f291938a.mo28657c(new C104731bn(linearLayout));
        mo28295iC(linearLayout);
    }

    /* renamed from: l */
    public final Long mo86360l() {
        return (Long) ((C58833ax) ((C104789dr) this.f291718b).f291940c.f63720e).mo56111f();
    }
}
