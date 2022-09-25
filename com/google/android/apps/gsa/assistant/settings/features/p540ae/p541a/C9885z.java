package com.google.android.apps.gsa.assistant.settings.features.p540ae.p541a;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.gsa.assistant.settings.p516d.C9525a;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.cache.C46407v;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46728bl;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3861at.C50267qt;
import com.google.assistant.p3861at.C50268qu;
import com.google.assistant.p3861at.C50282rh;
import com.google.assistant.p3861at.C50283ri;
import com.google.assistant.p3861at.C50284rj;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.a.z */
/* compiled from: PG */
public final class C9885z implements C9861b {

    /* renamed from: f */
    public static final /* synthetic */ int f33925f = 0;

    /* renamed from: g */
    private static final C58495hd f33926g;

    /* renamed from: b */
    public final C9525a f33927b;

    /* renamed from: c */
    public final Context f33928c;

    /* renamed from: d */
    public final C46723bg f33929d;

    /* renamed from: e */
    public final C50282rh f33930e;

    /* renamed from: h */
    private final h f33931h;

    /* renamed from: i */
    private final Set f33932i;

    /* renamed from: j */
    private final C46128f f33933j;

    /* renamed from: k */
    private final C46778cv f33934k;

    /* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.a.z$a */
    /* compiled from: PG */
    public interface C9886a {
        /* renamed from: d */
        C46407v mo18091d();

        /* renamed from: e */
        C46728bl mo18092e();
    }

    static {
        C58490gz j = C58495hd.m89896j(15);
        j.mo55429h("customize_assistant_title", Integer.valueOf(R.string.customize_assistant_title));
        j.mo55429h("access_your_assistant_title", Integer.valueOf(R.string.access_your_assistant_title));
        j.mo55429h("access_your_assistant_link_subtitle", Integer.valueOf(R.string.access_your_assistant_link_subtitle));
        j.mo55429h("access_your_assistant_page_subtitle", Integer.valueOf(R.string.access_your_assistant_page_subtitle));
        j.mo55429h("your_information_title", Integer.valueOf(R.string.your_information_title));
        j.mo55429h("your_information_link_subtitle", Integer.valueOf(R.string.your_information_link_subtitle));
        j.mo55429h("your_information_page_subtitle", Integer.valueOf(R.string.your_information_page_subtitle));
        j.mo55429h("assistant_features_title", Integer.valueOf(R.string.assistant_features_title));
        j.mo55429h("home_and_family_title", Integer.valueOf(R.string.home_and_family_title));
        j.mo55429h("home_and_family_link_subtitle", Integer.valueOf(R.string.home_and_family_link_subtitle));
        j.mo55429h("home_and_family_page_subtitle", Integer.valueOf(R.string.home_and_family_page_subtitle));
        j.mo55429h("manage_apps_title", Integer.valueOf(R.string.manage_apps_title));
        j.mo55429h("preferred_apps_title", Integer.valueOf(R.string.preferred_apps_title));
        j.mo55429h("preferred_apps_link_subtitle", Integer.valueOf(R.string.preferred_apps_link_subtitle));
        j.mo55429h("preferred_apps_page_subtitle", Integer.valueOf(R.string.preferred_apps_page_subtitle));
        f33926g = j.mo55427f(false);
    }

    public C9885z(C9525a aVar, h hVar, Set set, C46128f fVar, Context context, C46778cv cvVar, C46723bg bgVar, C50282rh rhVar) {
        this.f33927b = aVar;
        this.f33931h = hVar;
        this.f33932i = set;
        this.f33933j = fVar;
        this.f33928c = context;
        this.f33934k = cvVar;
        this.f33929d = bgVar;
        this.f33930e = rhVar;
    }

    /* renamed from: a */
    public final C46689ag mo18082a() {
        acu acu = (acu) acv.f128920X.createBuilder();
        C50283ri riVar = (C50283ri) C50284rj.f130766f.createBuilder();
        riVar.mo53389a((Iterable) Collection.EL.stream(this.f33932i).map(C9873n.f33908a).collect(Collectors.toCollection(C9874o.f33909a)));
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        C50284rj rjVar = (C50284rj) riVar.build();
        rjVar.getClass();
        acv.f128931J = rjVar;
        acv.f128946b |= 65536;
        acu.copyOnWrite();
        acv acv2 = (acv) acu.instance;
        acv2.f128945a |= 128;
        acv2.f128952h = true;
        C46128f fVar = this.f33933j;
        String b = this.f33931h.b();
        b.getClass();
        C60870cx c = fVar.mo50216c(b);
        C9882w wVar = new C9882w(this, C60922j.m93044g(c, C47810es.m84963c(new C9862c(this)), C60826bg.f164896a), (acv) acu.build());
        return new C9884y(this, C60922j.m93044g(C60922j.m93044g(c, C47810es.m84963c(new C9868i(this)), C60826bg.f164896a), C47810es.m84963c(new C9869j(wVar)), C60826bg.f164896a), wVar);
    }

    /* renamed from: b */
    public final void mo18083b() {
        this.f33934k.mo50788b(C60866ct.f164955a, f33894a);
    }

    /* renamed from: c */
    public final C50268qu mo18089c(C58495hd hdVar, C50268qu quVar) {
        C50267qt qtVar = (C50267qt) C50268qu.f130720e.createBuilder(quVar);
        String d = mo18090d(quVar.f130723b);
        qtVar.copyOnWrite();
        C50268qu quVar2 = (C50268qu) qtVar.instance;
        d.getClass();
        quVar2.f130722a |= 1;
        quVar2.f130723b = d;
        String d2 = mo18090d(quVar.f130724c);
        qtVar.copyOnWrite();
        C50268qu quVar3 = (C50268qu) qtVar.instance;
        d2.getClass();
        quVar3.f130722a |= 2;
        quVar3.f130724c = d2;
        qtVar.copyOnWrite();
        ((C50268qu) qtVar.instance).f130725d = C50268qu.emptyProtobufList();
        Iterable iterable = (Iterable) Collection.EL.stream(quVar.f130725d).filter(C9870k.f33904a).map(new C9871l(this, hdVar)).filter(C9872m.f33907a).collect(C58370cn.f155946a);
        qtVar.copyOnWrite();
        C50268qu quVar4 = (C50268qu) qtVar.instance;
        C62971cq cqVar = quVar4.f130725d;
        if (!cqVar.mo58948c()) {
            quVar4.f130725d = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) quVar4.f130725d);
        return (C50268qu) qtVar.build();
    }

    /* renamed from: d */
    public final String mo18090d(String str) {
        Resources resources = this.f33928c.getResources();
        int intValue = ((Integer) f33926g.getOrDefault(str, 0)).intValue();
        if (intValue == 0) {
            return str;
        }
        return resources.getString(intValue);
    }
}
