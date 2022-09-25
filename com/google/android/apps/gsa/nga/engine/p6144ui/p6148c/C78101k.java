package com.google.android.apps.gsa.nga.engine.p6144ui.p6148c;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import com.google.android.apps.gsa.nga.engine.p6144ui.C78018a;
import com.google.android.apps.gsa.nga.engine.p6144ui.answer.C78038ak;
import com.google.android.apps.gsa.nga.engine.p6144ui.answer.C78070i;
import com.google.android.apps.gsa.nga.engine.p6144ui.answer.C78071j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.c.k */
/* compiled from: PG */
public final /* synthetic */ class C78101k implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C78107q f215095a;

    public /* synthetic */ C78101k(C78107q qVar) {
        this.f215095a = qVar;
    }

    public final void run() {
        C78107q qVar = this.f215095a;
        C78018a aVar = qVar.f215108f;
        View inflate = qVar.f215105c.inflate(R.layout.debug, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.events_history);
        ImageView imageView = (ImageView) findViewById.findViewById(R.id.events_history_toggle);
        FrameLayout frameLayout = (FrameLayout) findViewById.findViewById(R.id.events_history_content);
        imageView.setOnClickListener(new C78105o(qVar, frameLayout, imageView));
        ListView listView = new ListView(qVar.f215104b);
        listView.setDivider((Drawable) null);
        listView.setTranscriptMode(1);
        listView.setAdapter(qVar.f215109g.f215088d);
        frameLayout.addView(listView);
        ((Button) inflate.findViewById(R.id.send_feedback)).setOnClickListener(new C78106p(qVar));
        C78070i d = C78071j.m125368d();
        C78038ak akVar = (C78038ak) d;
        akVar.f214956a = inflate;
        d.mo73007c();
        akVar.f214958c = null;
        akVar.f214959d = qVar.f215112j.mo75121a(qVar.f215111i.mo72021b().mo72039e()).getString(R.string.events_history_title, new Object[0]);
        aVar.mo72967f(d.mo73005a());
    }
}
