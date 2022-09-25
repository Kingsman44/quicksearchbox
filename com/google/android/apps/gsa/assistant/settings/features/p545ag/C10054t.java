package com.google.android.apps.gsa.assistant.settings.features.p545ag;

import com.google.android.apps.gsa.assistant.settings.features.p545ag.p546a.C9985a;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6332a.C81006b;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.util.permissions.ProxyIntentStarter;
import com.google.android.apps.gsa.shared.util.permissions.p7179a.C91074a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1535p.p1536a.p1538b.C18519g;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.p4527a.C58974d;
import dagger.C68214a;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ag.t */
/* compiled from: PG */
public final class C10054t {

    /* renamed from: a */
    public static final C58974d f34279a = C58974d.m91136j();

    /* renamed from: b */
    public static final C58528ij f34280b = C58528ij.m90013M(C79570b.CALL_CONTACT, C79570b.CALL_NUMBER, C79570b.CALL_CONTACT_V2, C79570b.CALL_NUMBER_V2);

    /* renamed from: c */
    public static final C10053s f34281c;

    /* renamed from: d */
    public static final C10053s f34282d;

    /* renamed from: e */
    static final C58495hd f34283e;

    /* renamed from: f */
    public final C90021c f34284f;

    /* renamed from: g */
    public final C28443m f34285g;

    /* renamed from: h */
    public final C46801dp f34286h;

    /* renamed from: i */
    public final C28306ab f34287i;

    /* renamed from: j */
    public final C28310af f34288j;

    /* renamed from: k */
    public final C9985a f34289k;

    /* renamed from: l */
    public final C10041g f34290l;

    /* renamed from: m */
    public final C18519g f34291m;

    /* renamed from: n */
    public final C91074a f34292n;

    /* renamed from: o */
    public final ProxyIntentStarter f34293o;

    /* renamed from: p */
    public final C68214a f34294p;

    /* renamed from: q */
    public C58485gu f34295q = C58485gu.m89845m();

    /* renamed from: r */
    private final C81006b f34296r;

    static {
        C9984a aVar = new C9984a(C58528ij.m90011K(C79570b.CALL_CONTACT, C79570b.CALL_NUMBER), R.id.guacamole_settings_call_enabled, R.string.guacamole_settings_call_enabled_subtitle, 127338);
        f34281c = aVar;
        C9984a aVar2 = new C9984a(C58528ij.m90011K(C79570b.CALL_CONTACT_V2, C79570b.CALL_NUMBER_V2), R.id.guacamole_settings_call_v2_enabled, R.string.guacamole_settings_call_v2_enabled_subtitle, 127338);
        f34282d = aVar2;
        f34283e = C58495hd.m89905s(C58528ij.m90011K(C79570b.ALARM, C79570b.TIMER), new C9984a(C58528ij.m90011K(C79570b.ALARM, C79570b.TIMER), R.id.guacamole_settings_alarm_timer_enabled, R.string.guacamole_settings_alarm_timer_enabled_subtitle, 127337), C58528ij.m90011K(C79570b.CALL_CONTACT, C79570b.CALL_NUMBER), aVar, C58528ij.m90011K(C79570b.CALL_CONTACT_V2, C79570b.CALL_NUMBER_V2), aVar2, new C58759qy(C79570b.SYSUI_NOTIFICATION), new C9984a(new C58759qy(C79570b.SYSUI_NOTIFICATION), R.id.guacamole_settings_other_enabled, R.string.guacamole_settings_other_enabled_subtitle, 138193), new C58759qy(C79570b.GRPC), new C9984a(new C58759qy(C79570b.GRPC), R.id.guacamole_settings_other2_enabled, R.string.guacamole_settings_other_enabled_subtitle, -1), new C58759qy(C79570b.MEDIA), new C9984a(new C58759qy(C79570b.MEDIA), R.id.guacamole_settings_goat_teleporter_enabled, R.string.guacamole_settings_goat_teleporter_enabled_subtitle, -2));
    }

    public C10054t(C90021c cVar, C28443m mVar, C46801dp dpVar, C28306ab abVar, C28310af afVar, C9985a aVar, C10041g gVar, C81006b bVar, C18519g gVar2, C91074a aVar2, ProxyIntentStarter proxyIntentStarter, C68214a aVar3) {
        this.f34284f = cVar;
        this.f34285g = mVar;
        this.f34286h = dpVar;
        this.f34287i = abVar;
        this.f34288j = afVar;
        this.f34289k = aVar;
        this.f34290l = gVar;
        this.f34296r = bVar;
        this.f34291m = gVar2;
        this.f34292n = aVar2;
        this.f34293o = proxyIntentStarter;
        this.f34294p = aVar3;
    }

    /* renamed from: a */
    public static C10041g m24847a(C18519g gVar) {
        C10041g gVar2 = new C10041g();
        C68324h.m98669f(gVar2);
        C47243l.m84039a(gVar2, gVar);
        return gVar2;
    }

    /* renamed from: b */
    public final C58528ij mo18210b() {
        C58528ij c = this.f34296r.mo74778c();
        C58526ih ihVar = new C58526ih();
        ihVar.mo55489i(c);
        ihVar.mo55489i((C58528ij) Collection.EL.stream(f34283e.values()).filter(new C10043i(c)).map(C10044j.f34267a).flatMap(C10045k.f34268a).collect(C58370cn.f155947b));
        return ihVar.mo55486f();
    }

    /* renamed from: c */
    public final void mo18211c(java.util.Collection collection, boolean z) {
        this.f34289k.mo18175a((C58528ij) Collection.EL.stream(collection).map(C10044j.f34267a).flatMap(C10045k.f34268a).collect(C58370cn.f155947b), z);
    }
}
