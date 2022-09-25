package android.support.p033v7.widget;

/* renamed from: android.support.v7.widget.cw */
/* compiled from: PG */
final class C0580cw extends C0658ft {

    /* renamed from: a */
    final /* synthetic */ C0583cz f2238a;

    public C0580cw(C0583cz czVar) {
        this.f2238a = czVar;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        C0583cz czVar = this.f2238a;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        int computeVerticalScrollRange = czVar.f2260l.computeVerticalScrollRange();
        int i3 = czVar.f2259k;
        czVar.f2261m = computeVerticalScrollRange - i3 > 0 && i3 >= czVar.f2249a;
        int computeHorizontalScrollRange = czVar.f2260l.computeHorizontalScrollRange();
        int i4 = czVar.f2258j;
        boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= czVar.f2249a;
        czVar.f2262n = z;
        if (czVar.f2261m) {
            float f = (float) i3;
            czVar.f2253e = (int) ((f * (((float) computeVerticalScrollOffset) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
            czVar.f2252d = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        } else if (!z) {
            if (czVar.f2263o != 0) {
                czVar.mo2716a(0);
                return;
            }
            return;
        }
        if (czVar.f2262n) {
            float f2 = (float) i4;
            czVar.f2256h = (int) ((f2 * (((float) computeHorizontalScrollOffset) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
            czVar.f2255g = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
        }
        int i5 = czVar.f2263o;
        if (i5 == 0 || i5 == 1) {
            czVar.mo2716a(1);
        }
    }
}
