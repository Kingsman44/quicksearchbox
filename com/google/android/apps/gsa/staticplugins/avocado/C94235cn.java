package com.google.android.apps.gsa.staticplugins.avocado;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3861at.acz;
import com.google.common.base.C58839bc;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.cn */
/* compiled from: PG */
public final /* synthetic */ class C94235cn implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C94256dh f263334a;

    /* renamed from: b */
    public final /* synthetic */ Account f263335b;

    /* renamed from: c */
    public final /* synthetic */ C58839bc f263336c;

    public /* synthetic */ C94235cn(C94256dh dhVar, Account account, C58839bc bcVar) {
        this.f263334a = dhVar;
        this.f263335b = account;
        this.f263336c = bcVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C94256dh dhVar = this.f263334a;
        Account account = this.f263335b;
        C58839bc bcVar = this.f263336c;
        acz acz = (acz) obj;
        ((C59052c) ((C59052c) C94256dh.f263378a.mo56224b()).mo56372aa(14321)).mo56386p("Start checking status.");
        return C90877ak.m148470d(dhVar.f263392g, "fetch status", new C94244cw(dhVar, account), bcVar, dhVar.f263408w);
    }
}
