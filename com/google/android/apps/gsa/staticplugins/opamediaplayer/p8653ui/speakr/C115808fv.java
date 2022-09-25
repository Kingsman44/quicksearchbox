package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.p6696b.C85333k;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.fv */
/* compiled from: PG */
public final class C115808fv extends C0640fb {

    /* renamed from: a */
    public final C58485gu f321152a;

    /* renamed from: b */
    public int f321153b;

    /* renamed from: c */
    public C115806ft f321154c;

    public C115808fv(List list) {
        this.f321152a = C58485gu.m89842j(list);
    }

    public final int getItemCount() {
        return this.f321152a.size();
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C115807fu fuVar = (C115807fu) ghVar;
        boolean z = this.f321153b == i;
        FrameLayout frameLayout = (FrameLayout) fuVar.itemView;
        ImageView imageView = (ImageView) frameLayout.findViewById(R.id.voice_selection_circle);
        View findViewById = frameLayout.findViewById(R.id.voice_selection_check);
        if (z) {
            findViewById.setVisibility(0);
            imageView.setImageResource(R.drawable.voice_selection_circle_filled);
        } else {
            findViewById.setVisibility(8);
            imageView.setImageResource(R.drawable.voice_selection_circle_unfilled);
        }
        C85333k kVar = (C85333k) this.f321152a.get(i);
        imageView.setColorFilter(kVar.f231108c);
        imageView.setOnClickListener(new C115805fs(this, i));
        imageView.setContentDescription(String.valueOf(kVar.f231109d).concat(true != z ? BuildConfig.FLAVOR : " selected"));
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.speakr_assistant_settings_voice_selection_voice, frameLayout);
        frameLayout.setClickable(true);
        return new C115807fu(frameLayout);
    }
}
