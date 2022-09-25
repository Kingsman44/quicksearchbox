package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.view.View;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88507a;
import com.google.android.apps.gsa.shared.p7148ui.C90658bc;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.ad */
/* compiled from: PG */
final class C93526ad extends C90658bc {

    /* renamed from: a */
    final /* synthetic */ AudioArgumentView f261162a;

    public C93526ad(AudioArgumentView audioArgumentView) {
        this.f261162a = audioArgumentView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo84951a(View view) {
        AudioArgumentView audioArgumentView = this.f261162a;
        int i = audioArgumentView.f261011v;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            ((C59052c) ((C59052c) AudioArgumentView.f260994a.mo56225c()).mo56372aa(13732)).mo56386p("Clicking on playback button when AudioArgumentView's state is UNKNOWN should never occur");
        } else if (i2 == 1) {
            ((C88507a) audioArgumentView.f261444j).f239225a.mo82092S();
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5 && audioArgumentView.mo87857c()) {
                    AudioArgumentView audioArgumentView2 = this.f261162a;
                    audioArgumentView2.f261444j.mo88005b(7, audioArgumentView2.mo87855a(), 2);
                }
            } else if (audioArgumentView.mo87857c()) {
                AudioArgumentView audioArgumentView3 = this.f261162a;
                audioArgumentView3.f261444j.mo88005b(6, audioArgumentView3.mo87855a(), 2);
            }
        } else if (audioArgumentView.mo87857c()) {
            AudioArgumentView audioArgumentView4 = this.f261162a;
            audioArgumentView4.f261444j.mo88005b(5, audioArgumentView4.mo87855a(), 1);
        }
    }
}
