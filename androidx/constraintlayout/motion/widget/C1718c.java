package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.motion.widget.c */
/* compiled from: PG */
public abstract class C1718c {

    /* renamed from: a */
    int f5013a = -1;

    /* renamed from: b */
    int f5014b = -1;

    /* renamed from: c */
    String f5015c = null;

    /* renamed from: d */
    protected int f5016d;

    /* renamed from: e */
    HashMap f5017e;

    /* renamed from: a */
    public abstract C1718c clone();

    /* renamed from: b */
    public abstract void mo4792b(HashMap hashMap);

    /* renamed from: c */
    public abstract void mo4793c(HashSet hashSet);

    /* renamed from: d */
    public abstract void mo4795d(Context context, AttributeSet attributeSet);

    /* renamed from: e */
    public void mo4796e(HashMap hashMap) {
    }

    /* renamed from: f */
    public final void mo4797f(C1718c cVar) {
        this.f5013a = cVar.f5013a;
        this.f5014b = cVar.f5014b;
        this.f5015c = cVar.f5015c;
        this.f5016d = cVar.f5016d;
        this.f5017e = cVar.f5017e;
    }
}
