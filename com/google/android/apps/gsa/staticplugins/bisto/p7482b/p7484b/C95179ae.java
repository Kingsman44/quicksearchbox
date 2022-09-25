package com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.p7158b.C90753j;
import com.google.android.apps.gsa.shared.util.p7158b.C90754k;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95294af;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.b.b.ae */
/* compiled from: PG */
public final /* synthetic */ class C95179ae implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C95186al f266297a;

    /* renamed from: b */
    public final /* synthetic */ Uri f266298b;

    /* renamed from: c */
    public final /* synthetic */ C95294af f266299c;

    public /* synthetic */ C95179ae(C95186al alVar, Uri uri, C95294af afVar) {
        this.f266297a = alVar;
        this.f266298b = uri;
        this.f266299c = afVar;
    }

    public final void run() {
        C95186al alVar = this.f266297a;
        Uri uri = this.f266298b;
        C95294af afVar = this.f266299c;
        synchronized (alVar.f266312d) {
            alVar.f266315g = null;
            alVar.mo89094e((C95294af) null);
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(3).setUsage(1).build());
            mediaPlayer.setAudioSessionId(((AudioManager) alVar.f266313e.getSystemService("audio")).generateAudioSessionId());
            alVar.f266314f = mediaPlayer;
            try {
                alVar.f266314f.setDataSource(alVar.f266313e, uri);
                MediaPlayer mediaPlayer2 = alVar.f266314f;
                if (mediaPlayer2 == null) {
                    C59104x c = C95186al.f266307a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "UriPlayer");
                    C90476a aVar = C90754k.f253829b;
                    C90476a aVar2 = C90754k.f253829b;
                    ((C59052c) ((C59052c) c).mo56372aa(14648)).mo56389s("Failed to create MediaPlayer for Uri %s", C90753j.m148240b(uri));
                    alVar.mo89091b();
                    return;
                }
                mediaPlayer2.setOnErrorListener(new C95175aa(alVar));
                alVar.f266314f.setOnCompletionListener(new C95176ab(alVar));
                alVar.f266314f.setOnPreparedListener(new C95177ac(alVar, afVar, uri));
                alVar.f266314f.prepareAsync();
            } catch (RuntimeException e) {
                e = e;
                C59104x c2 = C95186al.f266307a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "UriPlayer");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(14649)).mo56386p("Exception playing URI in MediaPlayer");
                alVar.mo89091b();
            } catch (IOException e2) {
                e = e2;
                C59104x c22 = C95186al.f266307a.mo56225c();
                c22.mo56378ag(C58975e.f156826a, "UriPlayer");
                ((C59052c) ((C59052c) ((C59052c) c22).mo56382g(e)).mo56372aa(14649)).mo56386p("Exception playing URI in MediaPlayer");
                alVar.mo89091b();
            }
        }
    }
}
