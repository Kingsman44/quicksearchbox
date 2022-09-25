package com.google.android.libraries.assistant.ampactions;

import android.util.Log;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.assistant.ampactions.v */
/* compiled from: PG */
public final class C11049v {

    /* renamed from: a */
    public final C11046s f36288a;

    /* renamed from: b */
    public final Map f36289b = new HashMap();

    public C11049v(C11046s sVar) {
        this.f36288a = sVar;
    }

    /* renamed from: a */
    public final C60870cx mo19515a(String str) {
        Log.d("WebViewFactoryManager", "createWebView");
        return C60922j.m93044g(this.f36288a.mo19512a(str), new C11048u(this, str), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final void mo19516b(C58833ax axVar) {
        Log.d("WebViewFactoryManager", "destroyAllExcept");
        ArrayList arrayList = new ArrayList(this.f36289b.keySet());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            if (!axVar.mo56113h() || !str.equals(axVar.mo56107c())) {
                mo19518d(str);
            }
        }
    }

    /* renamed from: c */
    public final void mo19517c() {
        Log.d("WebViewFactoryManager", "Destroying all webViews");
        mo19516b(C58836b.f156633a);
    }

    /* renamed from: d */
    public final void mo19518d(String str) {
        Log.d("WebViewFactoryManager", "Destroying WebView for ID: ".concat(String.valueOf(str)));
        this.f36289b.remove(str);
        this.f36288a.mo19514c(str);
    }
}
