package android.support.p033v7.p037c.p038a;

import android.support.p033v7.p040e.C0419a;
import android.support.p033v7.p040e.C0425g;
import android.support.p033v7.widget.C0640fb;

/* renamed from: android.support.v7.c.a.i */
/* compiled from: PG */
public abstract class C0417i extends C0640fb {

    /* renamed from: a */
    public final C0415g f1406a;

    /* renamed from: b */
    private final C0416h f1407b;

    protected C0417i(C0425g gVar) {
        C0416h hVar = new C0416h();
        this.f1407b = hVar;
        C0415g gVar2 = new C0415g(new C0419a(this), new C0409a(gVar).mo1378a());
        this.f1406a = gVar2;
        gVar2.f1402d.add(hVar);
    }

    public final int getItemCount() {
        return this.f1406a.f1404f.size();
    }
}
