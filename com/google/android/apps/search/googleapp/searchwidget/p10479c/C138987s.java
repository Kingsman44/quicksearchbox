package com.google.android.apps.search.googleapp.searchwidget.p10479c;

import android.net.Uri;
import android.text.TextUtils;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.p337aa.C6617d;
import com.google.p337aa.p338a.C6610l;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.c.s */
/* compiled from: PG */
public final /* synthetic */ class C138987s implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C138990v f377980a;

    public /* synthetic */ C138987s(C138990v vVar) {
        this.f377980a = vVar;
    }

    public final C60870cx apply(Object obj) {
        C138990v vVar = this.f377980a;
        C6617d dVar = (C6617d) obj;
        C6610l lVar = dVar.f19672v;
        if (lVar == null) {
            lVar = C6610l.f19630i;
        }
        if ((lVar.f19632a & 1) == 0) {
            return vVar.mo114648a();
        }
        C60870cx d = vVar.f377986b.mo46042d();
        C138989u uVar = C138989u.f377984a;
        C60870cx g = C60922j.m93044g(d, C47810es.m84963c(uVar), vVar.f377989e);
        C6610l lVar2 = dVar.f19672v;
        if (lVar2 == null) {
            lVar2 = C6610l.f19630i;
        }
        String str = lVar2.f19633b;
        if (!Uri.parse(str).isAbsolute()) {
            str = TextUtils.concat(new CharSequence[]{"https://www.google.com", str}).toString();
        }
        C138984p pVar = new C138984p(vVar, str, dVar);
        return C60922j.m93045h(g, C47810es.m84966f(pVar), vVar.f377989e);
    }
}
