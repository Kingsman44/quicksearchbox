package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.bumptech.glide.p282c.p283a.C5528f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.proactive.C36201a;
import com.google.android.libraries.search.assistant.proactive.C36334o;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.abc;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p3717aq.p3718a.p3719a.C47878l;
import com.google.p3717aq.p3718a.p3719a.C47887u;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.by */
/* compiled from: PG */
public final /* synthetic */ class C114433by implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C114464db f317296a;

    /* renamed from: b */
    public final /* synthetic */ int f317297b;

    /* renamed from: c */
    public final /* synthetic */ aas f317298c;

    /* renamed from: d */
    public final /* synthetic */ C36334o f317299d;

    public /* synthetic */ C114433by(C114464db dbVar, int i, aas aas, C36334o oVar) {
        this.f317296a = dbVar;
        this.f317297b = i;
        this.f317298c = aas;
        this.f317299d = oVar;
    }

    public final C60870cx apply(Object obj) {
        Object obj2;
        C60870cx cxVar;
        int i;
        C114464db dbVar = this.f317296a;
        int i2 = this.f317297b;
        aas aas = this.f317298c;
        C36334o oVar = this.f317299d;
        C36201a aVar = (C36201a) obj;
        if (dbVar.f317379E.f94590h) {
            return dbVar.f317386g.mo40104b(i2, aas, oVar, aVar);
        }
        C114388aj ajVar = dbVar.f317385f;
        C62940bt r0 = C62942bv.checkIsLite(abc.f134692p);
        aas.mo58887l(r0);
        Object l = aas.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj2 = r0.f169969b;
        } else {
            obj2 = r0.mo58889c(l);
        }
        abc abc = (abc) obj2;
        if ((abc.f134694a & 2) == 0) {
            return C60856cj.m92899h(new IllegalArgumentException("Unable to render notification without preview."));
        }
        C47887u uVar = abc.f134698e;
        if (uVar == null) {
            uVar = C47887u.f123976l;
        }
        C60870cx a = ajVar.f317177c.mo28201a("Build notification", new C114386ah(ajVar, aas, oVar, uVar, abc, i2, aVar));
        int i3 = uVar.f123982e;
        if (i3 == 8) {
            String str = (String) uVar.f123983f;
            if (str.isEmpty()) {
                cxVar = C60856cj.m92900i(BitmapFactory.decodeResource(ajVar.f317176b.getResources(), R.drawable.logo_assistant_notifications_48));
            } else {
                cxVar = C5528f.m14300b(C5528f.m14299a(ajVar.f317178d.mo51286a().mo11864b().mo12445g(Uri.parse(str))));
            }
        } else if (i3 == 20) {
            Resources resources = ajVar.f317176b.getResources();
            if (uVar.f123982e == 20) {
                i = C47878l.m85095a(((Integer) uVar.f123983f).intValue());
                if (i == 0) {
                    i = 1;
                }
            } else {
                i = 2;
            }
            cxVar = C60856cj.m92900i(BitmapFactory.decodeResource(resources, C114388aj.m189694e(i)));
        } else {
            cxVar = C60856cj.m92900i(BitmapFactory.decodeResource(ajVar.f317176b.getResources(), C114388aj.m189694e(2)));
        }
        C60870cx cxVar2 = cxVar;
        return C60856cj.m92893b(a, cxVar2).mo57334a(C47810es.m84978r(new C114387ai(ajVar, a, uVar, cxVar2, aas)), C60826bg.f164896a);
    }
}
