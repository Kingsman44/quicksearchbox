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

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.a.ap */
/* compiled from: PG */
public final class C114917ap extends C0640fb implements C28289g {

    /* renamed from: a */
    public static final C59071e f318848a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.a.ap");

    /* renamed from: b */
    public final C58485gu f318849b;

    /* renamed from: c */
    public final C68214a f318850c;

    /* renamed from: d */
    public final C44565p f318851d;

    /* renamed from: e */
    public final C28293k f318852e;

    /* renamed from: f */
    public C114756j f318853f;

    public C114917ap(C68214a aVar, C58485gu guVar, C44565p pVar) {
        this.f318850c = aVar;
        this.f318849b = guVar;
        this.f318851d = pVar;
        ArrayList arrayList = new ArrayList();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C114924b bVar = (C114924b) guVar.get(i);
            if (bVar.mo101703a() != null) {
                Integer a = bVar.mo101703a();
                a.getClass();
                C28292j jVar = new C28292j(a.intValue());
                jVar.mo33795i(5);
                arrayList.add(C28293k.m52908e(jVar, new C28293k[0]));
            }
        }
        this.f318852e = C28293k.m52907d(new C28292j(124579), arrayList);
    }

    /* renamed from: a */
    public final C28293k mo33782a() {
        return this.f318852e;
    }

    public final int getItemCount() {
        return this.f318849b.size();
    }

    public final /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C114916ao aoVar = (C114916ao) ghVar;
        C114924b bVar = (C114924b) this.f318849b.get(i);
        aoVar.f318844b.setText(bVar.mo101708f());
        aoVar.f318845c.setText(bVar.mo101707e());
        if (!C58837ba.m90859h(bVar.mo101705c())) {
            String c = bVar.mo101705c();
            c.getClass();
            ((C91189au) aoVar.f318847e.f318850c.mo27525b()).mo85421i(c, aoVar.f318843a);
        } else {
            ((C59052c) ((C59052c) f318848a.mo56226d()).mo56372aa(29434)).mo56386p("Failed to load button icon.");
        }
        if (!C58837ba.m90859h(bVar.mo101704b())) {
            String b = bVar.mo101704b();
            b.getClass();
            ((C91189au) aoVar.f318847e.f318850c.mo27525b()).mo85421i(b, aoVar.f318846d);
        } else {
            ((C59052c) ((C59052c) f318848a.mo56226d()).mo56372aa(29435)).mo56386p("Failed to load arrow icon.");
        }
        View view = aoVar.itemView;
        C28293k kVar = this.f318852e;
        if (kVar != null) {
            C28295m.m52919e(view, ((C28293k) ((C28257a) kVar).f76909b.get(i)).mo33745a());
        }
        view.setOnClickListener(new C89943l(new C114915an(this, i, bVar)));
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C114916ao(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zero_state_fab_shelf_button, viewGroup, false));
    }
}
