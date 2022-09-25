package android.support.p031v4.media;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.support.p031v4.media.session.MediaSessionCompat;
import android.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v4.media.b */
/* compiled from: PG */
final class C0265b extends Handler {

    /* renamed from: a */
    private final WeakReference f951a;

    /* renamed from: b */
    private WeakReference f952b;

    public C0265b(C0275l lVar) {
        this.f951a = new WeakReference(lVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo832a(Messenger messenger) {
        this.f952b = new WeakReference(messenger);
    }

    public final void handleMessage(Message message) {
        WeakReference weakReference = this.f952b;
        if (weakReference != null && weakReference.get() != null && this.f951a.get() != null) {
            Bundle data = message.getData();
            MediaSessionCompat.m652b(data);
            C0275l lVar = (C0275l) this.f951a.get();
            Messenger messenger = (Messenger) this.f952b.get();
            try {
                int i = message.what;
                if (i == 1) {
                    MediaSessionCompat.m652b(data.getBundle("data_root_hints"));
                    data.getString("data_media_item_id");
                    MediaSessionCompat.Token token = (MediaSessionCompat.Token) data.getParcelable("data_media_session_token");
                    lVar.mo846e();
                } else if (i == 2) {
                    lVar.mo844c();
                } else if (i != 3) {
                    Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                } else {
                    Bundle bundle = data.getBundle("data_options");
                    MediaSessionCompat.m652b(bundle);
                    MediaSessionCompat.m652b(data.getBundle("data_notify_children_changed_options"));
                    lVar.mo845d(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle);
                }
            } catch (BadParcelableException unused) {
                Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                if (message.what == 1) {
                    lVar.mo844c();
                }
            }
        }
    }
}
