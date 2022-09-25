package com.google.apps.tiktok.tracing;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: com.google.apps.tiktok.tracing.cd */
/* compiled from: PG */
public final /* synthetic */ class C47580cd implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ C47770dh f123475a;

    /* renamed from: b */
    public final /* synthetic */ String f123476b = "Primary language selection item tapped";

    /* renamed from: c */
    public final /* synthetic */ AdapterView.OnItemClickListener f123477c;

    public /* synthetic */ C47580cd(C47770dh dhVar, AdapterView.OnItemClickListener onItemClickListener) {
        this.f123475a = dhVar;
        this.f123477c = onItemClickListener;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C47770dh dhVar = this.f123475a;
        String str = this.f123476b;
        AdapterView.OnItemClickListener onItemClickListener = this.f123477c;
        C47538ax c = dhVar.mo51613c(str);
        try {
            onItemClickListener.onItemClick(adapterView, view, i, j);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47574by.m84679a(th, th);
        }
        throw th;
    }
}
