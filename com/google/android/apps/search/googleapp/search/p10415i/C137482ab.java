package com.google.android.apps.search.googleapp.search.p10415i;

import android.net.Uri;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.search.p10415i.p10417b.C137494a;
import com.google.android.apps.search.googleapp.search.p10415i.p10417b.C137495b;
import com.google.android.apps.search.googleapp.search.p10415i.p10417b.C137496c;
import com.google.android.apps.search.googleapp.search.p10415i.p10417b.C137498e;
import com.google.android.apps.search.googleapp.search.p10415i.p10417b.C137500g;
import com.google.android.gms.droidguard.C144112b;
import com.google.android.libraries.web.profile.Profile;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58819aj;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58487gw;
import com.google.common.p4522b.C58585km;
import com.google.common.util.concurrent.C60801ai;
import com.google.common.util.concurrent.C60812at;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.search.googleapp.search.i.ab */
/* compiled from: PG */
public final /* synthetic */ class C137482ab implements C60801ai {

    /* renamed from: a */
    public final /* synthetic */ C137485ae f373929a;

    /* renamed from: b */
    public final /* synthetic */ Uri f373930b;

    /* renamed from: c */
    public final /* synthetic */ C58585km f373931c;

    /* renamed from: d */
    public final /* synthetic */ Profile f373932d;

    public /* synthetic */ C137482ab(C137485ae aeVar, Uri uri, C58585km kmVar, Profile profile) {
        this.f373929a = aeVar;
        this.f373930b = uri;
        this.f373931c = kmVar;
        this.f373932d = profile;
    }

    /* renamed from: a */
    public final C60817ay mo20982a(C60812at atVar, Object obj) {
        C47633f fVar;
        C60870cx cxVar;
        C137485ae aeVar = this.f373929a;
        Uri uri = this.f373930b;
        C58585km kmVar = this.f373931c;
        Profile profile = this.f373932d;
        C137514p pVar = (C137514p) obj;
        C137500g gVar = aeVar.f373944g;
        pVar.getClass();
        String uri2 = C137485ae.m223378a(uri).toString();
        if (gVar.f373982i) {
            C58487gw gwVar = pVar.f374020a;
            if (gwVar.map.containsKey(C137500g.f373974a)) {
                C58485gu b = pVar.f374020a.mo55277g(C137500g.f373974a);
                if (b.isEmpty()) {
                    return new C60817ay(C47633f.m84733g(C60856cj.m92900i(pVar)));
                }
                String str = (String) b.get(0);
                synchronized (gVar.f373985l) {
                    if (TextUtils.equals(str, gVar.f373988o)) {
                        fVar = C47633f.m84733g(C60856cj.m92900i(BuildConfig.FLAVOR));
                    } else {
                        synchronized (gVar.f373985l) {
                            C144112b bVar = gVar.f373987n;
                            if (bVar == null || !bVar.mo119659b()) {
                                if (gVar.f373986m == null) {
                                    gVar.f373986m = gVar.f373979f.mo19399b(C47810es.m84978r(new C137496c(gVar)));
                                }
                                cxVar = gVar.f373986m;
                            } else {
                                cxVar = C47633f.m84733g(C60856cj.m92900i(gVar.f373987n));
                            }
                        }
                        fVar = C47633f.m84733g(cxVar).mo51517j(C137500g.f373977d.longValue(), TimeUnit.MILLISECONDS, gVar.f373979f).mo51515h(new C137498e(gVar, str), gVar.f373980g).mo51513e(Exception.class, new C58819aj(BuildConfig.FLAVOR), gVar.f373980g);
                    }
                }
                return new C60817ay(fVar).mo57273f(C47810es.m84968h(new C137494a(gVar, pVar, uri2, kmVar, str)), gVar.f373980g).mo57273f(C47810es.m84968h(new C137495b(gVar, profile, uri2)), gVar.f373980g);
            }
        }
        return new C60817ay(C47633f.m84733g(C60856cj.m92900i(pVar)));
    }
}
