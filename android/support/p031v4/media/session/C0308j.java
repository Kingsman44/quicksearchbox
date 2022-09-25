package android.support.p031v4.media.session;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.p031v4.media.MediaMetadataCompat;
import java.util.List;

/* renamed from: android.support.v4.media.session.j */
/* compiled from: PG */
final class C0308j extends Handler {

    /* renamed from: a */
    boolean f1037a = false;

    /* renamed from: b */
    final /* synthetic */ C0310l f1038b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0308j(C0310l lVar, Looper looper) {
        super(looper);
        this.f1038b = lVar;
    }

    public final void handleMessage(Message message) {
        if (this.f1037a) {
            switch (message.what) {
                case 1:
                    Bundle data = message.getData();
                    MediaSessionCompat.m652b(data);
                    this.f1038b.mo1011j((String) message.obj, data);
                    return;
                case 2:
                    this.f1038b.mo1006e((PlaybackStateCompat) message.obj);
                    return;
                case 3:
                    this.f1038b.mo1005d((MediaMetadataCompat) message.obj);
                    return;
                case 4:
                    this.f1038b.mo1001a((C0314p) message.obj);
                    return;
                case 5:
                    this.f1038b.mo1007f((List) message.obj);
                    return;
                case 6:
                    this.f1038b.mo1008g((CharSequence) message.obj);
                    return;
                case 7:
                    Bundle bundle = (Bundle) message.obj;
                    MediaSessionCompat.m652b(bundle);
                    this.f1038b.mo1004c(bundle);
                    return;
                case 8:
                    this.f1038b.mo1010i();
                    return;
                case 9:
                    this.f1038b.mo1009h(((Integer) message.obj).intValue());
                    return;
                case 11:
                    this.f1038b.mo1002b(((Boolean) message.obj).booleanValue());
                    return;
                case 12:
                    this.f1038b.mo1013l(((Integer) message.obj).intValue());
                    return;
                case 13:
                    this.f1038b.mo1012k();
                    return;
                default:
                    return;
            }
        }
    }
}
