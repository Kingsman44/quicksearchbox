package androidx.navigation;

import android.content.Context;
import android.content.ContextWrapper;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: androidx.navigation.c */
/* compiled from: PG */
final class C3859c extends C69665o implements C69626l {

    /* renamed from: a */
    public static final C3859c f12409a = new C3859c();

    public C3859c() {
        super(1);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        Context context = (Context) obj;
        C69664n.m101061g(context, "it");
        if (context instanceof ContextWrapper) {
            return ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
