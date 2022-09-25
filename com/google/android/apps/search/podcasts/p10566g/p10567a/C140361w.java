package com.google.android.apps.search.podcasts.p10566g.p10567a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.search.podcasts.p10565f.C140303ax;
import com.google.android.apps.search.podcasts.p10566g.p10568b.C140370e;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.p10601r.C140997s;
import com.google.android.apps.search.podcasts.p10601r.p10608f.C140980a;
import com.google.android.apps.search.podcasts.show.C141121af;
import com.google.android.apps.search.podcasts.show.C141122ag;
import com.google.android.apps.search.podcasts.widgets.menu.ClickableMenuView;
import com.google.android.apps.search.podcasts.widgets.thumbnail.ThumbnailView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28449s;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.play.unison.binding.C31970as;
import com.google.android.libraries.play.unison.binding.C31978d;
import com.google.android.libraries.play.unison.binding.C31987m;
import com.google.android.libraries.play.unison.binding.C31989o;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.contrib.p3629c.C46490k;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4552o.C60430py;
import com.google.common.p4552o.C60431pz;
import com.google.common.p4552o.C60438qa;
import com.google.common.p4552o.C60439qb;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.g.a.w */
/* compiled from: PG */
final class C140361w extends C31978d {

    /* renamed from: a */
    public final C46485f f381273a;

    /* renamed from: b */
    public final C28443m f381274b;

    /* renamed from: c */
    private final C47449e f381275c;

    /* renamed from: d */
    private final C28310af f381276d;

    /* renamed from: e */
    private final C28306ab f381277e;

    /* renamed from: j */
    private final C47770dh f381278j;

    /* renamed from: k */
    private final ThumbnailView f381279k;

    /* renamed from: l */
    private final ClickableMenuView f381280l;

    /* renamed from: m */
    private final TextView f381281m;

    /* renamed from: n */
    private final TextView f381282n;

    /* renamed from: o */
    private final ImageView f381283o;

    /* renamed from: p */
    private final C140997s f381284p;

    public C140361w(C47449e eVar, C46485f fVar, C28310af afVar, C28443m mVar, C47770dh dhVar, C28306ab abVar, C140997s sVar, View view) {
        super(view);
        this.f381275c = eVar;
        this.f381273a = fVar;
        this.f381276d = afVar;
        this.f381277e = abVar;
        this.f381274b = mVar;
        this.f381278j = dhVar;
        this.f381284p = sVar;
        this.f381279k = (ThumbnailView) view.findViewById(R.id.podcasts_show_image);
        this.f381280l = (ClickableMenuView) view.findViewById(R.id.podcasts_show_more_actions_button);
        this.f381281m = (TextView) view.findViewById(R.id.podcasts_show_title);
        this.f381282n = (TextView) view.findViewById(R.id.podcasts_show_publisher);
        this.f381283o = (ImageView) view.findViewById(R.id.podcasts_feed_subscribe_button);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo37735a(Object obj, C31989o oVar) {
        C140370e eVar = (C140370e) obj;
        ThumbnailView thumbnailView = this.f381279k;
        String c = eVar.mo115627c();
        String str = eVar.f381312a.f381998d;
        C69664n.m101060f(str, "showItem.thumbnailUrl");
        C47449e eVar2 = this.f381275c;
        String str2 = eVar.f381312a.f382003i;
        C69664n.m101060f(str2, "showItem.fallbackThumbnailColor");
        thumbnailView.mo116304a(c, str, eVar2, str2);
        this.f381281m.setText(eVar.mo115627c());
        this.f381282n.setText(eVar.f381312a.f381997c);
        this.f381279k.setContentDescription(eVar.mo115627c());
        int i = 8;
        this.f381280l.setVisibility(true != eVar.f381315d ? 8 : 0);
        ImageView imageView = this.f381283o;
        if (true == eVar.f381316e) {
            i = 0;
        }
        imageView.setVisibility(i);
        if (eVar.f381316e) {
            this.f381283o.setSelected(eVar.f381312a.f382007m);
            this.f381283o.setContentDescription(mo37744f().getContext().getString(true != eVar.f381312a.f382007m ? R.string.podcasts_feed_subscribe_button_label : R.string.podcasts_feed_unsubscribe_button_label));
            this.f381284p.mo116062a(this.f381283o, new C140358t(new C140303ax(eVar.f381312a)), "Subscribe button click");
        }
        if (eVar.f381315d) {
            this.f381280l.setOnClickListener(new C47591co(this.f381278j, "navigate to show actions", new C140359u(this, eVar)));
        }
        C141121af afVar = (C141121af) C141122ag.f383149c.createBuilder();
        String a = eVar.mo115619a();
        afVar.copyOnWrite();
        a.getClass();
        ((C141122ag) afVar.instance).f383151a = a;
        this.f85977f.setOnClickListener(new C47591co(this.f381278j, "Click show item", new C140360v(this, C46490k.m82868a(afVar.build()).mo50504d())));
        C140646b bVar = eVar.f381312a;
        String str3 = eVar.f381313b.f382764b;
        C69664n.m101061g(bVar, "showItem");
        C60430py pyVar = (C60430py) C60431pz.f163541h.createBuilder();
        C60438qa qaVar = (C60438qa) C60439qb.f163564d.createBuilder();
        String str4 = bVar.f381995a;
        qaVar.copyOnWrite();
        C60439qb qbVar = (C60439qb) qaVar.instance;
        str4.getClass();
        qbVar.f163566a |= 2;
        qbVar.f163568c = str4;
        String str5 = bVar.f382001g;
        qaVar.copyOnWrite();
        C60439qb qbVar2 = (C60439qb) qaVar.instance;
        str5.getClass();
        qbVar2.f163566a |= 1;
        qbVar2.f163567b = str5;
        pyVar.copyOnWrite();
        C60431pz pzVar = (C60431pz) pyVar.instance;
        C60439qb qbVar3 = (C60439qb) qaVar.build();
        qbVar3.getClass();
        pzVar.f163545c = qbVar3;
        pzVar.f163543a |= 2;
        if (str3 != null) {
            pyVar.copyOnWrite();
            C60431pz pzVar2 = (C60431pz) pyVar.instance;
            pzVar2.f163543a |= 16;
            pzVar2.f163547e = str3;
        }
        C28353e eVar3 = new C28353e(C140980a.f382762a, pyVar.build());
        C28306ab abVar = this.f381277e;
        View view = this.f85977f;
        C28313c a2 = this.f381276d.mo33805a(C28427h.m53115a(eVar.f381313b.f382763a));
        a2.mo33858f(eVar3);
        a2.mo33858f(C28375ak.m53059a((long) eVar.f381312a.f381995a.hashCode()));
        C31970as asVar = (C31970as) ((C31987m) oVar).f85985a;
        asVar.getClass();
        a2.mo33858f(C28449s.m53155a(asVar.mo37732a()));
        abVar.mo33802c(view, a2);
        C28306ab abVar2 = this.f381277e;
        ClickableMenuView clickableMenuView = this.f381280l;
        C28313c a3 = this.f381276d.mo33805a(C28427h.m53115a(40975));
        a3.mo33858f(eVar3);
        abVar2.mo33802c(clickableMenuView, a3);
        this.f381277e.mo33802c(this.f381283o, this.f381276d.mo33805a(C28427h.m53115a(true != eVar.f381312a.f382007m ? 41154 : 41153)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo37736b() {
        C28306ab.m52929e(this.f381283o);
        C28306ab.m52929e(this.f381280l);
        C28306ab.m52929e(this.f85977f);
    }
}
