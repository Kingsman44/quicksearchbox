package androidx.navigation.p179b;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p033v7.p035b.p036a.C0407b;
import androidx.navigation.C3807af;
import androidx.navigation.C3825ax;
import androidx.navigation.C3896q;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.navigation.b.a */
/* compiled from: PG */
public abstract class C3829a implements C3896q {

    /* renamed from: a */
    public final Context f12363a;

    /* renamed from: b */
    public final Set f12364b;

    /* renamed from: c */
    public C0407b f12365c;

    /* renamed from: d */
    public ValueAnimator f12366d;

    public C3829a(Context context, C3830b bVar) {
        C69664n.m101061g(context, "context");
        this.f12363a = context;
        this.f12364b = bVar.f12367a;
    }

    /* renamed from: a */
    public void mo8090a(C3807af afVar, C3825ax axVar, Bundle bundle) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo8091b(Drawable drawable, int i);
}
