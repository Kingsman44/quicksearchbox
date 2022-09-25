package androidx.customview.p102a;

import android.view.View;
import androidx.core.p098j.C2051bq;
import com.google.android.googlequicksearchbox.R;
import java.util.Iterator;
import p5462h.p5466c.C69577g;
import p5462h.p5482l.C69734n;
import p5462h.p5482l.C69735o;

/* renamed from: androidx.customview.a.a */
/* compiled from: PG */
public final class C2140a {
    /* renamed from: a */
    public static final C2142c m5938a(View view) {
        C2142c cVar = (C2142c) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (cVar != null) {
            return cVar;
        }
        C2142c cVar2 = new C2142c();
        view.setTag(R.id.pooling_container_listener_holder_tag, cVar2);
        return cVar2;
    }

    /* renamed from: b */
    public static final void m5939b(View view) {
        Iterator a = C69734n.m101171a(new C69735o(new C2051bq(view, (C69577g) null)).f186113a);
        while (a.hasNext()) {
            m5938a((View) a.next()).mo5371a();
        }
    }
}
