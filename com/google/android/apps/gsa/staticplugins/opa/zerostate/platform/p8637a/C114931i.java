package com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.C90080ee;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114742l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28289g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.a.i */
/* compiled from: PG */
public final class C114931i extends C0640fb implements C28289g {

    /* renamed from: a */
    public final C68214a f318880a;

    /* renamed from: b */
    public final List f318881b = new ArrayList();

    /* renamed from: c */
    public final C114742l f318882c;

    /* renamed from: d */
    public final C86124t f318883d;

    /* renamed from: e */
    public C28293k f318884e;

    public C114931i(C68214a aVar, C114742l lVar, C86124t tVar) {
        this.f318880a = aVar;
        this.f318882c = lVar;
        this.f318883d = tVar;
    }

    /* renamed from: a */
    public final C28293k mo33782a() {
        return this.f318884e;
    }

    public final int getItemCount() {
        return this.f318881b.size();
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C114930h hVar = (C114930h) ghVar;
        boolean e = hVar.f318879d.f318883d.mo79746e(C90080ee.f249811j);
        hVar.f318876a.setText((String) this.f318881b.get(i));
        hVar.f318876a.setFocusable(e);
        if (e) {
            hVar.f318876a.addTextChangedListener(new C114929g(hVar));
        }
        hVar.f318877b.setVisibility(true != e ? 8 : 0);
        if (e) {
            ((C91189au) hVar.f318879d.f318880a.mo27525b()).mo85421i("https://www.gstatic.com/images/icons/material/system_gm/2x/edit_googblue_24dp.png", hVar.f318877b);
            hVar.f318877b.setOnClickListener(new C89943l(new C114928f(hVar)));
        }
        ((C91189au) hVar.f318879d.f318880a.mo27525b()).mo85421i("https://www.gstatic.com/images/icons/material/system_gm/2x/delete_googblue_24dp.png", hVar.f318878c);
        hVar.f318878c.setOnClickListener(new C89943l(new C114927e(hVar)));
        C28292j jVar = new C28292j(96732);
        jVar.mo33795i(5);
        C28295m.m52919e(hVar.f318878c, jVar);
        C114742l lVar = hVar.f318879d.f318882c;
        C28293k e2 = C28293k.m52908e(jVar, new C28293k[0]);
        C28293k kVar = hVar.f318879d.f318884e;
        kVar.getClass();
        lVar.mo101570e(e2, kVar);
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C114930h(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zero_state_fab_list_item, viewGroup, false));
    }
}
