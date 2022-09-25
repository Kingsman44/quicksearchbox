package com.google.android.libraries.lens.view.p2113h.p2115b.p2119d;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import androidx.media3.common.C2666j;
import androidx.media3.exoplayer.C2759ad;
import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.p4017at.p4056g.p4057a.p4058a.C54020ca;

/* renamed from: com.google.android.libraries.lens.view.h.b.d.h */
/* compiled from: PG */
final class C26714h {

    /* renamed from: a */
    public final Uri f72827a;

    /* renamed from: b */
    public C58833ax f72828b = C58836b.f156633a;

    /* renamed from: c */
    public final C54020ca f72829c;

    public C26714h(Context context, Uri uri) {
        C54020ca caVar;
        char c;
        C59104x xVar;
        this.f72827a = uri;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(context, uri);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(23);
            C58974d dVar = C26715i.f72830a;
            caVar = C26716j.m49393a(extractMetadata);
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e) {
                e = e;
                xVar = C26715i.f72830a.mo56225c();
                c = 49124;
            }
        } catch (IllegalArgumentException e2) {
            ((C58970a) ((C58970a) ((C58970a) C26715i.f72830a.mo56225c()).mo56382g(e2)).mo56372aa(49125)).mo56389s("invalid uri: %s", uri);
            caVar = null;
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e3) {
                e = e3;
                xVar = C26715i.f72830a.mo56225c();
                c = 49126;
            }
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e4) {
                ((C58970a) ((C58970a) ((C58970a) C26715i.f72830a.mo56225c()).mo56382g(e4)).mo56372aa(49127)).mo56386p("failed to release retriever");
            }
            throw th;
        }
        this.f72829c = caVar;
        ((C58970a) ((C58970a) ((C58970a) xVar).mo56382g(e)).mo56372aa(c)).mo56386p("failed to release retriever");
        this.f72829c = caVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo32023a(C2759ad adVar) {
        if (adVar != null && this.f72828b.mo56113h()) {
            C2666j jVar = (C2666j) adVar;
            jVar.mo5973A(jVar.mo5996c(), ((Long) this.f72828b.mo56107c()).longValue());
            this.f72828b = C58836b.f156633a;
        }
    }

    public final String toString() {
        return String.valueOf(String.valueOf(this.f72827a)).concat(!this.f72828b.mo56113h() ? BuildConfig.FLAVOR : "@".concat(String.valueOf(String.valueOf(this.f72828b))));
    }
}
