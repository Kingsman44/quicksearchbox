package com.google.android.apps.search.googleapp.search.p10415i;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.web.base.C43257h;
import com.google.android.libraries.web.profile.Profile;
import com.google.common.p4522b.C58331bb;
import com.google.common.util.concurrent.C60801ai;
import com.google.common.util.concurrent.C60812at;
import com.google.common.util.concurrent.C60817ay;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.search.googleapp.search.i.y */
/* compiled from: PG */
public final /* synthetic */ class C137523y implements C60801ai {

    /* renamed from: a */
    public final /* synthetic */ C137485ae f374046a;

    /* renamed from: b */
    public final /* synthetic */ Profile f374047b;

    public /* synthetic */ C137523y(C137485ae aeVar, Profile profile) {
        this.f374046a = aeVar;
        this.f374047b = profile;
    }

    /* renamed from: a */
    public final C60817ay mo20982a(C60812at atVar, Object obj) {
        String queryParameter;
        C137485ae aeVar = this.f374046a;
        Profile profile = this.f374047b;
        C43257h hVar = (C43257h) obj;
        hVar.getClass();
        if (TextUtils.isEmpty(Uri.parse(hVar.mo46356f()).getQueryParameter("pf"))) {
            throw new Exception("Provided URL did not have pf=i, not prefetching.");
        } else if (aeVar.f373943f || (queryParameter = Uri.parse(hVar.mo46356f()).getQueryParameter("tbm")) == null || !queryParameter.equals("isch")) {
            C58331bb bbVar = new C58331bb();
            Map.EL.forEach(hVar.mo46353d(), new C137481aa(bbVar));
            return ((C137508j) aeVar.f373940c).mo113788a(hVar.mo46356f(), bbVar, 0, profile);
        } else {
            throw new Exception("Provided URL has tbm=isch, not prefetching.");
        }
    }
}
