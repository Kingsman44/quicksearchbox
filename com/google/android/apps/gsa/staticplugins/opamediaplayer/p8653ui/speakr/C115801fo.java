package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.p6696b.C85333k;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115453w;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115456z;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;
import p5285d.p5290b.p5291a.p5292a.C68184bt;
import p5285d.p5290b.p5291a.p5292a.C68185bu;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.fo */
/* compiled from: PG */
public final class C115801fo extends C115713ch implements View.OnClickListener, C115809fw, C115806ft {

    /* renamed from: e */
    public static final C59071e f321130e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.fo");

    /* renamed from: f */
    public RecyclerView f321131f;

    /* renamed from: g */
    public List f321132g = C58485gu.m89845m();

    /* renamed from: h */
    public LottieAnimationView f321133h;

    /* renamed from: i */
    public View f321134i;

    /* renamed from: j */
    public C115808fv f321135j;

    /* renamed from: k */
    public View f321136k;

    /* renamed from: l */
    final GestureDetector f321137l;

    /* renamed from: m */
    final C22871g f321138m;

    /* renamed from: n */
    public final C115453w f321139n;

    /* renamed from: o */
    private final C115456z f321140o;

    /* renamed from: p */
    private final C91189au f321141p;

    /* renamed from: q */
    private ImageView f321142q;

    /* renamed from: r */
    private ImageView f321143r;

    /* renamed from: s */
    private TextView f321144s;

    public C115801fo(C22945j jVar, C115456z zVar, Context context, C91189au auVar, C22871g gVar, C115453w wVar, C58833ax axVar) {
        super(jVar, context, axVar);
        this.f321140o = zVar;
        this.f321141p = auVar;
        this.f321138m = gVar;
        this.f321139n = wVar;
        this.f321137l = new GestureDetector(context, new C115800fn(this));
    }

    /* renamed from: h */
    private final void m191938h(int i) {
        C85333k kVar = (C85333k) this.f321132g.get(i);
        int i2 = kVar.f231108c;
        this.f321143r.setColorFilter(i2);
        this.f321134i.setBackgroundColor(i2);
        this.f321144s.setText(kVar.f231109d);
        this.f321141p.mo85429s(this.f321142q);
        C115808fv fvVar = this.f321135j;
        if (fvVar.f321153b != i) {
            fvVar.f321153b = i;
            fvVar.mObservable.mo2879a();
        }
    }

    /* renamed from: e */
    public final void mo102268e(int i) {
        m191938h(i);
        C68184bt btVar = (C68184bt) C68185bu.f184497d.createBuilder();
        String str = ((C85333k) this.f321132g.get(i)).f231107b;
        btVar.copyOnWrite();
        str.getClass();
        ((C68185bu) btVar.instance).f184499a = str;
        C58976aa aaVar = C58975e.f156826a;
        this.f321139n.mo101995f((C68185bu) btVar.build());
    }

    /* renamed from: g */
    public final void mo102269g() {
        C68185bu buVar = (C68185bu) ((C23251a) this.f321140o.mo102028c()).f63720e;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f321132g.size()) {
                break;
            } else if (((C85333k) this.f321132g.get(i2)).f231107b.equals(buVar.f184499a)) {
                i = i2;
                break;
            } else {
                i2++;
            }
        }
        if (i < this.f321132g.size()) {
            this.f321131f.scrollToPosition(i);
            m191938h(i);
        }
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        C58976aa aaVar = C58975e.f156826a;
        mo28295iC(LayoutInflater.from(this.f321208b).inflate(R.layout.speakr_assistant_settings_voice_selection_preference, (ViewGroup) null));
        super.mo28299iw();
        ((TextView) mo28297il().findViewById(R.id.pagedescriptionview_title)).setText(R.string.speakr_settings_voice_selection_title);
        ((TextView) mo28297il().findViewById(R.id.pagedescriptionview_subtitle)).setText(R.string.speakr_settings_voice_selection_header);
        this.f321134i = mo28297il().findViewById(R.id.voice_selection_banner);
        this.f321142q = (ImageView) mo28297il().findViewById(R.id.voice_selection_banner_image);
        this.f321143r = (ImageView) mo28297il().findViewById(R.id.voice_selection_triangle);
        this.f321144s = (TextView) mo28297il().findViewById(R.id.voice_selection_name);
        this.f321133h = (LottieAnimationView) mo28297il().findViewById(R.id.voice_selection_animation);
        this.f321136k = mo28297il().findViewById(R.id.loading_progress_bar_container);
        this.f321131f = (RecyclerView) mo28297il().findViewById(R.id.voice_selection_recycler);
        this.f321131f.setLayoutManager(new LinearLayoutManager(this.f321208b));
        ((C23249a) this.f321140o.mo102030e()).mo28726b(new C115797fk(this));
        ((C23249a) this.f321140o.mo102028c()).mo28726b(new C115798fl(this));
        ((C23249a) this.f321140o.mo102029d()).mo28726b(new C115799fm(this));
    }

    public final void onClick(View view) {
        this.f321139n.mo101994e();
    }
}
