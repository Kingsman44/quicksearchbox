package com.google.android.apps.search.soundsearch.p10664h;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.load.C5964w;
import com.bumptech.glide.load.p299c.p300a.C5860i;
import com.bumptech.glide.load.p299c.p302c.C5889g;
import com.bumptech.glide.p287f.p289b.C5577a;
import com.google.android.apps.search.soundsearch.p10657f.C141663a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28449s;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.apps.tiktok.media.C47449e;
import com.google.audio.p4107b.p4108a.C54586i;
import com.google.audio.p4107b.p4108a.C54597t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C59592app;
import com.google.common.p4552o.apo;
import com.google.protobuf.C62940bt;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.soundsearch.h.k */
/* compiled from: PG */
public final class C141715k extends C0640fb {

    /* renamed from: a */
    public static final C59071e f384631a = C59071e.m91332i("com.google.android.apps.search.soundsearch.h.k");

    /* renamed from: b */
    public final List f384632b;

    /* renamed from: c */
    private final C28310af f384633c;

    /* renamed from: d */
    private final C28306ab f384634d;

    /* renamed from: e */
    private final C28443m f384635e;

    /* renamed from: f */
    private final C47449e f384636f;

    /* renamed from: g */
    private final boolean f384637g;

    /* renamed from: h */
    private final Optional f384638h;

    public C141715k(C28310af afVar, C28306ab abVar, C28443m mVar, C47449e eVar, boolean z, List list, Optional optional) {
        this.f384633c = afVar;
        this.f384634d = abVar;
        this.f384635e = mVar;
        this.f384636f = eVar;
        this.f384637g = z;
        this.f384632b = list;
        this.f384638h = optional;
    }

    public final int getItemCount() {
        return this.f384632b.size();
    }

    public final /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C141714j jVar = (C141714j) ghVar;
        C54586i iVar = (C54586i) this.f384632b.get(i);
        int itemCount = getItemCount() - 1;
        TextView textView = (TextView) jVar.f384629d.findViewById(R.id.soundsearch_track_name);
        C54597t tVar = iVar.f143318c;
        if (tVar == null) {
            tVar = C54597t.f143337f;
        }
        textView.setText(tVar.f143341c);
        TextView textView2 = (TextView) jVar.f384629d.findViewById(R.id.soundsearch_artist);
        C54597t tVar2 = iVar.f143318c;
        if (tVar2 == null) {
            tVar2 = C54597t.f143337f;
        }
        textView2.setText(tVar2.f143340b);
        TextView textView3 = (TextView) jVar.f384629d.findViewById(R.id.soundsearch_match);
        String str = null;
        if ((iVar.f143316a & 2) != 0) {
            try {
                str = jVar.f384629d.getResources().getString(R.string.soundsearch_label_match_confidence, new Object[]{Integer.valueOf(Math.round(iVar.f143317b * 100.0f))});
            } catch (RuntimeException e) {
                ((C59052c) ((C59052c) ((C59052c) f384631a.mo56225c()).mo56382g(e)).mo56372aa(41806)).mo56386p("Cannot get the match confidence");
            }
        }
        int i2 = 8;
        if (str != null) {
            textView3.setVisibility(0);
            textView3.setText(str);
        } else {
            textView3.setVisibility(8);
        }
        View findViewById = jVar.f384629d.findViewById(R.id.soundsearch_divider);
        if (i != itemCount) {
            i2 = 0;
        }
        findViewById.setVisibility(i2);
        C6007z zVar = (C6007z) jVar.f384628c.mo51286a().mo11871i(Integer.valueOf(R.drawable.soundsearch_album_art_placeholder)).mo11969V(jVar.f384630e);
        C47449e eVar = jVar.f384628c;
        C54597t tVar3 = iVar.f143318c;
        if (tVar3 == null) {
            tVar3 = C54597t.f143337f;
        }
        C6007z m = eVar.mo51286a().mo11873k(tVar3.f143342d).mo12451m(zVar);
        C5964w[] wVarArr = {new C5860i(), jVar.f384630e};
        C5889g gVar = new C5889g();
        gVar.mo11893b(new C5577a(150, false));
        ((C6007z) m.mo11970W(wVarArr)).mo12452n(gVar).mo12454r((ImageView) jVar.f384629d.findViewById(R.id.soundsearch_image));
        jVar.f384629d.setOnClickListener(new C141713i(jVar, iVar));
        C54597t tVar4 = ((C54586i) this.f384632b.get(i)).f143318c;
        if (tVar4 == null) {
            tVar4 = C54597t.f143337f;
        }
        int hashCode = tVar4.hashCode();
        C28313c a = this.f384633c.mo33805a(C28427h.m53115a(129781));
        a.mo33858f(C28449s.m53155a(i));
        a.mo33858f(C28375ak.m53059a((long) hashCode));
        if (this.f384638h.isPresent() && this.f384637g) {
            C62940bt btVar = C141663a.f384507a;
            apo apo = (apo) C59592app.f159690c.createBuilder();
            String str2 = (String) this.f384638h.get();
            apo.copyOnWrite();
            C59592app app = (C59592app) apo.instance;
            str2.getClass();
            app.f159693a |= 1;
            app.f159694b = str2;
            a.mo33858f(new C28353e(btVar, (C59592app) apo.build()));
        }
        this.f384634d.mo33802c(jVar.f384629d, a);
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C141714j(viewGroup.getContext(), this.f384635e, this.f384636f, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.soundsearch_result_item, viewGroup, false));
    }

    public final /* bridge */ /* synthetic */ void onViewRecycled(C0673gh ghVar) {
        int i = C141714j.f384625f;
        C28306ab.m52929e(((C141714j) ghVar).f384629d);
    }
}
