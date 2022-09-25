package androidx.core.app;

import android.app.PendingIntent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.evernote.android.state.BuildConfig;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: androidx.core.app.r */
/* compiled from: PG */
public final class C1831r {

    /* renamed from: a */
    public int f5646a;

    /* renamed from: b */
    public boolean f5647b;

    /* renamed from: c */
    private final IconCompat f5648c;

    /* renamed from: d */
    private final CharSequence f5649d;

    /* renamed from: e */
    private final PendingIntent f5650e;

    /* renamed from: f */
    private boolean f5651f;

    /* renamed from: g */
    private final Bundle f5652g;

    /* renamed from: h */
    private ArrayList f5653h;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1831r(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this(i != 0 ? IconCompat.m5207j((Resources) null, BuildConfig.FLAVOR, i) : null, charSequence, pendingIntent, new Bundle());
    }

    /* renamed from: a */
    public final C1832s mo5008a() {
        C1811ba[] baVarArr;
        CharSequence[] charSequenceArr;
        Set set;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f5653h;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                C1811ba baVar = (C1811ba) arrayList3.get(i);
                if (baVar.f5639d || (!((charSequenceArr = baVar.f5638c) == null || charSequenceArr.length == 0) || (set = baVar.f5642g) == null || set.isEmpty())) {
                    arrayList2.add(baVar);
                } else {
                    arrayList.add(baVar);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            C1811ba[] baVarArr2 = (C1811ba[]) arrayList.toArray(new C1811ba[arrayList.size()]);
        }
        if (arrayList2.isEmpty()) {
            baVarArr = null;
        } else {
            baVarArr = (C1811ba[]) arrayList2.toArray(new C1811ba[arrayList2.size()]);
        }
        return new C1832s(this.f5648c, this.f5649d, this.f5650e, this.f5652g, baVarArr, this.f5651f, this.f5646a, this.f5647b, false, false);
    }

    /* renamed from: b */
    public final void mo5009b(C1811ba baVar) {
        if (this.f5653h == null) {
            this.f5653h = new ArrayList();
        }
        if (baVar != null) {
            this.f5653h.add(baVar);
        }
    }

    public C1831r(CharSequence charSequence, PendingIntent pendingIntent) {
        this((IconCompat) null, charSequence, pendingIntent, new Bundle());
    }

    private C1831r(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        this.f5651f = true;
        this.f5647b = true;
        this.f5648c = iconCompat;
        this.f5649d = C1839z.m5037c(charSequence);
        this.f5650e = pendingIntent;
        this.f5652g = bundle;
        this.f5653h = null;
        this.f5651f = true;
        this.f5646a = 0;
        this.f5647b = true;
    }
}
