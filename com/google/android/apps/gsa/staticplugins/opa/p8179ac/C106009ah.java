package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.libraries.assistant.p1528m.p1529a.C18422g;
import com.google.android.libraries.assistant.p1528m.p1529a.C18431p;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.assistant.p3897e.p3921j.p3926e.C51843bd;
import com.google.assistant.p3897e.p3921j.p3926e.C51876cj;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.ah */
/* compiled from: PG */
public final /* synthetic */ class C106009ah implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C106023av f295953a;

    /* renamed from: b */
    public final /* synthetic */ String f295954b;

    public /* synthetic */ C106009ah(C106023av avVar, String str) {
        this.f295953a = avVar;
        this.f295954b = str;
    }

    public final void run() {
        C106023av avVar = this.f295953a;
        String str = this.f295954b;
        char c = 3;
        if (!((C106053i) avVar.f295980a.f296006d.mo56107c()).f296078h) {
            C106025ax axVar = avVar.f295980a;
            if (!axVar.f295988E && !axVar.f295987D) {
                c = 2;
            }
        }
        C18431p pVar = (C18431p) avVar.f295980a.f296005c.mo56107c();
        if (pVar.f52320l.mo23950a() != C18422g.LOADED) {
            ((C59052c) ((C59052c) C18431p.f52308a.mo56225c()).mo56372aa(47315)).mo56386p("Page content not loaded.");
        } else {
            WebView webView = pVar.f52310b;
            Object[] objArr = new Object[1];
            objArr[0] = C18431p.m35890d(c != 2 ? "BLOCKED" : "SUCCESS");
            webView.evaluateJavascript(pVar.mo23953c("sendTextQueryStatus", objArr), (ValueCallback) null);
        }
        C106025ax axVar2 = avVar.f295980a;
        if (!((C106053i) axVar2.f296006d.mo56107c()).f296078h && !axVar2.f295987D) {
            axVar2.mo95213C();
            axVar2.f296011i.mo96219b(new C88489j(C87739bu.OPA_CANCEL_CONVERSATION).mo82013a());
            C51843bd bdVar = C51843bd.APPLICATION_URL;
            C88244um umVar = C88244um.ATTACH_WEBVIEW;
            int a = C51876cj.m86404a(axVar2.f296023u.f136086e);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i == 1) {
                ((C106053i) axVar2.f296006d.mo56107c()).mo95271d(str, true);
            } else if (i == 2) {
                ((C106053i) axVar2.f296006d.mo56107c()).mo95271d(str, false);
            }
        }
    }
}
