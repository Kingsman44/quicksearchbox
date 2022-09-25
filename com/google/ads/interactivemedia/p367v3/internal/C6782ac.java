package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Build;
import android.webkit.WebView;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ac */
/* compiled from: PG */
public class C6782ac {

    /* renamed from: a */
    private C6809ax f20231a = new C6809ax((WebView) null);

    /* renamed from: b */
    private long f20232b;

    /* renamed from: c */
    private int f20233c;

    public C6782ac() {
        mo14424k();
    }

    /* renamed from: a */
    public void mo14414a() {
    }

    /* renamed from: b */
    public void mo14415b() {
        this.f20231a.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo14416c(WebView webView) {
        this.f20231a = new C6809ax(webView);
    }

    /* renamed from: d */
    public final WebView mo14417d() {
        return (WebView) this.f20231a.get();
    }

    /* renamed from: e */
    public final boolean mo14418e() {
        return this.f20231a.get() != null;
    }

    /* renamed from: f */
    public final void mo14419f(String str, long j) {
        if (j >= this.f20232b) {
            this.f20233c = 2;
            C7352v.m22064a().mo16602e(mo14417d(), str);
        }
    }

    /* renamed from: g */
    public final void mo14420g(String str, long j) {
        if (j >= this.f20232b && this.f20233c != 3) {
            this.f20233c = 3;
            C7352v.m22064a().mo16602e(mo14417d(), str);
        }
    }

    /* renamed from: h */
    public void mo14421h(C7001i iVar, C6947g gVar) {
        mo14422i(iVar, gVar, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo14422i(C7001i iVar, C6947g gVar, JSONObject jSONObject) {
        String i = iVar.mo16004i();
        JSONObject jSONObject2 = new JSONObject();
        C6789ah.m18702d(jSONObject2, "environment", "app");
        C6789ah.m18702d(jSONObject2, "adSessionType", gVar.mo15868h());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("; ");
        sb.append(str2);
        C6789ah.m18702d(jSONObject3, "deviceType", sb.toString());
        C6789ah.m18702d(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        C6789ah.m18702d(jSONObject3, "os", "Android");
        C6789ah.m18702d(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C6789ah.m18702d(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        C6789ah.m18702d(jSONObject4, "partnerName", gVar.mo15862b().mo16185a());
        C6789ah.m18702d(jSONObject4, "partnerVersion", gVar.mo15862b().mo16186b());
        C6789ah.m18702d(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        C6789ah.m18702d(jSONObject5, "libraryVersion", "1.3.3-google_20200416");
        C6789ah.m18702d(jSONObject5, "appId", C7298t.m21774a().mo16511b().getApplicationContext().getPackageName());
        C6789ah.m18702d(jSONObject2, "app", jSONObject5);
        if (gVar.mo15866f() != null) {
            C6789ah.m18702d(jSONObject2, "contentUrl", gVar.mo15866f());
        }
        if (gVar.mo15867g() != null) {
            C6789ah.m18702d(jSONObject2, "customReferenceData", gVar.mo15867g());
        }
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = gVar.mo15863c().iterator();
        if (!it.hasNext()) {
            C7352v.m22064a().mo16600c(mo14417d(), i, jSONObject2, jSONObject6, jSONObject);
        } else {
            C6904ek ekVar = (C6904ek) it.next();
            throw null;
        }
    }

    /* renamed from: j */
    public final void mo14423j(float f) {
        C7352v.m22064a().mo16603f(mo14417d(), f);
    }

    /* renamed from: k */
    public final void mo14424k() {
        this.f20232b = System.nanoTime();
        this.f20233c = 1;
    }
}
