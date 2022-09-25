package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.p033v7.app.C0392m;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3506c.C44581b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.bc */
/* compiled from: PG */
public final class C112750bc {

    /* renamed from: a */
    private final C68214a f312534a;

    public C112750bc(C68214a aVar) {
        this.f312534a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo99725a(C112749bb bbVar) {
        View inflate = LayoutInflater.from((Context) this.f312534a.mo27525b()).inflate(R.layout.contact_item_disambig_dialog, (ViewGroup) null);
        C44581b bVar = new C44581b((Context) this.f312534a.mo27525b(), R.style.ContactDisambigDialog);
        bVar.mo47607z(inflate);
        C0392m create = bVar.create();
        create.show();
        Window window = create.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 8388613;
            window.setAttributes(attributes);
            window.setBackgroundDrawable(new ColorDrawable(0));
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler_view);
            recyclerView.setLayoutManager(new LinearLayoutManager(inflate.getContext()));
            recyclerView.addItemDecoration$ar$ds(new C112752be(inflate.getContext()));
            bbVar.mo99724a(recyclerView);
        }
    }
}
