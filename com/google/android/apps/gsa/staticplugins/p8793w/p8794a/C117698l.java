package com.google.android.apps.gsa.staticplugins.p8793w.p8794a;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.io.File;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.a.l */
/* compiled from: PG */
public final /* synthetic */ class C117698l implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C117687ai f326674a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f326675b;

    /* renamed from: c */
    public final /* synthetic */ File f326676c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f326677d;

    /* renamed from: e */
    public final /* synthetic */ Query f326678e;

    /* renamed from: f */
    public final /* synthetic */ Account f326679f;

    public /* synthetic */ C117698l(C117687ai aiVar, C60870cx cxVar, File file, C60870cx cxVar2, Query query, Account account) {
        this.f326674a = aiVar;
        this.f326675b = cxVar;
        this.f326676c = file;
        this.f326677d = cxVar2;
        this.f326678e = query;
        this.f326679f = account;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C117687ai aiVar = this.f326674a;
        C60870cx cxVar = this.f326675b;
        File file = this.f326676c;
        C60870cx cxVar2 = this.f326677d;
        Query query = this.f326678e;
        Account account = this.f326679f;
        for (Integer intValue : (Set) C60856cj.m92909r(cxVar)) {
            int intValue2 = intValue.intValue();
            switch (intValue2) {
                case 291504647:
                case 322964416:
                case 354419973:
                case 356517120:
                    break;
                default:
                    ((C59052c) ((C59052c) C117687ai.f326644a.mo56225c()).mo56372aa(18604)).mo56387q("Unrecognized id %d is registered", intValue2);
                    break;
            }
        }
        return aiVar.mo103431a(file, (String) C60856cj.m92909r(cxVar2), query, account.name);
    }
}
