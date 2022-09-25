package androidx.navigation;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import java.lang.ref.WeakReference;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: androidx.navigation.cc */
/* compiled from: PG */
final class C3862cc extends C69665o implements C69626l {

    /* renamed from: a */
    public static final C3862cc f12423a = new C3862cc();

    public C3862cc() {
        super(1);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        View view = (View) obj;
        C69664n.m101061g(view, "it");
        Object tag = view.getTag(R.id.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            return (C3807af) ((WeakReference) tag).get();
        }
        if (tag instanceof C3807af) {
            return (C3807af) tag;
        }
        return null;
    }
}
