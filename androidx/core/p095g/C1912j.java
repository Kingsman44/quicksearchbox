package androidx.core.p095g;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: androidx.core.g.j */
/* compiled from: PG */
public final class C1912j implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f5795a;

    /* renamed from: b */
    final /* synthetic */ Context f5796b;

    /* renamed from: c */
    final /* synthetic */ C1909g f5797c;

    /* renamed from: d */
    final /* synthetic */ int f5798d;

    public C1912j(String str, Context context, C1909g gVar, int i) {
        this.f5795a = str;
        this.f5796b = context;
        this.f5797c = gVar;
        this.f5798d = i;
    }

    /* renamed from: a */
    public final C1914l call() {
        try {
            return C1915m.m5179a(this.f5795a, this.f5796b, this.f5797c, this.f5798d);
        } catch (Throwable unused) {
            return new C1914l(-3);
        }
    }
}
