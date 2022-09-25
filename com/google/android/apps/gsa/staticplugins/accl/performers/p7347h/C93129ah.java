package com.google.android.apps.gsa.staticplugins.accl.performers.p7347h;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.common.util.concurrent.SettableFuture;
import com.google.net.p4726a.p4727a.C62722b;
import java.io.File;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.h.ah */
/* compiled from: PG */
public final /* synthetic */ class C93129ah implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C93150bb f259764a;

    /* renamed from: b */
    public final /* synthetic */ MessageNotification f259765b;

    /* renamed from: c */
    public final /* synthetic */ AtomicLong f259766c;

    /* renamed from: d */
    public final /* synthetic */ boolean f259767d;

    public /* synthetic */ C93129ah(C93150bb bbVar, MessageNotification messageNotification, AtomicLong atomicLong, boolean z) {
        this.f259764a = bbVar;
        this.f259765b = messageNotification;
        this.f259766c = atomicLong;
        this.f259767d = z;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C93150bb bbVar = this.f259764a;
        MessageNotification messageNotification = this.f259765b;
        AtomicLong atomicLong = this.f259766c;
        boolean z = this.f259767d;
        bbVar.f259812m.mo19974a(C37176a.f97332z);
        if (!C93150bb.m153214k(messageNotification)) {
            bbVar.f259812m.mo19974a(C37176a.f96803A.mo40815i(C62722b.INTERNAL));
            C59104x d = C93150bb.f259800a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NotifReadPerformer");
            ((C59052c) ((C59052c) d).mo56372aa(13400)).mo56386p("Notification is not an audio message");
            return C60856cj.m92900i(C118826c.f331422a);
        } else if (messageNotification.f252547x == null) {
            C59104x d2 = C93150bb.f259800a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "NotifReadPerformer");
            ((C59052c) ((C59052c) d2).mo56372aa(13399)).mo56386p("Notification audio file is not ready");
            bbVar.f259812m.mo19974a(C37176a.f96803A.mo40815i(C62722b.NOT_FOUND));
            return C60856cj.m92899h(new Exception("Notification audio file is not ready"));
        } else {
            C58976aa aaVar = C58975e.f156826a;
            String str = messageNotification.f252545v;
            Uri uri = messageNotification.f252546w;
            String str2 = messageNotification.f252547x;
            SettableFuture settableFuture = new SettableFuture();
            try {
                String str3 = messageNotification.f252547x;
                str3.getClass();
                File file = new File(bbVar.f259809j.getCacheDir().getAbsolutePath(), str3);
                file.getAbsolutePath();
                if (!file.exists() || file.length() <= 0) {
                    bbVar.f259812m.mo19974a(C37176a.f96803A.mo40815i(C62722b.NOT_FOUND));
                    throw new Exception("Notification audio file is missing.");
                }
                if (bbVar.f259811l == null) {
                    bbVar.f259811l = new MediaPlayer();
                }
                AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(2).setUsage(16);
                MediaPlayer mediaPlayer = bbVar.f259811l;
                mediaPlayer.getClass();
                mediaPlayer.setAudioAttributes(usage.build());
                MediaPlayer mediaPlayer2 = bbVar.f259811l;
                mediaPlayer2.getClass();
                mediaPlayer2.setOnCompletionListener(new C93186y(bbVar, settableFuture));
                MediaPlayer mediaPlayer3 = bbVar.f259811l;
                mediaPlayer3.getClass();
                mediaPlayer3.setOnErrorListener(new C93131aj(bbVar, settableFuture));
                MediaPlayer mediaPlayer4 = bbVar.f259811l;
                mediaPlayer4.getClass();
                mediaPlayer4.reset();
                MediaPlayer mediaPlayer5 = bbVar.f259811l;
                mediaPlayer5.getClass();
                mediaPlayer5.setDataSource(bbVar.f259809j, Uri.parse(file.getAbsolutePath()));
                MediaPlayer mediaPlayer6 = bbVar.f259811l;
                mediaPlayer6.getClass();
                mediaPlayer6.prepare();
                MediaPlayer mediaPlayer7 = bbVar.f259811l;
                mediaPlayer7.getClass();
                long duration = (long) mediaPlayer7.getDuration();
                if (duration <= atomicLong.get()) {
                    atomicLong.addAndGet(-duration);
                    atomicLong.get();
                    MediaPlayer mediaPlayer8 = bbVar.f259811l;
                    mediaPlayer8.getClass();
                    mediaPlayer8.start();
                    return settableFuture;
                }
                bbVar.f259812m.mo19974a(C37176a.f96803A.mo40815i(C62722b.DEADLINE_EXCEEDED));
                throw new Exception("Audio message length threshold exceeded.");
            } catch (Exception e) {
                bbVar.f259812m.mo19974a(C37176a.f96803A.mo40815i(C62722b.INTERNAL));
                C59104x d3 = C93150bb.f259800a.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "NotifReadPerformer");
                ((C59052c) ((C59052c) d3).mo56372aa(13396)).mo56389s("Exception: %s", e.getMessage());
                settableFuture.mo57357o(new Exception(e.getMessage()));
                if (z) {
                    return bbVar.mo87555f(bbVar.mo87557h(messageNotification).toString());
                }
                return bbVar.mo87553d(messageNotification);
            }
        }
    }
}
