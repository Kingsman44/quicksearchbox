package com.google.android.apps.search.googleapp.saves.savefeature.p10400ui;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bumptech.glide.load.p293a.C5731x;
import com.bumptech.glide.p287f.C5593j;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137248f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.apps.tiktok.dataservice.p3638c.C46756m;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57566aj;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57626cp;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57636cz;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.ui.y */
/* compiled from: PG */
final class C137376y extends C46756m {

    /* renamed from: a */
    final /* synthetic */ C137377z f373665a;

    public C137376y(C137377z zVar) {
        this.f373665a = zVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ View mo18113a(ViewGroup viewGroup) {
        return (ListElementView) this.f373665a.f373669d.getLayoutInflater().inflate(R.layout.googleapp_list_element, viewGroup, false);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18114b(View view, Object obj) {
        Uri uri;
        ListElementView listElementView = (ListElementView) view;
        C137248f fVar = (C137248f) obj;
        C28306ab abVar = this.f373665a.f373673h;
        C28313c a = abVar.f76990a.mo33805a(C28427h.m53115a(37320));
        C57578av avVar = fVar.f373396a;
        if (avVar == null) {
            avVar = C57578av.f153822h;
        }
        C57566aj ajVar = avVar.f153824a;
        if (ajVar == null) {
            ajVar = C57566aj.f153791e;
        }
        a.mo33858f(C28375ak.m53059a((long) ajVar.f153793a.hashCode()));
        abVar.mo33802c(listElementView, a);
        C137366o a2 = listElementView.mo17754z();
        C47449e eVar = a2.f373649b;
        eVar.mo51286a().mo11876n(a2.f373650c);
        a2.f373651d.setText((CharSequence) null);
        a2.f373652e.setText((CharSequence) null);
        C47449e eVar2 = a2.f373649b;
        eVar2.mo51286a().mo11876n(a2.f373653f);
        a2.f373650c.setClipToOutline(true);
        C57578av avVar2 = fVar.f373396a;
        if (avVar2 == null) {
            avVar2 = C57578av.f153822h;
        }
        C57626cp cpVar = avVar2.f153830g;
        if (cpVar == null || cpVar.f153924a.isEmpty()) {
            uri = C137366o.f373648a;
        } else {
            C57626cp cpVar2 = avVar2.f153830g;
            if (cpVar2 == null) {
                cpVar2 = C57626cp.f153922b;
            }
            uri = Uri.parse(cpVar2.f153924a);
        }
        a2.f373649b.mo51286a().mo11870h(uri).mo11982o(C5593j.m14520d(C5731x.f17282a).mo11955H()).mo12454r(a2.f373650c);
        TextView textView = a2.f373651d;
        C57578av avVar3 = fVar.f373396a;
        if (avVar3 == null) {
            avVar3 = C57578av.f153822h;
        }
        textView.setText(avVar3.f153828e);
        C57578av avVar4 = fVar.f373396a;
        if (avVar4 == null) {
            avVar4 = C57578av.f153822h;
        }
        if (C137366o.m223191a(avVar4) || C137366o.m223192b(avVar4)) {
            TextView textView2 = a2.f373652e;
            C57636cz czVar = avVar4.f153827d;
            if (czVar == null) {
                czVar = C57636cz.f153933b;
            }
            textView2.setText(czVar.f153935a);
            a2.f373652e.setVisibility(0);
        } else {
            a2.f373652e.setVisibility(8);
        }
        C57578av avVar5 = fVar.f373396a;
        if (avVar5 == null) {
            avVar5 = C57578av.f153822h;
        }
        if (C137366o.m223191a(avVar5)) {
            a2.f373653f.setImageResource(R.drawable.quantum_gm_ic_public_white_24);
            a2.f373653f.setVisibility(0);
        } else if (C137366o.m223192b(avVar5)) {
            a2.f373653f.setImageResource(R.drawable.quantum_gm_ic_people_white_24);
            a2.f373653f.setVisibility(0);
        } else {
            a2.f373653f.setVisibility(4);
        }
        listElementView.setOnClickListener(new C47591co(this.f373665a.f373672g, "ListElement onClick", new C137375x(this, fVar)));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo50773c(View view) {
        C28306ab.m52929e((ListElementView) view);
    }
}
