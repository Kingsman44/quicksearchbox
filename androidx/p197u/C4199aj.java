package androidx.p197u;

import android.view.ViewGroup;
import androidx.core.p098j.C2043bi;
import androidx.p060c.C0977g;
import com.google.android.googlequicksearchbox.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: androidx.u.aj */
/* compiled from: PG */
public final class C4199aj {

    /* renamed from: a */
    static final ArrayList f13615a = new ArrayList();

    /* renamed from: b */
    private static final C4195af f13616b = new C4216b();

    /* renamed from: c */
    private static final ThreadLocal f13617c = new ThreadLocal();

    /* renamed from: a */
    static C0977g m12053a() {
        C0977g gVar;
        ThreadLocal threadLocal = f13617c;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (gVar = (C0977g) weakReference.get()) != null) {
            return gVar;
        }
        C0977g gVar2 = new C0977g();
        threadLocal.set(new WeakReference(gVar2));
        return gVar2;
    }

    /* renamed from: b */
    public static void m12054b(ViewGroup viewGroup, C4195af afVar) {
        ArrayList arrayList = f13615a;
        if (!arrayList.contains(viewGroup) && C2043bi.m5570ax(viewGroup)) {
            arrayList.add(viewGroup);
            if (afVar == null) {
                afVar = f13616b;
            }
            C4195af h = afVar.clone();
            ArrayList arrayList2 = (ArrayList) m12053a().get(viewGroup);
            if (arrayList2 != null && arrayList2.size() > 0) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((C4195af) arrayList2.get(i)).mo8891r(viewGroup);
                }
            }
            if (h != null) {
                h.mo8887n(viewGroup, true);
            }
            if (((C4240y) viewGroup.getTag(R.id.transition_current_scene)) == null) {
                viewGroup.setTag(R.id.transition_current_scene, (Object) null);
                if (h != null && viewGroup != null) {
                    C4198ai aiVar = new C4198ai(h, viewGroup);
                    viewGroup.addOnAttachStateChangeListener(aiVar);
                    viewGroup.getViewTreeObserver().addOnPreDrawListener(aiVar);
                    return;
                }
                return;
            }
            throw null;
        }
    }
}
