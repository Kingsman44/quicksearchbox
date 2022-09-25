package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.view.View;
import android.widget.Checkable;
import com.google.android.googlequicksearchbox.R;
import java.util.Set;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.dv */
/* compiled from: PG */
public final /* synthetic */ class C132269dv implements C132296er {

    /* renamed from: a */
    public final /* synthetic */ C132271dx f361019a;

    /* renamed from: b */
    public final /* synthetic */ MediaFilterRadioButton f361020b;

    /* renamed from: c */
    public final /* synthetic */ View f361021c;

    /* renamed from: d */
    public final /* synthetic */ Set f361022d;

    public /* synthetic */ C132269dv(C132271dx dxVar, MediaFilterRadioButton mediaFilterRadioButton, View view, Set set) {
        this.f361019a = dxVar;
        this.f361020b = mediaFilterRadioButton;
        this.f361021c = view;
        this.f361022d = set;
    }

    /* renamed from: a */
    public final void mo110540a(Checkable checkable, boolean z) {
        C132271dx dxVar = this.f361019a;
        MediaFilterRadioButton mediaFilterRadioButton = this.f361020b;
        View view = this.f361021c;
        Set set = this.f361022d;
        if (mediaFilterRadioButton.equals(checkable)) {
            if (z) {
                view.findViewById(R.id.assistant_custodio_youtube_video_provider).setVisibility(0);
            } else {
                view.findViewById(R.id.assistant_custodio_youtube_video_provider).setVisibility(8);
                return;
            }
        } else if (!z) {
            return;
        }
        dxVar.f361032h.mo110599a(checkable);
        dxVar.mo110579d(set);
    }
}
