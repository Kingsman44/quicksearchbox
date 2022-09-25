package com.google.android.apps.gsa.staticplugins.opa.appactions.p8292e;

import android.content.Intent;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protos.p4985f.p5042u.C65358t;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.e.d */
/* compiled from: PG */
public final /* synthetic */ class C107301d implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C107304g f298625a;

    /* renamed from: b */
    public final /* synthetic */ C65358t f298626b;

    /* renamed from: c */
    public final /* synthetic */ String f298627c;

    /* renamed from: d */
    public final /* synthetic */ Intent f298628d;

    public /* synthetic */ C107301d(C107304g gVar, C65358t tVar, String str, Intent intent) {
        this.f298625a = gVar;
        this.f298626b = tVar;
        this.f298627c = str;
        this.f298628d = intent;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C107304g gVar = this.f298625a;
        C65358t tVar = this.f298626b;
        String str = this.f298627c;
        Intent intent = this.f298628d;
        if (gVar.f298635c == null) {
            gVar.f298635c = new C107303f(gVar, tVar, str);
        }
        if (gVar.f298634b.bindService(intent, gVar.f298635c, 1)) {
            return C60866ct.f164955a;
        }
        return C60856cj.m92898g();
    }
}
