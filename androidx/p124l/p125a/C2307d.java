package androidx.p124l.p125a;

import android.util.Log;
import androidx.lifecycle.C2333ah;
import androidx.p124l.p126b.C2313c;
import com.google.android.libraries.social.licenses.C41957e;
import java.util.List;

/* renamed from: androidx.l.a.d */
/* compiled from: PG */
final class C2307d implements C2333ah {

    /* renamed from: a */
    public final C2313c f6456a;

    /* renamed from: b */
    public final C2304a f6457b;

    /* renamed from: c */
    public boolean f6458c = false;

    public C2307d(C2313c cVar, C2304a aVar) {
        this.f6456a = cVar;
        this.f6457b = aVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        if (C2310g.m6251b(2)) {
            Log.v("LoaderManager", "  onLoadFinished in " + this.f6456a + ": " + C2313c.m6258f(obj));
        }
        this.f6458c = true;
        C41957e eVar = (C41957e) this.f6457b;
        eVar.f109509a.clear();
        eVar.f109509a.addAll((List) obj);
        eVar.f109509a.notifyDataSetChanged();
    }

    public final String toString() {
        return this.f6457b.toString();
    }
}
