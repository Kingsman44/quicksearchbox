package androidx.navigation;

import android.view.View;
import android.view.ViewParent;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: androidx.navigation.cb */
/* compiled from: PG */
final class C3861cb extends C69665o implements C69626l {

    /* renamed from: a */
    public static final C3861cb f12422a = new C3861cb();

    public C3861cb() {
        super(1);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        View view = (View) obj;
        C69664n.m101061g(view, "it");
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
