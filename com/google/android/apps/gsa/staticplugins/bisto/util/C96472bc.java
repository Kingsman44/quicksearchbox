package com.google.android.apps.gsa.staticplugins.bisto.util;

import android.net.Uri;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.bc */
/* compiled from: PG */
public final /* synthetic */ class C96472bc implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ StreamedMessageContentProvider f269894a;

    /* renamed from: b */
    public final /* synthetic */ Uri f269895b;

    /* renamed from: c */
    public final /* synthetic */ C96473bd f269896c;

    public /* synthetic */ C96472bc(StreamedMessageContentProvider streamedMessageContentProvider, Uri uri, C96473bd bdVar) {
        this.f269894a = streamedMessageContentProvider;
        this.f269895b = uri;
        this.f269896c = bdVar;
    }

    public final void run() {
        StreamedMessageContentProvider streamedMessageContentProvider = this.f269894a;
        Uri uri = this.f269895b;
        C96473bd bdVar = this.f269896c;
        C58976aa aaVar = C58975e.f156826a;
        streamedMessageContentProvider.f269810e.remove(uri);
        try {
            bdVar.f269898b.close();
        } catch (IOException e) {
            C59104x d = StreamedMessageContentProvider.f269806a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "StreamedMessageCP");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(17189)).mo56386p("Cannot close inputStream.");
        }
        bdVar.mo90166a();
    }
}
