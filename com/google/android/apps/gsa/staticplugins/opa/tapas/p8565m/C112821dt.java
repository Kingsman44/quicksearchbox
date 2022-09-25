package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.content.Context;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112694be;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113188cs;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113342cm;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113367dh;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113427g;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3781ad.p3789d.C48578al;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protos.p4985f.p5046x.C65379d;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.dt */
/* compiled from: PG */
public final class C112821dt implements C113342cm {

    /* renamed from: d */
    private static final C59071e f312691d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.m.dt");

    /* renamed from: a */
    public final C112880fy f312692a;

    /* renamed from: b */
    public final C113367dh f312693b;

    /* renamed from: c */
    public final C112694be f312694c;

    /* renamed from: e */
    private final Context f312695e;

    /* renamed from: f */
    private final int f312696f;

    /* renamed from: g */
    private final String f312697g;

    /* renamed from: h */
    private final String f312698h;

    /* renamed from: i */
    private final C113188cs f312699i;

    public C112821dt(Context context, C112880fy fyVar, C113367dh dhVar, C112694be beVar, C113188cs csVar) {
        this.f312695e = context;
        this.f312696f = C1878d.m5128a(context, R.color.tapas_personalized_query_text_matching);
        this.f312697g = context.getString(R.string.tapas_media_artist_subtitle_prefix);
        this.f312698h = context.getString(R.string.tapas_media_artists_delimiter);
        this.f312692a = fyVar;
        this.f312693b = dhVar;
        this.f312694c = beVar;
        this.f312699i = csVar;
    }

    /* renamed from: a */
    public final int mo99713a() {
        return R.layout.media_query;
    }

    /* renamed from: b */
    public final int mo99684b(C113415ez ezVar) {
        return 105503;
    }

    /* renamed from: c */
    public final C0673gh mo99714c(View view) {
        return new C112820ds(view);
    }

    /* renamed from: d */
    public final /* synthetic */ Optional mo99715d(C113415ez ezVar) {
        return Optional.empty();
    }

    /* renamed from: e */
    public final /* synthetic */ Optional mo99716e(C0673gh ghVar) {
        return Optional.empty();
    }

    /* renamed from: f */
    public final void mo99685f(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        if (ezVar.mo100192E().isEmpty()) {
            C59104x d = f312691d.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MediaQueryRndr");
            ((C59052c) ((C59052c) d).mo56372aa(27804)).mo56386p("Not handling click because we are missing crucial info.");
            return;
        }
        String str = ((C65379d) ezVar.mo100192E().get()).f177779b;
        this.f312692a.mo99775c((String) ezVar.mo100195H().flatMap(C112815dn.f312683a).filter(C112816do.f312684a).map(C112817dp.f312685a).orElse(str), esVar, ezVar, 7);
    }

    /* renamed from: g */
    public final void mo99717g(C113415ez ezVar, View view) {
        this.f312692a.mo99774b(ezVar, view);
    }

    /* renamed from: h */
    public final void mo99686h(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        String str;
        if (ezVar.mo100192E().isEmpty() || ezVar.mo100195H().isEmpty()) {
            C59104x d = f312691d.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MediaQueryRndr");
            ((C59052c) ((C59052c) d).mo56372aa(27805)).mo56386p("Not rendering media query because we are missing crucial info.");
            ghVar.itemView.setVisibility(8);
            return;
        }
        ghVar.itemView.setVisibility(0);
        C112820ds dsVar = (C112820ds) ghVar;
        C65379d dVar = (C65379d) ezVar.mo100192E().get();
        C48578al alVar = (C48578al) ezVar.mo100195H().get();
        TextView textView = dsVar.f312689b;
        C113188cs csVar = this.f312699i;
        String L = ezVar.mo100199L();
        if (!dVar.f177784g.isEmpty()) {
            str = String.valueOf(this.f312697g).concat(String.valueOf((String) Collection.EL.stream(dVar.f177784g).map(C112818dq.f312686a).filter(C112819dr.f312687a).collect(Collectors.joining(this.f312698h))));
        } else {
            str = dVar.f177780c;
        }
        textView.setText(csVar.mo99901b(L, str, this.f312696f));
        int a = C1878d.m5128a(this.f312695e, R.color.translucent_white_placeholder);
        dsVar.f312688a.setVisibility(8);
        Collection.EL.stream(dVar.f177782e).findFirst().ifPresent(new C112813dl(this, dsVar, a));
        this.f312694c.mo99660k(dsVar.f312690c, 105504);
        dsVar.f312690c.setOnClickListener(new C112814dm(this, esVar, ezVar, alVar));
    }

    /* renamed from: i */
    public final /* synthetic */ boolean mo99718i() {
        return false;
    }
}
