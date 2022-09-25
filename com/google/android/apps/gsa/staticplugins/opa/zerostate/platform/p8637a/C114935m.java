package com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a;

import android.content.Context;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3994s.p3995a.C53469y;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.a.m */
/* compiled from: PG */
public final class C114935m extends C0640fb {

    /* renamed from: a */
    public final Context f318891a;

    /* renamed from: b */
    public final C68214a f318892b;

    /* renamed from: c */
    public C53469y f318893c = C53469y.f140323e;

    public C114935m(Context context, C68214a aVar) {
        this.f318891a = context;
        this.f318892b = aVar;
    }

    public final int getItemCount() {
        return this.f318893c.equals(C53469y.f140323e) ? 0 : 1;
    }

    public final /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C114934l lVar = (C114934l) ghVar;
        C53469y yVar = this.f318893c;
        if (!yVar.f140325a.isEmpty()) {
            ((C91189au) lVar.f318890d.f318892b.mo27525b()).mo85421i(yVar.f140325a, lVar.f318887a);
            if (!yVar.f140327c.isEmpty()) {
                lVar.f318887a.setOnClickListener(new C89943l(new C114933k(lVar, yVar.f140327c)));
            }
        }
        if (!yVar.f140326b.isEmpty()) {
            ((C91189au) lVar.f318890d.f318892b.mo27525b()).mo85421i(yVar.f140326b, lVar.f318888b);
        }
        if (!yVar.f140328d.isEmpty()) {
            lVar.f318889c.setText(yVar.f140328d);
        }
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C114934l(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zero_state_fab_list_footer, viewGroup, false));
    }
}
