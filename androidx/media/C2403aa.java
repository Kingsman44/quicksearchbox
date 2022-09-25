package androidx.media;

import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.media.aa */
/* compiled from: PG */
final class C2403aa {

    /* renamed from: a */
    final MediaBrowserService.Result f6644a;

    public C2403aa(MediaBrowserService.Result result) {
        this.f6644a = result;
    }

    /* renamed from: a */
    public final void mo5816a(Object obj) {
        ArrayList arrayList = null;
        if (obj instanceof List) {
            MediaBrowserService.Result result = this.f6644a;
            List<Parcel> list = (List) obj;
            if (list != null) {
                arrayList = new ArrayList(list.size());
                for (Parcel parcel : list) {
                    parcel.setDataPosition(0);
                    arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                    parcel.recycle();
                }
            }
            result.sendResult(arrayList);
        } else if (obj instanceof Parcel) {
            Parcel parcel2 = (Parcel) obj;
            parcel2.setDataPosition(0);
            this.f6644a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
            parcel2.recycle();
        } else {
            this.f6644a.sendResult((Object) null);
        }
    }
}
