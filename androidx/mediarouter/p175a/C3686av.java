package androidx.mediarouter.p175a;

import android.media.MediaRoute2Info;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.mediarouter.a.av */
/* compiled from: PG */
final class C3686av {
    /* renamed from: a */
    public static C3739l m10680a(MediaRoute2Info mediaRoute2Info) {
        if (mediaRoute2Info == null) {
            return null;
        }
        C3738k kVar = new C3738k(mediaRoute2Info.getId(), mediaRoute2Info.getName().toString());
        kVar.mo7873c(mediaRoute2Info.getConnectionState());
        kVar.mo7881k(mediaRoute2Info.getVolumeHandling());
        kVar.mo7882l(mediaRoute2Info.getVolumeMax());
        kVar.mo7880j(mediaRoute2Info.getVolume());
        kVar.mo7877g(mediaRoute2Info.getExtras());
        kVar.mo7876f(true);
        kVar.f12004a.putBoolean("canDisconnect", false);
        CharSequence description = mediaRoute2Info.getDescription();
        if (description != null) {
            kVar.mo7874d(description.toString());
        }
        Uri iconUri = mediaRoute2Info.getIconUri();
        if (iconUri != null) {
            kVar.f12004a.putString("iconUri", iconUri.toString());
        }
        Bundle extras = mediaRoute2Info.getExtras();
        if (extras == null || !extras.containsKey("androidx.mediarouter.media.KEY_EXTRAS") || !extras.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") || !extras.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
            return null;
        }
        kVar.mo7877g(extras.getBundle("androidx.mediarouter.media.KEY_EXTRAS"));
        kVar.mo7875e(extras.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0));
        kVar.mo7878h(extras.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
        ArrayList parcelableArrayList = extras.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
        if (parcelableArrayList != null) {
            kVar.mo7872b(parcelableArrayList);
        }
        return kVar.mo7871a();
    }

    /* renamed from: b */
    static List m10681b(List list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2Info = (MediaRoute2Info) it.next();
            if (mediaRoute2Info != null) {
                arrayList.add(mediaRoute2Info.getId());
            }
        }
        return arrayList;
    }
}
