package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news;

import android.app.Activity;
import android.view.MenuItem;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.news.ab */
/* compiled from: PG */
public final /* synthetic */ class C115555ab implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ C115572as f320536a;

    /* renamed from: b */
    public final /* synthetic */ String f320537b;

    public /* synthetic */ C115555ab(C115572as asVar, String str) {
        this.f320536a = asVar;
        this.f320537b = str;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C115572as asVar = this.f320536a;
        String str = this.f320537b;
        C18509a c = C18522b.m35986c();
        ((C18523c) c).f52492a = str;
        ((Activity) asVar.f320586y.mo56107c()).startActivityForResult(c.mo24020b().mo24031a(), 0);
        return true;
    }
}
