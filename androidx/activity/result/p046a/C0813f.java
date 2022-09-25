package androidx.activity.result.p046a;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.activity.result.a.f */
/* compiled from: PG */
public final class C0813f extends C0809b {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Intent mo613a(Context context, Object obj) {
        Intent intent = (Intent) obj;
        C69664n.m101061g(intent, "input");
        return intent;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo614b(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}
