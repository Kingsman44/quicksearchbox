package com.google.android.apps.gsa.velour;

import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.weather.p10685d.C142073b;

/* renamed from: com.google.android.apps.gsa.velour.a */
/* compiled from: PG */
public final /* synthetic */ class C118610a implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ DynamicActivityTrampoline f330904a;

    /* renamed from: b */
    public final /* synthetic */ String f330905b;

    /* renamed from: c */
    public final /* synthetic */ String f330906c;

    /* renamed from: d */
    public final /* synthetic */ int f330907d;

    public /* synthetic */ C118610a(DynamicActivityTrampoline dynamicActivityTrampoline, String str, String str2, int i) {
        this.f330904a = dynamicActivityTrampoline;
        this.f330905b = str;
        this.f330906c = str2;
        this.f330907d = i;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        DynamicActivityTrampoline dynamicActivityTrampoline = this.f330904a;
        String str = this.f330905b;
        String str2 = this.f330906c;
        int i = this.f330907d;
        Intent intent = (Intent) obj;
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.putExtra("source", str);
        intent.putExtra("location_64", str2);
        intent.putExtra("default_tab_index", i);
        C142073b.m230648b(intent);
        dynamicActivityTrampoline.startActivity(intent);
    }
}
