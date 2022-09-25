package com.google.android.libraries.web.webview.p3485h.p3486a;

import androidx.p201w.C4322a;
import androidx.p201w.C4363g;
import com.google.android.libraries.web.base.C43234b;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.postmessage.PostMessageConfig;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.android.libraries.web.postmessage.internal.C43969p;
import com.google.android.libraries.web.postmessage.internal.C43970q;
import com.google.android.libraries.web.shared.lifecycle.C44107h;
import com.google.android.libraries.web.webview.p3481f.p3482a.C44408a;
import com.google.android.libraries.web.webview.p3485h.C44412a;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import java.util.Set;

/* renamed from: com.google.android.libraries.web.webview.h.a.l */
/* compiled from: PG */
public final class C44424l implements C44107h {

    /* renamed from: a */
    public static final C59071e f115471a = C59071e.m91332i("com.google.android.libraries.web.webview.h.a.l");

    /* renamed from: b */
    public final C43970q f115472b;

    /* renamed from: c */
    public final C44412a f115473c;

    /* renamed from: d */
    public final Set f115474d;

    /* renamed from: e */
    public final C47770dh f115475e;

    /* renamed from: f */
    public final boolean f115476f;

    /* renamed from: g */
    public final C44408a f115477g;

    /* renamed from: h */
    private final C43969p f115478h;

    /* renamed from: i */
    private final C43234b f115479i;

    public C44424l(C43970q qVar, C43269t tVar, C44412a aVar, C43969p pVar, C47770dh dhVar, C44408a aVar2, C43234b bVar) {
        this.f115472b = qVar;
        this.f115473c = aVar;
        this.f115474d = tVar.mo46388f();
        this.f115478h = pVar;
        this.f115475e = dhVar;
        this.f115477g = aVar2;
        this.f115479i = bVar;
        this.f115476f = tVar.mo46384b().f112975n;
    }

    /* renamed from: a */
    public final void mo44356a() {
        this.f115472b.mo46964b();
    }

    /* renamed from: b */
    public final C43968o mo47299b(C4322a aVar) {
        return this.f115478h.mo46962a(new C44414b(aVar));
    }

    /* renamed from: c */
    public final C43968o mo47300c(C4363g gVar) {
        return this.f115478h.mo46962a(new C44421i(gVar));
    }

    /* renamed from: d */
    public final C58485gu mo47301d(PostMessageConfig postMessageConfig) {
        if (!this.f115479i.f112982a) {
            return postMessageConfig.mo42599b();
        }
        C58480gp e = C58485gu.m89837e();
        e.mo55395g("http://localhost:9879");
        e.mo55395g("http://localhost:8888");
        e.mo55396h(postMessageConfig.mo42599b());
        return e.mo55394f();
    }
}
