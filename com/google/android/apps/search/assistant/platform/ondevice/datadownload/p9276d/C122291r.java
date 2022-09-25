package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17036ac;
import com.google.android.libraries.mdi.download.C28739bq;
import com.google.android.libraries.mdi.download.C28740br;
import com.google.android.libraries.mdi.download.C29436g;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.r */
/* compiled from: PG */
public final /* synthetic */ class C122291r implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C122297x f339117a;

    /* renamed from: b */
    public final /* synthetic */ String f339118b;

    /* renamed from: c */
    public final /* synthetic */ C122296w f339119c;

    /* renamed from: d */
    public final /* synthetic */ C58833ax f339120d;

    /* renamed from: e */
    public final /* synthetic */ C17036ac f339121e;

    public /* synthetic */ C122291r(C122297x xVar, String str, C122296w wVar, C58833ax axVar, C17036ac acVar) {
        this.f339117a = xVar;
        this.f339118b = str;
        this.f339119c = wVar;
        this.f339120d = axVar;
        this.f339121e = acVar;
    }

    public final C60870cx apply(Object obj) {
        C122297x xVar = this.f339117a;
        String str = this.f339118b;
        C122296w wVar = this.f339119c;
        C58833ax axVar = this.f339120d;
        C17036ac acVar = this.f339121e;
        C58833ax axVar2 = (C58833ax) obj;
        C28739bq m = C28740br.m53599m();
        m.mo34338d(str);
        C122279f fVar = (C122279f) wVar;
        C29436g gVar = (C29436g) m;
        gVar.f79804d = C58833ax.m90834k(fVar.f339067a);
        gVar.f79805e = C58833ax.m90834k(fVar.f339068b);
        m.mo34336b(axVar2);
        gVar.f79806f = axVar;
        gVar.f79810j = 1;
        return C47633f.m84733g(xVar.f339133d.mo105549b(m.mo34335a(), Locale.forLanguageTag(acVar.f49644c))).mo51515h(new C122293t(str, axVar2, acVar), xVar.f339131b);
    }
}
