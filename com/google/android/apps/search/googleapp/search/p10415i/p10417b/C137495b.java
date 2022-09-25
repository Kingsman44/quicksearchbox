package com.google.android.apps.search.googleapp.search.p10415i.p10417b;

import android.text.TextUtils;
import com.google.android.apps.search.googleapp.search.p10415i.C137514p;
import com.google.android.libraries.web.profile.Profile;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60801ai;
import com.google.common.util.concurrent.C60812at;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60856cj;
import com.google.frameworks.client.data.android.C61362ad;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.search.googleapp.search.i.b.b */
/* compiled from: PG */
public final /* synthetic */ class C137495b implements C60801ai {

    /* renamed from: a */
    public final /* synthetic */ C137500g f373966a;

    /* renamed from: b */
    public final /* synthetic */ Profile f373967b;

    /* renamed from: c */
    public final /* synthetic */ String f373968c;

    public /* synthetic */ C137495b(C137500g gVar, Profile profile, String str) {
        this.f373966a = gVar;
        this.f373967b = profile;
        this.f373968c = str;
    }

    /* renamed from: a */
    public final C60817ay mo20982a(C60812at atVar, Object obj) {
        String str;
        int i;
        C137500g gVar = this.f373966a;
        Profile profile = this.f373967b;
        String str2 = this.f373968c;
        C137514p pVar = (C137514p) obj;
        pVar.getClass();
        C58485gu b = pVar.f374020a.mo55277g(C61362ad.m93870b("Set-Cookie"));
        int size = b.size();
        int i2 = 0;
        loop0:
        while (true) {
            if (i2 >= size) {
                str = null;
                break;
            }
            str = (String) b.get(i2);
            Iterator it = C58869cf.m90938d("; ").mo56153g(str).iterator();
            while (true) {
                i = i2 + 1;
                if (!it.hasNext()) {
                    break;
                }
                List i3 = C58869cf.m90936b(new C58903m('=')).mo56155i((String) it.next());
                if (i3.size() == 2 && C137500g.f373976c.contains(i3.get(0))) {
                    break loop0;
                }
            }
            i2 = i;
        }
        if (!TextUtils.isEmpty(str)) {
            return new C60817ay(gVar.f373984k.mo47022b(profile).mo47013b(str2, str)).mo57272e(new C137499f(pVar), gVar.f373980g);
        }
        return new C60817ay(C47633f.m84733g(C60856cj.m92900i(pVar)));
    }
}
