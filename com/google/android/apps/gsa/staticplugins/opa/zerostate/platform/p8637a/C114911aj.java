package com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114756j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28257a;
import com.google.android.libraries.logging.C28289g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.android.material.bottomsheet.C44565p;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.a.aj */
/* compiled from: PG */
public final class C114911aj extends C0640fb implements C28289g {

    /* renamed from: a */
    public static final C59071e f318814a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.a.aj");

    /* renamed from: b */
    public final C58485gu f318815b;

    /* renamed from: c */
    public final C68214a f318816c;

    /* renamed from: d */
    public final C44565p f318817d;

    /* renamed from: e */
    public final C28293k f318818e;

    /* renamed from: f */
    public C114756j f318819f;

    public C114911aj(C68214a aVar, C58485gu guVar, C44565p pVar) {
        this.f318816c = aVar;
        this.f318815b = guVar;
        this.f318817d = pVar;
        ArrayList arrayList = new ArrayList();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C114901a aVar2 = (C114901a) guVar.get(i);
            if (aVar2.mo101690a() != null) {
                Integer a = aVar2.mo101690a();
                a.getClass();
                C28292j jVar = new C28292j(a.intValue());
                jVar.mo33795i(5);
                arrayList.add(C28293k.m52908e(jVar, new C28293k[0]));
            }
        }
        this.f318818e = C28293k.m52907d(new C28292j(81092), arrayList);
    }

    /* renamed from: a */
    public final C28293k mo33782a() {
        return this.f318818e;
    }

    public final int getItemCount() {
        return this.f318815b.size();
    }

    public final /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C114910ai aiVar = (C114910ai) ghVar;
        C114901a aVar = (C114901a) this.f318815b.get(i);
        aiVar.f318812b.setText(aVar.mo101693d());
        if (!C58837ba.m90859h(aVar.mo101691b())) {
            String b = aVar.mo101691b();
            b.getClass();
            ((C91189au) aiVar.f318813c.f318816c.mo27525b()).mo85421i(b, aiVar.f318811a);
        } else {
            ((C59052c) ((C59052c) f318814a.mo56226d()).mo56372aa(29432)).mo56386p("Failed to load the icon.");
        }
        View view = aiVar.itemView;
        C28293k kVar = this.f318818e;
        if (kVar != null) {
            C28295m.m52919e(view, ((C28293k) ((C28257a) kVar).f76909b.get(i)).mo33745a());
        }
        view.setOnClickListener(new C89943l(new C114909ah(this, i, aVar)));
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C114910ai(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zero_state_fab_bottom_sheet_button, viewGroup, false));
    }
}
