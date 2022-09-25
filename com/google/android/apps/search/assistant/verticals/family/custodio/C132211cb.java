package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.view.View;
import android.widget.Checkable;
import com.google.android.googlequicksearchbox.R;
import java.util.Set;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.cb */
/* compiled from: PG */
public final /* synthetic */ class C132211cb implements C132296er {

    /* renamed from: a */
    public final /* synthetic */ C132213cd f360861a;

    /* renamed from: b */
    public final /* synthetic */ MediaFilterRadioButton f360862b;

    /* renamed from: c */
    public final /* synthetic */ View f360863c;

    /* renamed from: d */
    public final /* synthetic */ Set f360864d;

    public /* synthetic */ C132211cb(C132213cd cdVar, MediaFilterRadioButton mediaFilterRadioButton, View view, Set set) {
        this.f360861a = cdVar;
        this.f360862b = mediaFilterRadioButton;
        this.f360863c = view;
        this.f360864d = set;
    }

    /* renamed from: a */
    public final void mo110540a(Checkable checkable, boolean z) {
        C132213cd cdVar = this.f360861a;
        MediaFilterRadioButton mediaFilterRadioButton = this.f360862b;
        View view = this.f360863c;
        Set set = this.f360864d;
        if (mediaFilterRadioButton.equals(checkable)) {
            view.findViewById(R.id.assistant_custodio_music_providers_container).setVisibility(true != z ? 8 : 0);
        }
        if (z) {
            cdVar.f360876i.mo110599a(checkable);
            cdVar.mo110543d(set);
        }
    }
}
