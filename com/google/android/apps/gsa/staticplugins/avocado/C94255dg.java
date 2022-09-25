package com.google.android.apps.gsa.staticplugins.avocado;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.SoundPool;
import com.google.common.p4526f.C59052c;
import java.io.File;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.dg */
/* compiled from: PG */
final class C94255dg extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C94256dh f263377a;

    public C94255dg(C94256dh dhVar) {
        this.f263377a = dhVar;
    }

    public final void onReceive(Context context, Intent intent) {
        long longExtra = intent.getLongExtra("extra_download_id", -1);
        if (longExtra != -1 && this.f263377a.f263402q != null) {
            File externalCacheDir = context.getExternalCacheDir();
            if (externalCacheDir == null) {
                ((C59052c) ((C59052c) C94256dh.f263378a.mo56225c()).mo56372aa(14293)).mo56386p("Sound load failed: cannot open external cache directory");
                return;
            }
            C94256dh dhVar = this.f263377a;
            if (longExtra == dhVar.f263400o) {
                SoundPool soundPool = dhVar.f263402q;
                soundPool.getClass();
                dhVar.f263405t = soundPool.load(externalCacheDir.toString().concat("/photo-capture.wav"), 1);
                ((C59052c) ((C59052c) C94256dh.f263378a.mo56224b()).mo56372aa(14292)).mo56387q("sound to load for capture is %d", this.f263377a.f263405t);
            } else if (longExtra == dhVar.f263401p) {
                SoundPool soundPool2 = dhVar.f263402q;
                soundPool2.getClass();
                dhVar.f263406u = soundPool2.load(externalCacheDir.toString().concat("/photo-complete.wav"), 1);
                ((C59052c) ((C59052c) C94256dh.f263378a.mo56224b()).mo56372aa(14291)).mo56387q("sound to load for complete is %d", this.f263377a.f263406u);
            }
        }
    }
}
