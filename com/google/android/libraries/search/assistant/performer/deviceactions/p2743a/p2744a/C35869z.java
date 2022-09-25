package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35932a;
import com.google.apps.tiktok.dataservice.C46740bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3897e.p3921j.C52098fd;
import com.google.assistant.p3897e.p3921j.C52099fe;
import com.google.assistant.p3897e.p3921j.C52103fi;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.z */
/* compiled from: PG */
public final /* synthetic */ class C35869z implements Function {

    /* renamed from: a */
    public final /* synthetic */ C35817af f93982a;

    /* renamed from: b */
    public final /* synthetic */ String f93983b;

    /* renamed from: c */
    public final /* synthetic */ C52098fd f93984c;

    public /* synthetic */ C35869z(C35817af afVar, String str, C52098fd fdVar) {
        this.f93982a = afVar;
        this.f93983b = str;
        this.f93984c = fdVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C60870cx cxVar;
        C60870cx cxVar2;
        C35817af afVar = this.f93982a;
        String str = this.f93983b;
        C52098fd fdVar = this.f93984c;
        String str2 = (String) obj;
        C58976aa aaVar = C58975e.f156826a;
        C35932a.m64316a(afVar.f93843e, str);
        C52099fe feVar = (C52099fe) C52103fi.f136729i.createBuilder();
        C35862s a = afVar.f93841c.mo39871a(str2);
        C60870cx b = a.mo39869b();
        Uri c = C35864u.m64261c(a.f93955c);
        if (c == null) {
            ((C59052c) ((C59052c) C35862s.f93953a.mo56226d()).mo56372aa(51874)).mo56386p("Null uri when querying setting intent.");
            cxVar = C60856cj.m92900i(BuildConfig.FLAVOR);
        } else {
            cxVar = C60846c.m92878g(a.mo39868a(c).f121591a.mo57272e(C47810es.m84970j(new C35846c(a)), a.f93956d).mo57275g(), C46740bx.class, C35847d.f93937a, C60826bg.f164896a);
        }
        C60870cx cxVar3 = cxVar;
        Uri c2 = C35864u.m64261c(a.f93955c);
        if (c2 == null) {
            ((C59052c) ((C59052c) C35862s.f93953a.mo56226d()).mo56372aa(51869)).mo56386p("Null uri when query dependent setting Id");
            cxVar2 = C60856cj.m92900i(Optional.empty());
        } else {
            cxVar2 = C60846c.m92878g(a.mo39868a(c2).f121591a.mo57272e(C47810es.m84970j(new C35850g(a)), a.f93956d).mo57275g(), C46740bx.class, new C35852i(a), C60826bg.f164896a);
        }
        C60870cx cxVar4 = cxVar2;
        return C47633f.m84733g(C47638k.m84751b(b, cxVar3, cxVar4).mo51520a(C47810es.m84978r(new C35813ab(b, cxVar3, cxVar4, a, feVar, str2)), afVar.f93842d)).mo51516i(new C35867x(afVar, feVar), afVar.f93842d).mo51515h(new C35868y(afVar, fdVar, str, feVar), afVar.f93842d);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
