package com.google.android.apps.search.soundsearch.p10655d;

import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.play.core.p3538g.C45137aw;
import com.google.android.play.core.p3538g.C45140az;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.soundsearch.d.d */
/* compiled from: PG */
public final /* synthetic */ class C141654d implements C45140az {

    /* renamed from: a */
    public final /* synthetic */ C141658h f384483a;

    /* renamed from: b */
    public final /* synthetic */ TextView f384484b;

    public /* synthetic */ C141654d(C141658h hVar, TextView textView) {
        this.f384483a = hVar;
        this.f384484b = textView;
    }

    /* renamed from: a */
    public final void mo33446a(Object obj) {
        C141658h hVar = this.f384483a;
        TextView textView = this.f384484b;
        C45137aw awVar = (C45137aw) obj;
        ((C59052c) ((C59052c) C141658h.f384494a.mo56224b()).mo56372aa(41775)).mo56359L("#SoSeFingerprinter Install update: status %s, bytesDownloaded %d, totalBytesToDownload %d", Integer.valueOf(awVar.mo48947c()), Long.valueOf(awVar.mo48948d()), Long.valueOf(awVar.mo48949e()));
        textView.setText(hVar.f384495b.getContext().getString(R.string.soundsearch_fingerprint_download_progress, new Object[]{Long.valueOf(awVar.mo48948d()), Long.valueOf(awVar.mo48949e())}));
    }
}
