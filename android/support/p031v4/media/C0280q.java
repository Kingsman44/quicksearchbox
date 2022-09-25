package android.support.p031v4.media;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.support.p031v4.media.MediaBrowserCompat;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: android.support.v4.media.q */
/* compiled from: PG */
class C0280q extends MediaBrowser.SubscriptionCallback {

    /* renamed from: a */
    final /* synthetic */ C0282s f971a;

    public C0280q(C0282s sVar) {
        this.f971a = sVar;
    }

    public final void onError(String str) {
        this.f971a.mo857b(str);
    }

    public final void onChildrenLoaded(String str, List list) {
        C0279p pVar;
        WeakReference weakReference = this.f971a.f974c;
        if (weakReference == null) {
            pVar = null;
        } else {
            pVar = (C0279p) weakReference.get();
        }
        if (pVar == null) {
            this.f971a.mo856a(str, MediaBrowserCompat.MediaItem.m595a(list));
            return;
        }
        List a = MediaBrowserCompat.MediaItem.m595a(list);
        List list2 = pVar.f969a;
        List list3 = pVar.f970b;
        for (int i = 0; i < list2.size(); i++) {
            Bundle bundle = (Bundle) list3.get(i);
            if (bundle == null) {
                this.f971a.mo856a(str, a);
            } else if (a != null) {
                int i2 = -1;
                int i3 = bundle.getInt("android.media.browse.extra.PAGE", -1);
                int i4 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                if (i3 != -1) {
                    i2 = i3;
                } else if (i4 == -1) {
                }
                int i5 = i4 * i2;
                int i6 = i5 + i4;
                if (i2 < 0 || i4 <= 0 || i5 >= a.size()) {
                    Collections.emptyList();
                } else {
                    if (i6 > a.size()) {
                        i6 = a.size();
                    }
                    a.subList(i5, i6);
                }
            }
        }
    }
}
