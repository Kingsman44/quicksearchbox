package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.accounts.Account;
import android.view.View;
import android.widget.CompoundButton;
import com.google.android.apps.gsa.assistant.shared.cc;
import com.google.android.apps.gsa.assistant.shared.l.s;
import com.google.android.apps.gsa.assistant.shared.l.t;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.i */
/* compiled from: PG */
public final /* synthetic */ class C9699i implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C9702l f33519a;

    /* renamed from: b */
    public final /* synthetic */ Account f33520b;

    /* renamed from: c */
    public final /* synthetic */ View f33521c;

    public /* synthetic */ C9699i(C9702l lVar, Account account, View view) {
        this.f33519a = lVar;
        this.f33520b = account;
        this.f33521c = view;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C9702l lVar = this.f33519a;
        Account account = this.f33520b;
        View view = this.f33521c;
        if (account != null && lVar.f33532e != null) {
            if (z) {
                if (!((cc) lVar.f33531d.mo27525b()).c(account, lVar.f33532e)) {
                    s createBuilder = t.d.createBuilder();
                    String str = lVar.f33532e;
                    createBuilder.copyOnWrite();
                    t tVar = createBuilder.instance;
                    str.getClass();
                    tVar.a |= 1;
                    tVar.b = str;
                    ((cc) lVar.f33531d.mo27525b()).a(account, createBuilder.build());
                }
            } else if (((cc) lVar.f33531d.mo27525b()).c(account, lVar.f33532e)) {
                s createBuilder2 = t.d.createBuilder();
                String str2 = lVar.f33532e;
                createBuilder2.copyOnWrite();
                t tVar2 = createBuilder2.instance;
                str2.getClass();
                tVar2.a |= 1;
                tVar2.b = str2;
                ((cc) lVar.f33531d.mo27525b()).b(account, createBuilder2.build());
            }
            lVar.mo17970b(view);
        }
    }
}
