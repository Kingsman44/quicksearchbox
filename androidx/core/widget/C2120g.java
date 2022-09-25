package androidx.core.widget;

/* renamed from: androidx.core.widget.g */
/* compiled from: PG */
public final /* synthetic */ class C2120g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ContentLoadingProgressBar f6082a;

    public /* synthetic */ C2120g(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.f6082a = contentLoadingProgressBar;
    }

    public final void run() {
        ContentLoadingProgressBar contentLoadingProgressBar = this.f6082a;
        System.currentTimeMillis();
        contentLoadingProgressBar.setVisibility(0);
    }
}
