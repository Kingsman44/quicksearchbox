package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.widget.C1762u;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.motion.widget.ao */
/* compiled from: PG */
public final class C1716ao {

    /* renamed from: a */
    public final MotionLayout f5007a;

    /* renamed from: b */
    public final ArrayList f5008b = new ArrayList();

    /* renamed from: c */
    public HashSet f5009c;

    /* renamed from: d */
    public final String f5010d = "ViewTransitionController";

    /* renamed from: e */
    ArrayList f5011e;

    /* renamed from: f */
    final ArrayList f5012f = new ArrayList();

    public C1716ao(MotionLayout motionLayout) {
        this.f5007a = motionLayout;
    }

    /* renamed from: a */
    public static final void m4662a(C1714am amVar) {
        if (ConstraintLayout.f5200P == null) {
            ConstraintLayout.f5200P = new C1762u();
        }
        C1762u uVar = ConstraintLayout.f5200P;
        int i = amVar.f4995j;
        C1715an anVar = new C1715an();
        HashMap hashMap = uVar.f5482a;
        Integer valueOf = Integer.valueOf(i);
        HashSet hashSet = (HashSet) hashMap.get(valueOf);
        if (hashSet == null) {
            hashSet = new HashSet();
            uVar.f5482a.put(valueOf, hashSet);
        }
        hashSet.add(new WeakReference(anVar));
    }
}
