package androidx.p106e.p107a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.e.a.f */
/* compiled from: PG */
public abstract class C2189f extends C2186c {

    /* renamed from: a */
    private final int f6208a;

    /* renamed from: h */
    public final int f6209h;

    /* renamed from: i */
    public final LayoutInflater f6210i;

    @Deprecated
    public C2189f(Context context, int i) {
        this.f6208a = i;
        this.f6209h = i;
        this.f6210i = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: f */
    public View mo3230f(ViewGroup viewGroup) {
        throw null;
    }

    /* renamed from: h */
    public final View mo5506h(ViewGroup viewGroup) {
        return this.f6210i.inflate(this.f6208a, viewGroup, false);
    }
}
