package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122419bk;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122445cj;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122454i;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122461p;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.p9283a.C122594e;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9287d.p9288a.C122811k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e.C122859d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.dw */
/* compiled from: PG */
public final /* synthetic */ class C122851dw implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C122870ea f340266a;

    /* renamed from: b */
    public final /* synthetic */ C122461p f340267b;

    /* renamed from: c */
    public final /* synthetic */ C122419bk f340268c;

    /* renamed from: d */
    public final /* synthetic */ C52091ex f340269d;

    /* renamed from: e */
    public final /* synthetic */ C122454i f340270e;

    /* renamed from: f */
    public final /* synthetic */ C122859d f340271f;

    /* renamed from: g */
    public final /* synthetic */ C122811k f340272g;

    public /* synthetic */ C122851dw(C122870ea eaVar, C122461p pVar, C122419bk bkVar, C52091ex exVar, C122811k kVar, C122454i iVar, C122859d dVar) {
        this.f340266a = eaVar;
        this.f340267b = pVar;
        this.f340268c = bkVar;
        this.f340269d = exVar;
        this.f340272g = kVar;
        this.f340270e = iVar;
        this.f340271f = dVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar;
        C122870ea eaVar = this.f340266a;
        C122461p pVar = this.f340267b;
        C122419bk bkVar = this.f340268c;
        C52091ex exVar = this.f340269d;
        C122811k kVar = this.f340272g;
        C122454i iVar = this.f340270e;
        C122859d dVar = this.f340271f;
        C122594e eVar = eaVar.f340306g;
        boolean z = eaVar.f340313n;
        if (pVar.f339490b != 1) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        String str = ((C122445cj) pVar.f339491c).f339452a;
        if (bkVar.f339403j || z) {
            cxVar = C60856cj.m92900i(C58485gu.m89845m());
        } else {
            cxVar = C47633f.m84733g(kVar.mo105753b()).mo51516i(new C122837di(str, bkVar, exVar), C60826bg.f164896a).mo51513e(Throwable.class, new C122838dj(dVar), C60826bg.f164896a);
        }
        C122839dk dkVar = new C122839dk(eVar, str, iVar, bkVar);
        return C60922j.m93044g(cxVar, C47810es.m84963c(dkVar), C60826bg.f164896a);
    }
}
