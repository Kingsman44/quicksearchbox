package com.google.android.apps.gsa.staticplugins.inappwebpage;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.webview.C87256b;
import com.google.android.apps.gsa.search.shared.inappwebpage.Request;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C59052c;
import java.net.URISyntaxException;

/* renamed from: com.google.android.apps.gsa.staticplugins.inappwebpage.ap */
/* compiled from: PG */
final class C102472ap extends C87256b {

    /* renamed from: a */
    final /* synthetic */ C102475as f285985a;

    public C102472ap(C102475as asVar) {
        this.f285985a = asVar;
    }

    /* renamed from: a */
    public final void mo79402a() {
        C102462af afVar = (C102462af) this.f285985a.f285996h;
        afVar.f285945b.f285956i.mo85151p(new C102460ad(afVar));
    }

    /* renamed from: b */
    public final void mo79403b(Uri uri, boolean z, boolean z2) {
        this.f285985a.f285996h.mo93264a(new Request(uri, C58733pz.f156496a, this.f285985a.f285998j.f236602c));
    }

    /* renamed from: c */
    public final String mo80865c() {
        return true != this.f285985a.f286002n ? "hidden" : "visible";
    }

    /* renamed from: d */
    public final void mo80866d(String str) {
        this.f285985a.f285999k.add(str);
    }

    /* renamed from: e */
    public final void mo80867e(String str, int i, String str2, boolean z) {
        try {
            Uri parse = Uri.parse(str2);
            this.f285985a.f286000l.add(new C102468al(this.f285985a, str, i, parse, z && this.f285985a.f285990b.mo79554e(parse, true)));
        } catch (URISyntaxException e) {
            ((C59052c) ((C59052c) ((C59052c) C102475as.f285989a.mo56226d()).mo56382g(e)).mo56372aa(20818)).mo56389s("Ignoring Menu Item with invalid URI %s", C85929cw.m138091v(str2));
        }
    }

    /* renamed from: f */
    public final void mo80868f(int i, Intent intent) {
        C102462af afVar = (C102462af) this.f285985a.f285996h;
        afVar.f285945b.f285956i.mo85151p(new C102461ae(afVar, i, intent));
        this.f285985a.f285996h.mo93267d();
    }

    /* renamed from: g */
    public final void mo80869g() {
        this.f285985a.f285997i.mo93290a();
    }

    /* renamed from: h */
    public final void mo80870h() {
        if (this.f285985a.f285997i.mo93292c()) {
            this.f285985a.f285996h.mo93266c();
        }
    }

    /* renamed from: i */
    public final boolean mo80871i(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.f285985a.f286001m.add(str);
        return true;
    }
}
