package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.apps.gsa.now.shared.p6421ui.WebImageView;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.android.material.bottomsheet.C44565p;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3994s.p3995a.C53115by;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.ak */
/* compiled from: PG */
public final class C114626ak extends ArrayAdapter {

    /* renamed from: a */
    public static final C59071e f317998a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.ak");

    /* renamed from: b */
    public final C44565p f317999b;

    /* renamed from: c */
    public final C53115by[] f318000c;

    /* renamed from: d */
    public final C114629an f318001d;

    /* renamed from: e */
    private final LayoutInflater f318002e;

    /* renamed from: f */
    private final C68214a f318003f;

    /* renamed from: g */
    private final C28293k f318004g;

    public C114626ak(Context context, C68214a aVar, C44565p pVar, C53115by[] byVarArr, C114629an anVar, C28293k kVar) {
        super(context, 0, byVarArr);
        this.f318002e = LayoutInflater.from(context);
        this.f318003f = aVar;
        this.f317999b = pVar;
        this.f318000c = byVarArr;
        this.f318001d = anVar;
        this.f318004g = kVar;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C53115by byVar = (C53115by) getItem(i);
        if (view == null) {
            view = this.f318002e.inflate(R.layout.overflow_menu_action, viewGroup, false);
        }
        ((TextView) view.findViewById(R.id.overflow_menu_action_label)).setText(byVar.f139189b);
        WebImageView webImageView = (WebImageView) view.findViewById(R.id.overflow_menu_icon);
        C51012dc dcVar = byVar.f139190c;
        if (dcVar == null) {
            dcVar = C51012dc.f132813k;
        }
        if ((dcVar.f132815a & 2) != 0) {
            C51012dc dcVar2 = byVar.f139190c;
            if (dcVar2 == null) {
                dcVar2 = C51012dc.f132813k;
            }
            webImageView.mo76738i(dcVar2.f132817c, (C91189au) this.f318003f.mo27525b());
        }
        C28293k kVar = this.f318004g;
        if (kVar != null && i < kVar.mo33746b().size()) {
            C28295m.m52919e(view, ((C28293k) this.f318004g.mo33746b().get(i)).mo33745a());
        }
        view.setOnClickListener(new C89943l(new C114625aj(this, i)));
        return view;
    }
}
