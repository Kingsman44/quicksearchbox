package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8752b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.core.p6884y.C87290c;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6995aq.C89257aa;
import com.google.android.apps.gsa.shared.p6995aq.C89270m;
import com.google.android.apps.gsa.shared.p6995aq.C89281x;
import com.google.android.apps.gsa.shared.p6995aq.C89282y;
import com.google.android.apps.gsa.shared.p6995aq.C89283z;
import com.google.android.apps.gsa.shared.p7129r.C90461c;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.searchwidget.C117241bi;
import com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8753c.C117093e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protobuf.C62921ba;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.b.t */
/* compiled from: PG */
public final class C117082t extends C23056g {

    /* renamed from: a */
    private final C117093e f325077a;

    /* renamed from: b */
    private final C90465g f325078b;

    /* renamed from: c */
    private final Context f325079c;

    /* renamed from: d */
    private final C91097g f325080d;

    /* renamed from: e */
    private final C117241bi f325081e;

    /* renamed from: f */
    private final C87290c f325082f;

    public C117082t(C23052c cVar, C117093e eVar, C87290c cVar2, C90465g gVar, Context context, C91097g gVar2, C117241bi biVar) {
        super(cVar);
        this.f325080d = gVar2;
        this.f325082f = cVar2;
        this.f325077a = eVar;
        this.f325078b = gVar;
        this.f325079c = context;
        this.f325081e = biVar;
    }

    /* renamed from: N */
    public final void mo28493N(String str, String str2, Parcelable parcelable) {
        if ("CUSTOMIZE".equals(str)) {
            Bundle bundle = (Bundle) parcelable;
            int i = bundle.getInt("WIDGET_BOUNDS_TOP");
            int i2 = bundle.getInt("WIDGET_BOUNDS_BOTTOM");
            int i3 = bundle.getInt("WIDGET_BOUNDS_LEFT");
            int i4 = bundle.getInt("WIDGET_BOUNDS_RIGHT");
            C89281x xVar = (C89281x) C89282y.f242066f.createBuilder();
            xVar.copyOnWrite();
            C89282y yVar = (C89282y) xVar.instance;
            yVar.f242068a |= 4;
            yVar.f242071d = i;
            xVar.copyOnWrite();
            C89282y yVar2 = (C89282y) xVar.instance;
            yVar2.f242068a |= 8;
            yVar2.f242072e = i2;
            xVar.copyOnWrite();
            C89282y yVar3 = (C89282y) xVar.instance;
            yVar3.f242068a |= 1;
            yVar3.f242069b = i3;
            xVar.copyOnWrite();
            C89282y yVar4 = (C89282y) xVar.instance;
            yVar4.f242068a |= 2;
            yVar4.f242070c = i4;
            C89282y yVar5 = (C89282y) xVar.build();
            C89270m mVar = (C89270m) ((C89283z) ((C117072j) this.f325077a).f325042b.f63720e).toBuilder();
            mVar.copyOnWrite();
            C89283z zVar = (C89283z) mVar.instance;
            yVar5.getClass();
            zVar.f242086l = yVar5;
            zVar.f242075a |= C89885b.S3REQUEST_VALUE;
            this.f325080d.mo65089a(C89257aa.m145192d((C89283z) mVar.build(), "more-icon"));
        } else if ("RESET_TO_DEFAULT_STYLE".equals(str)) {
            this.f325081e.mo103216c();
            Intent intent = new Intent("update-widget");
            intent.setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.googlequicksearchbox.SearchWidgetProvider"));
            intent.addFlags(268435456);
            this.f325079c.sendBroadcast(intent);
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 1131;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        } else if ("FEEDBACK".equals(str)) {
            C90461c cVar = new C90461c();
            cVar.f252699k = false;
            cVar.f252707s = R.string.feedback_entrypoint_widget_customization_overlay;
            cVar.f252697i = null;
            this.f325078b.mo84210a(this.f325079c).mo84209b(cVar, 1);
        } else if ("DISMISS".equals(str)) {
            this.f325082f.mo80935a();
        }
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C89283z zVar = (C89283z) C23245b.m43557b(protoParcelable, C89283z.f242073n.getParserForType(), C62921ba.m95368a(), true);
        zVar.getClass();
        ((C117072j) this.f325077a).f325041a.mo28730f(Boolean.valueOf(zVar.f242081g), false);
        ((C117072j) this.f325077a).f325042b.mo28730f(zVar, false);
    }
}
