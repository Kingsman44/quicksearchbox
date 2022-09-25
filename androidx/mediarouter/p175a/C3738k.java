package androidx.mediarouter.p175a;

import android.content.IntentFilter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: androidx.mediarouter.a.k */
/* compiled from: PG */
public final class C3738k {

    /* renamed from: a */
    public final Bundle f12004a;

    /* renamed from: b */
    public ArrayList f12005b;

    /* renamed from: c */
    public ArrayList f12006c;

    public C3738k(C3739l lVar) {
        if (lVar != null) {
            this.f12004a = new Bundle(lVar.f12007a);
            lVar.mo7898q();
            if (!lVar.f12008b.isEmpty()) {
                lVar.mo7898q();
                this.f12005b = new ArrayList(lVar.f12008b);
            }
            lVar.mo7897p();
            if (!lVar.f12009c.isEmpty()) {
                this.f12006c = new ArrayList(lVar.f12009c);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("descriptor must not be null");
    }

    /* renamed from: a */
    public final C3739l mo7871a() {
        ArrayList arrayList = this.f12006c;
        if (arrayList != null) {
            this.f12004a.putParcelableArrayList("controlFilters", arrayList);
        }
        ArrayList arrayList2 = this.f12005b;
        if (arrayList2 != null) {
            this.f12004a.putStringArrayList("groupMemberIds", arrayList2);
        }
        return new C3739l(this.f12004a);
    }

    /* renamed from: c */
    public final void mo7873c(int i) {
        this.f12004a.putInt("connectionState", i);
    }

    /* renamed from: d */
    public final void mo7874d(String str) {
        this.f12004a.putString("status", str);
    }

    /* renamed from: e */
    public final void mo7875e(int i) {
        this.f12004a.putInt("deviceType", i);
    }

    /* renamed from: f */
    public final void mo7876f(boolean z) {
        this.f12004a.putBoolean("enabled", z);
    }

    /* renamed from: g */
    public final void mo7877g(Bundle bundle) {
        if (bundle == null) {
            this.f12004a.putBundle("extras", (Bundle) null);
        } else {
            this.f12004a.putBundle("extras", new Bundle(bundle));
        }
    }

    /* renamed from: h */
    public final void mo7878h(int i) {
        this.f12004a.putInt("playbackType", i);
    }

    /* renamed from: i */
    public final void mo7879i(int i) {
        this.f12004a.putInt("presentationDisplayId", i);
    }

    /* renamed from: j */
    public final void mo7880j(int i) {
        this.f12004a.putInt("volume", i);
    }

    /* renamed from: k */
    public final void mo7881k(int i) {
        this.f12004a.putInt("volumeHandling", i);
    }

    /* renamed from: l */
    public final void mo7882l(int i) {
        this.f12004a.putInt("volumeMax", i);
    }

    /* renamed from: b */
    public final void mo7872b(Collection collection) {
        if (collection == null) {
            throw new IllegalArgumentException("filters must not be null");
        } else if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                IntentFilter intentFilter = (IntentFilter) it.next();
                if (intentFilter != null) {
                    if (this.f12006c == null) {
                        this.f12006c = new ArrayList();
                    }
                    if (!this.f12006c.contains(intentFilter)) {
                        this.f12006c.add(intentFilter);
                    }
                }
            }
        }
    }

    public C3738k(String str, String str2) {
        Bundle bundle = new Bundle();
        this.f12004a = bundle;
        if (str != null) {
            bundle.putString("id", str);
            if (str2 != null) {
                bundle.putString("name", str2);
                return;
            }
            throw new NullPointerException("name must not be null");
        }
        throw new NullPointerException("id must not be null");
    }
}
