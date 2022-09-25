package android.support.p031v4.media.session;

import android.media.session.MediaController;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.p031v4.media.MediaMetadataCompat;
import java.util.List;

/* renamed from: android.support.v4.media.session.l */
/* compiled from: PG */
public class C0310l implements IBinder.DeathRecipient {

    /* renamed from: a */
    final MediaController.Callback f1040a = new C0307i(this);

    /* renamed from: b */
    C0308j f1041b;

    /* renamed from: c */
    C0302d f1042c;

    /* renamed from: a */
    public void mo1001a(C0314p pVar) {
    }

    /* renamed from: b */
    public void mo1002b(boolean z) {
    }

    public void binderDied() {
        mo1014m(8, (Object) null, (Bundle) null);
    }

    /* renamed from: c */
    public void mo1004c(Bundle bundle) {
    }

    /* renamed from: d */
    public void mo1005d(MediaMetadataCompat mediaMetadataCompat) {
    }

    /* renamed from: e */
    public void mo1006e(PlaybackStateCompat playbackStateCompat) {
    }

    /* renamed from: f */
    public void mo1007f(List list) {
    }

    /* renamed from: g */
    public void mo1008g(CharSequence charSequence) {
    }

    /* renamed from: h */
    public void mo1009h(int i) {
    }

    /* renamed from: i */
    public void mo1010i() {
    }

    /* renamed from: j */
    public void mo1011j(String str, Bundle bundle) {
    }

    /* renamed from: k */
    public void mo1012k() {
    }

    /* renamed from: l */
    public void mo1013l(int i) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo1014m(int i, Object obj, Bundle bundle) {
        C0308j jVar = this.f1041b;
        if (jVar != null) {
            Message obtainMessage = jVar.obtainMessage(i, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo1015n(Handler handler) {
        if (handler == null) {
            C0308j jVar = this.f1041b;
            if (jVar != null) {
                jVar.f1037a = false;
                jVar.removeCallbacksAndMessages((Object) null);
                this.f1041b = null;
                return;
            }
            return;
        }
        C0308j jVar2 = new C0308j(this, handler.getLooper());
        this.f1041b = jVar2;
        jVar2.f1037a = true;
    }
}
