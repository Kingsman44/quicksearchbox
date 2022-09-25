package com.google.android.apps.gsa.staticplugins.p7850dq.p7853c;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6530ae.C84670h;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.logger.C89839b;
import com.google.android.apps.gsa.shared.monet.p7116h.C90332a;
import com.google.android.apps.gsa.shared.monet.p7116h.C90334c;
import com.google.android.apps.gsa.shared.p7066m.C90125fw;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.assistant.p3897e.p3921j.C52170hv;
import com.google.assistant.p3897e.p3921j.C52171hw;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.assistant.p3897e.p3921j.C52563wj;
import com.google.assistant.p3897e.p3921j.C52567wn;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.assistant.p3897e.p3921j.C52575wv;
import com.google.assistant.p3897e.p3921j.C52577wx;
import com.google.assistant.p3897e.p3921j.C52579wz;
import com.google.assistant.p3897e.p3921j.C52582xb;
import com.google.assistant.p3897e.p3921j.C52583xc;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.dq.c.a */
/* compiled from: PG */
public final class C99959a extends C86734a implements C84670h {

    /* renamed from: a */
    private static final C59071e f279616a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.dq.c.a");

    /* renamed from: b */
    private static final Intent f279617b = new Intent("android.intent.action.VIEW", Uri.parse("https://www.google.com"));

    /* renamed from: c */
    private final C91097g f279618c;

    /* renamed from: f */
    private final C86124t f279619f;

    public C99959a(C91097g gVar, C86124t tVar) {
        super(C118575h.WORKER_DEEPLINK, "speakrdeeplink");
        this.f279618c = gVar;
        this.f279619f = tVar;
    }

    /* renamed from: c */
    private static final void m165630c(boolean z) {
        C89839b.m146269a(z, 737, z ? 0 : 2);
    }

    /* renamed from: a */
    public final void mo78408a(Uri uri) {
        if (!this.f279619f.mo79746e(C90125fw.f250931j)) {
            Intent addCategory = new Intent("android.intent.action.VIEW", uri).addCategory("android.intent.category.APP_BROWSER").addCategory("android.intent.category.DEFAULT");
            addCategory.setSelector(f279617b);
            this.f279618c.mo65089a(addCategory);
            m165630c(true);
            return;
        }
        String queryParameter = uri.getQueryParameter("url");
        int i = 0;
        if (queryParameter == null) {
            C59104x c = f279616a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SpeakrDeeplinkWork");
            ((C59052c) ((C59052c) c).mo56372aa(33158)).mo56389s("No url given in deeplink %s.", uri);
            m165630c(false);
            return;
        }
        Uri parse = Uri.parse(queryParameter);
        try {
            i = Integer.parseInt((String) C58833ax.m90833j(uri.getQueryParameter("par")).mo56109e("0"));
        } catch (NumberFormatException e) {
            C59104x d = f279616a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SpeakrDeeplinkWork");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(33157)).mo56389s("Received invalid paragarph index in deeplink %s", uri);
        }
        C23129y yVar = new C23129y("opamediaplayer", "root");
        C52170hv hvVar = (C52170hv) C52176ia.f136911k.createBuilder();
        C52171hw hwVar = (C52171hw) C52174hz.f136892m.createBuilder();
        String uri2 = parse.toString();
        hwVar.copyOnWrite();
        C52174hz hzVar = (C52174hz) hwVar.instance;
        uri2.getClass();
        hzVar.f136894a |= 1;
        hzVar.f136895b = uri2;
        C52563wj wjVar = (C52563wj) C52568wo.f137992v.createBuilder();
        C52567wn wnVar = C52567wn.NARRATED_WEB;
        wjVar.copyOnWrite();
        C52568wo woVar = (C52568wo) wjVar.instance;
        woVar.f138003j = wnVar.f137991y;
        woVar.f137994a |= 512;
        C52575wv wvVar = (C52575wv) C52583xc.f138063o.createBuilder();
        wvVar.copyOnWrite();
        C52583xc xcVar = (C52583xc) wvVar.instance;
        xcVar.f138065a |= 2;
        xcVar.f138067c = i;
        C52579wz wzVar = C52579wz.UNREAD;
        wvVar.copyOnWrite();
        C52583xc xcVar2 = (C52583xc) wvVar.instance;
        xcVar2.f138066b = wzVar.f138049f;
        xcVar2.f138065a |= 1;
        C52577wx wxVar = C52577wx.READ_IT_NOW_SINGLE;
        wvVar.copyOnWrite();
        C52583xc xcVar3 = (C52583xc) wvVar.instance;
        xcVar3.f138069e = wxVar.f138041e;
        xcVar3.f138065a |= 8;
        C52582xb xbVar = C52582xb.DEEPLINK;
        wvVar.copyOnWrite();
        C52583xc xcVar4 = (C52583xc) wvVar.instance;
        xcVar4.f138076l = xbVar.f138062i;
        xcVar4.f138065a |= 1024;
        wjVar.copyOnWrite();
        C52568wo woVar2 = (C52568wo) wjVar.instance;
        C52583xc xcVar5 = (C52583xc) wvVar.build();
        xcVar5.getClass();
        woVar2.f137997d = xcVar5;
        woVar2.f137996c = 26;
        hwVar.copyOnWrite();
        C52174hz hzVar2 = (C52174hz) hwVar.instance;
        C52568wo woVar3 = (C52568wo) wjVar.build();
        woVar3.getClass();
        hzVar2.f136897d = woVar3;
        hzVar2.f136894a |= 8;
        hvVar.mo53807c(hwVar);
        this.f279618c.mo65089a(C90334c.m146886a(C90332a.DEFAULT.f252281i, yVar, C23245b.m43556a((C52176ia) hvVar.build())));
        m165630c(true);
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
