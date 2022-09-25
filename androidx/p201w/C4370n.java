package androidx.p201w;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.evernote.android.state.BuildConfig;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.w.n */
/* compiled from: PG */
public final class C4370n {

    /* renamed from: a */
    private final List f13980a;

    public C4370n(List list) {
        this.f13980a = list;
    }

    /* renamed from: a */
    public final WebResourceResponse mo9291a(Uri uri) {
        WebResourceResponse a;
        Iterator it = this.f13980a.iterator();
        while (true) {
            C4368l lVar = null;
            if (!it.hasNext()) {
                return null;
            }
            C4369m mVar = (C4369m) it.next();
            if (!uri.getScheme().equals("http") && ((uri.getScheme().equals("http") || uri.getScheme().equals("https")) && uri.getAuthority().equals(mVar.f13977a) && uri.getPath().startsWith(mVar.f13978b))) {
                lVar = mVar.f13979c;
            }
            if (lVar != null && (a = lVar.mo9290a(uri.getPath().replaceFirst(mVar.f13978b, BuildConfig.FLAVOR))) != null) {
                return a;
            }
        }
    }
}
