package com.google.android.apps.gsa.staticplugins.p8043n;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.n.a */
/* compiled from: PG */
public final /* synthetic */ class C102871a implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C102889s f287310a;

    /* renamed from: b */
    public final /* synthetic */ C2164c f287311b;

    /* renamed from: c */
    public final /* synthetic */ int f287312c;

    public /* synthetic */ C102871a(C102889s sVar, C2164c cVar, int i) {
        this.f287310a = sVar;
        this.f287311b = cVar;
        this.f287312c = i;
    }

    public final void run() {
        C102889s sVar = this.f287310a;
        C2164c cVar = this.f287311b;
        int i = this.f287312c;
        synchronized (sVar.f287337j) {
            sVar.mo93523j();
            sVar.f287339l = cVar;
            MediaPlayer create = MediaPlayer.create(sVar.f287331b, i);
            create.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).setUsage(1).build());
            sVar.f287338k = create;
            sVar.f287338k.setOnCompletionListener(new C102887q(sVar));
            sVar.f287338k.setOnErrorListener(new C102872b(sVar));
            sVar.f287338k.start();
            cVar.mo5436a(new C102873c(sVar), sVar.f287333f);
        }
    }
}
