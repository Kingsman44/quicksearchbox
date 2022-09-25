package com.google.android.apps.search.sceneviewer.p10649d;

import android.accounts.Account;
import android.app.Activity;
import android.text.TextUtils;
import com.google.android.libraries.surveys.C43170k;
import com.google.android.libraries.surveys.C43171l;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.apps.search.sceneviewer.d.c */
/* compiled from: PG */
public final /* synthetic */ class C141543c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C141545e f384180a;

    /* renamed from: b */
    public final /* synthetic */ Activity f384181b;

    /* renamed from: c */
    public final /* synthetic */ List f384182c;

    public /* synthetic */ C141543c(C141545e eVar, Activity activity, List list) {
        this.f384180a = eVar;
        this.f384181b = activity;
        this.f384182c = list;
    }

    public final C60870cx apply(Object obj) {
        C141545e eVar = this.f384180a;
        Activity activity = this.f384181b;
        List list = this.f384182c;
        Account account = (Account) obj;
        ((C59052c) ((C59052c) C141545e.f384186a.mo56224b()).mo56372aa(41729)).mo56386p("Account retrieval successful, requesting HaTS survey");
        String str = eVar.f384188c;
        if (activity == null) {
            throw new IllegalArgumentException("Client context is not set.");
        } else if (!TextUtils.isEmpty(str)) {
            C43171l.m75930b(new C43170k(activity, str, new C141544d(activity, account, list), eVar.f384187b, account, eVar.f384189d));
            return C60866ct.f164955a;
        } else {
            throw new IllegalArgumentException("Trigger ID cannot be null or empty.");
        }
    }
}
