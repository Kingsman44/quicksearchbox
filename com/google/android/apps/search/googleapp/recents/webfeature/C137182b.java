package com.google.android.apps.search.googleapp.recents.webfeature;

import android.graphics.Bitmap;
import android.net.Uri;
import android.support.p031v4.app.Fragment;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10535w.C139856b;
import com.google.android.apps.search.googleapp.recents.C137170d;
import com.google.android.apps.search.googleapp.recents.C137177k;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.account.data.p3613b.C46180e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58837ba;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.googleapp.recents.webfeature.b */
/* compiled from: PG */
public final /* synthetic */ class C137182b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C137183c f373284a;

    /* renamed from: b */
    public final /* synthetic */ C43376u f373285b;

    public /* synthetic */ C137182b(C137183c cVar, C43376u uVar) {
        this.f373284a = cVar;
        this.f373285b = uVar;
    }

    public final C60870cx apply(Object obj) {
        Bitmap bitmap;
        C137183c cVar = this.f373284a;
        C43376u uVar = this.f373285b;
        C46108a aVar = (C46108a) obj;
        if (!cVar.f373288b || aVar.mo50210b().f121165j.equals("pseudonymous") || C46180e.m82417b(aVar)) {
            return C60866ct.f164955a;
        }
        Uri parse = Uri.parse(uVar.f113329b);
        String b = cVar.f373289c.mo113396b(parse);
        if (b == null) {
            return C60866ct.f164955a;
        }
        Fragment fragment = cVar.f373290d;
        if (fragment == null) {
            bitmap = null;
        } else {
            bitmap = C139856b.m227400a(fragment);
        }
        Bitmap bitmap2 = bitmap;
        String host = parse.getHost();
        String g = parse.isHierarchical() ? C58837ba.m90858g(parse.getQueryParameter("tbm")) : BuildConfig.FLAVOR;
        C137177k kVar = cVar.f373287a;
        if (!kVar.f373270d || host == null) {
            return C60866ct.f164955a;
        }
        return C60922j.m93045h(kVar.f373274h.mo103980a(), C47810es.m84966f(new C137170d(kVar, bitmap2, b, g, host)), kVar.f373272f);
    }
}
